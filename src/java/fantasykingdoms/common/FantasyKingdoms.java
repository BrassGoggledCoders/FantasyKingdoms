package fantasykingdoms.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid = "fantasykingdoms", name = "Fantast Kingdoms", version = "1.0.0", dependencies = "required-after:boilerplate")
public class FantasyKingdoms
{
	public static Fluid beerFluid;
	public static Block blockBeer;

	public static Item itemEmptyTankard, itemFullTankard;

	@Mod.Instance("fantasykingdoms")
	public static FantasyKingdoms instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		LanguageRegistry.instance().getStringLocalization("itemGroup.fantasykingdoms", "en_US");

		// Blocks
		beerFluid = new FluidBeer("beer").setUnlocalizedName("beerFluid");

		if (!FluidRegistry.registerFluid(beerFluid) && !FluidRegistry.isFluidRegistered("beer"))
			beerFluid = FluidRegistry.getFluid("beer");

		blockBeer = new BlockFluidBeer(beerFluid, Material.water).setBlockName("beerFluidBlock");

		GameRegistry.registerBlock(blockBeer, "blockbeer");

		// Items
		itemEmptyTankard = new ItemEmptyTankard().setUnlocalizedName("itemEmptyTankard");
		itemFullTankard = new ItemTankard().setUnlocalizedName("itemFullTankard");
	}

	@Mod.EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandMagic());
	}
}