package fantasykingdoms.common.blocks;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fantasykingdoms.common.init.InitBlocks;
import fantasykingdoms.common.init.InitItems;
import fantasykingdoms.common.lib.Reference;

public class BlockGemstone extends BlockOre
{
	public IIcon[] icon = new IIcon[4];

	public BlockGemstone()
	{
		super();
		this.setHardness(2.0F);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	{
		ArrayList<ItemStack> drop = new ArrayList<ItemStack>();

		drop.add(new ItemStack(InitItems.itemGem, metadata));

		return drop;
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
		this.icon[0] = ir.registerIcon(Reference.PREFIX + "blockRuby");
		this.icon[1] = ir.registerIcon(Reference.PREFIX + "blockSapphire");
		this.icon[2] = ir.registerIcon(Reference.PREFIX + "blockAmethyst");
		this.icon[3] = ir.registerIcon(Reference.PREFIX + "blockTopaz");
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
