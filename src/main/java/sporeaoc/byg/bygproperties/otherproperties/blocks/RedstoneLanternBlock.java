package sporeaoc.byg.bygproperties.otherproperties.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneTorchBlock;
import net.minecraft.block.material.PushReaction;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.pathfinding.PathType;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Direction.Axis;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class RedstoneLanternBlock extends Block {
    public static final BooleanProperty HANGING;
    protected static final VoxelShape field_220279_b;
    protected static final VoxelShape field_220280_c;
    public static BooleanProperty LIT;

    public RedstoneLanternBlock(Properties p_i49980_1_) {
        super(p_i49980_1_);
        this.setDefaultState((BlockState)((BlockState)this.stateContainer.getBaseState()).with(HANGING, false));

        this.setDefaultState((BlockState)this.getDefaultState().with(LIT, false));
    }

    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext p_196258_1_) {
        Direction[] var2 = p_196258_1_.getNearestLookingDirections();
        int var3 = var2.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Direction lvt_5_1_ = var2[var4];
            if (lvt_5_1_.getAxis() == Axis.Y) {
                BlockState lvt_6_1_ = (BlockState)this.getDefaultState().with(HANGING, lvt_5_1_ == Direction.UP);
                if (lvt_6_1_.isValidPosition(p_196258_1_.getWorld(), p_196258_1_.getPos())) {
                    return lvt_6_1_;
                }
            }
        }        return (BlockState)this.getDefaultState().with(LIT, p_196258_1_.getWorld().isBlockPowered(p_196258_1_.getPos()));
    }

    public void neighborChanged(BlockState p_220069_1_, World p_220069_2_, BlockPos p_220069_3_, Block p_220069_4_, BlockPos p_220069_5_, boolean p_220069_6_) {
        if (!p_220069_2_.isRemote) {
            boolean lvt_7_1_ = (Boolean)p_220069_1_.get(LIT);
            if (lvt_7_1_ != p_220069_2_.isBlockPowered(p_220069_3_)) {
                if (lvt_7_1_) {
                    p_220069_2_.getPendingBlockTicks().scheduleTick(p_220069_3_, this, 4);
                } else {
                    p_220069_2_.setBlockState(p_220069_3_, (BlockState)p_220069_1_.cycle(LIT), 2);
                }
            }

        }

    }

    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        return (Boolean)p_220053_1_.get(HANGING) ? field_220280_c : field_220279_b;
    }

    protected void fillStateContainer(Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(new IProperty[]{HANGING});
        p_206840_1_.add(new IProperty[]{LIT});
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }


    public boolean isValidPosition(BlockState p_196260_1_, IWorldReader p_196260_2_, BlockPos p_196260_3_) {
        Direction lvt_4_1_ = func_220277_j(p_196260_1_).getOpposite();
        return Block.hasEnoughSolidSide(p_196260_2_, p_196260_3_.offset(lvt_4_1_), lvt_4_1_.getOpposite());
    }

    protected static Direction func_220277_j(BlockState p_220277_0_) {
        return (Boolean)p_220277_0_.get(HANGING) ? Direction.DOWN : Direction.UP;
    }

    public PushReaction getPushReaction(BlockState p_149656_1_) {
        return PushReaction.DESTROY;
    }

    public void onBlockAdded(BlockState p_220082_1_, World p_220082_2_, BlockPos p_220082_3_, BlockState p_220082_4_, boolean p_220082_5_) {
        super.onBlockAdded(p_220082_1_, p_220082_2_, p_220082_3_, p_220082_4_, p_220082_5_);
    }
    
    public int getLightValue(BlockState p_149750_1_) {
        return (Boolean)p_149750_1_.get(LIT) ? super.getLightValue(p_149750_1_) : 0;
    }

    public BlockState updatePostPlacement(BlockState p_196271_1_, Direction p_196271_2_, BlockState p_196271_3_, IWorld p_196271_4_, BlockPos p_196271_5_, BlockPos p_196271_6_) {
        return func_220277_j(p_196271_1_).getOpposite() == p_196271_2_ && !p_196271_1_.isValidPosition(p_196271_4_, p_196271_5_) ? Blocks.AIR.getDefaultState() : super.updatePostPlacement(p_196271_1_, p_196271_2_, p_196271_3_, p_196271_4_, p_196271_5_, p_196271_6_);
    }

    public boolean allowsMovement(BlockState p_196266_1_, IBlockReader p_196266_2_, BlockPos p_196266_3_, PathType p_196266_4_) {
        return false;
    }

    public void tick(BlockState p_196267_1_, World p_196267_2_, BlockPos p_196267_3_, Random p_196267_4_) {
        if (!p_196267_2_.isRemote) {
            if ((Boolean)p_196267_1_.get(LIT) && !p_196267_2_.isBlockPowered(p_196267_3_)) {
                p_196267_2_.setBlockState(p_196267_3_, (BlockState)p_196267_1_.cycle(LIT), 2);
            }

        }
    }

    static {
        HANGING = BlockStateProperties.HANGING;
        field_220279_b = VoxelShapes.or(Block.makeCuboidShape(5.0D, 0.0D, 5.0D, 11.0D, 7.0D, 11.0D), Block.makeCuboidShape(6.0D, 7.0D, 6.0D, 10.0D, 9.0D, 10.0D));
        field_220280_c = VoxelShapes.or(Block.makeCuboidShape(5.0D, 1.0D, 5.0D, 11.0D, 8.0D, 11.0D), Block.makeCuboidShape(6.0D, 8.0D, 6.0D, 10.0D, 10.0D, 10.0D));
        LIT = RedstoneTorchBlock.LIT;
    }

}
