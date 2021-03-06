package tradeoffs.common;

import java.util.Random;

import tradeoffs.blocks.TradeoffsBlocks;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class TWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId) {
		case -1:
			generateNether(world, random, chunkX * 16, chunkZ * 16);
			
		case 0:
			generateOverworld(world, random, chunkX * 16, chunkZ * 16);
			
		case 1:
			generateEnd(world, random, chunkX * 16, chunkZ * 16);
			
			default:
		}
	}
	
	private void generateEnd(World world, Random random, int x, int z) {}
	 
	private void generateOverworld(World world, Random random, int x, int z) {
		this.addOreSpawn(TradeoffsBlocks.cEssOre, world, random, x, z, 16, 16, 6, 5, 8, 48);
	}
	 
	private void generateNether(World world, Random random, int x, int z) {}

	public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
		int diffBtwnMinMaxY = maxY - minY;
		
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
		}
	}
}
