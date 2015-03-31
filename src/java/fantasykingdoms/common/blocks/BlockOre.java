package fantasykingdoms.common.blocks;

import net.minecraft.block.material.Material;

import fantasykingdoms.common.FantasyKingdoms;
import boilerplate.common.baseclasses.BaseMetadataBlock;

/**
 * Created by Toby on 15/02/2015.
 */
public class BlockOre extends BaseMetadataBlock
{
	public BlockOre()
	{
		super(Material.rock);
		this.setStepSound(soundTypeStone);
		this.setHardness(2.0F);
		this.setCreativeTab(FantasyKingdoms.tabKingdoms);
		this.setHarvestLevel("pickaxe", 2);
	}
}
