package sporeaoc.byg.blockproperties;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.lighting.LightEngine;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.IShearable;

public class SnowyLeavesBlock extends LeavesBlock implements IShearable {

    public static final BooleanProperty SNOWY = BlockStateProperties.SNOWY;

        protected SnowyLeavesBlock(Block.Properties builder) {
            super(builder);
            this.setDefaultState(this.stateContainer.getBaseState().with(SNOWY, Boolean.valueOf(false)));
        }

        public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
            if (facing != Direction.UP) {
                return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
            } else {
                Block block = facingState.getBlock();
                return stateIn.with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW));
            }
        }

        public BlockState getStateForPlacement(BlockItemUseContext context) {
            Block block = context.getWorld().getBlockState(context.getPos().up()).getBlock();
            return this.getDefaultState().with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW));
        }

        protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
            builder.add(SNOWY); builder.add(DISTANCE, PERSISTENT);

        }
}
