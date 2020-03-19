package sporeaoc.byg.bygproperties.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import sporeaoc.byg.byglists.BYGBlockList;

import java.util.Random;

public class BYGOreBlock extends Block {

    public BYGOreBlock(Block.Properties properties) {
        super(properties);
    }

    protected int getExperience(Random p_220281_1_) {
        if (this == BYGBlockList.AMETRINE_ORE) {
            return MathHelper.nextInt(p_220281_1_, 3, 9);
        } else if (this == Blocks.DIAMOND_ORE) {
            return MathHelper.nextInt(p_220281_1_, 3, 7);
        } else if (this == Blocks.EMERALD_ORE) {
            return MathHelper.nextInt(p_220281_1_, 3, 7);
        } else if (this == Blocks.LAPIS_ORE) {
            return MathHelper.nextInt(p_220281_1_, 2, 5);
        } else {
            return this == Blocks.NETHER_QUARTZ_ORE ? MathHelper.nextInt(p_220281_1_, 2, 5) : 0;
        }
    }

    /**
     * Perform side-effects from block dropping, such as creating silverfish
     */
    public void spawnAdditionalDrops(BlockState state, World worldIn, BlockPos pos, ItemStack stack) {
        super.spawnAdditionalDrops(state, worldIn, pos, stack);
    }

    @Override
    public int getExpDrop(BlockState state, net.minecraft.world.IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return silktouch == 0 ? this.getExperience(RANDOM) : 0;
    }
}
