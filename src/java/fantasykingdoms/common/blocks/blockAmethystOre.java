package fantasykingdoms.common.blocks;

import fantasykingdoms.common.Init.BlockRegistry;
import net.minecraft.item.Item;

import java.util.Random;

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
        return this == BlockRegistry.RubyOre ? ItemRegistry.Amethyst : Item.getItemFromBlock(this);
    }
}
