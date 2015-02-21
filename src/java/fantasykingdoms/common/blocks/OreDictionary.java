package fantasykingdoms.common.blocks;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitItems;

public class OreDictionary extends net.minecraftforge.oredict.OreDictionary
{
    public static void registerOre()
    {
        net.minecraftforge.oredict.OreDictionary.registerOre("oreRuby", InitBlocks.RubyOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreSapphire", InitBlocks.SapphireOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreAmethyst", InitBlocks.AmethystOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreCopper", InitBlocks.CopperOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreTin", InitBlocks.TinOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreSilver", InitBlocks.SilverOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemRuby", InitItems.itemRuby);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemSapphire", InitItems.itemSapphire);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemAmethyst", InitItems.itemAmethyst);
    }
}
