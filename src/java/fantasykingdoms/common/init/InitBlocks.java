package fantasykingdoms.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.blocks.BaseBlock;
import fantasykingdoms.common.blocks.BlockGemstoneOre;
import fantasykingdoms.common.blocks.BlockOre;
import fantasykingdoms.common.blocks.dwarven.BlockBarrel;
import fantasykingdoms.common.blocks.dwarven.BlockExplosiveBarrel;

import net.minecraftforge.fluids.Fluid;

import boilerplate.common.baseclasses.BaseItemBlockWithMetadata;

public class InitBlocks
{
	public static Fluid beerFluid, treasureFluid;

	public static Block blockGemOre;
	public static Block blockMetalOre;

	public static Block blockBarrel;
	public static Block blockExplosiveBarrel;

	public static Block blockStygiumBlock;

	public static Block blockAltar;

	public static void registerBlocks()
	{
		blockGemOre = new BlockGemstoneOre().setBlockName("blockGemOre");
		GameRegistry.registerBlock(blockGemOre, BaseItemBlockWithMetadata.class, "BlockGemOre");
		blockMetalOre = new BlockOre().setBlockName("blockMetalOre");
		GameRegistry.registerBlock(blockMetalOre, BaseItemBlockWithMetadata.class, "BlockMetalOre");

		blockBarrel = new BlockBarrel().setBlockName("blockBarrel");
		GameRegistry.registerBlock(blockBarrel, "BlockBarrel");
		blockExplosiveBarrel = new BlockExplosiveBarrel().setBlockName("blockExplosiveBarrel");
		GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");

		blockStygiumBlock = new BaseBlock(Material.anvil).setBlockName("blockStygiumBlock");
		GameRegistry.registerBlock(blockStygiumBlock, "BlockStygiumBlock");

		blockAltar = new BaseBlock(Material.anvil).setBlockName("blockAltar");
		GameRegistry.registerBlock(blockAltar, "BlockAltar");

	}
}
