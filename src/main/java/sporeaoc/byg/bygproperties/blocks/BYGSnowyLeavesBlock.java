package sporeaoc.byg.bygproperties.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.IShearable;

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

//    @Override
//    public BlockState getStateForPlacement(BlockItemUseContext context) {
//        Block block = context.getWorld().getBlockState(context.getPos().up()).getBlock();
//        return this.getDefaultState().with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW));
//    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(SNOWY);
        builder.add(DISTANCE, PERSISTENT);

    }
}
