/**
 * This class was created by BrassGoggledCoders modding team.
 * This class is available as part of the Steamcraft 2 Mod for Minecraft.
 *
 * Steamcraft 2 is open-source and is distributed under the MMPL v1.0 License.
 * (http://www.mod-buildcraft.com/MMPL-1.0.txt)
 *
 * Steamcraft 2 is based on the original Steamcraft Mod created by Proloe.
 * Steamcraft (c) Proloe 2011
 * (http://www.minecraftforum.net/topic/251532-181-steamcraft-source-code-releasedmlv054wip/)
 *
 */
package fantasykingdoms.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

import boilerplate.common.utils.ItemStackUtils;
import fantasykingdoms.common.lib.ModInfo;

/**
 * @author Decebaldecebal
 *
 */
public class BlockCustomFiniteFluid extends BlockFluidClassic
{
	public IIcon stillIcon;
	public IIcon flowIcon;

	String texture;

	private boolean overwriteIcons = true;

	public BlockCustomFiniteFluid(Fluid fluid, Material material, String texture)
	{
		super(fluid, material);
		this.texture = texture;
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.stillIcon = iconRegister.registerIcon(ModInfo.PREFIX + this.texture);
		this.flowIcon = iconRegister.registerIcon(ModInfo.PREFIX + this.texture + "_flow");

		if (this.overwriteIcons)
		{
			this.getFluid().setIcons(this.stillIcon, this.flowIcon);
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if ((side == 0) || (side == 1))
		{
			return this.stillIcon;
		}
		return this.flowIcon;
	}

	@Override
	public boolean canDisplace(IBlockAccess world, int x, int y, int z)
	{
		return !ItemStackUtils.getBlockMaterial(world, x, y, z).isLiquid() && super.canDisplace(world, x, y, z);
	}

	@Override
	public boolean displaceIfPossible(World world, int x, int y, int z)
	{
		return !ItemStackUtils.getBlockMaterial(world, x, y, z).isLiquid() && super.displaceIfPossible(world, x, y, z);
	}

	public void dontOverwriteIcons()
	{
		this.overwriteIcons = false;
	}
}