package fr.blocdev.ttm.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;

import java.util.Map;

import fr.blocdev.ttm.TtmMod;

public class AncientPickaxeActivatePross1Procedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TtmMod.LOGGER.warn("Failed to load dependency itemstack for procedure AncientPickaxeActivatePross1!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.FORTUNE, (int) 3);
	}
}
