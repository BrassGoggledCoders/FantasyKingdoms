package fantasykingdoms.common.blocks;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import boilerplate.common.baseclasses.BaseMetadataBlock;
import fantasykingdoms.common.FantasyKingdoms;
import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.lib.ModInfo;

public class BlockGemstone extends BaseMetadataBlock
{
	public IIcon[] icon = new IIcon[4];

	public BlockGemstone()
	{
		super(Material.rock);
		this.setHardness(2.0F);
		this.setCreativeTab(FantasyKingdoms.tabKingdoms);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		return this.icon[metadata];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(final IIconRegister ir)
	{
		this.icon[0] = ir.registerIcon(ModInfo.PREFIX + "blockRuby");
		this.icon[1] = ir.registerIcon(ModInfo.PREFIX + "blockSapphire");
		this.icon[2] = ir.registerIcon(ModInfo.PREFIX + "blockAmethyst");
		this.icon[3] = ir.registerIcon(ModInfo.PREFIX + "blockTopaz");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(final Item item, final CreativeTabs tab, final List l)
	{
		for (int var4 = 0; var4 < this.icon.length; ++var4)
		{
			l.add(new ItemStack(InitBlocks.blockGemstone, 1, var4));
		}
	}
}
