package fantasykingdoms.common.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockWithItemDrop extends BaseBlock
{
	Item itemToDrop;

	public BlockWithItemDrop(Material material, Item itemToDrop)
	{
		super(material);
		this.itemToDrop = itemToDrop;
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random p_149745_1_)
	{
		return 1;
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	{
		return itemToDrop;
	}
}
