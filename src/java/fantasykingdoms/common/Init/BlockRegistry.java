package fantasykingdoms.common.Init;

import cpw.mods.fml.common.registry.GameRegistry;
import fantasykingdoms.common.blocks.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class BlockRegistry
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

    public static final BlockFluidClassic blockFluidBeer = new BlockFluidBeer(beerFluid, Material.water);
    public static final BlockFluidBeer blockBeer = new blockBeer();

    public static void registerBlocks()
    {
        GameRegistry.registerBlock(RubyOre, "BlockRubyOre");
        GameRegistry.registerBlock(SapphireOre, "BlockSapphireOre");
        GameRegistry.registerBlock(AmethystOre, "BlockAmethystOre");
        GameRegistry.registerBlock(CopperOre, "BlockCopperOre");
        GameRegistry.registerBlock(TinOre, "BlockTinOre");
        GameRegistry.registerBlock(SilverOre, "BlockSilverOre");
        GameRegistry.registerBlock(blockFluidBeer, "beerFluidBlock");
        GameRegistry.registerBlock(blockBeer, "blockBeer");
        GameRegistry.registerBlock(blockBarrel, "BlockBarrel");
        GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");
    }
}
