package tradeoffs.utility;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TradeoffsTabs {

	public static CreativeTabs tradeoffsGeneral = new CreativeTabs("tradeoffsGeneral") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Items.diamond;
	    }
	};
	
	public static CreativeTabs tradeoffsAmulets = new CreativeTabs("tradeoffsAmulets") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Items.emerald;
	    }
	};
	
	public static CreativeTabs tradeoffsRings = new CreativeTabs("tradeoffsRings") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Items.ender_eye;
	    }
	};
	
	public static CreativeTabs tradeoffsBelts = new CreativeTabs("tradeoffsBelts") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return Items.redstone;
	    }
	};

}
