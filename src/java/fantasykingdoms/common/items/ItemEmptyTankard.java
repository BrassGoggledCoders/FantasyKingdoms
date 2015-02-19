package fantasykingdoms.common.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import fantasykingdoms.common.FantasyKingdoms;

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
		if (world.getBlock(x, y, z) == FantasyKingdoms.blockBarrel)
		{
			player.destroyCurrentEquippedItem();
			player.inventory.addItemStackToInventory(new ItemStack(FantasyKingdoms.itemEmptyTankard));
			return true;
		}

		return false;
	}
}
