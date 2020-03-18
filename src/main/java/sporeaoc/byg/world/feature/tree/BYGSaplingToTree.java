package sporeaoc.byg.world.feature.tree;

import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.feature.tree.birch.BrownBirchTree;
import sporeaoc.byg.world.feature.tree.birch.OrangeBirchTree;
import sporeaoc.byg.world.feature.tree.birch.RedBirchTree;
import sporeaoc.byg.world.feature.tree.birch.YellowBirchTree;
import sporeaoc.byg.world.feature.tree.coniferousforest.SmallFirTree;
import sporeaoc.byg.world.feature.tree.coniferousforest.WideFirTree;
import sporeaoc.byg.world.feature.tree.jacaranda.JacarandaTree;
import sporeaoc.byg.world.feature.tree.oak.BrownOakTree;
import sporeaoc.byg.world.feature.tree.oak.OrangeOakTree;
import sporeaoc.byg.world.feature.tree.oak.RedOakTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantBlueSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantOrangeSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantRedSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantYellowSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.BlueSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.OrangeSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.RedSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.YellowSpruceTree;
import sporeaoc.byg.world.feature.tree.tropicalrainforest.ShortTropicalRainForestTree;
import sporeaoc.byg.world.feature.tree.tropicalrainforest.TropicalRainForestTree;
import sporeaoc.byg.world.feature.tree.util.BYGAbstractTreeFeature;
import sporeaoc.byg.world.feature.tree.util.BYGHugeTree;
import sporeaoc.byg.world.feature.tree.util.BYGTree;

import javax.annotation.Nullable;
import java.util.Random;

public class BYGSaplingToTree {
    public static class BlueSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantBlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }
    }

    public static class RedSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantRedSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class OrangeSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantOrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class YellowSpruceSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new GiantYellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class BrownOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownOakTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class OrangeOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeOakTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class RedOakSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedOakTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class OrangeBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new OrangeBirchTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class BrownBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new BrownBirchTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class RedBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new RedBirchTree(NoFeatureConfig::deserialize, false, 0);
        }
    }


    public static class YellowBirchSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new YellowBirchTree(NoFeatureConfig::deserialize, false, 0);
        }
    }

    public static class JacarandaSaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new JacarandaTree(NoFeatureConfig::deserialize, false, 0);
        }
    }

    public static class FirSaplingToTree extends BYGHugeTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getBigTreeFeature(Random random) {
            return new WideFirTree(NoFeatureConfig::deserialize, false, 0);
        }

        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return new SmallFirTree(NoFeatureConfig::deserialize, false, 0);
        }
    }

    public static class MahogonySaplingToTree extends BYGTree {
        @Nullable
        public BYGAbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {
            return random.nextInt(2) == 0 ? new TropicalRainForestTree(NoFeatureConfig::deserialize, true, 0) : new ShortTropicalRainForestTree(NoFeatureConfig::deserialize, true, 0);
        }
    }
}

