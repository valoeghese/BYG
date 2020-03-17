package sporeaoc.byg.world.tree;

import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.tree.birch.BrownBirchTree;
import sporeaoc.byg.world.tree.birch.OrangeBirchTree;
import sporeaoc.byg.world.tree.birch.RedBirchTree;
import sporeaoc.byg.world.tree.birch.YellowBirchTree;
import sporeaoc.byg.world.tree.coniferousforest.SmallFirTree;
import sporeaoc.byg.world.tree.coniferousforest.WideFirTree;
import sporeaoc.byg.world.tree.jacaranda.JacarandaTree;
import sporeaoc.byg.world.tree.util.BYGAbstractTreeFeature;
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
import sporeaoc.byg.world.tree.util.BYGHugeTree;
import sporeaoc.byg.world.tree.util.BYGTree;

import javax.annotation.Nullable;
import java.util.Random;

public class BYGSaplingToTree {
    public static class BlueSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantBlueSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BlueSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }

    public static class RedSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantRedSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantOrangeSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class YellowSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantYellowSpruceTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowSpruceTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class BrownOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class RedOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedOakTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class OrangeBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class BrownBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class RedBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedBirchTree(NoFeatureConfig::deserialize, false);
        }
    }


    public static class YellowBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowBirchTree(NoFeatureConfig::deserialize, false);
        }
    }

    public static class JacarandaSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new JacarandaTree(NoFeatureConfig::deserialize, false);
        }
    }

    public static class FirSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new WideFirTree(NoFeatureConfig::deserialize, false);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new SmallFirTree(NoFeatureConfig::deserialize, false);
        }
    }

}

