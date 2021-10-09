package fr.blocdev.ttm.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import java.util.Random;
import java.util.Map;

import fr.blocdev.ttm.TtmMod;

public class AncientPickaxeActivateClickProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TtmMod.LOGGER.warn("Failed to load dependency itemstack for procedure AncientPickaxeActivateClick!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			ItemStack _ist = (itemstack);
			if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
				_ist.shrink(1);
				_ist.setDamage(0);
			}
		}
		((itemstack)).addEnchantment(Enchantments.EFFICIENCY, (int) 5);
		((itemstack)).setDisplayName(new StringTextComponent("Ancient Pickaxe Fury Mode"));
	}
}
