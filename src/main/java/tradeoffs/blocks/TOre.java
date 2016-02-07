package tradeoffs.blocks;

import java.util.Random;

import tradeoffs.items.TradeoffsItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class TOre extends TBlock {

	public TOre(Material material, float hardness, SoundType type, String name, String tool, int harvestLvl) {
		super(material, hardness, type, name, tool, harvestLvl);
	}

	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return TradeoffsItems.cEss;
    }
	
}
