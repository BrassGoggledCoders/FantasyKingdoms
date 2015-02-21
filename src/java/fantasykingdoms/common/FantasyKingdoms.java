/*
package fantasykingdoms.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fantasykingdoms.common.Reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.Fluid;

@Mod(modid = Reference.MODID, name = Reference.Name, version = Reference.Version)

public class FantasyKingdoms
{
    public static Fluid beerFluid;
    public static Block blockBeer, blockBarrel, blockExplosiveBarrel;

    public static Item itemEmptyTankard, itemFullTankard;

    @Mod.Instance("fantasykingdoms")
    public static FantasyKingdoms modInstance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        GameRegistry.registerBlock(blockExplosiveBarrel, "BlockExplosiveBarrel");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void serverStart(FMLServerStartingEvent event)
    {
        event.registerServerCommand(new CommandMagic());
    }
}*/
