package fantasykingdoms.common.items.tools;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import boilerplate.common.baseclasses.items.tools.BaseTool;
import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.lib.ModInfo;

public class ItemRuneblade extends BaseTool
{

	public ItemRuneblade(ToolMaterial mat)
	{
		super(0.0F, mat, ModInfo.PREFIX);
		this.setCreativeTab(FantasyKingdoms.tabKingdoms);
	}

	@Override
	public boolean hitEntity(ItemStack itemstack, EntityLivingBase attacked, EntityLivingBase attacker)
	{
		attacked.attackEntityFrom(DamageSource.outOfWorld, 4F);
		return super.hitEntity(itemstack, attacked, attacker);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer entityPlayer, List list, boolean bool)
	{
		list.add("+4 Armour-Piercing Damage");
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
}
