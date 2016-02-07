package tradeoffs.items;

import tradeoffs.items.baubles.amulets.TAmulet;
import tradeoffs.items.baubles.belts.BeltOfStability;
import tradeoffs.items.baubles.belts.TBelt;
import tradeoffs.items.baubles.rings.TRing;
import tradeoffs.utility.References;
import net.minecraft.item.Item;

public class TradeoffsItems {
	
	public static Item amuletFrame;
	public static Item rAmuletFrame;
	public static Item cAmuletFrame;
	
	public static Item ringFrame;
	public static Item rRingFrame;
	public static Item cRingFrame;
	
	public static Item beltFrame;
	public static Item rBeltFrame;
	public static Item cBeltFrame;
	
	public static Item beltOfStability1;
	public static Item beltOfStability2;
	public static Item beltOfStability3;

	public static void initializeItems() {
		
		amuletFrame = new TAmulet("amuletFrame", 0);
		rAmuletFrame = new TAmulet("rAmuletFrame", 1);
		cAmuletFrame = new TAmulet("cAmuletFrame", 2);
		
		ringFrame = new TRing("ringFrame", 0);
		rRingFrame = new TRing("rRingFrame", 1);
		cRingFrame = new TRing("cRingFrame", 2);
		
		beltFrame = new TBelt("beltFrame", 0);
		rBeltFrame = new TBelt("rBeltFrame", 1);
		cBeltFrame = new TBelt("cBeltFrame", 2);
		
		beltOfStability1 = new BeltOfStability("beltOfStability1", 0);
		beltOfStability2 = new BeltOfStability("beltOfStability2", 1);
		beltOfStability3 = new BeltOfStability("beltOfStability3", 2);
		
		Item[] TItems = {};
		Item[] amulets = {amuletFrame, rAmuletFrame, cAmuletFrame};
		Item[] rings = {ringFrame, rRingFrame, cRingFrame};
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
