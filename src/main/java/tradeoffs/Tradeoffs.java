package tradeoffs;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import tradeoffs.common.CommonProxy;
import tradeoffs.init.Initialize;
import tradeoffs.items.TItem;
import tradeoffs.items.baubles.belts.BeltOfStability;
import tradeoffs.utility.References;
import tradeoffs.utility.TradeoffsTabs;
import tradeoffs.utility.ModInfo;

@Mod(modid = ModInfo.modid, name = ModInfo.name, version = ModInfo.version, dependencies = ModInfo.dependencies)
public class Tradeoffs {

	@Instance(value = ModInfo.modid)
	public static Tradeoffs instance;

	@SidedProxy(clientSide = ModInfo.clientProxy, serverSide = ModInfo.serverProxy)
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		Initialize.preInit();

	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		Initialize.load();
		
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		Initialize.postInit();
		
	}

}
