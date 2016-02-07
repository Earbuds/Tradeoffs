package tradeoffs.blocks;

import tradeoffs.utility.TradeoffsTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TBlock extends Block {

	public TBlock(Material material, float hardness, SoundType type, String name, String tool, int harvestLvl) {
		super(material);
		
		setHardness(hardness);
		setStepSound(type);
		setBlockName(name);
		setCreativeTab(TradeoffsTabs.tradeoffsGeneral);
		setHarvestLevel(tool, harvestLvl);
	}

}
