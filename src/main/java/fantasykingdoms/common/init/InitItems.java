package fantasykingdoms.common.init;

import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

import boilerplate.common.utils.helpers.RegistryHelper;
import fantasykingdoms.common.items.ItemGem;
import fantasykingdoms.common.items.ItemIngot;
import fantasykingdoms.common.items.ItemNormalArmor;
import fantasykingdoms.common.items.ItemNugget;
import fantasykingdoms.common.items.ItemStygiumRing;
import fantasykingdoms.common.items.ItemWizardsKey;
import fantasykingdoms.common.items.dwarven.ItemEmptyTankard;
import fantasykingdoms.common.items.dwarven.ItemRune;
import fantasykingdoms.common.items.dwarven.ItemTankard;
import fantasykingdoms.common.items.tools.ItemModAxe;
import fantasykingdoms.common.items.tools.ItemModHoe;
import fantasykingdoms.common.items.tools.ItemModPickaxe;
import fantasykingdoms.common.items.tools.ItemModShovel;
import fantasykingdoms.common.items.tools.ItemModSword;
import fantasykingdoms.common.lib.ModInfo;
import fantasykingdoms.common.util.MaterialHelper;

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

	public static Item itemPlateHelmet, itemPlateChestplate, itemPlateLeggings, itemPlateBoots;
	// Tunic
	public static Item itemChainmailHelmet, itemChainmailChestplate, itemChainmailLeggings, itemChainmailBoots;
	// Crowned Helmet | Golden, with Red Cloak
	public static Item itemKingHelmet, itemKingChestplate, itemKingLeggings, itemKingBoots;
	//
	public static Item itemHellfireHelmet, itemHellfireChestplate, itemHellfireLeggings, itemHellfireBoots;

	public static Item itemJewelledSword, itemJewelledPickaxe, itemJewelledAxe, itemJewelledShovel, itemJewelledHoe;

	public static Item itemSilverSword, itemSilverPickaxe, itemSilverAxe, itemSilverShovel, itemSilverHoe;

	public static Item itemElvenLongbow, itemElvenShortbow, itemDwarvenCrossbow, itemBolt;

	public static Item itemStoneWarhammer, itemIronWarhammer, itemGoldWarhammer, itemDiamondWarhammer, itemJewelledWarhammer, itemSilverWarhammer,
			itemMithrilWarhammer;

	public static Item itemStoneBattleaxe, itemIronBattleaxe, itemGoldBattleaxe, itemDiamondBattleaxe, itemJewelledBattleaxe, itemSilverBattleaxe,
			itemMithrilBattleaxe;

	public static Item itemStoneMace, itemIronMace, itemGoldMace, itemDiamondMace, itemJewelledMace, itemSilverMace, itemMithrilMace;

	public static Item itemRuneblade;

	public static Item itemStygiumRing;

	public static Item itemWizardsKey;

	public static Item itemRune;

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

		itemPlateHelmet = new ItemNormalArmor(MaterialHelper.ARMOR_PLATE, 0, "plate").setUnlocalizedName("itemHelmetPlate");
		itemPlateChestplate = new ItemNormalArmor(MaterialHelper.ARMOR_PLATE, 1, "plate").setUnlocalizedName("itemChestplatePlate");
		itemPlateLeggings = new ItemNormalArmor(MaterialHelper.ARMOR_PLATE, 2, "plate").setUnlocalizedName("itemLegsPlate");
		itemPlateBoots = new ItemNormalArmor(MaterialHelper.ARMOR_PLATE, 3, "plate").setUnlocalizedName("itemBootsPlate");

		RegistryHelper.registerArmorSet(itemPlateHelmet, itemPlateChestplate, itemPlateLeggings, itemPlateBoots, "Plate", ModInfo.MODID);

		itemChainmailHelmet = new ItemNormalArmor(MaterialHelper.ARMOR_CHAINMAIL, 0, "chainmail").setUnlocalizedName("itemHelmetChainmail");
		itemChainmailChestplate = new ItemNormalArmor(MaterialHelper.ARMOR_CHAINMAIL, 1, "chainmail").setUnlocalizedName("itemChainmailChestplate");
		itemChainmailLeggings = new ItemNormalArmor(MaterialHelper.ARMOR_CHAINMAIL, 2, "chainmail").setUnlocalizedName("itemLegsChainmail");
		itemChainmailBoots = new ItemNormalArmor(MaterialHelper.ARMOR_CHAINMAIL, 3, "chainmail").setUnlocalizedName("itemBootsChainmail");

		RegistryHelper.registerArmorSet(itemChainmailHelmet, itemChainmailChestplate, itemChainmailLeggings, itemChainmailBoots, "Chainmail",
				ModInfo.MODID);

		// Jewelled
		itemJewelledPickaxe = new ItemModPickaxe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemPickaxeJewelled");
		itemJewelledSword = new ItemModSword(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemSwordJewelled");
		itemJewelledShovel = new ItemModShovel(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemShovelJewelled");
		itemJewelledAxe = new ItemModAxe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemAxeJewelled");
		itemJewelledHoe = new ItemModHoe(MaterialHelper.TOOL_JEWELLED).setUnlocalizedName("itemHoeJewelled");

		RegistryHelper.registerToolSet(itemJewelledSword, itemJewelledShovel, itemJewelledPickaxe, itemJewelledAxe, itemJewelledHoe, "Jewelled",
				ModInfo.MODID);

		// Silver
		itemSilverPickaxe = new ItemModPickaxe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemPickaxeSilver");
		itemSilverSword = new ItemModSword(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemSwordSilver");
		itemSilverShovel = new ItemModShovel(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemShovelSilver");
		itemSilverAxe = new ItemModAxe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemAxeSilver");
		itemSilverHoe = new ItemModHoe(MaterialHelper.TOOL_SILVER).setUnlocalizedName("itemHoeSilver");

		RegistryHelper.registerToolSet(itemSilverSword, itemSilverShovel, itemSilverPickaxe, itemSilverAxe, itemSilverHoe, "Silver", ModInfo.MODID);

		itemRune = new ItemRune().setUnlocalizedName("itemRune");
		GameRegistry.registerItem(itemRune, "ItemRune");
	}
}
