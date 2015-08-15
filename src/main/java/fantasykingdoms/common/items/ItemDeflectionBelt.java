package fantasykingdoms.common.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IProjectile;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import boilerplate.common.baseclasses.RootItem;

public class ItemDeflectionBelt extends RootItem implements IBauble
{

	public ItemDeflectionBelt()
	{
		setCreativeTab(CreativeTabs.tabMisc);
	}
	@Override
	public BaubleType getBaubleType(ItemStack itemstack)
	{
		return BaubleType.BELT;
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		World world = player.worldObj;
		List<Entity> entities = world.getEntitiesWithinAABBExcludingEntity(player, player.boundingBox.expand(5.0D, 5.0D, 5.0D));
		for(int i=0; i<entities.size(); i++)
		{
			Entity entity = entities.get(i);
			if(entity instanceof IProjectile)
			{
				entity.setVelocity(-entity.motionX, entity.motionY, -entity.motionZ);
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
