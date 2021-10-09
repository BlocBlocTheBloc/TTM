
package fr.blocdev.ttm;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import fr.blocdev.ttm.item.AncientWaterItem;
import fr.blocdev.ttm.item.AncientDustItem;

@TtmModElements.ModElement.Tag
public class AncientWaterCraftBrewingRecipe extends TtmModElements.ModElement {
	public AncientWaterCraftBrewingRecipe(TtmModElements instance) {
		super(instance, 28);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}
	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.POTION;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == AncientDustItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(AncientWaterItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
