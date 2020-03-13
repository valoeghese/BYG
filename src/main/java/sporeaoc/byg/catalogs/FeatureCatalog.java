package sporeaoc.byg.catalogs;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import sporeaoc.byg.world.features.DeadSeaSpires;
import sporeaoc.byg.world.flowers.AlliumFieldFlowers;
import sporeaoc.byg.world.flowers.AmaranthFieldFlowers;
import sporeaoc.byg.world.flowers.PrairieGrass;
import sporeaoc.byg.world.structures.RedDesertPyramidStructure;
import sporeaoc.byg.world.tree.birch.BrownBirchTree;
import sporeaoc.byg.world.tree.birch.OrangeBirchTree;
import sporeaoc.byg.world.tree.birch.RedBirchTree;
import sporeaoc.byg.world.tree.birch.YellowBirchTree;
import sporeaoc.byg.world.tree.borealforest.BorealForestTree1;
import sporeaoc.byg.world.tree.borealforest.BorealForestTree2;
import sporeaoc.byg.world.tree.coniferousforest.SmallFirTree;
import sporeaoc.byg.world.tree.coniferousforest.WideFirTree;
import sporeaoc.byg.world.tree.cypressswamplands.HugeCypressTree;
import sporeaoc.byg.world.tree.deciduousforest.*;
import sporeaoc.byg.world.tree.jacaranda.JacarandaTree;
import sporeaoc.byg.world.tree.misc.TightTrees;
import sporeaoc.byg.world.tree.misc.TreeName;
import sporeaoc.byg.world.tree.misc.TreeTemplate;
import sporeaoc.byg.world.tree.oak.BrownOakTree;
import sporeaoc.byg.world.tree.oak.OrangeOakTree;
import sporeaoc.byg.world.tree.oak.RedOakTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantBlueSpruceTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantOrangeSpruceTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantRedSpruceTree;
import sporeaoc.byg.world.tree.taiga.giantspruce.GiantYellowSpruceTree;
import sporeaoc.byg.world.tree.taiga.smallspruce.SmallBlueTaigaTree;
import sporeaoc.byg.world.tree.taiga.smallspruce.SmallOrangeSpruceTree;
import sporeaoc.byg.world.tree.taiga.smallspruce.SmallRedSpruceTree;
import sporeaoc.byg.world.tree.taiga.smallspruce.SmallYellowTaigaTree;
import sporeaoc.byg.world.tree.taiga.spruce.BlueSpruceTree;
import sporeaoc.byg.world.tree.taiga.spruce.OrangeSpruceTree;
import sporeaoc.byg.world.tree.taiga.spruce.RedSpruceTree;
import sporeaoc.byg.world.tree.taiga.spruce.YellowSpruceTree;
import sporeaoc.byg.world.tree.taiga.tallspruce.TallBlueSpruceTree;
import sporeaoc.byg.world.tree.taiga.tallspruce.TallOrangeSpruceTree;
import sporeaoc.byg.world.tree.taiga.tallspruce.TallRedSpruceTree;
import sporeaoc.byg.world.tree.taiga.tallspruce.TallYellowSpruceTree;
import sporeaoc.byg.world.tree.tropicalrainforest.ShortTropicalRainForestTree;
import sporeaoc.byg.world.tree.tropicalrainforest.TropicalRainForestTree;

public class FeatureCatalog {
    public static final AbstractTreeFeature<NoFeatureConfig> DECIDUOUS_TREE = new DeciduousTree1();
    //public static final AbstractTreeFeature<NoFeatureConfig> DECIDUOUS_TREE2 = new DeciduousTree2();
    public static final AbstractTreeFeature<NoFeatureConfig> TIGHT_TREE = new TightTrees();
    public static final AbstractTreeFeature<NoFeatureConfig> TREE_TEMPLATE = new TreeTemplate();
    public static final AbstractTreeFeature<NoFeatureConfig> SDECIDUOUS_TREE1 = new SDeciduousTrees();
    public static final AbstractTreeFeature<NoFeatureConfig> SDECIDUOUS_TREE2 = new SDeciduousTrees2();
    public static final AbstractTreeFeature<NoFeatureConfig> SDECIDUOUS_TREE3 = new SDeciduousTrees3();
    public static final AbstractTreeFeature<NoFeatureConfig> SDECIDUOUS_BIRCH = new SDeciduousBirch();
    public static final AbstractTreeFeature<NoFeatureConfig> SDECIDUOUS_TREE5 = new SDeciduousTrees5();
    public static final AbstractTreeFeature<NoFeatureConfig> SDECIDUOUS_SHRUBS = new SDeciduousShrub();
    public static final AbstractTreeFeature<NoFeatureConfig> DECIDUOUS_SHRUBS = new DeciduousShrub();
    public static final AbstractTreeFeature<NoFeatureConfig> BROWNOAK_TREE = new BrownOakTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> ORANGEOAK_TREE = new OrangeOakTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> REDOAK_TREE = new RedOakTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> BROWNBIRCH_TREE = new BrownBirchTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> ORANGEBIRCH_TREE = new OrangeBirchTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> REDBIRCH_TREE = new RedBirchTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> YELLOWBIRCH_TREE = new YellowBirchTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> JACARANDA_TREE = new JacarandaTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> HUGECYPRESS_TREE = new HugeCypressTree(NoFeatureConfig::deserialize, false);


    //TaigaTrees
    public static final Feature<NoFeatureConfig> BLUEGIANTTAIGA_TREE = new GiantBlueSpruceTree(NoFeatureConfig::deserialize, false);
    public static final Feature<NoFeatureConfig> TALL_BLUE_SPRUCE = new TallBlueSpruceTree(NoFeatureConfig::deserialize, false);
    public static final Feature<NoFeatureConfig> BLUE_SPRUCE = new BlueSpruceTree(NoFeatureConfig::deserialize, false);
    public static final Feature<NoFeatureConfig> SMALL_BLUE_SPRUCE = new SmallBlueTaigaTree(NoFeatureConfig::deserialize, false);

    public static final AbstractTreeFeature<NoFeatureConfig> GIANT_ORANGE_SPRUCE = new GiantOrangeSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> TALL_ORANGE_SPRUCE = new TallOrangeSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> ORANGE_SPRUCE = new OrangeSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> SMALL_ORANGE_SPRUCE = new SmallOrangeSpruceTree(NoFeatureConfig::deserialize, false);

    public static final AbstractTreeFeature<NoFeatureConfig> GIANT_RED_SPRUCE = new GiantRedSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> TALL_RED_SPRUCE = new TallRedSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> RED_SPRUCE = new RedSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> SMALL_RED_SPRUCE = new SmallRedSpruceTree(NoFeatureConfig::deserialize, false);

    public static final AbstractTreeFeature<NoFeatureConfig> GIANT_YELLOW_SPRUCE = new GiantYellowSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> TALL_YELLOW_SPRUCE = new TallYellowSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> YELLOW_SPRUCE = new YellowSpruceTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> SMALL_YELLOW_SPRUCE = new SmallYellowTaigaTree(NoFeatureConfig::deserialize, false);


    public static final AbstractTreeFeature<NoFeatureConfig> BOREALFOREST_TREE = new BorealForestTree1();
    public static final AbstractTreeFeature<NoFeatureConfig> BOREALFOREST_TREE2 = new BorealForestTree2();
    public static final AbstractTreeFeature<NoFeatureConfig> TROPICALRAINFORESTTREE = new TropicalRainForestTree();
    public static final AbstractTreeFeature<NoFeatureConfig> SHORTTROPICALRAINFORESTTREE = new ShortTropicalRainForestTree();
    public static final AbstractTreeFeature<NoFeatureConfig> TREENAME = new TreeName();
    public static final AbstractTreeFeature<NoFeatureConfig> SHRUB = new DeciduousShrub();
    //    public static final AbstractTreeFeature<NoFeatureConfig> ASPENTREE1 = new AspenTree();
    public static final AbstractTreeFeature<NoFeatureConfig> SMALLCONIFEROUSTREE = new SmallFirTree(NoFeatureConfig::deserialize, false);
    public static final AbstractTreeFeature<NoFeatureConfig> WIDECONIFEROUSTREE = new WideFirTree(NoFeatureConfig::deserialize, false);


    public static final FlowersFeature ALLIUMFLOWERS = new AlliumFieldFlowers(NoFeatureConfig::deserialize);
    public static final FlowersFeature AMARANTHFLOWERS = new AmaranthFieldFlowers(NoFeatureConfig::deserialize);
    public static final FlowersFeature PRAIRIEGRASS = new PrairieGrass(NoFeatureConfig::deserialize);

    public static final Structure<NoFeatureConfig> REDDESERTPYRAMID = new RedDesertPyramidStructure(NoFeatureConfig::deserialize);

    public static final Feature<NoFeatureConfig> DEADSEA_SPIRE = new DeadSeaSpires(null);
}

