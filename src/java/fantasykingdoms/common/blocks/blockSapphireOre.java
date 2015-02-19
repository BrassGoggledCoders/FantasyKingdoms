package fantasykingdoms.common.blocks;

import fantasykingdoms.common.Init.BlockRegistry;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Toby on 19/02/2015.
 */
public class blockSapphireOre extends BlockGemstoneOre
{
    public blockSapphireOre()
    {
        super();
        this.setBlockName("SapphireOre");
        this.canSilkHarvest();
    }

    public Item getItemDropped(int i, Random random, int j)
    {
        return this == BlockRegistry.SapphireOre ? ItemRegistry.Sapphire : Item.getItemFromBlock(this);
    }
}
