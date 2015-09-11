package fantasykingdoms.common.tiles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

import boilerplate.common.baseclasses.BaseTileWithInventory;

public class TileRunicAnvil extends BaseTileWithInventory
{
	public TileRunicAnvil()
	{
		super(2);
	}

	@Override
	public void updateEntity()
	{

	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		return null;
	}

}
