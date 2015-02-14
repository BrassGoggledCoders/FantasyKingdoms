package fantasykingdoms.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fantasykingdoms.common.tiles.TileBarrel;

public class BlockBarrel extends BaseContainerBlock
{
	@SideOnly(Side.CLIENT)
	private IIcon iconTop, iconBottom;

	public BlockBarrel(Material material)
	{
		super(material);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileBarrel();
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		switch (side)
		{
		case 0:
			return this.iconBottom; // bottom

		case 1:
			return this.iconTop; // top

		default:
			return this.blockIcon; // sides
		}
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister icon)
	{
		this.blockIcon = icon.registerIcon("fantasykingdoms:blockBarrelSide");
		this.iconTop = icon.registerIcon("fantasykingdoms:blockBarrelEndFull");
		this.iconBottom = icon.registerIcon("fantasykingdoms:blockEndBarrelClosed");
	}

}
