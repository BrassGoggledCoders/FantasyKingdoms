package fantasykingdoms.common.util;

import net.minecraft.item.Item.ToolMaterial;

import net.minecraftforge.common.util.EnumHelper;

public class MaterialHelper
{
	public static ToolMaterial TOOL_JEWELLED;

	public static void initializeMaterials()
	{
		TOOL_JEWELLED = EnumHelper.addToolMaterial("TOOL_JEWELLED", 2, 200, 12.0F, 0.0F, 32);
	}
}
