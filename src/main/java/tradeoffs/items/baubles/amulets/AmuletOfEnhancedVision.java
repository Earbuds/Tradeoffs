package tradeoffs.items.baubles.amulets;

import java.util.List;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.MinecraftForge;
import tradeoffs.items.TradeoffsItems;
import baubles.api.BaublesApi;
import baubles.common.container.InventoryBaubles;

public class AmuletOfEnhancedVision extends TAmulet {

	public AmuletOfEnhancedVision(String name, int baubleLevel) {
		super(name, baubleLevel);
		
		this.baubleLevel = baubleLevel;
		MinecraftForge.EVENT_BUS.register(this);
	}
	
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
			
			if(this.baubleLevel == 0) {
				
			}
			
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 400, 4));
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
		
		list.add(EnumChatFormatting.GREEN + "Enhanced Vision");
		
		if(this.baubleLevel == 0) {
			list.add(EnumChatFormatting.RED + "Heavy");
		}else if(this.baubleLevel == 1) {
			list.add(EnumChatFormatting.GRAY + timeRemaining(tag, ticks));
		}
	}
	
	public void onEquippedOrLoadedIntoWorld(ItemStack stack, EntityLivingBase player) { // Sky flickers when 10s or less are left in effect
		player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 400, 4));
	}

	@Override
	public void onUnequipped(ItemStack stack, EntityLivingBase player) {
		player.removePotionEffect(Potion.nightVision.id);
	}
	
}
