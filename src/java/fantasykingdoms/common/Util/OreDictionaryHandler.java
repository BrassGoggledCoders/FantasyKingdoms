package fantasykingdoms.common.util;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler
{
	public static void registerOre()
	{
		OreDictionary.registerOre("oreRuby", InitBlocks.blockRubyOre);
		OreDictionary.registerOre("oreSapphire", InitBlocks.blockSapphireOre);
		OreDictionary.registerOre("oreAmethyst", InitBlocks.blockAmethystOre);
		OreDictionary.registerOre("oreCopper", InitBlocks.blockCopperOre);
		OreDictionary.registerOre("oreTin", InitBlocks.blockTinOre);
		OreDictionary.registerOre("oreSilver", InitBlocks.blockSilverOre);
		OreDictionary.registerOre("gemRuby", InitItems.itemRuby);
		OreDictionary.registerOre("gemSapphire", InitItems.itemSapphire);
		OreDictionary.registerOre("gemAmethyst", InitItems.itemAmethyst);
	}
}
