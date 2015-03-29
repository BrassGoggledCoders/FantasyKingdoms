package fantasykingdoms.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by Toby on 15/02/2015.
 */
public class BlockOre extends BaseBlock
{
	public BlockOre()
	{
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(2.0F);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("pickaxe", 2);
	}
}
