/**
 * This class was created by BrassGoggledCoders modding team.
 * This class is available as part of the Steamcraft 2 Mod for Minecraft.
 *
 * Steamcraft 2 is open-source and is distributed under the MMPL v1.0 License.
 * (http://www.mod-buildcraft.com/MMPL-1.0.txt)
 *
 * Steamcraft 2 is based on the original Steamcraft Mod created by Proloe.
 * Steamcraft (c) Proloe 2011
 * (http://www.minecraftforum.net/topic/251532-181-steamcraft-source-code-releasedmlv054wip/)
 *
 */
package fantasykingdoms.common.items;

import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.lib.ModInfo;

/**
 * @author warlordjones
 *
 */
public class ItemNugget extends BaseItemWithMetadata
{
	IIcon[] itemIcon = new IIcon[6];

	public ItemNugget()
	{
		super();
		this.setCreativeTab(FantasyKingdoms.tabKingdoms);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister ir)
	{
		this.itemIcon[0] = ir.registerIcon(ModInfo.PREFIX + "itemCopperNugget");
		this.itemIcon[1] = ir.registerIcon(ModInfo.PREFIX + "itemTinNugget");
		this.itemIcon[2] = ir.registerIcon(ModInfo.PREFIX + "itemSilverNugget");
		this.itemIcon[3] = ir.registerIcon(ModInfo.PREFIX + "itemLeadNugget");
		this.itemIcon[4] = ir.registerIcon(ModInfo.PREFIX + "itemMithrilNugget");
		this.itemIcon[5] = ir.registerIcon(ModInfo.PREFIX + "itemStygiumNugget");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List l)
	{
		for (int var4 = 0; var4 < this.itemIcon.length; ++var4)
		{
			l.add(new ItemStack(InitItems.itemNugget, 1, var4));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIconFromDamage(int itemDamage)
	{
		return this.itemIcon[itemDamage];
	}
}
