package fantasykingdoms.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import fantasykingdoms.common.tiles.TileBarrel;

public class BlockBarrel extends BaseContainerBlock
{

	public BlockBarrel(Material mat)
	{
		super(mat);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileBarrel();
	}

}
