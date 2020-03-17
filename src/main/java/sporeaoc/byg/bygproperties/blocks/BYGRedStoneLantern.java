package sporeaoc.byg.bygproperties.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class BYGRedStoneLantern extends Block {
    public static  BooleanProperty LIT = RedstoneTorchBlock.LIT;
    public static  BooleanProperty HANGING = BlockStateProperties.HANGING;
    protected static final VoxelShape field_220279_b = VoxelShapes.or(Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D), Block.makeCuboidShape(6.0D, 7.0D, 6.0D, 10.0D, 9.0D, 10.0D));
    protected static final VoxelShape field_220280_c = VoxelShapes.or(Block.makeCuboidShape(5.0D, 1.0D, 5.0D, 11.0D, 8.0D, 11.0D), Block.makeCuboidShape(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));


    public BYGRedStoneLantern(String registryName) {
        super(
                Block.Properties.create(Material.REDSTONE_LIGHT)
                .sound(SoundType.LANTERN)
                .hardnessAndResistance(0.0f)
                .lightValue(15)
        );
        setRegistryName(registryName);
        this.setDefaultState(this.getDefaultState().with(LIT, Boolean.valueOf(false)));
        this.setDefaultState(this.stateContainer.getBaseState().with(HANGING, Boolean.valueOf(false)));
    }
    public int getLightValue(BlockState state) {
        return state.get(LIT) ? super.getLightValue(state) : 0;
    }

    public void onBlockAdded(BlockState state, World worldIn, BlockPos pos, BlockState oldState, boolean isMoving) {
        super.onBlockAdded(state, worldIn, pos, oldState, isMoving);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(LIT, Boolean.valueOf(context.getWorld().isBlockPowered(context.getPos())));
    }
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return state.get(HANGING) ? field_220280_c : field_220279_b;
    }


    public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
        if (!worldIn.isRemote) {
            boolean flag = state.get(LIT);
            if (flag != worldIn.isBlockPowered(pos)) {
                if (flag) {
                    worldIn.getPendingBlockTicks().scheduleTick(pos, this, 4);
                } else {
                    worldIn.setBlockState(pos, state.cycle(LIT), 2);
                }
            }

        }
    }

    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        if (!worldIn.isRemote) {
            if (state.get(LIT) && !worldIn.isBlockPowered(pos)) {
                worldIn.setBlockState(pos, state.cycle(LIT), 2);
            }

        }
    }

    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }
}
