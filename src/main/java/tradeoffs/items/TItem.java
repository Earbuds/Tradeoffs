package tradeoffs.items;

import tradeoffs.utility.TradeoffsTabs;
import net.minecraft.item.Item;

public class TItem extends Item {
	
	public TItem(String name) {
		setMaxStackSize(64);
		setUnlocalizedName(name);
		setCreativeTab(TradeoffsTabs.tradeoffsGeneral);
	}

}
