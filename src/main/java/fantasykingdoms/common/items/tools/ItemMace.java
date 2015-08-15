package fantasykingdoms.common.items.tools;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import boilerplate.common.baseclasses.items.tools.BaseTool;
import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.lib.ModInfo;

public class ItemMace extends BaseTool
{
	public ItemMace(ToolMaterial mat)
	{
		super(mat.getDamageVsEntity() + 6.0F, mat, ModInfo.PREFIX);
		this.setCreativeTab(FantasyKingdoms.tabKingdoms);
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity holder, int slot, boolean held)
	{
		if (holder instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) holder;
			if (held)
			{
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 1, 2, true));
			}
		}
	}

}
