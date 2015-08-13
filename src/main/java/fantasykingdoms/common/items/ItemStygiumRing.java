package fantasykingdoms.common.items;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;

import baubles.api.BaubleType;
import baubles.api.IBauble;

public class ItemStygiumRing extends BaseItem implements IBauble
{

	@Override
	public BaubleType getBaubleType(ItemStack itemstack)
	{
		return BaubleType.RING;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		if (!player.worldObj.isRemote)
		{
			if (player.worldObj.isDaytime())
			{
				float f = player.getBrightness(1.0F);

				if ((f > 0.5F) && ((player.getRNG().nextFloat() * 30.0F) < ((f - 0.4F) * 2.0F)) && player.worldObj.canBlockSeeTheSky(
						MathHelper.floor_double(player.posX), MathHelper.floor_double(player.posY), MathHelper.floor_double(player.posZ)))
				{
					boolean flag = true;
					ItemStack stack = player.getEquipmentInSlot(4);

					if (stack != null)
					{
						if (stack.isItemStackDamageable())
						{
							stack.setItemDamage(stack.getItemDamageForDisplay() + player.getRNG().nextInt(2));

							if (stack.getItemDamageForDisplay() >= stack.getMaxDamage())
							{
								player.renderBrokenItemStack(stack);
								player.setCurrentItemOrArmor(4, (ItemStack) null);
							}
						}

						flag = false;
					}

					if (flag)
					{
						player.setFire(8);
					}
				}
			}
			else
			{
				player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 0, true));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 2, true));
			}
		}
	}

	@Override
	public void onEquipped(ItemStack itemstack, EntityLivingBase player)
	{

	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
	{

	}

	@Override
	public boolean canEquip(ItemStack itemstack, EntityLivingBase player)
	{
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack itemstack, EntityLivingBase player)
	{
		return true;
	}

}
