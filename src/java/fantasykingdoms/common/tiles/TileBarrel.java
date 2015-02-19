package fantasykingdoms.common.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

import cpw.mods.fml.common.FMLLog;

public class TileBarrel extends TileEntity
{
	private int beerLevel = 0;
	private String beerType = "empty";
	private int fermentationTime = 0;

	public TileBarrel()
	{

	}

	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		this.setBeerLevel(nbt.getInteger("beerLevel"));
		this.setBeerType(nbt.getString("beerType"));
		this.setFermentationTime(nbt.getInteger("fermentationTime"));
	}

	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		nbt.setInteger("beerLevel", getBeerLevel());
		nbt.setString("beerType", getBeerType());
		nbt.setInteger("fermentationTime", getFermentationTime());
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
			if (fermentationTime > 0 && beerType != "empty")
				fermentationTime--;
			else
				beerLevel = 10;
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
