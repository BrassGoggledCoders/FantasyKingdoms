package fantasykingdoms.common.items.dwarven;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.items.BaseItemWithMetadata;
import fantasykingdoms.common.lib.Reference;

public class ItemSigil extends BaseItemWithMetadata
{
	IIcon[] itemIcon = new IIcon[24];

	public ItemSigil()
	{
		super();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{
		this.itemIcon[0] = ir.registerIcon(Reference.PREFIX + "itemSigilFehu");
		this.itemIcon[1] = ir.registerIcon(Reference.PREFIX + "itemSigilUruz");
		this.itemIcon[2] = ir.registerIcon(Reference.PREFIX + "itemSigilThurisaz");
		this.itemIcon[3] = ir.registerIcon(Reference.PREFIX + "itemSigilAnsuz");
		this.itemIcon[4] = ir.registerIcon(Reference.PREFIX + "itemSigilRaido");
		this.itemIcon[5] = ir.registerIcon(Reference.PREFIX + "itemSigilKenaz");
		this.itemIcon[6] = ir.registerIcon(Reference.PREFIX + "itemSigilGifu");
		this.itemIcon[7] = ir.registerIcon(Reference.PREFIX + "itemSigilWunjo");
		this.itemIcon[8] = ir.registerIcon(Reference.PREFIX + "itemSigilHagalaz");
		this.itemIcon[9] = ir.registerIcon(Reference.PREFIX + "itemSigilNauthiz");
		this.itemIcon[10] = ir.registerIcon(Reference.PREFIX + "itemSigilIsa");
		this.itemIcon[11] = ir.registerIcon(Reference.PREFIX + "itemSigilJera");
		this.itemIcon[12] = ir.registerIcon(Reference.PREFIX + "itemSigilEihwaz");
		this.itemIcon[13] = ir.registerIcon(Reference.PREFIX + "itemSigilPertho");
		this.itemIcon[14] = ir.registerIcon(Reference.PREFIX + "itemSigilAlgiz");
		this.itemIcon[15] = ir.registerIcon(Reference.PREFIX + "itemSigilSowulo");
		this.itemIcon[16] = ir.registerIcon(Reference.PREFIX + "itemSigilTeiwaz");
		this.itemIcon[17] = ir.registerIcon(Reference.PREFIX + "itemSigilBerkana");
		this.itemIcon[18] = ir.registerIcon(Reference.PREFIX + "itemSigilEhwaz");
		this.itemIcon[19] = ir.registerIcon(Reference.PREFIX + "itemSigilMannaz");
		this.itemIcon[20] = ir.registerIcon(Reference.PREFIX + "itemSigilLaguz");
		this.itemIcon[21] = ir.registerIcon(Reference.PREFIX + "itemSigilInguz");
		this.itemIcon[22] = ir.registerIcon(Reference.PREFIX + "itemSigilOthila");
		this.itemIcon[23] = ir.registerIcon(Reference.PREFIX + "itemSigilDagaz");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List l)
	{
		for (int var4 = 0; var4 < 24; ++var4)
			l.add(new ItemStack(InitItems.itemSigil, 1, var4));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int itemDamage)
	{
		return this.itemIcon[itemDamage];
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
	{
		// I know no better
		switch (stack.getItemDamage())
		{
		case 0:
			break;
		case 1:
			player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 300, 1));
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 300, 1));
			break;
		case 5:
			world.setBlock((int) Math.round(player.posX), (int) Math.round(player.posY), (int) Math.round(player.posZ), InitBlocks.blockInvisLight);
			break;
		case 6:
			break;
		case 7:
			// Spawn Ice Projectile
			break;
		case 8:
			break;
		case 9:
			// Ice Block
			break;
		case 10:
			world.setWorldTime(world.getWorldTime() + 100);
			break;
		case 11:
			break;
		case 12:
			// Random Other Effect
			break;
		case 13:
			player.addPotionEffect(new PotionEffect(Potion.resistance.id, 300, 1));
			break;
		case 14:
			break;
		case 15:
			break;
		case 16:
			break;
		case 17:
			break;
		case 18:
			// Summon Earth Horse
			break;
		case 19:
			player.addExperienceLevel(1);
			break;
		case 20:
			break;
		case 21:
			// Bonemeal effect
			break;
		case 22:
			break;
		case 23:
			break;
		}
		return stack;
	}
}
