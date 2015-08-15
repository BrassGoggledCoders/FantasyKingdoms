package fantasykingdoms.common.items.tools;

import net.minecraft.entity.EntityLivingBase;
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
		attacked.attackEntityFrom(DamageSource.outOfWorld, attacked.getHealth() % 10);

		return super.hitEntity(itemstack, attacked, attacker);
	}
}
