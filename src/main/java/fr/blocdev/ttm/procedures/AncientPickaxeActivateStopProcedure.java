package fr.blocdev.ttm.procedures;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;

import java.util.Map;

import fr.blocdev.ttm.TtmMod;

public class AncientPickaxeActivateStopProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				TtmMod.LOGGER.warn("Failed to load dependency itemstack for procedure AncientPickaxeActivateStop!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		{
			Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments((itemstack));
			if (_enchantments.containsKey(Enchantments.EFFICIENCY)) {
				_enchantments.remove(Enchantments.EFFICIENCY);
				EnchantmentHelper.setEnchantments(_enchantments, (itemstack));
			}
		}
		((itemstack)).setDisplayName(new StringTextComponent("Ancient Pickaxe"));
	}
}
