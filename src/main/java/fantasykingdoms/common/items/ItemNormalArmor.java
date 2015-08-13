/**
 * This class was created by BrassGoggledCoders modding team.
 * This class is available as part of the Steamcraft 2 Mod for Minecraft.
 *
 * Steamcraft 2 is open-source and is distributed under the MMPL v1.0 License.
 * (http://www.mod-buildcraft.com/MMPL-1.0.txt)
 *
 * Steamcraft 2 is based on the original Steamcraft Mod created by Proloe.
 * Steamcraft (c) Proloe 2011
 * (http://www.minecraftforum.net/topic/251532-181-steamcraft-source-code-releasedmlv054wip/)
 *
 */
package fantasykingdoms.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fantasykingdoms.common.lib.ModInfo;

/**
 * @author Decebaldecebal
 *
 */
public class ItemNormalArmor extends BaseArmor
{
	String textureName;

	public ItemNormalArmor(ArmorMaterial mat, int type, String textureName)
	{
		super(mat, 0, type);
		this.textureName = textureName;
	}

	// TODO - move to basearmor
	@Override
	@SideOnly(Side.CLIENT)
	public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
	{
		return slot == 2 ? ModInfo.PREFIX + "textures/models/armor/" + type + "_2.png" : ModInfo.PREFIX + "textures/models/armor/" + type + "_1.png";
	}
}
