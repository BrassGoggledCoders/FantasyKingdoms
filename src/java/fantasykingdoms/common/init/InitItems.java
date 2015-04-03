package fantasykingdoms.common.init;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

import fantasykingdoms.common.items.ItemGem;
import fantasykingdoms.common.items.ItemIngot;
import fantasykingdoms.common.items.ItemModAxe;
import fantasykingdoms.common.items.ItemModHoe;
import fantasykingdoms.common.items.ItemModPickaxe;
import fantasykingdoms.common.items.ItemModShovel;
import fantasykingdoms.common.items.ItemModSword;
import fantasykingdoms.common.items.ItemNugget;
import fantasykingdoms.common.items.ItemStygiumRing;
import fantasykingdoms.common.items.ItemWizardsKey;
import fantasykingdoms.common.items.dwarven.ItemEmptyTankard;
import fantasykingdoms.common.items.dwarven.ItemRune;
import fantasykingdoms.common.items.dwarven.ItemSigil;
import fantasykingdoms.common.items.dwarven.ItemTankard;
import fantasykingdoms.common.lib.Reference;
import fantasykingdoms.common.util.MaterialHelper;
import boilerplate.common.utils.helpers.RegistryHelper;

/**
 * Created by Toby on 20/02/2015.
 */
public class InitItems
{
	public static Item itemGem;
	public static Item itemIngot;
	public static Item itemNugget;

	public static Item itemEmptyTankard;
	public static Item itemFullTankard;

	public static Item itemStygiumRing;

	public static Item itemJewelledSword, itemJewelledPickaxe, itemJewelledAxe, itemJewelledShovel, itemJewelledHoe;

	public static Item itemSilverSword, itemSilverPickaxe, itemSilverAxe, itemSilverShovel, itemSilverHoe;

	public static Item itemElvenLongbow, itemElvenShortbow, itemDwarvenCrossbow, itemBolt;

	public static Item itemStoneHammer, itemIronHammer, itemGoldHammer, itemDiamondHammer, itemJewelledHammer, itemSilverHammer, itemMithrilHammer;

	public static Item itemWizardsKey;

	public static Item itemRune, itemSigil, itemRunicAmulet, itemRunicRing;

	public static void registerItems()
	{
		itemGem = new ItemGem().setUnlocalizedName("itemGem");
		GameRegistry.registerItem(itemGem, "ItemGem");
		itemIngot = new ItemIngot().setUnlocalizedName("itemIngot");
		GameRegistry.registerItem(itemIngot, "ItemIngot");
		itemNugget = new ItemNugget().setUnlocalizedName("itemNugget");
		GameRegistry.registerItem(itemNugget, "ItemNugget");

		itemStygiumRing = new ItemStygiumRing().setUnlocalizedName("itemStygiumRing");
		GameRegistry.registerItem(itemStygiumRing, "ItemStygiumRing");

		itemEmptyTankard = new ItemEmptyTankard().setUnlocalizedName("itemEmptyTankard");
		GameRegistry.registerItem(itemEmptyTankard, "ItemEmptyTankard");
		itemFullTankard = new ItemTankard().setUnlocalizedName("itemFullTankard");
		GameRegistry.registerItem(itemFullTankard, "ItemTankard");

		itemWizardsKey = new ItemWizardsKey().setUnlocalizedName("itemWizardsKey");
		// GameRegistry.registerItem(itemWizardsKey, "ItemWizardsKey");

		// Jewelled
		itemJewelledPickaxe = new ItemModPickaxe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemPickaxeJewelled");
		itemJewelledSword = new ItemModSword(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemSwordJewelled");
		itemJewelledShovel = new ItemModShovel(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemShovelJewelled");
		itemJewelledAxe = new ItemModAxe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemAxeJewelled");
		itemJewelledHoe = new ItemModHoe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemHoeJewelled");

		RegistryHelper.registerToolSet(itemJewelledSword, itemJewelledShovel, itemJewelledPickaxe, itemJewelledAxe, itemJewelledHoe, "Jewelled",
				Reference.MODID);

		// Silver
		itemSilverPickaxe = new ItemModPickaxe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemPickaxeSilver");
		itemSilverSword = new ItemModSword(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemSwordSilver");
		itemSilverShovel = new ItemModShovel(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemShovelSilver");
		itemSilverAxe = new ItemModAxe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemAxeSilver");
		itemSilverHoe = new ItemModHoe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemHoeSilver");

		RegistryHelper.registerToolSet(itemSilverSword, itemSilverShovel, itemSilverPickaxe, itemSilverAxe, itemSilverHoe, "Silver", Reference.MODID);

		itemRune = new ItemRune().setUnlocalizedName("itemRune");
		GameRegistry.registerItem(itemRune, "ItemRune");
		itemSigil = new ItemSigil().setUnlocalizedName("itemSigil");
		GameRegistry.registerItem(itemSigil, "ItemSigil");
	}
}
