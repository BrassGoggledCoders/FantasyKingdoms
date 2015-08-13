package fantasykingdoms.common.util;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import net.minecraftforge.common.util.EnumHelper;

public class MaterialHelper
{
	public static ToolMaterial TOOL_JEWELLED, TOOL_SILVER;
	public static ArmorMaterial ARMOR_PLATE;

	public static void initializeMaterials()
	{
		TOOL_JEWELLED = EnumHelper.addToolMaterial("TOOL_JEWELLED", 2, 200, 12.0F, 0.0F, 32);
		TOOL_SILVER = EnumHelper.addToolMaterial("TOOL_SILVER", 2, 128, 6.0F, 0.0F, 12);

		ARMOR_PLATE = EnumHelper.addArmorMaterial("ARMOR_PLATE", 20, new int[] { 3, 7, 6, 3 }, 12);
	}
}
