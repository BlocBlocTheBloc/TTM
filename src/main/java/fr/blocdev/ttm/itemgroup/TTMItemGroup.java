
package fr.blocdev.ttm.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import fr.blocdev.ttm.block.AncientOreBlock;
import fr.blocdev.ttm.TtmModElements;

@TtmModElements.ModElement.Tag
public class TTMItemGroup extends TtmModElements.ModElement {
	public TTMItemGroup(TtmModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabttm") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(AncientOreBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
