package fantasykingdoms.common.items.tools;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;

import boilerplate.common.baseclasses.items.tools.BaseSword;
import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.lib.ModInfo;

public class ItemRuneblade extends BaseSword
{

	public ItemRuneblade(ToolMaterial mat)
	{
		super(mat, ModInfo.PREFIX);
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
		list.add("+4 Armour-Peircing Damage");
	}
}
