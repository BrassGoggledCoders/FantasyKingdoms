package fantasykingdoms.common.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.FluidTank;

public class TileBarrel extends TileEntity
{
	private int beerLevel = 0;
	private String beerType = "empty";
	private int fermentationTime = 0;
	public FluidTank waterTank;

	public TileBarrel()
	{
		super();
		this.waterTank = new FluidTank(new FluidStack(FluidRegistry.WATER, 0), 5000);
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		this.setBeerLevel(nbt.getInteger("beerLevel"));
		this.setBeerType(nbt.getString("beerType"));
		this.setFermentationTime(nbt.getInteger("fermentationTime"));
		this.waterTank.setFluid(new FluidStack(FluidRegistry.getFluid("water"), nbt.getShort("waterLevel")));
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		nbt.setInteger("beerLevel", getBeerLevel());
		nbt.setString("beerType", getBeerType());
		nbt.setInteger("fermentationTime", getFermentationTime());
		nbt.setShort("waterLevel", (short) this.waterTank.getFluidAmount());
	}

	public int getFermentationTime()
	{
		return fermentationTime;
	}

	public void setFermentationTime(int fermentationTime)
	{
		this.fermentationTime = fermentationTime;
	}

	public String getBeerType()
	{
		return beerType;
	}

	public void setBeerType(String beerType)
	{
		this.beerType = beerType;
	}

	@Override
	public void updateEntity()
	{
		if (!worldObj.isRemote)
		{
			FMLLog.info("Time: " + fermentationTime, "");
			FMLLog.info("Type: " + beerType, "");
			FMLLog.info("Level: " + beerLevel, "");

			while (fermentationTime >= 0 && beerType != "empty")
			{
				if (fermentationTime > 0)
					fermentationTime--;
				else
				{
					beerLevel = 10;
					break;
				}
			}
		}
	}

	public int getBeerLevel()
	{
		return beerLevel;
	}

	public void setBeerLevel(int beerLevel)
	{
		this.beerLevel = beerLevel;
	}

}
