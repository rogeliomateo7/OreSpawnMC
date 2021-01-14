/*     */ package danger.orespawn;
/*     */ 
/*     */ import cpw.mods.fml.relauncher.Side;
/*     */ import cpw.mods.fml.relauncher.SideOnly;
/*     */ import java.util.Random;
/*     */ import net.minecraft.block.Block;
/*     */ import net.minecraft.block.BlockReed;
/*     */ import net.minecraft.client.renderer.texture.IIconRegister;
/*     */ import net.minecraft.init.Blocks;
/*     */ import net.minecraft.item.Item;
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
/*     */ public class DungeonSpawnerBlock
/*     */   extends BlockReed
/*     */ {
/*     */   protected DungeonSpawnerBlock(int par1) {
/*  26 */     float var3 = 0.375F;
/*  27 */     setBlockBounds(0.5F - var3, 0.0F, 0.5F - var3, 0.5F + var3, 1.0F, 0.5F + var3);
/*  28 */     setTickRandomly(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4) {
/*  37 */     if (par1World.getBlock(par2, par3 - 1, par4).getMaterial().isSolid()) return true; 
/*  38 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
/*  44 */     for (int j1 = 0; j1 < 5; j1++)
/*     */     {
/*     */       
/*  47 */       par1World.spawnParticle("fireworksSpark", (par2 + par1World.rand.nextFloat()), par3 + par1World.rand.nextFloat(), (par4 + par1World.rand.nextFloat()), (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0D, par1World.rand.nextFloat() / 2.0D, (par1World.rand.nextFloat() - par1World.rand.nextFloat()) / 4.0D);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockAdded(World world, int x, int y, int z) {
/*  58 */     if (world.isRemote)
/*     */       return; 
/*  60 */     world.scheduleBlockUpdate(x, y, z, (Block)this, 400);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void onBlockDestroyedByPlayer(World par1World, int par2, int par3, int par4, int par5) {
/*  69 */     super.onBlockDestroyedByPlayer(par1World, par2, par3, par4, par5);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void updateTick(World world, int clickedX, int clickedY, int clickedZ, Random par5Random) {
/*  79 */     if (world.isRemote)
/*     */       return; 
/*  81 */     world.setBlock(clickedX, clickedY, clickedZ, Blocks.air, 0, 2);
/*  82 */     world.setBlock(clickedX, clickedY + 1, clickedZ, Blocks.air, 0, 2);
/*     */     
/*  84 */     int type = world.rand.nextInt(50);
/*  85 */     if (type == 0) OreSpawnMain.OreSpawnTrees.FairyTree(world, clickedX, clickedY, clickedZ); 
/*  86 */     if (type == 1) OreSpawnMain.OreSpawnTrees.FairyCastleTree(world, clickedX, clickedY, clickedZ); 
/*  87 */     if (type == 2) OreSpawnMain.MyDungeon.makeEnormousCastle(world, clickedX, clickedY, clickedZ); 
/*  88 */     if (type == 3) OreSpawnMain.MyDungeon.makeRotatorStation(world, clickedX, clickedY, clickedZ); 
/*  89 */     if (type == 4) OreSpawnMain.MyDungeon.makeBeeHive(world, clickedX, clickedY, clickedZ); 
/*  90 */     if (type == 5) OreSpawnMain.MyDungeon.makeHauntedHouse(world, clickedX, clickedY, clickedZ); 
/*  91 */     if (type == 6) OreSpawnMain.MyDungeon.makeMantisHive(world, clickedX, clickedY, clickedZ); 
/*  92 */     if (type == 7) OreSpawnMain.MyDungeon.makeKyuubiDungeon(world, clickedX, clickedY, clickedZ); 
/*  93 */     if (type == 8) OreSpawnMain.MyDungeon.makeSmallBeeHive(world, clickedX, clickedY, clickedZ); 
/*  94 */     if (type == 9) OreSpawnMain.MyDungeon.makeShadowDungeon(world, clickedX, clickedY, clickedZ); 
/*  95 */     if (type == 10) OreSpawnMain.MyDungeon.makeAlienWTFDungeon(world, clickedX, clickedY, clickedZ); 
/*  96 */     if (type == 11) OreSpawnMain.MyDungeon.makeEnderKnightDungeon(world, clickedX, clickedY, clickedZ); 
/*  97 */     if (type == 12) OreSpawnMain.MyDungeon.makePlayPool(world, clickedX, clickedY, clickedZ); 
/*  98 */     if (type == 13) OreSpawnMain.MyDungeon.makeWaterDragonLair(world, clickedX, clickedY, clickedZ); 
/*  99 */     if (type == 14) OreSpawnMain.MyDungeon.makeCloudSharkDungeon(world, clickedX, clickedY, clickedZ); 
/* 100 */     if (type == 15) OreSpawnMain.MyDungeon.makeLeafMonsterDungeon(world, clickedX, clickedY, clickedZ); 
/* 101 */     if (type == 16) OreSpawnMain.MyDungeon.makeMiniDungeon(world, clickedX, clickedY, clickedZ); 
/* 102 */     if (type == 17) OreSpawnMain.MyDungeon.makeGoldFishBowl(world, clickedX, clickedY, clickedZ); 
/* 103 */     if (type == 18) OreSpawnMain.MyDungeon.makeEnderReaperGraveyard(world, clickedX, clickedY, clickedZ); 
/* 104 */     if (type == 19) OreSpawnMain.MyDungeon.makeSpitBugLair(world, clickedX, clickedY, clickedZ); 
/* 105 */     if (type == 20) OreSpawnMain.MyDungeon.makeIgloo(world, clickedX, clickedY, clickedZ); 
/* 106 */     if (type == 21) OreSpawnMain.MyDungeon.makeDungeon(world, clickedX, clickedY, clickedZ); 
/* 107 */     if (type == 22) OreSpawnMain.RubyDungeon.makeDungeon(world, clickedX, clickedY, clickedZ); 
/* 108 */     if (type == 23) OreSpawnMain.BMaze.buildBasiliskMaze(world, clickedX, clickedY, clickedZ); 
/* 109 */     if (type == 24) OreSpawnMain.MyDungeon.makeEnderDragonHospital(world, clickedX, clickedY, clickedZ); 
/* 110 */     if (type == 25) OreSpawnMain.MyDungeon.makeCrystalHauntedHouse(world, clickedX, clickedY, clickedZ); 
/* 111 */     if (type == 26) OreSpawnMain.MyDungeon.makeBouncyCastle(world, clickedX, clickedY, clickedZ); 
/* 112 */     if (type == 27) OreSpawnMain.MyDungeon.makeEnderCastle(world, clickedX, clickedY, clickedZ); 
/* 113 */     if (type == 28) OreSpawnMain.MyDungeon.makeDamselInDistress(world, clickedX, clickedY, clickedZ); 
/* 114 */     if (type == 29) OreSpawnMain.MyDungeon.makeIncaPyramid(world, clickedX, clickedY, clickedZ); 
/* 115 */     if (type == 30) OreSpawnMain.MyDungeon.makeRobotLab(world, clickedX, clickedY, clickedZ); 
/* 116 */     if (type == 31) OreSpawnMain.MyDungeon.makeKingAltar(world, clickedX, clickedY, clickedZ); 
/* 117 */     if (type == 32) OreSpawnMain.MyDungeon.makeLeonNest(world, clickedX, clickedY, clickedZ); 
/* 118 */     if (type == 33) OreSpawnMain.MyDungeon.makeCrystalBattleTower(world, clickedX, clickedY, clickedZ); 
/* 119 */     if (type == 34) OreSpawnMain.MyDungeon.makeCephadromeAltar(world, clickedX, clickedY, clickedZ); 
/* 120 */     if (type == 35) OreSpawnMain.MyDungeon.makeGirlfriendIsland(world, clickedX, clickedY, clickedZ); 
/* 121 */     if (type == 36) OreSpawnMain.MyDungeon.makeGreenhouseDungeon(world, clickedX, clickedY, clickedZ); 
/* 122 */     if (type == 37) OreSpawnMain.MyDungeon.makeMonsterIsland(world, clickedX, clickedY, clickedZ); 
/* 123 */     if (type == 38) OreSpawnMain.MyDungeon.makeNightmareRookery(world, clickedX, clickedY, clickedZ); 
/* 124 */     if (type == 39) OreSpawnMain.MyDungeon.makeStinkyHouse(world, clickedX, clickedY, clickedZ); 
/* 125 */     if (type == 40) OreSpawnMain.MyDungeon.makeRubberDuckyPond(world, clickedX, clickedY, clickedZ); 
/* 126 */     if (type == 41) OreSpawnMain.MyDungeon.makeWhiteHouse(world, clickedX, clickedY, clickedZ); 
/* 127 */     if (type == 42) OreSpawnMain.MyDungeon.makeQueenAltar(world, clickedX, clickedY, clickedZ); 
/* 128 */     if (type == 43) OreSpawnMain.MyDungeon.makeFrogPond(world, clickedX, clickedY + 1, clickedZ); 
/* 129 */     if (type == 44) OreSpawnMain.MyDungeon.makePumpkin(world, clickedX, clickedY + 1, clickedZ); 
/* 130 */     if (type == 45) OreSpawnMain.MyDungeon.makeRoundRotator(world, clickedX, clickedY + 1, clickedZ); 
/* 131 */     if (type == 46) OreSpawnMain.MyDungeon.makeRainbow(world, clickedX, clickedY, clickedZ); 
/* 132 */     if (type == 47) OreSpawnMain.MyDungeon.makeEnormousCastleQ(world, clickedX, clickedY, clickedZ); 
/* 133 */     if (type == 48) OreSpawnMain.MyDungeon.makeSpiderHangout(world, clickedX, clickedY, clickedZ); 
/* 134 */     if (type == 49) OreSpawnMain.MyDungeon.makeRedAntHangout(world, clickedX, clickedY, clickedZ);
/*     */   
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
/* 142 */     return OreSpawnMain.RandomDungeon;
/*     */   }
/*     */ 
/*     */   
/*     */   public Item getItemDropped(int par1, Random par2Random, int par3) {
/* 147 */     return OreSpawnMain.RandomDungeon;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int quantityDropped(Random par1Random) {
/* 155 */     return 1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean canBlockStay(World par1World, int par2, int par3, int par4) {
/* 164 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   @SideOnly(Side.CLIENT)
/*     */   public void registerBlockIcons(IIconRegister iconRegister) {
/* 170 */     this.blockIcon = iconRegister.registerIcon("OreSpawn:" + getUnlocalizedName().substring(5));
/*     */   }
/*     */ }


/* Location:              C:\Users\Admin\Downloads\orespawn-1.7.10-20.3-deobf.jar!\danger\orespawn\DungeonSpawnerBlock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */