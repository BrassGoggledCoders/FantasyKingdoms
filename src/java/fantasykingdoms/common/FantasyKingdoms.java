package fantasykingdoms.common;

import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitConfig;
import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.init.InitRecipes;
import fantasykingdoms.common.lib.CreativeTabFantasyKingdoms;
import fantasykingdoms.common.lib.Reference;
import fantasykingdoms.common.util.LogHelper;
import fantasykingdoms.common.util.MaterialHelper;
import fantasykingdoms.common.util.OreDictionaryHandler;
import fantasykingdoms.common.worldgen.WorldGeneratorFantasyKingdoms;

import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.Version, dependencies = "required-after:boilerplate; required-after:Baubles")
public class FantasyKingdoms
{
	@Mod.Instance("FantasyKingdoms")
	public static FantasyKingdoms modInstance;

	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;

	public static CreativeTabs tabKingdoms = new CreativeTabFantasyKingdoms(CreativeTabs.getNextID(), Reference.MODID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		InitConfig.init(event);
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

		proxy.init();

		GameRegistry.registerWorldGenerator(new WorldGeneratorFantasyKingdoms(), 1);

		MinecraftForge.EVENT_BUS.register(new EventHandlerForge());
		FMLCommonHandler.instance().bus().register(new EventHandlerFML());

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
