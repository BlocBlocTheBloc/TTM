
package fr.blocdev.ttm.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

import fr.blocdev.ttm.itemgroup.TTMItemGroup;
import fr.blocdev.ttm.TtmModElements;

@TtmModElements.ModElement.Tag
public class AncientReparatorItem extends TtmModElements.ModElement {
	@ObjectHolder("ttm:ancient_reparator")
	public static final Item block = null;
	public AncientReparatorItem(TtmModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(TTMItemGroup.tab).maxStackSize(1).rarity(Rarity.UNCOMMON));
			setRegistryName("ancient_reparator");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Repare evry ancient items"));
			list.add(new StringTextComponent("tools and armor"));
		}
	}
}
