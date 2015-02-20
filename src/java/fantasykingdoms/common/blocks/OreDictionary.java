package fantasykingdoms.common.blocks;

import fantasykingdoms.common.Init.BlockRegistry;
import fantasykingdoms.common.Init.ItemRegistry;

public class OreDictionary extends net.minecraftforge.oredict.OreDictionary
{
    public static void registerOre()
    {
        net.minecraftforge.oredict.OreDictionary.registerOre("oreRuby", BlockRegistry.RubyOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreSapphire", BlockRegistry.SapphireOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreAmethyst", BlockRegistry.AmethystOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreCopper", BlockRegistry.CopperOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreTin", BlockRegistry.TinOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreSilver", BlockRegistry.SilverOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemRuby", ItemRegistry.itemRuby);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemSapphire", ItemRegistry.itemSapphire);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemAmethyst", ItemRegistry.itemAmethyst);
    }
}
