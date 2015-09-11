package fantasykingdoms.common.blocks.dwarven;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import fantasykingdoms.common.blocks.BaseContainerBlock;
import fantasykingdoms.common.tiles.TileRunicAnvil;

public class BlockRunicAnvil extends BaseContainerBlock
{

	public BlockRunicAnvil(Material material)
	{
		super(material);
	}

	/**
	 * Called upon block activation (right click on the block.)
	 */
	@Override
	public boolean onBlockActivated(World world, int xCoord, int yCoord, int zCoord, EntityPlayer player, int side, float posX, float posY,
			float posZ)
	{
		TileRunicAnvil tile = (TileRunicAnvil) world.getTileEntity(xCoord, yCoord, zCoord);

		if (side == 0)
		{
			ItemStack stack = player.getItemInUse();
			if (stack != null)
			{
				tile.inventory[0] = stack;
				if (stack.stackSize > 1)
					player.getItemInUse().stackSize--;
				else
					stack = null;
			}
			else
			{
				stack = tile.inventory[0];
			}
			return true;
		}
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileRunicAnvil();
	}

}
