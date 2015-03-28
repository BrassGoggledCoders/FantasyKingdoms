package fantasykingdoms.common.init;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.items.BaseItem;
import fantasykingdoms.common.items.ItemEmptyTankard;
import fantasykingdoms.common.items.ItemModAxe;
import fantasykingdoms.common.items.ItemModHoe;
import fantasykingdoms.common.items.ItemModPickaxe;
import fantasykingdoms.common.items.ItemModShovel;
import fantasykingdoms.common.items.ItemModSword;
import fantasykingdoms.common.items.ItemStygiumRing;
import fantasykingdoms.common.items.ItemTankard;
import fantasykingdoms.common.util.MaterialHelper;
import boilerplate.common.utils.helpers.RegistryHelper;

/**
 * Created by Toby on 20/02/2015.
 */
public class InitItems
{
	public static Item itemRuby, itemSapphire, itemAmethyst;
	public static Item itemCopperIngot, itemTinIngot, itemSilverIngot, itemMithrilIngot;

	public static Item itemEmptyTankard;
	public static Item itemFullTankard;

	public static Item itemStygiumIngot, itemStygiumNugget, itemStygiumRing;

	public static Item itemJewelledSword, itemJewelledPickaxe, itemJewelledAxe, itemJewelledShovel, itemJewelledHoe;

	public static Item itemElvenLongbow, itemElvenShortbow;

	public static Item itemDwarvenCrossbow;

	public static void registerItems()
	{
		itemRuby = new BaseItem().setUnlocalizedName("itemRuby");
		GameRegistry.registerItem(itemRuby, "ItemRuby");
		itemSapphire = new BaseItem().setUnlocalizedName("itemSapphire");
		GameRegistry.registerItem(itemSapphire, "ItemSapphire");
		itemAmethyst = new BaseItem().setUnlocalizedName("itemAmethyst");
		GameRegistry.registerItem(itemAmethyst, "ItemAmethyst");

		itemCopperIngot = new BaseItem().setUnlocalizedName("itemCopperIngot");
		GameRegistry.registerItem(itemCopperIngot, "itemCopperIngot");
		itemTinIngot = new BaseItem().setUnlocalizedName("itemTinIngot");
		GameRegistry.registerItem(itemTinIngot, "ItemTinIngot");
		itemSilverIngot = new BaseItem().setUnlocalizedName("itemSilverIngot");
		GameRegistry.registerItem(itemSilverIngot, "ItemSilverIngot");
		itemMithrilIngot = new BaseItem().setUnlocalizedName("itemMithrilIngot");
		GameRegistry.registerItem(itemMithrilIngot, "ItemMithrilIngot");

		itemStygiumIngot = new BaseItem().setUnlocalizedName("itemStygiumIngot");
		GameRegistry.registerItem(itemStygiumIngot, "ItemStygiumIngot");
		itemStygiumNugget = new BaseItem().setUnlocalizedName("itemStgyiumNugget");
		GameRegistry.registerItem(itemStygiumNugget, "ItemStygiumNugget");

		itemStygiumRing = new ItemStygiumRing().setUnlocalizedName("itemStygiumRing");
		GameRegistry.registerItem(itemStygiumRing, "ItemStygiumRing");

		itemEmptyTankard = new ItemEmptyTankard().setUnlocalizedName("itemEmptyTankard");
		GameRegistry.registerItem(itemEmptyTankard, "ItemEmptyTankard");
		itemFullTankard = new ItemTankard().setUnlocalizedName("itemFullTankard");
		GameRegistry.registerItem(itemFullTankard, "ItemTankard");

		// Jewelled
		itemJewelledPickaxe = new ItemModPickaxe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemPickaxeJewelled");
		itemJewelledSword = new ItemModSword(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemSwordJewelled");
		itemJewelledShovel = new ItemModShovel(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemShovelJewelled");
		itemJewelledAxe = new ItemModAxe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemAxeJewelled");
		itemJewelledHoe = new ItemModHoe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemHoeJewelled");

		RegistryHelper.registerToolSet(itemJewelledSword, itemJewelledShovel, itemJewelledPickaxe, itemJewelledAxe, itemJewelledHoe, "Jewelled",
				"fantasykingdoms");
	}
}
