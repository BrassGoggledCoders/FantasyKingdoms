package fantasykingdoms.common.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import net.minecraftforge.common.util.EnumHelper;

public class InitMaterials
{
	public static ToolMaterial HTOOL_RUNEBLADE;
	public static ToolMaterial TOOL_JEWELLED, TOOL_SILVER, TOOL_MYTHRIL, TOOL_DRAGONBONE;
	public static ArmorMaterial ARMOR_PLATE, ARMOR_CHAINMAIL, ARMOR_MYTHRILCHAIN, ARMOR_MYTHRILPLATE, ARMOR_DRAGONLEATHER, ARMOR_DRAGONSCALE;

	public static void initializeMaterials()
	{
		TOOL_JEWELLED = EnumHelper.addToolMaterial("TOOL_JEWELLED", 2, 200, 12.0F, 0.0F, 32);
		TOOL_SILVER = EnumHelper.addToolMaterial("TOOL_SILVER", 2, 128, 6.0F, 0.0F, 12);
		TOOL_MYTHRIL = EnumHelper.addToolMaterial("TOOL_MYTHRIL", 4, 2000, 12.0F, 3.0F, 20);
		TOOL_DRAGONBONE = EnumHelper.addToolMaterial("TOOL_DRAGONBONE", 4, 4000, 15.0F, 4.0F, 40);

		HTOOL_RUNEBLADE = EnumHelper.addToolMaterial("HTOOL_RUNEBLADE", 0, 128, 0, 0.0F, 40);

		// CLOTH(5, new int[]{1, 3, 2, 1}, 15),
		// IRON(15, new int[]{2, 6, 5, 2}, 9),
		ARMOR_CHAINMAIL = EnumHelper.addArmorMaterial("ARMOR_CHAINMAIL", 20, new int[] { 3, 7, 6, 3 }, 12);
		ARMOR_PLATE = EnumHelper.addArmorMaterial("ARMOR_PLATE", 25, new int[] { 3, 8, 5, 3 }, 10);
		// DIAMOND(33, new int[]{3, 8, 6, 3}, 10);
		ARMOR_MYTHRILCHAIN = EnumHelper.addArmorMaterial("ARMOR_MYTHRILCHAIN", 30, new int[] { 4, 8, 6, 4 }, 10);
		ARMOR_MYTHRILPLATE = EnumHelper.addArmorMaterial("ARMOR_MYTHRILPLATE", 35, new int[] { 3, 9, 6, 3 }, 10);
		ARMOR_DRAGONLEATHER = EnumHelper.addArmorMaterial("ARMOR_DRAGONLEATHER", 40, new int[] { 4, 9, 7, 4 }, 10);
		ARMOR_DRAGONSCALE = EnumHelper.addArmorMaterial("ARMOR_DRAGONSCALE", 40, new int[] { 4, 9, 8, 5 }, 10);
	}
}
