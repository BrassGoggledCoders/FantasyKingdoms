package fantasykingdoms.common.blocks;

import net.minecraft.block.material.Material;

public class BlockSolidFog extends BaseBlock
{
	public BlockSolidFog()
	{
		super(Material.rock);
		this.setBlockUnbreakable();
		this.setLightLevel(0.5F);
	}
}
