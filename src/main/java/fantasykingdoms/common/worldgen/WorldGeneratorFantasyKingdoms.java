package fantasykingdoms.common.worldgen;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGeneratorFantasyKingdoms implements IWorldGenerator
{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		int blockChunkX = chunkX * 16;
		int blockChunkZ = chunkZ * 16;

		if (world.provider.dimensionId == -1)
		{
			this.generateNether(world, random, blockChunkX, blockChunkZ);
		}
		else if (world.provider.dimensionId == 0)
		{
			this.generateSurface(world, random, blockChunkX, blockChunkZ);
		}
		else if (world.provider.dimensionId == 1)
		{
			this.generateEnd(world, random, blockChunkX, blockChunkZ);
		}
	}

	private void generateEnd(World world, Random random, int blockChunkX, int blockChunkZ)
	{
		// TODO Auto-generated method stub

	}

	private void generateSurface(World world, Random random, int blockChunkX, int blockChunkZ)
	{
		// TODO Auto-generated method stub

	}

	private void generateNether(World world, Random random, int blockChunkX, int blockChunkZ)
	{
		// TODO Auto-generated method stub

	}

}
