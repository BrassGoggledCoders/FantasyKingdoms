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
	IIcon[] itemIcon = new IIcon[3];

	public ItemRune()
	{
		super();
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{
		this.itemIcon[0] = ir.registerIcon(Reference.PREFIX + "itemRuneIsaz");
		this.itemIcon[1] = ir.registerIcon(Reference.PREFIX + "itemRune2");
		this.itemIcon[2] = ir.registerIcon(Reference.PREFIX + "itemRune3");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List l)
	{
		for (int var4 = 0; var4 < 3; ++var4)
			l.add(new ItemStack(InitItems.itemRune, 1, var4));
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int itemDamage)
	{
		return this.itemIcon[itemDamage];
	}
}
