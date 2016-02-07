package tradeoffs.items.baubles.belts;

import tradeoffs.items.baubles.ItemBauble;
import tradeoffs.utility.TradeoffsTabs;
import net.minecraft.item.ItemStack;
import baubles.api.BaubleType;

public class TBelt extends ItemBauble {
	
	public TBelt(String name, int baubleLevel) {
		super(name, baubleLevel);
		setCreativeTab(TradeoffsTabs.tradeoffsBelts);
	}

	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.BELT;
	}

}
