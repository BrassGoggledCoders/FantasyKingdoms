package fantasykingdoms.common.tiles;

import net.minecraft.inventory.IInventory;

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

	}
}
