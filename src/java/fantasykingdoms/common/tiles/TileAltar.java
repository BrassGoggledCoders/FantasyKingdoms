package fantasykingdoms.common.tiles;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;

import fantasykingdoms.common.init.InitItems;
import boilerplate.common.baseclasses.BaseTileWithInventory;

public class TileAltar extends BaseTileWithInventory implements IInventory
{
	public TileAltar()
	{
		super(1);
	}

	@Override
	public String getInventoryName()
	{
		return "Altar";
	}

	@Override
	public void updateEntity()
	{
		if (this.inventory[0].getItem() == InitItems.itemSilverIngot)
		{
			this.inventory[0] = new ItemStack(InitItems.itemStygiumIngot);
		}
	}
}
