/*     */ package danger.orespawn.entity.model;
/*     */ 
/*     */ import net.minecraft.client.model.ModelBase;
/*     */ import net.minecraft.client.model.ModelRenderer;
/*     */ import net.minecraft.entity.Entity;
/*     */ import net.minecraft.util.math.MathHelper;
/*     */ 
/*     */ public class ModelBird extends ModelBase {
/*   9 */   private float wingspeed = 1.0F;
/*     */   
/*     */   ModelRenderer Body;
/*     */   
/*     */   ModelRenderer Head;
/*     */   ModelRenderer Beak;
/*     */   ModelRenderer LowerBeak;
/*     */   ModelRenderer feather2;
/*     */   ModelRenderer feather1;
/*     */   ModelRenderer feather3;
/*     */   ModelRenderer tailfeather1;
/*     */   ModelRenderer rwing1;
/*     */   ModelRenderer lwing1;
/*     */   ModelRenderer leg;
/*     */   ModelRenderer otherleg;
/*     */   ModelRenderer lwing2;
/*     */   ModelRenderer rwing2;
/*     */   ModelRenderer tailfeather2;
/*     */   ModelRenderer tailfeather3;
/*     */   
/*     */   public ModelBird(float f1) {
/*  30 */     this.wingspeed = f1;
/*     */     
/*  32 */     this.textureWidth = 64;
/*  33 */     this.textureHeight = 32;
/*     */     
/*  35 */     this.Body = new ModelRenderer(this, 0, 0);
/*  36 */     this.Body.addBox(0.0F, 0.0F, 0.0F, 5, 3, 6);
/*  37 */     this.Body.setRotationPoint(-1.0F, 18.0F, 0.0F);
/*  38 */     this.Body.setTextureSize(64, 32);
/*  39 */     this.Body.mirror = true;
/*  40 */     setRotation(this.Body, 0.0F, 0.0F, 0.0F);
/*  41 */     this.Head = new ModelRenderer(this, 22, 0);
/*  42 */     this.Head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 4);
/*  43 */     this.Head.setRotationPoint(0.0F, 16.0F, -3.0F);
/*  44 */     this.Head.setTextureSize(64, 32);
/*  45 */     this.Head.mirror = true;
/*  46 */     setRotation(this.Head, 0.0F, 0.0F, 0.0F);
/*  47 */     this.Beak = new ModelRenderer(this, 0, 21);
/*  48 */     this.Beak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3);
/*  49 */     this.Beak.setRotationPoint(1.0F, 17.0F, -6.0F);
/*  50 */     this.Beak.setTextureSize(64, 32);
/*  51 */     this.Beak.mirror = true;
/*  52 */     setRotation(this.Beak, 0.0F, 0.0F, 0.0F);
/*  53 */     this.LowerBeak = new ModelRenderer(this, 1, 17);
/*  54 */     this.LowerBeak.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1);
/*  55 */     this.LowerBeak.setRotationPoint(1.0F, 18.0F, -4.0F);
/*  56 */     this.LowerBeak.setTextureSize(64, 32);
/*  57 */     this.LowerBeak.mirror = true;
/*  58 */     setRotation(this.LowerBeak, 0.0F, 0.0F, 0.0F);
/*  59 */     this.feather2 = new ModelRenderer(this, 15, 9);
/*  60 */     this.feather2.addBox(0.0F, -2.5F, -0.75F, 1, 3, 1);
/*  61 */     this.feather2.setRotationPoint(1.0F, 16.0F, 0.0F);
/*  62 */     this.feather2.setTextureSize(64, 32);
/*  63 */     this.feather2.mirror = true;
/*  64 */     setRotation(this.feather2, -0.6426736F, 0.0F, 0.0F);
/*  65 */     this.feather1 = new ModelRenderer(this, 11, 9);
/*  66 */     this.feather1.addBox(0.0F, -2.5F, -0.5F, 1, 3, 1);
/*  67 */     this.feather1.setRotationPoint(1.0F, 16.0F, -2.0F);
/*  68 */     this.feather1.setTextureSize(64, 32);
/*  69 */     this.feather1.mirror = true;
/*  70 */     setRotation(this.feather1, -0.2230717F, 0.0F, 0.0F);
/*  71 */     this.feather3 = new ModelRenderer(this, 19, 9);
/*  72 */     this.feather3.addBox(0.0F, -3.0F, 0.5F, 1, 4, 1);
/*  73 */     this.feather3.setRotationPoint(1.0F, 16.0F, 1.0F);
/*  74 */     this.feather3.setTextureSize(64, 32);
/*  75 */     this.feather3.mirror = true;
/*  76 */     setRotation(this.feather3, -1.276259F, 0.0F, 0.0F);
/*  77 */     this.tailfeather1 = new ModelRenderer(this, 46, 15);
/*  78 */     this.tailfeather1.addBox(0.0F, 0.0F, 0.0F, 3, 2, 3);
/*  79 */     this.tailfeather1.setRotationPoint(0.0F, 18.0F, 6.0F);
/*  80 */     this.tailfeather1.setTextureSize(64, 32);
/*  81 */     this.tailfeather1.mirror = true;
/*  82 */     setRotation(this.tailfeather1, 0.0F, 0.0F, 0.0F);
/*  83 */     this.rwing1 = new ModelRenderer(this, 23, 9);
/*  84 */     this.rwing1.addBox(0.0F, 0.0F, 0.0F, 1, 4, 4);
/*  85 */     this.rwing1.setRotationPoint(-1.0F, 18.0F, 1.0F);
/*  86 */     this.rwing1.setTextureSize(64, 32);
/*  87 */     this.rwing1.mirror = true;
/*  88 */     setRotation(this.rwing1, 0.0F, 0.0F, 1.595066F);
/*  89 */     this.lwing1 = new ModelRenderer(this, 33, 9);
/*  90 */     this.lwing1.addBox(-1.0F, 0.0F, 0.0F, 1, 4, 4);
/*  91 */     this.lwing1.setRotationPoint(4.0F, 18.0F, 1.0F);
/*  92 */     this.lwing1.setTextureSize(64, 32);
/*  93 */     this.lwing1.mirror = true;
/*  94 */     setRotation(this.lwing1, 0.0F, 0.0F, -1.561488F);
/*  95 */     this.leg = new ModelRenderer(this, 4, 12);
/*  96 */     this.leg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
/*  97 */     this.leg.setRotationPoint(2.0F, 21.0F, 3.0F);
/*  98 */     this.leg.setTextureSize(64, 32);
/*  99 */     this.leg.mirror = true;
/* 100 */     setRotation(this.leg, 0.8726646F, 0.0F, 0.0F);
/* 101 */     this.otherleg = new ModelRenderer(this, 0, 12);
/* 102 */     this.otherleg.addBox(0.0F, 0.0F, 0.0F, 1, 3, 1);
/* 103 */     this.otherleg.setRotationPoint(0.0F, 21.0F, 3.0F);
/* 104 */     this.otherleg.setTextureSize(64, 32);
/* 105 */     this.otherleg.mirror = true;
/* 106 */     setRotation(this.otherleg, 0.6108652F, 0.0F, 0.0F);
/* 107 */     this.lwing2 = new ModelRenderer(this, 10, 14);
/* 108 */     this.lwing2.addBox(4.0F, 0.0F, 0.0F, 3, 1, 3);
/* 109 */     this.lwing2.setRotationPoint(4.0F, 18.0F, 1.0F);
/* 110 */     this.lwing2.setTextureSize(64, 32);
/* 111 */     this.lwing2.mirror = true;
/* 112 */     setRotation(this.lwing2, 0.0F, 0.0F, 0.0F);
/* 113 */     this.rwing2 = new ModelRenderer(this, 10, 19);
/* 114 */     this.rwing2.addBox(-7.0F, 0.0F, 0.0F, 3, 1, 3);
/* 115 */     this.rwing2.setRotationPoint(-1.0F, 18.0F, 1.0F);
/* 116 */     this.rwing2.setTextureSize(64, 32);
/* 117 */     this.rwing2.mirror = true;
/* 118 */     setRotation(this.rwing2, 0.0F, 0.0F, 0.0F);
/* 119 */     this.tailfeather2 = new ModelRenderer(this, 44, 20);
/* 120 */     this.tailfeather2.addBox(-0.5F, 0.0F, 3.0F, 4, 1, 4);
/* 121 */     this.tailfeather2.setRotationPoint(0.0F, 18.0F, 6.0F);
/* 122 */     this.tailfeather2.setTextureSize(64, 32);
/* 123 */     this.tailfeather2.mirror = true;
/* 124 */     setRotation(this.tailfeather2, 0.0F, 0.0F, 0.0F);
/* 125 */     this.tailfeather3 = new ModelRenderer(this, 36, 26);
/* 126 */     this.tailfeather3.addBox(-1.0F, 0.0F, 7.0F, 5, 1, 4);
/* 127 */     this.tailfeather3.setRotationPoint(0.0F, 18.0F, 6.0F);
/* 128 */     this.tailfeather3.setTextureSize(64, 32);
/* 129 */     this.tailfeather3.mirror = true;
/* 130 */     setRotation(this.tailfeather3, 0.0F, 0.0F, 0.0F);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
/* 136 */     float newangle = 0.0F;
/* 137 */     super.render(entity, f, f1, f2, f3, f4, f5);
/* 138 */     setRotationAngles(f, f1, f2, f3, f4, f5, entity);
/*     */     
/* 140 */     newangle = MathHelper.cos(f2 * 1.5F * this.wingspeed) * 3.1415927F * 0.35F;
/* 141 */     this.lwing1.rotateAngleZ = -1.5F + newangle;
/* 142 */     this.lwing2.rotateAngleZ = newangle;
/* 143 */     this.rwing1.rotateAngleZ = 1.5F - newangle;
/* 144 */     this.rwing2.rotateAngleZ = -newangle;
/*     */     
/* 146 */     newangle = MathHelper.cos(f2 * 0.3F * this.wingspeed) * 3.1415927F * 0.1F;
/* 147 */     this.tailfeather1.rotateAngleX = newangle;
/* 148 */     this.tailfeather2.rotateAngleX = newangle;
/* 149 */     this.tailfeather3.rotateAngleX = newangle;
/*     */     
/* 151 */     newangle = MathHelper.cos(f2 * 1.1F * this.wingspeed) * 3.1415927F * 0.08F;
/* 152 */     this.feather1.rotateAngleZ = newangle;
/* 153 */     newangle = MathHelper.cos(f2 * 1.2F * this.wingspeed) * 3.1415927F * 0.08F;
/* 154 */     this.feather2.rotateAngleZ = newangle;
/* 155 */     newangle = MathHelper.cos(f2 * 1.3F * this.wingspeed) * 3.1415927F * 0.08F;
/* 156 */     this.feather3.rotateAngleZ = newangle;
/*     */     
/* 158 */     this.Body.render(f5);
/* 159 */     this.Head.render(f5);
/* 160 */     this.Beak.render(f5);
/* 161 */     this.LowerBeak.render(f5);
/* 162 */     this.feather2.render(f5);
/* 163 */     this.feather1.render(f5);
/* 164 */     this.feather3.render(f5);
/* 165 */     this.tailfeather1.render(f5);
/* 166 */     this.rwing1.render(f5);
/* 167 */     this.lwing1.render(f5);
/* 168 */     this.leg.render(f5);
/* 169 */     this.otherleg.render(f5);
/* 170 */     this.lwing2.render(f5);
/* 171 */     this.rwing2.render(f5);
/* 172 */     this.tailfeather2.render(f5);
/* 173 */     this.tailfeather3.render(f5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void setRotation(ModelRenderer model, float x, float y, float z) {
/* 180 */     model.rotateAngleX = x;
/* 181 */     model.rotateAngleY = y;
/* 182 */     model.rotateAngleZ = z;
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity) {
/* 187 */     super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawnmc_1.12-development_0.4-deobf.jar!\danger\orespawn\entity\model\ModelBird.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */