package tradeoffs.blocks;

import tradeoffs.utility.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TradeoffsBlocks {

	public static Block cEssOre;
	
	public static void initializeBlocks() {
		
		cEssOre = new TOre(Material.ground, 0.5F, Block.soundTypeStone, "cEssOre", "pickaxe", 2);
		
		Block[] TBlocks = {cEssOre};
		
		for(int i = 0; i < TBlocks.length; i++) {
			References.register(TBlocks[i]);
		}
		
	}
	
}
