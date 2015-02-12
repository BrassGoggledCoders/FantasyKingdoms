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

import net.minecraftforge.fluids.Fluid;

/**
 * @author warlordjones
 * 
 */
public class FluidBeer extends Fluid
{
	public FluidBeer(String fluidName)
	{
		super(fluidName);
		this.setGaseous(true);
		this.setTemperature(30);
		this.setDensity(10);
		this.setViscosity(10);
		this.setLuminosity(1);
		this.setIcons(this.stillIcon, this.flowingIcon);
	}

}
