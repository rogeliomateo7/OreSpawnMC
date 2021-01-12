/*     */ package danger.orespawn;
/*     */ 
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.entity.projectile.EntityThrowable;
/*     */ import net.minecraft.util.DamageSource;
/*     */ import net.minecraft.util.MathHelper;
/*     */ import net.minecraft.util.MovingObjectPosition;
/*     */ import net.minecraft.world.World;
/*     */ 
/*     */ 
/*     */ public class BerthaHit
/*     */   extends EntityThrowable
/*     */ {
/*  17 */   private int hit_type = 0;
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World) {
/*  21 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, int par2) {
/*  26 */     super(par1World);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, EntityLivingBase par2EntityLiving) {
/*  31 */     super(par1World, par2EntityLiving);
/*     */     
/*  33 */     setSize(0.33F, 0.33F);
/*  34 */     setLocationAndAngles(par2EntityLiving.posX, par2EntityLiving.posY + par2EntityLiving.getEyeHeight(), par2EntityLiving.posZ, par2EntityLiving.rotationYaw, par2EntityLiving.rotationPitch);
/*  35 */     this.posX -= (MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
/*  36 */     this.posY -= 0.1D;
/*  37 */     this.posZ -= (MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * 0.16F);
/*  38 */     setPosition(this.posX, this.posY, this.posZ);
/*  39 */     this.yOffset = 0.0F;
/*  40 */     float f = 0.4F;
/*  41 */     this.motionX = (-MathHelper.sin(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * f);
/*  42 */     this.motionZ = (MathHelper.cos(this.rotationYaw / 180.0F * 3.1415927F) * MathHelper.cos(this.rotationPitch / 180.0F * 3.1415927F) * f);
/*  43 */     this.motionY = (-MathHelper.sin((this.rotationPitch + func_70183_g()) / 180.0F * 3.1415927F) * f);
/*  44 */     setThrowableHeading(this.motionX, this.motionY, this.motionZ, func_70182_d(), 0.1F);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, EntityLivingBase par2EntityLiving, int par3) {
/*  49 */     super(par1World, par2EntityLiving);
/*     */   }
/*     */ 
/*     */   
/*     */   public BerthaHit(World par1World, double par2, double par4, double par6) {
/*  54 */     super(par1World, par2, par4, par6);
/*     */   }
/*     */ 
/*     */   
/*     */   public void setHitType(int i) {
/*  59 */     this.hit_type = i;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
/*  68 */     if (this.isDead) {
/*     */       return;
/*     */     }
/*  71 */     if (par1MovingObjectPosition.entityHit != null && getThrower() != null) {
/*     */       
/*  73 */       Entity e = par1MovingObjectPosition.entityHit;
/*  74 */       if ((OreSpawnMain.big_bertha_pvp == 0 && e instanceof EntityPlayer) || e instanceof Girlfriend || e instanceof Boyfriend) {
/*  75 */         setDead();
/*     */         return;
/*     */       } 
/*  78 */       if (OreSpawnMain.big_bertha_pvp == 0 && e instanceof EntityTameable) {
/*  79 */         EntityTameable t = (EntityTameable)e;
/*  80 */         if (t.isTamed()) {
/*  81 */           setDead();
/*     */           return;
/*     */         } 
/*     */       } 
/*  85 */       if (this.hit_type == 0 && getDistanceSqToEntity((Entity)getThrower()) < 81.0D && e != getThrower()) {
/*  86 */         e.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getThrower()), OreSpawnMain.bertha_stats.damage);
/*  87 */         e.setFire(10);
/*  88 */         double ks = 2.25D;
/*  89 */         double inair = 0.35D;
/*  90 */         float f3 = (float)Math.atan2(e.posZ - (getThrower()).posZ, e.posX - (getThrower()).posX);
/*  91 */         if (e.isDead) inair *= 2.0D; 
/*  92 */         e.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 102 */       if (this.hit_type == 2 && getDistanceSqToEntity((Entity)getThrower()) < 101.0D && e != getThrower()) {
/* 103 */         e.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getThrower()), OreSpawnMain.royal_stats.damage);
/*     */         
/* 105 */         double ks = 1.5D;
/* 106 */         double inair = 0.25D;
/* 107 */         float f3 = (float)Math.atan2(e.posZ - (getThrower()).posZ, e.posX - (getThrower()).posX);
/* 108 */         if (e.isDead) inair *= 2.0D; 
/* 109 */         e.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/*     */       } 
/* 111 */       if (this.hit_type == 3 && getDistanceSqToEntity((Entity)getThrower()) < 64.0D && e != getThrower()) {
/* 112 */         e.attackEntityFrom(DamageSource.causePlayerDamage((EntityPlayer)getThrower()), OreSpawnMain.hammy_stats.damage);
/* 113 */         double ks = 1.25D;
/* 114 */         double inair = 0.65D;
/* 115 */         float f3 = (float)Math.atan2(e.posZ - (getThrower()).posZ, e.posX - (getThrower()).posX);
/* 116 */         if (e.isDead) inair *= 2.0D; 
/* 117 */         e.addVelocity(Math.cos(f3) * ks, inair, Math.sin(f3) * ks);
/* 118 */         if (!this.worldObj.isRemote && 
/* 119 */           this.hit_type == 3 && getDistanceSqToEntity((Entity)getThrower()) < 64.0D) {
/* 120 */           this.worldObj.newExplosion((Entity)null, this.posX, this.posY, this.posZ, 1.5F, true, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
/*     */         
/*     */         }
/*     */       }
/*     */     
/*     */     }
/* 126 */     else if (!this.worldObj.isRemote && 
/* 127 */       this.hit_type == 3 && getDistanceSqToEntity((Entity)getThrower()) < 64.0D) {
/* 128 */       this.worldObj.newExplosion((Entity)null, this.posX, this.posY, this.posZ, 2.1F, true, this.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing"));
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 133 */     setDead();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onUpdate() {
/* 141 */     super.onUpdate();
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\BerthaHit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */