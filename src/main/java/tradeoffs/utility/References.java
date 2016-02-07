package tradeoffs.utility;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class References {

	public static void register(Block block) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
	}

	public static void register(Item item) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
	}

	public static String setName(Item name) {
		return ModInfo.modid.toLowerCase() + ":" + name.getUnlocalizedName().substring(5);
	}

	public static String setName(Block name) {
		return ModInfo.modid.toLowerCase() + ":" + name.getUnlocalizedName().substring(5);
	}

}
