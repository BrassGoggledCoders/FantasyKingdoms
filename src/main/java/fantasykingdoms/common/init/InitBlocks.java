package fantasykingdoms.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraftforge.fluids.Fluid;

import boilerplate.common.baseclasses.BaseItemBlockWithMetadata;
import fantasykingdoms.common.blocks.BaseBlock;
import fantasykingdoms.common.blocks.BlockFog;
import fantasykingdoms.common.blocks.BlockGemstone;
import fantasykingdoms.common.blocks.BlockGemstoneOre;
import fantasykingdoms.common.blocks.BlockInvisLight;
import fantasykingdoms.common.blocks.BlockMarble;
import fantasykingdoms.common.blocks.BlockMetal;
import fantasykingdoms.common.blocks.BlockOre;
import fantasykingdoms.common.blocks.BlockShadowstone;
import fantasykingdoms.common.blocks.BlockSolidFog;
import fantasykingdoms.common.blocks.dwarven.BlockBarrel;
import fantasykingdoms.common.blocks.dwarven.BlockExplosiveBarrel;

public class InitBlocks
{
	public static Fluid beerFluid, treasureFluid;

	public static Block blockGemOre, blockGemstone;
	public static Block blockMetalOre;
	public static Block blockMetal;
	public static Block blockMarble, blockShadowstone;

	public static Block blockShadewoodLog, blockShadewoodLeaves, blockShadewoodPlanks;

	public static Block blockBarrel;
	public static Block blockExplosiveBarrel;

	public static Block blockAltar;

	public static Block blockFog, blockSolidFog;

	public static Block blockInvisLight;

	public static void registerBlocks()
	{
		blockGemOre = new BlockGemstoneOre().setBlockName("blockGemOre");
		GameRegistry.registerBlock(blockGemOre, BaseItemBlockWithMetadata.class, "BlockGemOre");
		blockMetalOre = new BlockOre().setBlockName("blockMetalOre");
		GameRegistry.registerBlock(blockMetalOre, BaseItemBlockWithMetadata.class, "BlockMetalOre");
		blockMetal = new BlockMetal().setBlockName("blockMetal");
		GameRegistry.registerBlock(blockMetal, BaseItemBlockWithMetadata.class, "BlockMetal");
		blockGemstone = new BlockGemstone().setBlockName("blockGemstone");
		GameRegistry.registerBlock(blockGemstone, BaseItemBlockWithMetadata.class, "BlockGemstone");
		blockMarble = new BlockMarble().setBlockName("blockMarble");
		GameRegistry.registerBlock(blockMarble, BaseItemBlockWithMetadata.class, "BlockMarble");
		blockShadowstone = new BlockShadowstone().setBlockName("blockShadowstone");
		GameRegistry.registerBlock(blockShadowstone, BaseItemBlockWithMetadata.class, "BlockShadowstone");

		blockBarrel = new BlockBarrel().setBlockName("blockBarrel");
		GameRegistry.registerBlock(blockBarrel, "BlockBarrel");
		blockExplosiveBarrel = new BlockExplosiveBarrel().setBlockName("blockExplosiveBarrel");
		GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");

		blockAltar = new BaseBlock(Material.anvil).setBlockName("blockAltar");
		// GameRegistry.registerBlock(blockAltar, "BlockAltar");

		blockFog = new BlockFog().setBlockName("blockFog");
		GameRegistry.registerBlock(blockFog, "BlockFog");

		blockSolidFog = new BlockSolidFog().setBlockName("blockSolidFog");
		GameRegistry.registerBlock(blockSolidFog, "BlockSolidFog");

		blockInvisLight = new BlockInvisLight(Material.air).setBlockName("blockInvisLight");
		GameRegistry.registerBlock(blockInvisLight, "BlockInvisLight");

	}
}
