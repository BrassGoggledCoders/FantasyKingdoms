package fantasykingdoms.common.init;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import net.minecraftforge.common.util.EnumHelper;

public class InitMaterials
{
	public static ToolMaterial HTOOL_RUNEBLADE;
	public static ToolMaterial TOOL_JEWELLED, TOOL_SILVER;
	public static ArmorMaterial ARMOR_PLATE, ARMOR_CHAINMAIL;

	public static void initializeMaterials()
	{
		TOOL_JEWELLED = EnumHelper.addToolMaterial("TOOL_JEWELLED", 2, 200, 12.0F, 0.0F, 32);
		TOOL_SILVER = EnumHelper.addToolMaterial("TOOL_SILVER", 2, 128, 6.0F, 0.0F, 12);

		HTOOL_RUNEBLADE = EnumHelper.addToolMaterial("HTOOL_RUNEBLADE", 0, 128, 0, 6.0F, 40);

		ARMOR_PLATE = EnumHelper.addArmorMaterial("ARMOR_PLATE", 25, new int[] { 3, 8, 6, 3 }, 10);
		ARMOR_CHAINMAIL = EnumHelper.addArmorMaterial("ARMOR_CHAINMAIL", 20, new int[] { 3, 7, 6, 3 }, 12);
	}
}
