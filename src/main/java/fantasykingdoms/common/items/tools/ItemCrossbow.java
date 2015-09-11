package fantasykingdoms.common.items.tools;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import boilerplate.common.baseclasses.items.BaseFirearm;
import fantasykingdoms.common.lib.ModInfo;

public class ItemCrossbow extends BaseFirearm
{
	public ItemCrossbow(int damage, int reloadTime, Item ammo, Item ammo2, String fireSound, String reloadSound)
	{
		super(damage, reloadTime, ammo, ammo2, fireSound, reloadSound);
		// TODO Auto-generated constructor stub
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(ModInfo.PREFIX + this.getUnlocalizedName().substring(5));
	}

	@Override
	protected void shotBullet(ItemStack stack, World world, EntityPlayer player)
	{
		NBTTagCompound tag = stack.getTagCompound();
		tag.setShort("reloadTime", this.reloadTime);
		tag.setBoolean("canFire", false);
		stack.setTagCompound(tag);

		player.inventory.consumeInventoryItem(this.ammo);
		player.inventory.consumeInventoryItem(Items.gunpowder);

		if (!world.isRemote)
		{
			world.spawnEntityInWorld(new EntityArrow(world, player, this.damage));
		}

		world.playSoundAtEntity(player, this.fireSound, 0.6F, 1.0F);
	}

}
