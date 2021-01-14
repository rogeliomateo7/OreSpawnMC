/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.creativetab.CreativeTabs;
/*     */ import net.minecraft.enchantment.Enchantment;
/*     */ import net.minecraft.enchantment.EnchantmentHelper;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.entity.EntityLiving;
/*     */ import net.minecraft.entity.EntityLivingBase;
/*     */ import net.minecraft.entity.passive.EntityTameable;
/*     */ import net.minecraft.entity.player.EntityPlayer;
/*     */ import net.minecraft.item.Item;
/*     */ import net.minecraft.item.ItemStack;
/*     */ import net.minecraft.item.ItemSword;
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
/*     */ public class Bertha
/*     */   extends ItemSword
/*     */ {
/*     */   public Bertha(int par1, Item.ToolMaterial par2EnumToolMaterial) {
/*  31 */     super(par2EnumToolMaterial);
/*     */     
/*  33 */     this.maxStackSize = 1;
/*  34 */     setMaxDamage(9000);
/*  35 */     setCreativeTab(CreativeTabs.tabCombat);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onCreated(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
/*  40 */     if (this == OreSpawnMain.MyRoyal) {
/*  41 */       par1ItemStack.addEnchantment(Enchantment.unbreaking, 5);
/*     */     }
/*  43 */     else if (this != OreSpawnMain.MyHammy) {
/*  44 */       par1ItemStack.addEnchantment(Enchantment.knockback, 5);
/*  45 */       par1ItemStack.addEnchantment(Enchantment.baneOfArthropods, 1);
/*  46 */       par1ItemStack.addEnchantment(Enchantment.fireAspect, 1);
/*     */     } 
/*     */   }
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
/*     */   public void onUsingTick(ItemStack stack, EntityPlayer player, int count) {
/*  60 */     int lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, stack);
/*  61 */     if (lvl == 0) lvl = EnchantmentHelper.getEnchantmentLevel(Enchantment.unbreaking.effectId, stack);
/*     */     
/*  63 */     if (lvl <= 0) {
/*  64 */       if (this == OreSpawnMain.MyRoyal) {
/*  65 */         stack.addEnchantment(Enchantment.unbreaking, 5);
/*     */       }
/*  67 */       else if (this != OreSpawnMain.MyHammy) {
/*  68 */         stack.addEnchantment(Enchantment.knockback, 5);
/*  69 */         stack.addEnchantment(Enchantment.baneOfArthropods, 1);
/*  70 */         stack.addEnchantment(Enchantment.fireAspect, 1);
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */   
/*     */   public void onUpdate(ItemStack stack, World par2World, Entity par3Entity, int par4, boolean par5) {
/*  77 */     onUsingTick(stack, (EntityPlayer)null, 0);
/*     */   }
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
/*     */   
/*     */   public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
/* 123 */     if (entity != null && OreSpawnMain.big_bertha_pvp == 0) {
/* 124 */       if (entity instanceof EntityPlayer || entity instanceof Girlfriend || entity instanceof Boyfriend) {
/* 125 */         return true;
/*     */       }
/* 127 */       if (entity instanceof EntityTameable) {
/* 128 */         EntityTameable t = (EntityTameable)entity;
/* 129 */         if (t.isTamed()) {
/* 130 */           return true;
/*     */         }
/*     */       } 
/*     */     } 
/* 134 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
/* 146 */     if (entityLiving != null && entityLiving instanceof EntityPlayer && !entityLiving.worldObj.isRemote) {
/*     */ 
/*     */       
/* 149 */       EntityPlayer p = (EntityPlayer)entityLiving;
/* 150 */       double xzoff = 2.0D;
/* 151 */       double yoff = 1.55D;
/* 152 */       BerthaHit lb = new BerthaHit(p.worldObj, (EntityLivingBase)p);
/* 153 */       lb.setLocationAndAngles(p.posX - xzoff * Math.sin(Math.toRadians(p.rotationYawHead)), p.posY + yoff, p.posZ + xzoff * Math.cos(Math.toRadians(p.rotationYawHead)), p.rotationYawHead, p.rotationPitch);
/* 154 */       lb.motionX *= 2.0D;
/* 155 */       lb.motionY *= 2.0D;
/* 156 */       lb.motionZ *= 2.0D;
/* 157 */       if (this == OreSpawnMain.MyRoyal) {
/* 158 */         lb.setHitType(2);
/*     */       }
/* 160 */       if (this == OreSpawnMain.MyHammy) {
/* 161 */         lb.setHitType(3);
/*     */       }
/* 163 */       p.worldObj.spawnEntityInWorld((Entity)lb);
/* 164 */       stack.damageItem(1, (EntityLivingBase)p);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String getMaterialName() {
/* 181 */     return "Uranium/Titanium";
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving) {
/* 186 */     par1ItemStack.damageItem(1, (EntityLivingBase)par3EntityLiving);
/* 187 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int getMaxItemUseDuration(ItemStack par1ItemStack) {
/* 195 */     return 9000;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerIcons(IIconRegister iconRegister) {
/* 201 */     this.itemIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\Bertha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */