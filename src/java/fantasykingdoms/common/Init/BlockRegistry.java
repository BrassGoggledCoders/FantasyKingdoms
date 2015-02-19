package fantasykingdoms.common.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import fantasykingdoms.common.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockRegistry
{

    public static final BlockGemstoneOre RubyOre = new blockRubyOre();
    public static final BlockGemstoneOre SapphireOre = new blockSapphireOre();
    public static final BlockGemstoneOre AmethystOre = new blockAmethystOre();

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(RubyOre, "BlockRubyOre");
        GameRegistry.registerBlock(SapphireOre, "BlockSapphireOre");
        GameRegistry.registerBlock(blockAmethystOre, "BlockAmethystOre");
        blockCopperOre = new BaseBlock(Material.rock).setBlockName("blockCopperOre");
        GameRegistry.registerBlock(blockCopperOre, "BlockCopperOre");
        blockTinOre = new BaseBlock(Material.rock).setBlockName("blockTinOre");
        GameRegistry.registerBlock(blockTinOre, "BlockTinOre");
        blockSilverOre = new BaseBlock(Material.rock).setBlockName("blockSilverOre");
        GameRegistry.registerBlock(blockSilverOre, "BlockSilverOre");
    }
}
