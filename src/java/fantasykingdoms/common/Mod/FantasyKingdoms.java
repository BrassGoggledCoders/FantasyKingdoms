package fantasykingdoms.common.Mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import fantasykingdoms.common.CommandMagic;
import fantasykingdoms.common.Init.BlockRegistry;
import fantasykingdoms.common.Init.ItemRegistry;
import fantasykingdoms.common.Reference.Reference;
import fantasykingdoms.common.Util.LogHelper;
import fantasykingdoms.common.blocks.OreDictionary;

@Mod(modid = Reference.MODID, name = Reference.Name, version = Reference.Version)
public class FantasyKingdoms
{

    public static boolean Client;

    @Mod.Instance("FantasyKingdoms")
    public static FantasyKingdoms modInstance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

        LanguageRegistry.instance().getStringLocalization("itemGroup.fantasykingdoms", "en_US");

        ItemRegistry.registerItems();
        BlockRegistry.registerBlocks();
        LogHelper.info("Pre-Initilisation successfully completed");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        OreDictionary.registerOre();

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

    public static void Client()
    {
     if(Client) return;
        Client = true;
    }
}