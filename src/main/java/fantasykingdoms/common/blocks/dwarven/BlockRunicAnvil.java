package fantasykingdoms.common.blocks.dwarven;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import fantasykingdoms.client.RenderIDs;
import fantasykingdoms.common.blocks.BaseContainerBlock;
import fantasykingdoms.common.init.InitItems;
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

		ItemStack stack = player.inventory.getCurrentItem();
		if (stack != null)
		{
			if (stack.getItem() == Items.shears && tile.inventory[0] != null)
			{
				if (tile.inventory[0].getItem() == InitItems.itemBlankRune)
				{
					tile.inventory[0] = new ItemStack(InitItems.itemRune);
					world.playAuxSFX(2000, xCoord, yCoord + 1, zCoord, 4);
				}
			}
			else
			{
				tile.inventory[0] = stack;
				if (stack.stackSize > 1)
					player.getItemInUse().stackSize--;
				else
					stack = null;
				return true;
			}
		}
		else
		{
			stack = tile.inventory[0];
			tile.inventory[0] = null;
			return true;
		}
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
	{
		return new TileRunicAnvil();
	}

	@Override
	public int getRenderType()
	{
		return RenderIDs.blockRunicAnvilRI;
	}

	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

}
