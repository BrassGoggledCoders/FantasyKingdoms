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

import boilerplate.common.baseclasses.items.BaseArmor;
import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.lib.ModInfo;

/**
 * Wrapper class for BaseArmor
 *
 */
public class ItemNormalArmor extends BaseArmor
{
	public ItemNormalArmor(ArmorMaterial mat, int type, String textureName)
	{
		super(mat, type, textureName, ModInfo.PREFIX);
		this.setCreativeTab(FantasyKingdoms.tabKingdoms);
	}
}
