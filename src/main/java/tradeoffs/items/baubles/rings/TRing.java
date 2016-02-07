package tradeoffs.items.baubles.rings;

import tradeoffs.items.baubles.ItemBauble;
import tradeoffs.utility.TradeoffsTabs;
import net.minecraft.item.ItemStack;
import baubles.api.BaubleType;

public class TRing extends ItemBauble {

	public TRing(String name, int baubleLevel) {
		super(name, baubleLevel);
		setCreativeTab(TradeoffsTabs.tradeoffsRings);
	}
	
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}

}
