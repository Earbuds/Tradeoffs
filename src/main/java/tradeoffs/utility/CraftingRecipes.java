package tradeoffs.utility;

import tradeoffs.items.TradeoffsItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipes {

	public static void initializeRecipes() {
		
		ItemStack iron = new ItemStack(Items.iron_ingot);
		ItemStack string = new ItemStack(Items.string);
		ItemStack pearl = new ItemStack(Items.ender_pearl);
		
		ItemStack obsidian = new ItemStack(Blocks.obsidian);
		ItemStack ironBar = new ItemStack(Blocks.iron_bars);
		
		ItemStack amuletFrame = new ItemStack(TradeoffsItems.amuletFrame);
		ItemStack rAmuletFrame = new ItemStack(TradeoffsItems.rAmuletFrame);
		ItemStack cAmuletFrame = new ItemStack(TradeoffsItems.cAmuletFrame);
		
		ItemStack ringFrame = new ItemStack(TradeoffsItems.ringFrame);
		ItemStack rRingFrame = new ItemStack(TradeoffsItems.rRingFrame);
		ItemStack cRingFrame = new ItemStack(TradeoffsItems.cRingFrame);
		
		ItemStack beltFrame = new ItemStack(TradeoffsItems.beltFrame);
		ItemStack rBeltFrame = new ItemStack(TradeoffsItems.rBeltFrame);
		ItemStack cBeltFrame = new ItemStack(TradeoffsItems.cBeltFrame);
		
		ItemStack stepBelt = new ItemStack(TradeoffsItems.beltOfStability1);
				
		GameRegistry.addRecipe(amuletFrame, "b b", "aaa", " a ", 'a', ironBar, 'b', string);
		GameRegistry.addRecipe(rAmuletFrame, "bbb", "bab", " b ", 'a', amuletFrame, 'b', obsidian);
		
		GameRegistry.addRecipe(ringFrame, " a ", "a a", " a ", 'a', ironBar);
		GameRegistry.addRecipe(rRingFrame, " c ", "bab", " b ", 'a', ringFrame, 'b', obsidian, 'c', pearl);
		
		GameRegistry.addRecipe(beltFrame, "aaa", "a a", "aaa", 'a', ironBar);
		GameRegistry.addRecipe(rBeltFrame, "bcb", "bab", " b ", 'a', beltFrame, 'b', obsidian, 'c', pearl);
		
		GameRegistry.addRecipe(stepBelt, "aaa", "bcb", "aaa", 'a', iron, 'b', obsidian, 'c', rBeltFrame);
		
	}
	
}