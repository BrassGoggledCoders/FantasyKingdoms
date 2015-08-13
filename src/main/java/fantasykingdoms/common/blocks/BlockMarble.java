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
import fantasykingdoms.common.lib.Reference;

/**
 * Created by Toby on 15/02/2015.
 */
public class BlockMarble extends BaseMetadataBlock
{
	public IIcon[] icon = new IIcon[3];

	public BlockMarble()
	{
		super(Material.rock);
		this.setStepSound(soundTypeStone);
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
		this.icon[0] = ir.registerIcon(Reference.PREFIX + "blockMarbleRaw");
		this.icon[1] = ir.registerIcon(Reference.PREFIX + "blockMarblePolished");
		this.icon[2] = ir.registerIcon(Reference.PREFIX + "blockMarbleBricks");
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(final Item item, final CreativeTabs tab, final List l)
	{
		for (int var4 = 0; var4 < this.icon.length; ++var4)
		{
			l.add(new ItemStack(InitBlocks.blockMarble, 1, var4));
		}
	}
}
