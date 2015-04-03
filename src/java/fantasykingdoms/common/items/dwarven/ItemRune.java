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
import fantasykingdoms.common.lib.Reference;

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
		this.itemIcon[0] = ir.registerIcon(Reference.PREFIX + "itemRuneFehu");
		this.itemIcon[1] = ir.registerIcon(Reference.PREFIX + "itemRuneUruz");
		this.itemIcon[2] = ir.registerIcon(Reference.PREFIX + "itemRuneThurisaz");
		this.itemIcon[3] = ir.registerIcon(Reference.PREFIX + "itemRuneAnsuz");
		this.itemIcon[4] = ir.registerIcon(Reference.PREFIX + "itemRuneRaido");
		this.itemIcon[5] = ir.registerIcon(Reference.PREFIX + "itemRuneKenaz");
		this.itemIcon[6] = ir.registerIcon(Reference.PREFIX + "itemRuneGifu");
		this.itemIcon[7] = ir.registerIcon(Reference.PREFIX + "itemRuneWunjo");
		this.itemIcon[8] = ir.registerIcon(Reference.PREFIX + "itemRuneHagalaz");
		this.itemIcon[9] = ir.registerIcon(Reference.PREFIX + "itemRuneNauthiz");
		this.itemIcon[10] = ir.registerIcon(Reference.PREFIX + "itemRuneIsa");
		this.itemIcon[11] = ir.registerIcon(Reference.PREFIX + "itemRuneJera");
		this.itemIcon[12] = ir.registerIcon(Reference.PREFIX + "itemRuneEihwaz");
		this.itemIcon[13] = ir.registerIcon(Reference.PREFIX + "itemRunePertho");
		this.itemIcon[14] = ir.registerIcon(Reference.PREFIX + "itemRuneAlgiz");
		this.itemIcon[15] = ir.registerIcon(Reference.PREFIX + "itemRuneSowulo");
		this.itemIcon[16] = ir.registerIcon(Reference.PREFIX + "itemRuneTeiwaz");
		this.itemIcon[17] = ir.registerIcon(Reference.PREFIX + "itemRuneBerkana");
		this.itemIcon[18] = ir.registerIcon(Reference.PREFIX + "itemRuneEhwaz");
		this.itemIcon[19] = ir.registerIcon(Reference.PREFIX + "itemRuneMannaz");
		this.itemIcon[20] = ir.registerIcon(Reference.PREFIX + "itemRuneLaguz");
		this.itemIcon[21] = ir.registerIcon(Reference.PREFIX + "itemRuneInguz");
		this.itemIcon[22] = ir.registerIcon(Reference.PREFIX + "itemRuneOthila");
		this.itemIcon[23] = ir.registerIcon(Reference.PREFIX + "itemRuneDagaz");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List l)
	{
		for (int var4 = 0; var4 < 24; ++var4)
			l.add(new ItemStack(InitItems.itemRune, 1, var4));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int itemDamage)
	{
		return this.itemIcon[itemDamage];
	}
}
