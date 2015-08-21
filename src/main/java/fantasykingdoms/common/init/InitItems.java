package fantasykingdoms.common.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;

import cpw.mods.fml.common.registry.GameRegistry;

import boilerplate.common.baseclasses.items.tools.BaseAxe;
import boilerplate.common.baseclasses.items.tools.BaseHoe;
import boilerplate.common.baseclasses.items.tools.BasePickaxe;
import boilerplate.common.baseclasses.items.tools.BaseShovel;
import boilerplate.common.baseclasses.items.tools.BaseSword;
import boilerplate.common.utils.helpers.RegistryHelper;
import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.items.ItemDeflectionBelt;
import fantasykingdoms.common.items.ItemGem;
import fantasykingdoms.common.items.ItemIngot;
import fantasykingdoms.common.items.ItemNormalArmor;
import fantasykingdoms.common.items.ItemNugget;
import fantasykingdoms.common.items.ItemPotionBelt;
import fantasykingdoms.common.items.ItemPotionRing;
import fantasykingdoms.common.items.ItemStygiumRing;
import fantasykingdoms.common.items.ItemWizardsKey;
import fantasykingdoms.common.items.dwarven.ItemEmptyTankard;
import fantasykingdoms.common.items.dwarven.ItemRune;
import fantasykingdoms.common.items.dwarven.ItemTankard;
import fantasykingdoms.common.items.tools.ItemBattleaxe;
import fantasykingdoms.common.items.tools.ItemLongbow;
import fantasykingdoms.common.items.tools.ItemMace;
import fantasykingdoms.common.items.tools.ItemRuneblade;
import fantasykingdoms.common.items.tools.ItemShortbow;
import fantasykingdoms.common.lib.ModInfo;

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

	public static Item itemMythrilChainHelmet, itemMythrilChainChestplate, itemMythrilChainLeggings, itemMythrilChainBoots;

	public static Item itemMythrilPlateHelmet, itemMythrilPlateChestplate, itemMythrilPlateLeggings, itemMythrilPlateBoots;

	public static Item itemDragonleatherHelmet, itemDragonleatherChestplate, itemDragonleatherLeggings, itemDragonleatherBoots;

	public static Item itemDragonscaleHelmet, itemDragonscaleChestplate, itemDragonscaleLeggings, itemDragonscaleBoots;

	public static Item itemJewelledSword, itemJewelledPickaxe, itemJewelledAxe, itemJewelledShovel, itemJewelledHoe;

	public static Item itemSilverSword, itemSilverPickaxe, itemSilverAxe, itemSilverShovel, itemSilverHoe;

	public static Item itemMythrilSword, itemMythrilPickaxe, itemMythrilAxe, itemMythrilShovel, itemMythrilHoe;

	public static Item itemDragonboneSword, itemDragonbonePickaxe, itemDragonboneAxe, itemDragonboneShovel, itemDragonboneHoe;

	public static Item itemLongbow, itemShortbow, itemCrossbow, itemBolt;

	public static Item itemStoneWarhammer, itemIronWarhammer, itemGoldWarhammer, itemDiamondWarhammer, itemJewelledWarhammer, itemSilverWarhammer,
			itemMithrilWarhammer;

	public static Item itemStoneBattleaxe, itemIronBattleaxe, itemGoldBattleaxe, itemDiamondBattleaxe, itemJewelledBattleaxe, itemSilverBattleaxe,
			itemMithrilBattleaxe;

	public static Item itemStoneMace, itemIronMace, itemGoldMace, itemDiamondMace, itemJewelledMace, itemSilverMace, itemMithrilMace;

	public static Item itemRuneblade;

	public static Item itemStygiumRing;

	public static Item itemWizardsKey;

	public static Item itemRune;

	public static Item itemSpeedBelt, itemDeflectionBelt, itemOneRing;

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

		itemPlateHelmet = new ItemNormalArmor(InitMaterials.ARMOR_PLATE, 0, "plate").setUnlocalizedName("itemHelmetPlate");
		itemPlateChestplate = new ItemNormalArmor(InitMaterials.ARMOR_PLATE, 1, "plate").setUnlocalizedName("itemChestplatePlate");
		itemPlateLeggings = new ItemNormalArmor(InitMaterials.ARMOR_PLATE, 2, "plate").setUnlocalizedName("itemLegsPlate");
		itemPlateBoots = new ItemNormalArmor(InitMaterials.ARMOR_PLATE, 3, "plate").setUnlocalizedName("itemBootsPlate");

		RegistryHelper.registerArmorSet(itemPlateHelmet, itemPlateChestplate, itemPlateLeggings, itemPlateBoots, "Plate", ModInfo.MODID);

		itemChainmailHelmet = new ItemNormalArmor(InitMaterials.ARMOR_CHAINMAIL, 0, "chainmail").setUnlocalizedName("itemHelmetChainmail");
		itemChainmailChestplate = new ItemNormalArmor(InitMaterials.ARMOR_CHAINMAIL, 1, "chainmail").setUnlocalizedName("itemChainmailChestplate");
		itemChainmailLeggings = new ItemNormalArmor(InitMaterials.ARMOR_CHAINMAIL, 2, "chainmail").setUnlocalizedName("itemLegsChainmail");
		itemChainmailBoots = new ItemNormalArmor(InitMaterials.ARMOR_CHAINMAIL, 3, "chainmail").setUnlocalizedName("itemBootsChainmail");

		RegistryHelper.registerArmorSet(itemChainmailHelmet, itemChainmailChestplate, itemChainmailLeggings, itemChainmailBoots, "Chainmail",
				ModInfo.MODID);

		// Jewelled
		itemJewelledPickaxe = new BasePickaxe(InitMaterials.TOOL_JEWELLED, ModInfo.PREFIX).setUnlocalizedName("itemPickaxeJewelled")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemJewelledSword = new BaseSword(InitMaterials.TOOL_JEWELLED, ModInfo.PREFIX).setUnlocalizedName("itemSwordJewelled")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemJewelledShovel = new BaseShovel(InitMaterials.TOOL_JEWELLED, ModInfo.PREFIX).setUnlocalizedName("itemShovelJewelled")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemJewelledAxe = new BaseAxe(InitMaterials.TOOL_JEWELLED, ModInfo.PREFIX).setUnlocalizedName("itemAxeJewelled")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemJewelledHoe = new BaseHoe(InitMaterials.TOOL_JEWELLED, ModInfo.PREFIX).setUnlocalizedName("itemHoeJewelled")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);

		RegistryHelper.registerToolSet(itemJewelledSword, itemJewelledShovel, itemJewelledPickaxe, itemJewelledAxe, itemJewelledHoe, "Jewelled",
				ModInfo.MODID);

		// Silver
		itemSilverPickaxe = new BasePickaxe(InitMaterials.TOOL_SILVER, ModInfo.PREFIX).setUnlocalizedName("itemPickaxeSilver")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemSilverSword = new BaseSword(InitMaterials.TOOL_SILVER, ModInfo.PREFIX).setUnlocalizedName("itemSwordSilver")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemSilverShovel = new BaseShovel(InitMaterials.TOOL_SILVER, ModInfo.PREFIX).setUnlocalizedName("itemShovelSilver")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemSilverAxe = new BaseAxe(InitMaterials.TOOL_SILVER, ModInfo.PREFIX).setUnlocalizedName("itemAxeSilver")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemSilverHoe = new BaseHoe(InitMaterials.TOOL_SILVER, ModInfo.PREFIX).setUnlocalizedName("itemHoeSilver")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);

		RegistryHelper.registerToolSet(itemSilverSword, itemSilverShovel, itemSilverPickaxe, itemSilverAxe, itemSilverHoe, "Silver", ModInfo.MODID);

		// Mythril
		itemMythrilPickaxe = new BasePickaxe(InitMaterials.TOOL_MYTHRIL, ModInfo.PREFIX).setUnlocalizedName("itemPickaxeMythril")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemMythrilSword = new BaseSword(InitMaterials.TOOL_MYTHRIL, ModInfo.PREFIX).setUnlocalizedName("itemSwordMythril")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemMythrilShovel = new BaseShovel(InitMaterials.TOOL_MYTHRIL, ModInfo.PREFIX).setUnlocalizedName("itemShovelMythril")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemMythrilAxe = new BaseAxe(InitMaterials.TOOL_MYTHRIL, ModInfo.PREFIX).setUnlocalizedName("itemAxeMythril")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);
		itemMythrilHoe = new BaseHoe(InitMaterials.TOOL_MYTHRIL, ModInfo.PREFIX).setUnlocalizedName("itemHoeMythril")
				.setCreativeTab(FantasyKingdoms.tabKingdoms);

		RegistryHelper.registerToolSet(itemMythrilSword, itemMythrilShovel, itemMythrilPickaxe, itemMythrilAxe, itemMythrilHoe, "Mythril",
				ModInfo.MODID);

		itemStoneBattleaxe = new ItemBattleaxe(ToolMaterial.STONE).setUnlocalizedName("itemBattleaxeStone");
		GameRegistry.registerItem(itemStoneBattleaxe, "ItemStoneBattleaxe");
		itemIronBattleaxe = new ItemBattleaxe(ToolMaterial.IRON).setUnlocalizedName("itemBattleaxeIron");
		GameRegistry.registerItem(itemIronBattleaxe, "ItemIronBattleaxe");
		itemGoldBattleaxe = new ItemBattleaxe(ToolMaterial.GOLD).setUnlocalizedName("itemBattleaxeGold");
		GameRegistry.registerItem(itemGoldBattleaxe, "ItemGoldBattleaxe");
		itemDiamondBattleaxe = new ItemBattleaxe(ToolMaterial.EMERALD).setUnlocalizedName("itemBattleaxeDiamond");
		GameRegistry.registerItem(itemDiamondBattleaxe, "ItemDiamondBattleaxe");
		itemJewelledBattleaxe = new ItemBattleaxe(InitMaterials.TOOL_JEWELLED).setUnlocalizedName("itemBattleaxeJewelled");
		GameRegistry.registerItem(itemJewelledBattleaxe, "ItemJewelledBattleaxe");
		itemSilverBattleaxe = new ItemBattleaxe(InitMaterials.TOOL_SILVER).setUnlocalizedName("itemBattleaxeSilver");
		GameRegistry.registerItem(itemSilverBattleaxe, "ItemSilverBattleaxe");

		itemStoneMace = new ItemMace(ToolMaterial.STONE).setUnlocalizedName("itemMaceStone");
		GameRegistry.registerItem(itemStoneMace, "ItemStoneMace");
		itemIronMace = new ItemMace(ToolMaterial.IRON).setUnlocalizedName("itemMaceIron");
		GameRegistry.registerItem(itemIronMace, "ItemIronMace");
		itemGoldMace = new ItemMace(ToolMaterial.GOLD).setUnlocalizedName("itemMaceGold");
		GameRegistry.registerItem(itemGoldMace, "ItemGoldMace");
		itemDiamondMace = new ItemMace(ToolMaterial.EMERALD).setUnlocalizedName("itemMaceDiamond");
		GameRegistry.registerItem(itemDiamondMace, "ItemDiamondMace");
		itemJewelledMace = new ItemMace(InitMaterials.TOOL_JEWELLED).setUnlocalizedName("itemMaceJewelled");
		GameRegistry.registerItem(itemJewelledMace, "ItemJewelledMace");
		itemSilverMace = new ItemMace(InitMaterials.TOOL_SILVER).setUnlocalizedName("itemMaceSilver");
		GameRegistry.registerItem(itemSilverMace, "ItemSilverMace");

		itemShortbow = new ItemShortbow().setUnlocalizedName("itemShortbow");
		GameRegistry.registerItem(itemShortbow, "ItemShortbow");
		itemLongbow = new ItemLongbow().setUnlocalizedName("itemLongbow");
		GameRegistry.registerItem(itemLongbow, "ItemLongbow");

		itemRuneblade = new ItemRuneblade(InitMaterials.HTOOL_RUNEBLADE).setUnlocalizedName("itemRuneblade");
		GameRegistry.registerItem(itemRuneblade, "ItemRuneblade");

		itemRune = new ItemRune().setUnlocalizedName("itemRune");
		GameRegistry.registerItem(itemRune, "ItemRune");

		itemSpeedBelt = new ItemPotionBelt(Potion.moveSpeed.id).setUnlocalizedName("itemSpeedBelt");
		GameRegistry.registerItem(itemSpeedBelt, "ItemSpeedBelt");

		itemDeflectionBelt = new ItemDeflectionBelt().setUnlocalizedName("itemDeflectionBelt");
		GameRegistry.registerItem(itemDeflectionBelt, "ItemDeflectionBelt");

		itemOneRing = new ItemPotionRing(Potion.invisibility.id).setUnlocalizedName("itemOneRing");
		GameRegistry.registerItem(itemOneRing, "ItemOneRing");
	}
}
