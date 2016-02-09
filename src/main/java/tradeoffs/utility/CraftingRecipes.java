package tradeoffs.utility;

import tradeoffs.blocks.TradeoffsBlocks;
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
		
		ItemStack cEss = new ItemStack(TradeoffsItems.cEss);
		ItemStack cEssCoarse = new ItemStack(TradeoffsItems.cEssCoarse);
		ItemStack cEssRefined = new ItemStack(TradeoffsItems.cEssRefined);
		
		ItemStack amuletFrame = new ItemStack(TradeoffsItems.amuletFrame);
		ItemStack rAmuletFrame = new ItemStack(TradeoffsItems.rAmuletFrame);
		ItemStack cAmuletFrame = new ItemStack(TradeoffsItems.cAmuletFrame);
		
		ItemStack ringFrame = new ItemStack(TradeoffsItems.ringFrame);
		ItemStack rRingFrame = new ItemStack(TradeoffsItems.rRingFrame);
		ItemStack cRingFrame = new ItemStack(TradeoffsItems.cRingFrame);
		
		ItemStack beltFrame = new ItemStack(TradeoffsItems.beltFrame);
		ItemStack rBeltFrame = new ItemStack(TradeoffsItems.rBeltFrame);
		ItemStack cBeltFrame = new ItemStack(TradeoffsItems.cBeltFrame);
		
		ItemStack waterRing = new ItemStack(TradeoffsItems.poseidionRing1);
		ItemStack lavaRing = new ItemStack(TradeoffsItems.vulcanianRing1);
		
		ItemStack stepBelt = new ItemStack(TradeoffsItems.beltOfStability1);
		
		ItemStack cEssBlock = new ItemStack(TradeoffsBlocks.cEssBlock);
		ItemStack cEssBlockRefined = new ItemStack(TradeoffsBlocks.cEssBlockRefined);
		
		// Shaped
		GameRegistry.addRecipe(amuletFrame, "b b", "aaa", " a ", 'a', ironBar, 'b', string);
		GameRegistry.addRecipe(rAmuletFrame, "bcb", "bab", " c ", 'a', amuletFrame, 'b', obsidian, 'c', cEssRefined);
		
		GameRegistry.addRecipe(ringFrame, " a ", "a a", " a ", 'a', ironBar);
		GameRegistry.addRecipe(rRingFrame, " c ", "bab", " c ", 'a', ringFrame, 'b', obsidian, 'c', cEssRefined);
		
		GameRegistry.addRecipe(beltFrame, "aaa", "a a", "aaa", 'a', ironBar);
		GameRegistry.addRecipe(rBeltFrame, "bcb", "bab", "bcb", 'a', beltFrame, 'b', obsidian, 'c', cEssRefined);
		
		GameRegistry.addRecipe(waterRing, " a ", "aba", "ccc", 'a', new ItemStack(Items.water_bucket), 'b', ringFrame, 'c', cEss);
		GameRegistry.addRecipe(lavaRing, " a ", "aba", "ccc", 'a', new ItemStack(Items.lava_bucket), 'b', ringFrame, 'c', cEss);
		
		GameRegistry.addRecipe(stepBelt, "aaa", "bcb", "aaa", 'a', iron, 'b', cEssRefined, 'c', rBeltFrame);
		
		GameRegistry.addRecipe(cEssBlock, "aaa", "aaa", "aaa", 'a', cEss);
		GameRegistry.addRecipe(cEssBlockRefined, "aaa", "aaa", "aaa", 'a', cEssRefined);
		
		GameRegistry.addRecipe(cEssCoarse, "aba", "bcb", "aba", 'a', obsidian, 'b', cEss, 'c', pearl);
		GameRegistry.addRecipe(cEssCoarse, "aba", "bcb", "aba", 'a', cEss, 'b', obsidian, 'c', pearl);
		
		// Shapeless
		GameRegistry.addShapelessRecipe(new ItemStack(TradeoffsItems.cEss, 9), new Object[] {cEssBlock});
		GameRegistry.addShapelessRecipe(new ItemStack(TradeoffsItems.cEssRefined, 9), new Object[] {cEssBlockRefined});
		
		// Furnace
		GameRegistry.addSmelting(cEssCoarse, cEssRefined, 0.2F);
	}
	
}
