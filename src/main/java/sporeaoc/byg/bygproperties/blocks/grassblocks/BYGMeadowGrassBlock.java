package sporeaoc.byg.bygproperties.blocks.grassblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.server.ServerWorld;
import sporeaoc.byg.byglists.BYGBlockList;
import sporeaoc.byg.bygproperties.blocks.spreadablesnowyblocks.SpreadableSnowyMeadowDirtBlock;

import java.util.List;
import java.util.Random;

public class BYGMeadowGrassBlock extends SpreadableSnowyMeadowDirtBlock implements IGrowable {
    public BYGMeadowGrassBlock(Properties properties) {
        super(properties);
    }

    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return worldIn.getBlockState(pos.up()).isAir();
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }

    public void grow(ServerWorld world, Random rand, BlockPos blockPos, BlockState state) {
        BlockPos blockpos = blockPos.up();
        BlockState blockstate = BYGBlockList.MEADOW_GRASSBLOCK.getDefaultState();

        for(int i = 0; i < 128; ++i) {
            BlockPos blockpos1 = blockpos;
            int j = 0;

            while(true) {
                if (j >= i / 16) {
                    BlockState blockstate2 = world.getBlockState(blockpos1);
                    if (blockstate2.getBlock() == blockstate.getBlock() && rand.nextInt(10) == 0) {
                        ((IGrowable)blockstate.getBlock()).grow(world, rand, blockpos1, blockstate2);
                    }

                    if (!blockstate2.isAir()) {
                        break;
                    }

                    BlockState blockstate1;
                    if (rand.nextInt(8) == 0) {
                        List<ConfiguredFeature<?, ?>> list = world.getBiome(blockpos1).getFlowers();
                        if (list.isEmpty()) {
                            break;
                        }

                        ConfiguredFeature<?, ?> configuredfeature = ((DecoratedFeatureConfig)(list.get(0)).config).feature;
                        blockstate1 = ((FlowersFeature)configuredfeature.feature).getFlowerToPlace(rand, blockpos1, configuredfeature.config);
                    } else {
                        blockstate1 = blockstate;
                    }

                    if (blockstate1.isValidPosition(world, blockpos1)) {
                        world.setBlockState(blockpos1, blockstate1, 3);
                    }
                    break;
                }

                blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);
                if (world.getBlockState(blockpos1.down()).getBlock() != this || world.getBlockState(blockpos1).isCollisionShapeOpaque(world, blockpos1)) {
                    break;
                }

                ++j;
            }
        }

    }
}