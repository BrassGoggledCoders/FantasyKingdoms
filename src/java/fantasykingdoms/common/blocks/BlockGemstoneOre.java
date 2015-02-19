package fantasykingdoms.common.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockGemstoneOre extends BlockOreFK
{
    public BlockGemstoneOre(Material material)
    {

    }

    public BlockGemstoneOre()
    {
        this(Material.rock);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.0F);
        this.setHarvestLevel("pickaxe", 2);
        //TODO: Create a creative tab system for our stuff
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister ir)
    {
        this.blockIcon = ir.registerIcon("fantasykingdoms:" + this.getUnlocalizedName().substring(5));
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return this.blockIcon;
    }
}

