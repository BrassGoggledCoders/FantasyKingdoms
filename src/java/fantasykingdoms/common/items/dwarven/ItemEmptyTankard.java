package fantasykingdoms.common.items.dwarven;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.items.BaseItem;
import fantasykingdoms.common.tiles.TileBarrel;

public class ItemEmptyTankard extends BaseItem
{
	public ItemEmptyTankard()
	{
		this.setMaxStackSize(1);
		this.setFull3D();
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float px, float py, float pz)
	{
		TileBarrel tile = (TileBarrel) world.getTileEntity(x, y, z);
		if (world.getBlock(x, y, z) == InitBlocks.blockBarrel && tile.getBeerType() != "empty" && tile.getBeerLevel() > 0)
		{
			tile.setBeerLevel(tile.getBeerLevel() - 1);
			if (tile.getBeerLevel() == 0)
			{
				tile.setBeerType("empty");
			}
			player.destroyCurrentEquippedItem();
			player.inventory.addItemStackToInventory(new ItemStack(InitItems.itemFullTankard));
			return true;
		}

		return false;
	}
}
