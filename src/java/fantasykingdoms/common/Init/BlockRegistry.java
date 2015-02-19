package fantasykingdoms.common.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import fantasykingdoms.common.blocks.*;
import net.minecraft.block.material.Material;

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
