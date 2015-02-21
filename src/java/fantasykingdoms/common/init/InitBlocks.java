package fantasykingdoms.common.init;

import net.minecraft.block.Block;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.blocks.BlockBarrel;
import fantasykingdoms.common.blocks.BlockExplosiveBarrel;
import fantasykingdoms.common.blocks.BlockGemstoneOre;
import fantasykingdoms.common.blocks.BlockOre;

import net.minecraftforge.fluids.Fluid;

public class InitBlocks
{
	public static Fluid beerFluid;

	public static Block blockRubyOre;
	public static Block blockSapphireOre;
	public static Block blockAmethystOre;

	public static Block blockCopperOre;
	public static Block blockTinOre;
	public static Block blockSilverOre;

	public static Block blockBarrel;
	public static Block blockExplosiveBarrel;

	public static void registerBlocks()
	{
		blockRubyOre = new BlockGemstoneOre(InitItems.itemRuby).setBlockName("blockRubyOre");
		GameRegistry.registerBlock(blockRubyOre, "BlockRubyOre");
		blockSapphireOre = new BlockGemstoneOre(InitItems.itemSapphire).setBlockName("blockSapphireOre");
		GameRegistry.registerBlock(blockSapphireOre, "BlockSapphireOre");
		blockAmethystOre = new BlockGemstoneOre(InitItems.itemAmethyst).setBlockName("blockAmethystOre");
		GameRegistry.registerBlock(blockAmethystOre, "BlockAmethystOre");
		blockCopperOre = new BlockOre().setBlockName("blockCopperOre");
		GameRegistry.registerBlock(blockCopperOre, "BlockCopperOre");
		blockTinOre = new BlockOre().setBlockName("blockTinOre");
		GameRegistry.registerBlock(blockTinOre, "BlockTinOre");
		blockSilverOre = new BlockOre().setBlockName("blockSilverOre");
		GameRegistry.registerBlock(blockSilverOre, "BlockSilverOre");

		blockBarrel = new BlockBarrel().setBlockName("blockBarrel");
		GameRegistry.registerBlock(blockBarrel, "BlockBarrel");
		blockExplosiveBarrel = new BlockExplosiveBarrel().setBlockName("blockExplosiveBarrel");
		GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");
	}
}
