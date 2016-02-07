package tradeoffs.blocks;

import java.util.Random;

import tradeoffs.items.TradeoffsItems;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class ContingentEssOre extends TBlock {

	public ContingentEssOre(Material material, float hardness, SoundType type, String name, String tool, int harvestLvl) {
		super(material, hardness, type, name, tool, harvestLvl);
	}

	@Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return TradeoffsItems.cEss;
    }
	
	@Override
	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(3);
    }
	
}
