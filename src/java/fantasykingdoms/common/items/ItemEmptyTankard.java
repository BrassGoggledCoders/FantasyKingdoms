package fantasykingdoms.common.items;

import fantasykingdoms.common.Init.BlockRegistry;
import fantasykingdoms.common.Init.ItemRegistry;
import fantasykingdoms.common.tiles.TileBarrel;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
		if (world.getBlock(x, y, z) == BlockRegistry.blockBarrel && tile.getBeerType() != "empty" && tile.getBeerLevel() > 0)
		{
			tile.setBeerLevel(tile.getBeerLevel() - 1);
			if (tile.getBeerLevel() == 0)
			{
				tile.setBeerType("empty");
			}
			player.destroyCurrentEquippedItem();
			player.inventory.addItemStackToInventory(new ItemStack(ItemRegistry.itemFullTankard));
			return true;
		}

		return false;
	}
}
