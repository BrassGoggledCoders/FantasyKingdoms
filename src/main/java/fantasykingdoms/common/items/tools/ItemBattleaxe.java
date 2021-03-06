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
package fantasykingdoms.common.items.tools;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import boilerplate.common.baseclasses.items.tools.BaseTool;
import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.lib.ModInfo;

/**
 * @author Surseance
 *
 */
public class ItemBattleaxe extends BaseTool
{

	public ItemBattleaxe(ToolMaterial mat)
	{
		super(mat.getDamageVsEntity() + 4.0F, mat, ModInfo.PREFIX);
		this.setCreativeTab(FantasyKingdoms.tabKingdoms);
		this.setHarvestLevel("axe", mat.getHarvestLevel());
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		return EnumAction.block;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack stack)
	{
		return 72000;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
		return stack;
	}

	@Override
	public int getItemEnchantability()
	{
		return this.toolMaterial.getEnchantability();
	}
}
