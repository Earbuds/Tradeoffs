package tradeoffs.items.baubles.amulets;

import tradeoffs.items.baubles.ItemBauble;
import tradeoffs.utility.TradeoffsTabs;
import net.minecraft.item.ItemStack;
import baubles.api.BaubleType;

public class TAmulet extends ItemBauble {
	
	public TAmulet(String name, int baubleLevel) {
		super(name, baubleLevel);
		setCreativeTab(TradeoffsTabs.tradeoffsAmulets);
	}

	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.AMULET;
	}

}
