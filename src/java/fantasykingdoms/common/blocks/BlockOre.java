package fantasykingdoms.common.blocks;

import fantasykingdoms.common.Reference.Reference;
import net.minecraft.block.material.Material;

/**
 * Created by Toby on 14/02/2015.
 */
public class BlockOre extends BaseBlock
{
    public BlockOre(Material material)
    {
        super(material);
    }

    public BlockOre()
    {
        this(Material.rock);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.0F);
    }

    @Override
    public String getUnlocalisedName()
    {
        return String.format("tile.%s%s", Reference.MODID.toLowerCase() + ":", getUnwrappedUnlocalisedName
                (super.getUnlocalizedName()));
    }

    protected String getUnwrappedUnlocalisedName(String unlocalisedName)
    {
        return unlocalisedName.substring(unlocalisedName.indexOf(".") + 1);
    }
}
