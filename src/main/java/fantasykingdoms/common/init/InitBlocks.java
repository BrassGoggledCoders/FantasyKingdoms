package fantasykingdoms.common.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

import boilerplate.common.baseclasses.items.BaseItemBlockWithMetadata;
import fantasykingdoms.common.blocks.BaseBlock;
import fantasykingdoms.common.blocks.BlockCustomFiniteFluid;
import fantasykingdoms.common.blocks.BlockCustomLeaves;
import fantasykingdoms.common.blocks.BlockCustomLog;
import fantasykingdoms.common.blocks.BlockDecorativeStone;
import fantasykingdoms.common.blocks.BlockFog;
import fantasykingdoms.common.blocks.BlockGemstone;
import fantasykingdoms.common.blocks.BlockGemstoneOre;
import fantasykingdoms.common.blocks.BlockInvisLight;
import fantasykingdoms.common.blocks.BlockMetal;
import fantasykingdoms.common.blocks.BlockOre;
import fantasykingdoms.common.blocks.BlockSolidFog;
import fantasykingdoms.common.blocks.FluidTreasure;
import fantasykingdoms.common.blocks.dwarven.BlockBarrel;
import fantasykingdoms.common.blocks.dwarven.BlockExplosiveBarrel;

public class InitBlocks
{
	public static Block blockGemOre, blockGemstone;
	public static Block blockMetalOre;
	public static Block blockMetal;
	public static Block blockMarble, blockLimestone, blockShadowstone, blockOnyx, blockFlint;

	public static Block blockShadewoodLog, blockShadewoodLeaves, blockShadewoodPlanks, blockElfwoodLog, blockElfwoodLeaves, blockElfwoodPlanks,
			blockYewLog, blockYewLeaves, blockYewPlanks, blockElmLog, blockElmLeaves, blockElmPlanks, blockAshLog, blockAshLeaves, blockAshPlanks,
			blockIronwoodLog, blockIronwoodLeaves, blockIronwoodPlanks, blockDeaththornLog, blockDeaththornLeaves, blockDeaththornPlanks;

	public static Block blockBarrel;
	public static Block blockExplosiveBarrel;

	public static Block blockRunicForge;

	public static Block blockRunicAnvil;

	public static Block blockFog, blockSolidFog;

	public static Block blockInvisLight;

	public static Block blockTreasureFluid;
	public static Fluid treasureFluid;

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

		blockMarble = new BlockDecorativeStone("Marble").setBlockName("blockMarble");
		GameRegistry.registerBlock(blockMarble, BaseItemBlockWithMetadata.class, "BlockMarble");
		blockLimestone = new BlockDecorativeStone("Limestone").setBlockName("blockLimestone");
		GameRegistry.registerBlock(blockLimestone, BaseItemBlockWithMetadata.class, "BlockLimestone");
		blockShadowstone = new BlockDecorativeStone("Shadowstone").setBlockName("blockShadowstone");
		GameRegistry.registerBlock(blockShadowstone, BaseItemBlockWithMetadata.class, "BlockShadowstone");
		blockOnyx = new BlockDecorativeStone("Onyx").setBlockName("blockOnyx");
		GameRegistry.registerBlock(blockOnyx, BaseItemBlockWithMetadata.class, "BlockOnyx");
		blockFlint = new BlockDecorativeStone("Flint").setBlockName("blockFlint");
		GameRegistry.registerBlock(blockFlint, BaseItemBlockWithMetadata.class, "BlockFlint");

		blockShadewoodLog = new BlockCustomLog("Shadewood").setBlockName("blockShadewoodLog");
		GameRegistry.registerBlock(blockShadewoodLog, "BlockShadewoodLog");
		blockShadewoodLeaves = new BlockCustomLeaves("Shadewood").setBlockName("blockShadewoodLeaves");
		GameRegistry.registerBlock(blockShadewoodLeaves, "BlockShadewoodLeaves");
		blockShadewoodPlanks = new BaseBlock(Material.wood).setBlockName("blockShadewoodPlanks");
		GameRegistry.registerBlock(blockShadewoodPlanks, "BlockShadewoodPlanks");
		blockElfwoodLog = new BlockCustomLog("Elfwood").setBlockName("blockElfwoodLog");
		GameRegistry.registerBlock(blockElfwoodLog, "BlockElfwoodLog");
		blockElfwoodLeaves = new BlockCustomLeaves("Elfwood").setBlockName("blockElfwoodLeaves");
		GameRegistry.registerBlock(blockElfwoodLeaves, "BlockElfwoodLeaves");
		blockElfwoodPlanks = new BaseBlock(Material.wood).setBlockName("blockElfwoodPlanks");
		GameRegistry.registerBlock(blockElfwoodPlanks, "BlockElfwoodPlanks");
		blockYewLog = new BlockCustomLog("Yew").setBlockName("blockYewLog");
		GameRegistry.registerBlock(blockYewLog, "BlockYewLog");
		blockYewLeaves = new BlockCustomLeaves("Yew").setBlockName("blockYewLeaves");
		GameRegistry.registerBlock(blockYewLeaves, "BlockYewLeaves");
		blockYewPlanks = new BaseBlock(Material.wood).setBlockName("blockYewPlanks");
		GameRegistry.registerBlock(blockYewPlanks, "BlockYewPlanks");
		blockElmLog = new BlockCustomLog("Elm").setBlockName("blockElmLog");
		GameRegistry.registerBlock(blockElmLog, "BlockElmLog");
		blockElmLeaves = new BlockCustomLeaves("Elm").setBlockName("blockElmLeaves");
		GameRegistry.registerBlock(blockElmLeaves, "BlockElmLeaves");
		blockElmPlanks = new BaseBlock(Material.wood).setBlockName("blockElmPlanks");
		GameRegistry.registerBlock(blockElmPlanks, "BlockElmPlanks");
		blockAshLog = new BlockCustomLog("Ash").setBlockName("blockAshLog");
		GameRegistry.registerBlock(blockAshLog, "BlockAshLog");
		blockAshLeaves = new BlockCustomLeaves("Ash").setBlockName("blockAshLeaves");
		GameRegistry.registerBlock(blockAshLeaves, "BlockAshLeaves");
		blockAshPlanks = new BaseBlock(Material.wood).setBlockName("blockAshPlanks");
		GameRegistry.registerBlock(blockAshPlanks, "BlockAshPlanks");
		blockIronwoodLog = new BlockCustomLog("Ironwood").setBlockName("blockIronwoodLog");
		GameRegistry.registerBlock(blockIronwoodLog, "BlockIronwoodLog");
		blockIronwoodLeaves = new BlockCustomLeaves("Ironwood").setBlockName("blockIronwoodLeaves");
		GameRegistry.registerBlock(blockIronwoodLeaves, "BlockIronwoodLeaves");
		blockIronwoodPlanks = new BaseBlock(Material.wood).setBlockName("blockIronwoodPlanks");
		GameRegistry.registerBlock(blockIronwoodPlanks, "BlockIronwoodPlanks");
		blockDeaththornLog = new BlockCustomLog("Deaththorn").setBlockName("blockDeaththornLog");
		GameRegistry.registerBlock(blockDeaththornLog, "BlockDeaththornLog");
		blockDeaththornLeaves = new BlockCustomLeaves("Deaththorn").setBlockName("blockDeaththornLeaves");
		GameRegistry.registerBlock(blockDeaththornLeaves, "BlockDeaththornLeaves");
		blockDeaththornPlanks = new BaseBlock(Material.wood).setBlockName("blockDeaththornPlanks");
		GameRegistry.registerBlock(blockDeaththornPlanks, "BlockDeaththornPlanks");

		blockBarrel = new BlockBarrel().setBlockName("blockBarrel");
		GameRegistry.registerBlock(blockBarrel, "BlockBarrel");
		blockExplosiveBarrel = new BlockExplosiveBarrel().setBlockName("blockExplosiveBarrel");
		GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");

		blockRunicForge = new BaseBlock(Material.rock).setBlockName("blockRunicForge");
		GameRegistry.registerBlock(blockRunicForge, "BlockRunicForge");

		blockRunicAnvil = new BaseBlock(Material.anvil);
		GameRegistry.registerBlock(blockRunicAnvil, "BlockRunicAnvil");

		blockFog = new BlockFog().setBlockName("blockFog");
		GameRegistry.registerBlock(blockFog, "BlockFog");

		blockSolidFog = new BlockSolidFog().setBlockName("blockSolidFog");
		GameRegistry.registerBlock(blockSolidFog, "BlockSolidFog");

		blockInvisLight = new BlockInvisLight(Material.air).setBlockName("blockInvisLight");
		GameRegistry.registerBlock(blockInvisLight, "BlockInvisLight");

		treasureFluid = new FluidTreasure("treasure").setUnlocalizedName("treasureFluid");
		if (!FluidRegistry.isFluidRegistered("treasure"))
		{
			FluidRegistry.registerFluid(treasureFluid);
		}
		blockTreasureFluid = new BlockCustomFiniteFluid(treasureFluid, Material.water, "treasure").setBlockName("treasureFluidBlock");
		GameRegistry.registerBlock(blockTreasureFluid, "BlockTreasure");
		if (treasureFluid.getBlock() == null)
		{
			treasureFluid.setBlock(blockTreasureFluid);
		}
		else
		{
			((BlockCustomFiniteFluid) blockTreasureFluid).dontOverwriteIcons();
		}
	}
}
