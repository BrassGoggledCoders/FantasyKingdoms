package fantasykingdoms.common.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockGemstoneOre extends BlockOre
{
	private Item item;

	public BlockGemstoneOre(Item gemItem)
	{
		super(Material.rock);
		this.item = gemItem;
		this.setStepSound(soundTypeStone);
		this.setHardness(2.0F);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister ir)
	{
		this.blockIcon = ir.registerIcon("fantasykingdoms:" + this.getUnlocalizedName().substring(5));
	}

	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	{
		return this.blockIcon;
	}

	@Override
	public boolean canSilkHarvest()
	{
		return true;
	}

	@Override
	public Item getItemDropped(int i, Random random, int j)
	{
		return item;
	}
}
