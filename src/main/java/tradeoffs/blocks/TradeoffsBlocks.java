package tradeoffs.blocks;

import tradeoffs.utility.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TradeoffsBlocks {

	public static Block cEssOre;
	
	public static Block cEssBlock;
	
	public static void initializeBlocks() {
		
		cEssOre = new ContingentEssOre(Material.ground, 2.5F, Block.soundTypeStone, "cEssOre", "pickaxe", 2);
		
		cEssBlock = new TBlock(Material.ground, 2.5F, Block.soundTypeStone, "cEssBlock", "pickaxe", 2);
		
		Block[] TBlocks = {cEssOre, cEssBlock};
		
		for(int i = 0; i < TBlocks.length; i++) {
			References.register(TBlocks[i]);
		}
		
	}
	
}
