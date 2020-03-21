package sporeaoc.byg.bygproperties.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraftforge.common.IShearable;

public class BYGSnowyLeavesBlock extends LeavesBlock implements IShearable {
    public static final BooleanProperty SNOWY = BlockStateProperties.SNOWY;
    public BYGSnowyLeavesBlock(String registryName) {
        super(Block.Properties.create(Material.LEAVES)
                .hardnessAndResistance(0.2F)
                .tickRandomly()
                .sound(SoundType.PLANT)
                .notSolid());
        //this.setDefaultState(this.stateContainer.getBaseState().with(SNOWY, Boolean.valueOf(false)));
        setRegistryName(registryName);
        this.setDefaultState(this.stateContainer.getBaseState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)));
    }
    @Override
    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (facing != Direction.UP) {
            return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        } else {
            Block block = facingState.getBlock();
            return stateIn.with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW ));
        }
    }

    public BlockState getStateForPlacement(BlockItemUseContext context) {
        Block block = context.getWorld().getBlockState(context.getPos().up()).getBlock();
        updateDistance(this.getDefaultState().with(PERSISTENT, Boolean.valueOf(true)), context.getWorld(), context.getPos());
        return this.getDefaultState().with(SNOWY, Boolean.valueOf(block == Blocks.SNOW_BLOCK || block == Blocks.SNOW));
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(SNOWY);
        builder.add(DISTANCE, PERSISTENT);

    }
}
