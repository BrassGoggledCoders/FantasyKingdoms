package fantasykingdoms.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
/**
 * Created by Toby on 15/02/2015.
 */
public class BlockOreFK extends Block
{
    public BlockOreFK(Material material)
    {
        super(material);
    }

    public BlockOreFK()
    {
        this(Material.rock);
        this.setStepSound(soundTypeStone);
        this.setHardness(2.0F);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
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
