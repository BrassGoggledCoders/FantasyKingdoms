package fantasykingdoms.common.tiles;

import net.minecraft.tileentity.TileEntity;

import net.minecraftforge.fluids.FluidTank;

public class TileBarrel extends TileEntity
{
	public FluidTank beerTank;

	public TileBarrel()
	{
		super();

		// this.beerTank = new FluidTank(new FluidStack(FluidRegistry.WATER, 0),
		// 5000);
	}
}
