package sporeaoc.byg.world;

import net.minecraft.block.trees.BigTree;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.tree.birch.BrownBirchTree;
import sporeaoc.byg.world.tree.birch.OrangeBirchTree;
import sporeaoc.byg.world.tree.birch.RedBirchTree;
import sporeaoc.byg.world.tree.birch.YellowBirchTree;
import sporeaoc.byg.world.tree.jacaranda.JacarandaTree;
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

public class BYGSaplingToTree {
    public static class BlueSpruceSaplingToTree extends BigTree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantBlueSpruceTree(NoFeatureConfig::deserialize, true);
        }

        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BlueSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }

    public static class RedSpruceSaplingToTree extends BigTree {
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantRedSpruceTree(NoFeatureConfig::deserialize, false);
        }

        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeSpruceSaplingToTree extends BigTree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantOrangeSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class YellowSpruceSaplingToTree extends BigTree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantYellowSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class BrownOakSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeOakSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class RedOakSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeBirchSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class BrownBirchSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class RedBirchSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class YellowBirchSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowBirchTree(NoFeatureConfig::deserialize, false);
        }
    }

    public static class JacarandaSaplingToTree extends Tree {
        @Nullable
        public AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new JacarandaTree(NoFeatureConfig::deserialize, false);
        }
    }
}

