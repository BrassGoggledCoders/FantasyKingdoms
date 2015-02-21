package fantasykingdoms.common.items;

import fantasykingdoms.common.Init.ItemRegistry;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemTankard extends BaseItem
{
	public ItemTankard()
	{
		this.setMaxStackSize(1);
		this.setFull3D();
	}

	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 50, 100));
		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 50, 100));
		player.destroyCurrentEquippedItem();
		player.inventory.addItemStackToInventory(new ItemStack(ItemRegistry.itemEmptyTankard));
		return stack;
	}
}
