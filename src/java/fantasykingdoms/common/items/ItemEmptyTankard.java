package fantasykingdoms.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import fantasykingdoms.common.FantasyKingdoms;
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
		if (world.getBlock(x, y, z) == FantasyKingdoms.blockBarrel && tile.getBeerType() != "empty" && tile.getBeerLevel() > 0)
		{
			tile.setBeerLevel(tile.getBeerLevel() - 1);
			player.destroyCurrentEquippedItem();
			player.inventory.addItemStackToInventory(new ItemStack(FantasyKingdoms.itemFullTankard));
			return true;
		}

		return false;
	}
}
