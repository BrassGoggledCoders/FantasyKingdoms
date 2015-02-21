package fantasykingdoms.common.blocks;

import java.util.Random;

import net.minecraft.item.Item;

import fantasykingdoms.common.init.BlockRegistry;
import fantasykingdoms.common.init.ItemRegistry;

/**
 * Created by Toby on 19/02/2015.
 */
public class blockAmethystOre extends BlockGemstoneOre
{
    public blockAmethystOre()
    {
        super();
        this.setBlockName("AmethystOre");
        this.canSilkHarvest();
    }

    public Item getItemDropped(int i, Random random, int j)
    {
        return this == BlockRegistry.RubyOre ? ItemRegistry.itemAmethyst : Item.getItemFromBlock(this);
    }
}
