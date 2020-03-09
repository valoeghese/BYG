package sporeaoc.byg.world.tree;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.trees.BigTree;
import net.minecraft.block.trees.Tree;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.tree.birch.BrownBirchTree;
import sporeaoc.byg.world.tree.birch.OrangeBirchTree;
import sporeaoc.byg.world.tree.birch.RedBirchTree;
import sporeaoc.byg.world.tree.birch.YellowBirchTree;
import sporeaoc.byg.world.tree.oak.BrownOakTree;
import sporeaoc.byg.world.tree.oak.OrangeOakTree;
import sporeaoc.byg.world.tree.oak.RedOakTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantBlueSpruceTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantOrangeSpruceTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantRedSpruceTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantYellowSpruceTree;
import sporeaoc.byg.world.tree.taiga.spruce.BlueSpruceTree;
import sporeaoc.byg.world.tree.taiga.spruce.OrangeSpruceTree;
import sporeaoc.byg.world.tree.taiga.spruce.RedSpruceTree;
import sporeaoc.byg.world.tree.taiga.spruce.YellowSpruceTree;

import javax.annotation.Nullable;
import java.util.Random;

public class BYGSaplings extends SaplingBlock implements IGrowable {
    static VoxelShape SHAPE = Block.makeCuboidShape(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    public static final IntegerProperty STAGE = BlockStateProperties.STAGE_0_1;
    public static Tree tree;

    public BYGSaplings(Tree tree, String registryName) {
        super(tree, Block.Properties.create(Material.PLANTS)
                .sound(SoundType.PLANT)
                .hardnessAndResistance(0.0f)
                .doesNotBlockMovement()
                .tickRandomly()
        );
        setRegistryName(registryName);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    @Override
    public void tick(BlockState state, World worldIn, BlockPos pos, Random random) {
        super.tick(state, worldIn, pos, random);
        if (!worldIn.isAreaLoaded(pos, 1))
            return; // Forge: prevent loading unloaded chunks when checking neighbor's light
        if (worldIn.getLight(pos.up()) >= 9 && random.nextInt(7) == 0) {
            this.grow(worldIn, pos, state, random);
        }
    }

    @Override
    public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand) {
        if (state.get(STAGE) == 0) {
            worldIn.setBlockState(pos, state.cycle(STAGE), 4);
        } else {
            if (!net.minecraftforge.event.ForgeEventFactory.saplingGrowTree(worldIn, rand, pos)) return;
            tree.spawn(worldIn, pos, state, rand);
        }

    }

    @Override
    public boolean canGrow(IBlockReader worldIn, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return (double) worldIn.rand.nextFloat() < 0.45D;
    }

    @Override
    public void grow(World worldIn, Random rand, BlockPos pos, BlockState state) {
        this.grow(worldIn, pos, state, rand);
    }

    @Override
    public void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(STAGE);
    }


    public static class BlueSpruceSapling extends BigTree {
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantBlueSpruceTree(NoFeatureConfig::deserialize, true);
        }

        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BlueSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class RedSpruceSapling extends BigTree {
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantRedSpruceTree(NoFeatureConfig::deserialize, false);
        }

        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeSpruceSapling extends BigTree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new OrangeSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new GiantOrangeSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class YellowSpruceSapling extends BigTree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new YellowSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new GiantYellowSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class BrownOakSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeOakSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class RedOakSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeBirchSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class BrownBirchSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class RedBirchSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class YellowBirchSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowBirchTree(NoFeatureConfig::deserialize, false);
        }
    }

    public static class JacarandaSapling extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowBirchTree(NoFeatureConfig::deserialize, false);
        }
    }
}
