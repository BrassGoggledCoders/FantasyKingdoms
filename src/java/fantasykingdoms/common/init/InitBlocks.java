package fantasykingdoms.common.init;

import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.blocks.BaseBlock;
import fantasykingdoms.common.blocks.BaseContainerBlock;
import fantasykingdoms.common.blocks.BlockBarrel;
import fantasykingdoms.common.blocks.BlockExplosiveBarrel;
import fantasykingdoms.common.blocks.BlockGemstoneOre;
import fantasykingdoms.common.blocks.BlockOreFK;
import fantasykingdoms.common.blocks.blockAmethystOre;
import fantasykingdoms.common.blocks.blockCopperOre;
import fantasykingdoms.common.blocks.blockRubyOre;
import fantasykingdoms.common.blocks.blockSapphireOre;
import fantasykingdoms.common.blocks.blockSilverOre;
import fantasykingdoms.common.blocks.blockTinOre;

import net.minecraftforge.fluids.Fluid;

public class InitBlocks
{

	public static Fluid beerFluid;

	public static final BlockGemstoneOre RubyOre = new blockRubyOre();
	public static final BlockGemstoneOre SapphireOre = new blockSapphireOre();
	public static final BlockGemstoneOre AmethystOre = new blockAmethystOre();

	public static final BlockOreFK CopperOre = new blockCopperOre();
	public static final BlockOreFK TinOre = new blockTinOre();
	public static final BlockOreFK SilverOre = new blockSilverOre();

	public static final BaseContainerBlock blockBarrel = new BlockBarrel(Material.wood);
	public static final BaseBlock blockExplosiveBarrel = new BlockExplosiveBarrel(Material.wood);

	public static void registerBlocks()
	{
		GameRegistry.registerBlock(RubyOre, "BlockRubyOre");
		GameRegistry.registerBlock(SapphireOre, "BlockSapphireOre");
		GameRegistry.registerBlock(AmethystOre, "BlockAmethystOre");
		GameRegistry.registerBlock(CopperOre, "BlockCopperOre");
		GameRegistry.registerBlock(TinOre, "BlockTinOre");
		GameRegistry.registerBlock(SilverOre, "BlockSilverOre");
		GameRegistry.registerBlock(blockBarrel, "BlockBarrel");
		GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");
	}
}
