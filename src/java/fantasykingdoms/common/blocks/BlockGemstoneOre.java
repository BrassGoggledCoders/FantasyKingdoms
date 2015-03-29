package fantasykingdoms.common.blocks;

import java.util.Random;

import net.minecraft.item.Item;

public class BlockGemstoneOre extends BlockOre
{
	private Item item;

	public BlockGemstoneOre(Item gemItem)
	{
		super();
		this.item = gemItem;
		this.setStepSound(soundTypeStone);
		this.setHardness(2.0F);
	}

	@Override
	public boolean canSilkHarvest()
	{
		return true;
	}

	@Override
	public Item getItemDropped(int i, Random random, int j)
	{
		return item;
	}
}
