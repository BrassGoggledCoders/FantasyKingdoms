package fantasykingdoms.common.blocks;

import fantasykingdoms.common.Init.BlockRegistry;
import fantasykingdoms.common.Init.ItemRegistry;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Toby on 19/02/2015.
 */
public class blockRubyOre extends BlockGemstoneOre
{
    public blockRubyOre()
    {
        super();
        this.setBlockName("RubyOre");
        this.canSilkHarvest();
    }

    public Item getItemDropped(int i, Random random, int j)
    {
        return this == BlockRegistry.RubyOre ? ItemRegistry.itemRuby : Item.getItemFromBlock(this);
    }
}
