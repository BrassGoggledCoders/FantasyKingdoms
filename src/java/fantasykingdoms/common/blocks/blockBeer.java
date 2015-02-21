package fantasykingdoms.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
/**
 * Created by Toby on 21/02/2015.
 */
public class blockBeer extends BlockFluidBeer
{
    public static Fluid beerFluid;

    public blockBeer()
    {
        super(beerFluid, Material.water);
        this.setBlockName("beerFluid");

        if (!FluidRegistry.registerFluid(beerFluid) && !FluidRegistry.isFluidRegistered("beer"))
            beerFluid = FluidRegistry.getFluid("beer");

    }
}
