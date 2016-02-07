package tradeoffs.init;

import tradeoffs.blocks.TradeoffsBlocks;
import tradeoffs.items.TradeoffsItems;
import tradeoffs.utility.CraftingRecipes;

public class Initialize {
	
	public static void preInit() {
		
		TradeoffsItems.initializeItems();
		TradeoffsBlocks.initializeBlocks();
		
	}
	
	public static void load() {
		
		CraftingRecipes.initializeRecipes();
		
	}
	
	public static void postInit() {}

}
