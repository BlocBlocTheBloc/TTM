package fr.blocdev.ttm.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import java.util.Map;

import fr.blocdev.ttm.TtmMod;

public class VHFASPro1Procedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TtmMod.LOGGER.warn("Failed to load dependency x for procedure VHFASPro1!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TtmMod.LOGGER.warn("Failed to load dependency z for procedure VHFASPro1!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TtmMod.LOGGER.warn("Failed to load dependency world for procedure VHFASPro1!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) 1, (int) z), Blocks.FIRE.getDefaultState(), 3);
	}
}
