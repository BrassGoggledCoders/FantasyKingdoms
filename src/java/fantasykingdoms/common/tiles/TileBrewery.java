package fantasykingdoms.common.tiles;

import net.minecraft.inventory.IInventory;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

import boilerplate.common.baseclasses.BaseTileWithInventory;

public class TileBrewery extends BaseTileWithInventory implements IInventory
{
	public FluidTank waterTank;

	public TileBrewery()
	{
		super(1);
		this.waterTank = new FluidTank(new FluidStack(FluidRegistry.WATER, 0), 5000);
	}

}
