package tradeoffs.init;

import tradeoffs.items.TradeoffsItems;
import tradeoffs.utility.CraftingRecipes;

public class Initialize {
	
	public static void preInit() {
		
		TradeoffsItems.initializeItems();
		
	}
	
	public static void load() {
		
		CraftingRecipes.initializeRecipes();
		
	}
	
	public static void postInit() {
		
		
		
	}

}
