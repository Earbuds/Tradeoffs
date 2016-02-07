package tradeoffs.items.baubles.belts;

import java.util.List;

import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import tradeoffs.items.TradeoffsItems;
import tradeoffs.utility.TradeoffsTabs;
import baubles.api.BaubleType;
import baubles.api.BaublesApi;
import baubles.common.container.InventoryBaubles;

// dont touch this shit
public class BeltOfStability extends TBelt {
	
	public BeltOfStability(String name, int baubleLevel) {
		super(name, baubleLevel);
		
		this.baubleLevel = baubleLevel;
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	final int baubleLevel;
	public int ticks = 72000;
	
	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase entity) {
		NBTTagCompound tag = stack.stackTagCompound;
		
		if (entity.ticksExisted == 1) {
			onEquippedOrLoadedIntoWorld(stack, entity);
		}
		
		if(this.baubleLevel == 1) {
			
			ticks = tag.getInteger("ticksRemaining");
			
			if(ticks > 0) {
				ticks--;
				tag.setInteger("ticksRemaining", ticks);
			}
		}
		
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			
			if(this.baubleLevel == 1) {
				if(ticks <= 0) {
					InventoryBaubles inv = (InventoryBaubles) BaublesApi.getBaubles(player);
					
					inv.setInventorySlotContents(3, new ItemStack(TradeoffsItems.beltOfStability1, 1));
				}
			}
			
			if(player.isSprinting()  && this.baubleLevel == 0) { // Early-Game, no sprinting w/ step assist
				player.setSprinting(false);
			}
			
			if (player.isSneaking()) {
				player.stepHeight = 0.50001F;
			} else if (player.stepHeight == 0.50001F) {
				player.stepHeight = 1F;
			}
		}
	}
	
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		NBTTagCompound tag = stack.stackTagCompound;
		
		if(tag == null) {
			tag = new NBTTagCompound();
			
			tag.setInteger("ticksRemaining", ticks);
			tag.setInteger("baubleLevel", this.baubleLevel);
			
			stack.stackTagCompound = tag;
		}
		
		list.add(EnumChatFormatting.GREEN + "Auto-Step");
		
		if(this.baubleLevel == 0) {
			list.add(EnumChatFormatting.RED + "Unable to Sprint");
		}else if(this.baubleLevel == 1) {
			list.add(EnumChatFormatting.GRAY + timeRemaining(tag, ticks)/*((int)tag.getInteger("ticksRemaining") / 60)*/);
		}
	}

	
	
	@Override
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		NBTTagCompound tag = stack.stackTagCompound;
		
		tag = new NBTTagCompound();
		
		tag.setInteger("ticksRemaining", ticks);
		tag.setInteger("baubleLevel", this.baubleLevel);
		
		stack.stackTagCompound = tag;
	}
	
	public void onEquippedOrLoadedIntoWorld(ItemStack stack, EntityLivingBase player) {
		player.stepHeight = 1F;
	}

	@Override
	public void onUnequipped(ItemStack stack, EntityLivingBase player) {
		player.stepHeight = 0.5F;
	}

}
