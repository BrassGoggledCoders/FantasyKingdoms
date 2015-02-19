package fantasykingdoms.common.init;

import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.blocks.BaseBlock;
import fantasykingdoms.common.blocks.BlockGemstoneOre;
import fantasykingdoms.common.blocks.BlockOreFK;
import fantasykingdoms.common.blocks.blockAmethystOre;
import fantasykingdoms.common.blocks.blockCopperOre;
import fantasykingdoms.common.blocks.blockRubyOre;
import fantasykingdoms.common.blocks.blockSapphireOre;
import fantasykingdoms.common.blocks.blockTinOre;

public class BlockRegistry
{

    public static final BlockGemstoneOre RubyOre = new blockRubyOre();
    public static final BlockGemstoneOre SapphireOre = new blockSapphireOre();
    public static final BlockGemstoneOre AmethystOre = new blockAmethystOre();

    public static final BlockOreFK CopperOre = new blockCopperOre();
    public static final BlockOreFK TinOre = new blockTinOre();

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(RubyOre, "BlockRubyOre");
        GameRegistry.registerBlock(SapphireOre, "BlockSapphireOre");
        GameRegistry.registerBlock(AmethystOre, "BlockAmethystOre");
        GameRegistry.registerBlock(CopperOre, "BlockCopperOre");
        GameRegistry.registerBlock(TinOre, "BlockTinOre");
        blockSilverOre = new BaseBlock(Material.rock).setBlockName("blockSilverOre");
        GameRegistry.registerBlock(blockSilverOre, "BlockSilverOre");
    }
}
