package fantasykingdoms.common.init;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.items.BaseItem;
import fantasykingdoms.common.items.ItemEmptyTankard;
import fantasykingdoms.common.items.ItemTankard;
import fantasykingdoms.common.items.itemAmethyst;
import fantasykingdoms.common.items.itemRuby;
import fantasykingdoms.common.items.itemSapphire;

/**
 * Created by Toby on 20/02/2015.
 */
public class InitItems
{
	public static final BaseItem itemRuby = new itemRuby();
	public static final BaseItem itemSapphire = new itemSapphire();
	public static final BaseItem itemAmethyst = new itemAmethyst();

	public static final BaseItem itemEmptyTankard = new ItemEmptyTankard();
	public static final BaseItem itemFullTankard = new ItemTankard();

	public static void registerItems()
	{
		GameRegistry.registerItem(itemRuby, "itemRuby");
		GameRegistry.registerItem(itemSapphire, "itemSapphire");
		GameRegistry.registerItem(itemAmethyst, "itemAmethyst");

		GameRegistry.registerItem(itemEmptyTankard, "ItemEmptyTankard");
		GameRegistry.registerItem(itemFullTankard, "ItemTankard");
	}
}
