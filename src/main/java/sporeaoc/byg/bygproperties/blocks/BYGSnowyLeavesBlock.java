package sporeaoc.byg.bygproperties.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IShearable;

import java.util.Random;

public class BYGSnowyLeavesBlock extends LeavesBlock implements IShearable {

    public static final BooleanProperty SNOWY = BlockStateProperties.SNOWY;

    protected BYGSnowyLeavesBlock(Block.Properties builder) {
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

    public boolean ticksRandomly(BlockState state) {
        return state.get(DISTANCE) == 7 && !state.get(PERSISTENT);
    }

    /**
     * Performs a random tick on a block.
     */
    public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random random) {
        if (!state.get(PERSISTENT) && state.get(DISTANCE) == 7) {
            spawnDrops(state, worldIn, pos);
            worldIn.removeBlock(pos, false);
        }

    }

    public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
        worldIn.setBlockState(pos, updateDistance(state, worldIn, pos), 3);
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Block block = context.getWorld().getBlockState(context.getPos().up()).getBlock();
        return this.getDefaultState().with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(SNOWY);
        builder.add(DISTANCE, PERSISTENT);

    }
}
