package fantasykingdoms.common.blocks;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import fantasykingdoms.common.init.InitItems;

public class BlockGemstoneOre extends BlockOre
{

	public BlockGemstoneOre()
	{
		super();
		this.setHardness(2.0F);
	}

	@Override
	public boolean canSilkHarvest()
	{
		return true;
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		ArrayList<ItemStack> drop = new ArrayList<ItemStack>();

		drop.add(new ItemStack(InitItems.itemGem, metadata));

		return drop;
	}
}
