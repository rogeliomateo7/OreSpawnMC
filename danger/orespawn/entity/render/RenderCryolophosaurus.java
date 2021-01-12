/*    */ package danger.orespawn.entity.render;
/*    */ 
/*    */ import danger.orespawn.entity.Cryolophosaurus;
/*    */ import danger.orespawn.entity.model.ModelCryolophosaurus;
/*    */ import net.minecraft.client.model.ModelBase;
/*    */ import net.minecraft.client.renderer.entity.RenderLiving;
/*    */ import net.minecraft.client.renderer.entity.RenderManager;
/*    */ import net.minecraft.entity.Entity;
/*    */ import net.minecraft.entity.EntityLivingBase;
/*    */ import net.minecraft.util.ResourceLocation;
/*    */ 
/*    */ public class RenderCryolophosaurus extends RenderLiving<Cryolophosaurus> {
/* 13 */   public static final ResourceLocation TEXTURES = new ResourceLocation("orespawn:textures/entity/cryolophosaurus.png");
/*    */ 
/*    */ 
/*    */   
/*    */   public RenderCryolophosaurus(RenderManager manager) {
/* 18 */     super(manager, (ModelBase)new ModelCryolophosaurus(1.5F), 0.3F);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   protected ResourceLocation getEntityTexture(Cryolophosaurus entity) {
/* 24 */     return TEXTURES;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void applyRotations(Cryolophosaurus entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
/* 29 */     super.applyRotations((EntityLivingBase)entityLiving, p_77043_2_, rotationYaw, partialTicks);
/*    */   }
/*    */ }


/* Location:              C:\Users\Admin\Downloads\orespawnmc_1.12-development_0.3-deobf.jar!\danger\orespawn\entity\render\RenderCryolophosaurus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */