package fantasykingdoms.common;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTankard extends BaseItem
{
	public ItemTankard()
	{
		this.setMaxStackSize(1);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		if (stack.getItemDamage() > 0)
		{
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 50, 100));
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 100));
			player.destroyCurrentEquippedItem();
			player.inventory.addItemStackToInventory(new ItemStack(FantasyKingdoms.itemEmptyTankard));

		}
		return stack;
	}

	/**
	 * returns the action that specifies what animation to play when the items
	 * is being used
	 */
	@Override
	public EnumAction getItemUseAction(ItemStack p_77661_1_)
	{
		return EnumAction.drink;
	}
}
