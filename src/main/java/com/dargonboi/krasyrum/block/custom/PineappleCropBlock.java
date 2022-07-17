package com.dargonboi.krasyrum.block.custom;

import com.dargonboi.krasyrum.item.ModFoods;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition.Builder;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PineappleCropBlock extends CropBlock {

	public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);
	private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[] { Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 18.0D, 16.0D),
			Block.box(0.0D, 0.0D, 0.0D, 16.0D, 28.0D, 16.0D), Block.box(0.0D, 0.0D, 0.0D, 16.0D, 28.0D, 16.0D) };

	private static final int MAXAGE = 6;

	public PineappleCropBlock(Properties properties) {
		super(properties);
	}

	@Override
	protected ItemLike getBaseSeedId() {
		return ModFoods.PINEAPPLE_SEEDS.get();
	}

	@Override
	public IntegerProperty getAgeProperty() {
		return AGE;
	}

	@Override
	public int getMaxAge() {
		return MAXAGE;
	}

	@Override
	protected void createBlockStateDefinition(Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}

	@Override
	public VoxelShape getShape(BlockState p_52297_, BlockGetter p_52298_, BlockPos p_52299_,
			CollisionContext p_52300_) {
		return SHAPE_BY_AGE[p_52297_.getValue(this.getAgeProperty())];
	}
}
