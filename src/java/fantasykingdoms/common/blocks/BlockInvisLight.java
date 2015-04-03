package fantasykingdoms.common.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockInvisLight extends BaseBlock
{
	public BlockInvisLight(Material material)
	{
		super(material);
		this.setLightLevel(1F);
		this.setTickRandomly(true);
		this.setBlockBounds(0.40F, 0.40F, 0.40F, 0.60F, 0.60F, 0.60F);
	}

	/**
	 * A randomly called display update to be able to add particles or other
	 * items for display
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World world, int x, int y, int z, Random rand)
	{
		world.spawnParticle("fireworksSpark", x + rand.nextDouble(), y + rand.nextDouble(), z + rand.nextDouble(), 0, 0, 0);
	}

	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random p_149745_1_)
	{
		return 0;
	}

	/**
	 * Returns which pass should this block be rendered on. 0 for solids and 1
	 * for alpha
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass()
	{
		return 1;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

}
