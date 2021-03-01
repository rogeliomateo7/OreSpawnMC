/*     */ package danger.orespawn.entity;
/*     */ 
/*     */ import danger.orespawn.util.ai.MyEntityAIWanderALot;
/*     */ import java.util.List;
/*     */ import net.minecraft.entity.EntityAgeable;
/*     */ import net.minecraft.entity.EntityCreature;
/*     */ import net.minecraft.entity.SharedMonsterAttributes;
/*     */ import net.minecraft.entity.ai.EntityAIBase;
/*     */ import net.minecraft.entity.ai.EntityAIPanic;
/*     */ import net.minecraft.entity.passive.EntityAnimal;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.ResourceLocation;
/*     */ import net.minecraft.util.SoundEvent;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Ant
/*     */   extends EntityAnimal
/*     */ {
/*  34 */   public double moveSpeed = 0.15000000596046448D;
/*     */   
/*  36 */   private static final ResourceLocation texture2 = new ResourceLocation("orespawn:textures/entity/red_ant.png");
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Ant(World par1World) {
/*  43 */     super(par1World);
/*  44 */     setSize(0.1F, 0.1F);
/*  45 */     this.experienceValue = 0;
/*     */     
/*  47 */     this.tasks.addTask(0, (EntityAIBase)new EntityAIPanic((EntityCreature)this, 1.4D));
/*  48 */     this.tasks.addTask(1, (EntityAIBase)new MyEntityAIWanderALot((EntityCreature)this, 9, 1.0D));
/*     */   }
/*     */   
/*     */   protected void applyEntityAttributes() {
/*  52 */     super.applyEntityAttributes();
/*  53 */     getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(mygetMaxHealth());
/*  54 */     getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
/*  55 */     getAttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
/*  56 */     getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(0.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public ResourceLocation getTexture(Ant a) {
/*  61 */     return texture2;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean canDespawn() {
/*  69 */     if (isNoDespawnRequired()) return false; 
/*  70 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUpdate() {
/*  77 */     getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(this.moveSpeed);
/*  78 */     super.onUpdate();
/*  79 */     updateAITick();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean interact(EntityPlayer par1EntityPlayer) {
/*  86 */     System.out.println("ANT INTERACTED");
/*  87 */     if (par1EntityPlayer == null) return false;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  93 */     if (!(par1EntityPlayer instanceof net.minecraft.entity.player.EntityPlayerMP)) return false;
/*     */ 
/*     */     
/*  96 */     ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
/*  97 */     if (var2 != null && 
/*  98 */       var2.getCount() <= 0) {
/*  99 */       par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, (ItemStack)null);
/* 100 */       var2 = null;
/*     */     } 
/*     */     
/* 103 */     if (var2 != null) {
/* 104 */       return false;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean isAIEnabled() {
/* 124 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public int mygetMaxHealth() {
/* 129 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected SoundEvent getAmbientSound() {
/* 137 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected SoundEvent getHurtSound(DamageSource source) {
/* 145 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected SoundEvent getDeathSound() {
/* 150 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected float getSoundVolume() {
/* 158 */     return 0.0F;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void playStepSound(int par1, int par2, int par3, int par4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void dropFewItems(boolean par1, int par2) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean canTriggerWalking() {
/* 186 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public EntityAgeable createChild(EntityAgeable var1) {
/* 193 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean getCanSpawnHere() {
/* 200 */     if (this.posY < 50.0D) return false; 
/* 201 */     if (findBuddies() > 4) return false; 
/* 202 */     return true;
/*     */   }
/*     */   
/*     */   private int findBuddies() {
/* 206 */     List var5 = this.world.getEntitiesWithinAABB(Ant.class, getEntityBoundingBox().expand(20.0D, 10.0D, 20.0D));
/* 207 */     return var5.size();
/*     */   }
/*     */   
/*     */   public void updateAITick() {
/* 211 */     if (this.world.rand.nextInt(200) == 1) setRevengeTarget(null); 
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawnmc_1.12-development_0.7-deobf.jar!\danger\orespawn\entity\Ant.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */