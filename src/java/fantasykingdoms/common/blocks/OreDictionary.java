package fantasykingdoms.common.blocks;

import fantasykingdoms.common.Init.BlockRegistry;

public class OreDictionary extends net.minecraftforge.oredict.OreDictionary
{
    public static void registerOre()
    {
        net.minecraftforge.oredict.OreDictionary.registerOre("oreRuby", blockRubyOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreSapphire", blockSapphireOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreAmethyst", blockAmethystOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreCopper", blockCopperOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreTin", blockTinOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("oreSilver", blockSilverOre);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemRuby", itemRuby);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemSapphire", itemSapphire);
        net.minecraftforge.oredict.OreDictionary.registerOre("gemAmethyst", itemAmethyst);
    }
}
