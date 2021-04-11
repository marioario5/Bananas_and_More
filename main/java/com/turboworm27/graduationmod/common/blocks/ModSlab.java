package com.turboworm27.graduationmod.common.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

public class ModSlab extends BaseHorizontalBlock {

	private static final VoxelShape SHAPE = Stream
			.of(Block.makeCuboidShape(14, 3, 7.888888888888889, 15, 4, 9.88888888888889),
					Block.makeCuboidShape(0, 0, 0, 16, 8, 16))
			.reduce((v1, v2) -> {
				return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);
			}).get();

	public ModSlab(Properties properties) {
		super(properties);
		runCalculation(SHAPE);
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES.get(this).get(state.get(HORIZONTAL_FACING));
	}
}