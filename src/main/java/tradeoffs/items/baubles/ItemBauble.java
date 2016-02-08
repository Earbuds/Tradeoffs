package tradeoffs.items.baubles;

import tradeoffs.utility.ModInfo;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ItemBauble extends Item implements IBauble {

	protected int baubleLevel;
	public int ticks = 162000;
	
	public ItemBauble(String name, int baubleLevel) {
		super();
		setMaxStackSize(1);
		setUnlocalizedName(name);
		setTextureName(ModInfo.modid + ":" + name);
		
		this.baubleLevel = baubleLevel;
	}
	
	public BaubleType getBaubleType(ItemStack itemstack) {
		return null;
	}

	public void onWornTick(ItemStack stack, EntityLivingBase player) {		
	}

	public void onEquippedOrLoadedIntoWorld(ItemStack stack, EntityLivingBase player) {
	}

	public void onUnequipped(ItemStack stack, EntityLivingBase player) {
	}

	public boolean canEquip(ItemStack stack, EntityLivingBase player) {
		return true;
	}

	public boolean canUnequip(ItemStack stack, EntityLivingBase player) {
		return true;
	}
	
	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		NBTTagCompound tag = stack.stackTagCompound;
		
		tag = new NBTTagCompound();
		
		tag.setInteger("ticksRemaining", ticks);
		tag.setInteger("baubleLevel", this.baubleLevel);
		
		stack.stackTagCompound = tag;
	}

	public void onEquipped(ItemStack stack, EntityLivingBase player) {
		if(!player.worldObj.isRemote)
			player.worldObj.playSoundAtEntity(player, "botania:equipBauble", 0.1F, 1.3F);

		onEquippedOrLoadedIntoWorld(stack, player);
	}
	
	public String timeRemaining(NBTTagCompound tag, int time) {
		return time / 3600 + " Minutes, " + (time % 3600) / 60 + " Seconds Remaining.";
	};

}
