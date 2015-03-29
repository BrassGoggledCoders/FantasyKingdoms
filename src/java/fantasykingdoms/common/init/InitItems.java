package fantasykingdoms.common.init;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.items.BaseItem;
import fantasykingdoms.common.items.ItemModAxe;
import fantasykingdoms.common.items.ItemModHoe;
import fantasykingdoms.common.items.ItemModPickaxe;
import fantasykingdoms.common.items.ItemModShovel;
import fantasykingdoms.common.items.ItemModSword;
import fantasykingdoms.common.items.ItemStygiumRing;
import fantasykingdoms.common.items.dwarven.ItemEmptyTankard;
import fantasykingdoms.common.items.dwarven.ItemTankard;
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

	public static Item itemSilverSword, itemSilverPickaxe, itemSilverAxe, itemSilverShovel, itemSilverHoe;

	public static Item itemElvenLongbow, itemElvenShortbow, itemDwarvenCrossbow, itemBolt;

	public static Item itemStoneHammer, itemIronHammer, itemGoldHammer, itemDiamondHammer, itemJewelledHammer, itemSilverHammer, itemMithrilHammer;

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
		itemStygiumNugget = new BaseItem().setUnlocalizedName("itemStygiumNugget");
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

		// Silver
		itemSilverPickaxe = new ItemModPickaxe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemPickaxeSilver");
		itemSilverSword = new ItemModSword(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemSwordSilver");
		itemSilverShovel = new ItemModShovel(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemShovelSilver");
		itemSilverAxe = new ItemModAxe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemAxeSilver");
		itemSilverHoe = new ItemModHoe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemHoeSilver");

		RegistryHelper.registerToolSet(itemSilverSword, itemSilverShovel, itemSilverPickaxe, itemSilverAxe, itemSilverHoe, "Silver",
				"fantasykingdoms");
	}
}
