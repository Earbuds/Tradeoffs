package tradeoffs.items;

import tradeoffs.items.baubles.amulets.TAmulet;
import tradeoffs.items.baubles.belts.BeltOfStability;
import tradeoffs.items.baubles.belts.TBelt;
import tradeoffs.items.baubles.rings.PoseidionRing;
import tradeoffs.items.baubles.rings.TRing;
import tradeoffs.items.baubles.rings.VulcanianRing;
import tradeoffs.utility.References;
import net.minecraft.item.Item;

public class TradeoffsItems {
	
	public static Item cEss;
	public static Item cEssCoarse;
	public static Item cEssRefined;
	
	public static Item amuletFrame;
	public static Item rAmuletFrame;
	public static Item cAmuletFrame;
	
	public static Item ringFrame;
	public static Item rRingFrame;
	public static Item cRingFrame;
	
	public static Item beltFrame;
	public static Item rBeltFrame;
	public static Item cBeltFrame;
	
	public static Item poseidionRing1;
	public static Item poseidionRing2;
	public static Item poseidionRing3;
	
	public static Item vulcanianRing1;
	public static Item vulcanianRing2;
	public static Item vulcanianRing3;
	
	public static Item beltOfStability1;
	public static Item beltOfStability2;
	public static Item beltOfStability3;

	public static void initializeItems() {
		
		cEss = new TItem("cEss");
		cEssCoarse = new TItem("cEssCoarse");
		cEssRefined = new TItem("cEssRefined");
		
		amuletFrame = new TAmulet("amuletFrame", 0);
		rAmuletFrame = new TAmulet("rAmuletFrame", 1);
		cAmuletFrame = new TAmulet("cAmuletFrame", 2);
		
		ringFrame = new TRing("ringFrame", 0);
		rRingFrame = new TRing("rRingFrame", 1);
		cRingFrame = new TRing("cRingFrame", 2);
		
		beltFrame = new TBelt("beltFrame", 0);
		rBeltFrame = new TBelt("rBeltFrame", 1);
		cBeltFrame = new TBelt("cBeltFrame", 2);
		
		poseidionRing1 = new PoseidionRing("poseidionRing1", 0);
		poseidionRing2 = new PoseidionRing("poseidionRing2", 1);
		poseidionRing3 = new PoseidionRing("poseidionRing3", 2);
		
		vulcanianRing1 = new VulcanianRing("vulcanianRing1", 0);
		vulcanianRing2 = new VulcanianRing("vulcanianRing2", 1);
		vulcanianRing3 = new VulcanianRing("vulcanianRing3", 2);
		
		beltOfStability1 = new BeltOfStability("beltOfStability1", 0);
		beltOfStability2 = new BeltOfStability("beltOfStability2", 1);
		beltOfStability3 = new BeltOfStability("beltOfStability3", 2);
		
		Item[] TItems = {cEss, cEssCoarse, cEssRefined};
		Item[] amulets = {amuletFrame, rAmuletFrame, cAmuletFrame};
		Item[] rings = {ringFrame, rRingFrame, cRingFrame, poseidionRing1, poseidionRing2, poseidionRing3, vulcanianRing1, vulcanianRing2, vulcanianRing3};
		Item[] belts = {beltFrame, rBeltFrame, cBeltFrame, beltOfStability1, beltOfStability2, beltOfStability3};
		
		for(int i = 0; i < TItems.length; i++) {
			References.register(TItems[i]);
		}
		
		for(int i = 0; i < amulets.length; i++) {
			References.register(amulets[i]);
		}
		
		for(int i = 0; i < rings.length; i++) {
			References.register(rings[i]);
		}
		
		for(int i = 0; i < belts.length; i++) {
			References.register(belts[i]);
		}
		
	}
	
}
