package fantasykingdoms.common.init;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.items.BaseItem;
import fantasykingdoms.common.items.ItemEmptyTankard;
import fantasykingdoms.common.items.ItemTankard;

/**
 * Created by Toby on 20/02/2015.
 */
public class InitItems
{
	public static Item itemRuby;
	public static Item itemSapphire;
	public static Item itemAmethyst;

	public static Item itemEmptyTankard;
	public static Item itemFullTankard;

	public static void registerItems()
	{
		itemRuby = new BaseItem().setUnlocalizedName("itemRuby");
		GameRegistry.registerItem(itemRuby, "itemRuby");
		itemSapphire = new BaseItem().setUnlocalizedName("itemSapphire");
		GameRegistry.registerItem(itemSapphire, "itemSapphire");
		itemAmethyst = new BaseItem().setUnlocalizedName("itemAmethyst");
		GameRegistry.registerItem(itemAmethyst, "itemAmethyst");

		itemEmptyTankard = new ItemEmptyTankard().setUnlocalizedName("itemEmptyTankard");
		GameRegistry.registerItem(itemEmptyTankard, "ItemEmptyTankard");
		itemFullTankard = new ItemTankard().setUnlocalizedName("itemFullTankard");
		GameRegistry.registerItem(itemFullTankard, "ItemTankard");
	}
}
