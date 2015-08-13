package fantasykingdoms.common.items.dwarven;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.items.BaseItemWithMetadata;
import fantasykingdoms.common.lib.ModInfo;

public class ItemRune extends BaseItemWithMetadata
{
	IIcon[] itemIcon = new IIcon[24];

	public ItemRune()
	{
		super();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{
		this.itemIcon[0] = ir.registerIcon(ModInfo.PREFIX + "itemRuneFehu");
		this.itemIcon[1] = ir.registerIcon(ModInfo.PREFIX + "itemRuneUruz");
		this.itemIcon[2] = ir.registerIcon(ModInfo.PREFIX + "itemRuneThurisaz");
		this.itemIcon[3] = ir.registerIcon(ModInfo.PREFIX + "itemRuneAnsuz");
		this.itemIcon[4] = ir.registerIcon(ModInfo.PREFIX + "itemRuneRaido");
		this.itemIcon[5] = ir.registerIcon(ModInfo.PREFIX + "itemRuneKenaz");
		this.itemIcon[6] = ir.registerIcon(ModInfo.PREFIX + "itemRuneGifu");
		this.itemIcon[7] = ir.registerIcon(ModInfo.PREFIX + "itemRuneWunjo");
		this.itemIcon[8] = ir.registerIcon(ModInfo.PREFIX + "itemRuneHagalaz");
		this.itemIcon[9] = ir.registerIcon(ModInfo.PREFIX + "itemRuneNauthiz");
		this.itemIcon[10] = ir.registerIcon(ModInfo.PREFIX + "itemRuneIsa");
		this.itemIcon[11] = ir.registerIcon(ModInfo.PREFIX + "itemRuneJera");
		this.itemIcon[12] = ir.registerIcon(ModInfo.PREFIX + "itemRuneEihwaz");
		this.itemIcon[13] = ir.registerIcon(ModInfo.PREFIX + "itemRunePertho");
		this.itemIcon[14] = ir.registerIcon(ModInfo.PREFIX + "itemRuneAlgiz");
		this.itemIcon[15] = ir.registerIcon(ModInfo.PREFIX + "itemRuneSowulo");
		this.itemIcon[16] = ir.registerIcon(ModInfo.PREFIX + "itemRuneTeiwaz");
		this.itemIcon[17] = ir.registerIcon(ModInfo.PREFIX + "itemRuneBerkana");
		this.itemIcon[18] = ir.registerIcon(ModInfo.PREFIX + "itemRuneEhwaz");
		this.itemIcon[19] = ir.registerIcon(ModInfo.PREFIX + "itemRuneMannaz");
		this.itemIcon[20] = ir.registerIcon(ModInfo.PREFIX + "itemRuneLaguz");
		this.itemIcon[21] = ir.registerIcon(ModInfo.PREFIX + "itemRuneInguz");
		this.itemIcon[22] = ir.registerIcon(ModInfo.PREFIX + "itemRuneOthila");
		this.itemIcon[23] = ir.registerIcon(ModInfo.PREFIX + "itemRuneDagaz");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List l)
	{
		for (int var4 = 0; var4 < 24; ++var4)
		{
			l.add(new ItemStack(InitItems.itemRune, 1, var4));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int itemDamage)
	{
		return this.itemIcon[itemDamage];
	}
}
