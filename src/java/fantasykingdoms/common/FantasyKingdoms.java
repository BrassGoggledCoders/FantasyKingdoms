package fantasykingdoms.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.init.InitRecipes;
import fantasykingdoms.common.util.LogHelper;
import fantasykingdoms.common.util.MaterialHelper;
import fantasykingdoms.common.util.OreDictionaryHandler;
import fantasykingdoms.common.util.Reference;

@Mod(modid = Reference.MODID, name = Reference.Name, version = Reference.Version, dependencies = "required-after:boilerplate; required-after:Baubles")
public class FantasyKingdoms
{

	@Mod.Instance("FantasyKingdoms")
	public static FantasyKingdoms modInstance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		MaterialHelper.initializeMaterials();
		InitItems.registerItems();
		InitBlocks.registerBlocks();

		LogHelper.info("Pre-Initilisation successfully completed");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		OreDictionaryHandler.registerOres();
		InitRecipes.init();

		LogHelper.info("Initilisation successfully completed");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post-Initilisation successfully completed");
	}

	public void serverStart(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandMagic());
	}
}
