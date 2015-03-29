package fantasykingdoms.common.blocks.dwarven;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import fantasykingdoms.common.blocks.BaseContainerBlock;
import fantasykingdoms.common.tiles.TileBarrel;

public class BlockBarrel extends BaseContainerBlock
{
	@SideOnly(Side.CLIENT)
	private IIcon iconTop, iconBottom;

	public BlockBarrel()
	{
		super(Material.wood);
		this.setBlockName("blockBarrel");

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
		this.iconBottom = icon.registerIcon("fantasykingdoms:blockBarrelEndClosed");
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float px, float py, float pz)
	{
		TileBarrel tile = (TileBarrel) world.getTileEntity(x, y, z);
		if (player.inventory.consumeInventoryItem(Items.wheat) && tile.getBeerType() == "empty")
		{
			tile.setBeerType("normal");
			tile.setFermentationTime(100);
			return true;
		}
		return false;
	}

}
