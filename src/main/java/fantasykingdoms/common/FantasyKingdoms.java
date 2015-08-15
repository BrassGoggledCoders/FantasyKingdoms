package fantasykingdoms.common;

import net.minecraft.creativetab.CreativeTabs;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraftforge.common.MinecraftForge;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitConfig;
import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.init.InitMaterials;
import fantasykingdoms.common.init.InitRecipes;
import fantasykingdoms.common.lib.CreativeTabFantasyKingdoms;
import fantasykingdoms.common.lib.ModInfo;
import fantasykingdoms.common.lib.events.EventHandlerFML;
import fantasykingdoms.common.lib.events.EventHandlerForge;
import fantasykingdoms.common.util.OreDictionaryHandler;
import fantasykingdoms.common.worldgen.WorldGeneratorFantasyKingdoms;

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.Version, dependencies = "required-after:boilerplate; required-after:Baubles")
public class FantasyKingdoms
{
	/**
	 * Opposite to shadewood, More stones & woods (elm, ash, yew, ironwood,
	 * deaththorn) Decorative dwarven blocks (runic patterns, decorative single
	 * rune blocks, gilded blocks etc), broadsword, shortsword, mythril tools
	 * and armor
	 */
	@Mod.Instance("FantasyKingdoms")
	public static FantasyKingdoms modInstance;

	@SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.COMMON_PROXY)
	public static CommonProxy proxy;

	public static CreativeTabs tabKingdoms = new CreativeTabFantasyKingdoms(ModInfo.MODID);

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		InitConfig.init(event);
		InitMaterials.initializeMaterials();
		InitItems.registerItems();
		InitBlocks.registerBlocks();

		FMLLog.info("Pre-Initilisation successfully completed");
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

		FMLLog.info("Initilisation successfully completed");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		FMLLog.info("Post-Initilisation successfully completed");
	}

	public void serverStart(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandMagic());
	}
}
