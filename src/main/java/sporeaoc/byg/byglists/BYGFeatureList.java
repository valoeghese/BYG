package sporeaoc.byg.byglists;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.feature.tree.birch.BrownBirchTree;
import sporeaoc.byg.world.feature.tree.birch.OrangeBirchTree;
import sporeaoc.byg.world.feature.tree.birch.RedBirchTree;
import sporeaoc.byg.world.feature.tree.birch.YellowBirchTree;
import sporeaoc.byg.world.feature.tree.borealforest.BorealForestTree1;
import sporeaoc.byg.world.feature.tree.borealforest.BorealForestTree2;
import sporeaoc.byg.world.feature.tree.coniferousforest.SmallFirTree;
import sporeaoc.byg.world.feature.tree.coniferousforest.WideFirTree;
import sporeaoc.byg.world.feature.tree.cypressswamplands.HugeCypressTree;
import sporeaoc.byg.world.feature.tree.deciduousforest.*;
import sporeaoc.byg.world.feature.tree.jacaranda.JacarandaTree;
import sporeaoc.byg.world.feature.tree.util.BYGAbstractTreeFeature;
import sporeaoc.byg.world.feature.tree.oak.BrownOakTree;
import sporeaoc.byg.world.feature.tree.oak.OrangeOakTree;
import sporeaoc.byg.world.feature.tree.oak.RedOakTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantBlueSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantOrangeSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantRedSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.giantspruce.GiantYellowSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.smallspruce.SmallBlueTaigaTree;
import sporeaoc.byg.world.feature.tree.taiga.smallspruce.SmallOrangeSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.smallspruce.SmallRedSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.smallspruce.SmallYellowTaigaTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.BlueSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.OrangeSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.RedSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.spruce.YellowSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.tallspruce.TallBlueSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.tallspruce.TallOrangeSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.tallspruce.TallRedSpruceTree;
import sporeaoc.byg.world.feature.tree.taiga.tallspruce.TallYellowSpruceTree;
import sporeaoc.byg.world.feature.tree.tropicalrainforest.ShortTropicalRainForestTree;
import sporeaoc.byg.world.feature.tree.tropicalrainforest.TropicalRainForestTree;

public class BYGFeatureList {
    //Seasonal Oaks
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BROWNOAK_TREE = new BrownOakTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> ORANGEOAK_TREE = new OrangeOakTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> REDOAK_TREE = new RedOakTree(NoFeatureConfig::deserialize, false, 0);

    //Seasonal Birch
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BROWNBIRCH_TREE = new BrownBirchTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> ORANGEBIRCH_TREE = new OrangeBirchTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> REDBIRCH_TREE = new RedBirchTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> YELLOWBIRCH_TREE = new YellowBirchTree(NoFeatureConfig::deserialize, false, 0);

    //Jacaranda
    public static final BYGAbstractTreeFeature<NoFeatureConfig> JACARANDA_TREE = new JacarandaTree(NoFeatureConfig::deserialize, false, 0);

    //Cypress
    public static final BYGAbstractTreeFeature<NoFeatureConfig> HUGECYPRESS_TREE = new HugeCypressTree(NoFeatureConfig::deserialize, false, 0);

    //Seasonal Deciduous and Deciduous
    public static final BYGAbstractTreeFeature<NoFeatureConfig> DECIDUOUS_TREE = new DeciduousTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BROWNDECIDUOUS_TREE = new BrownDeciduousTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> ORANGEDECIDUOUS_TREE = new OrangeDeciduousTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> YELLOWDECIDUOUS_TREE = new YellowDeciduousTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> REDDECIDUOUS_TREE = new RedDeciduousTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SEASONALSHRUBS = new ColorfulDeciduousShrubs(NoFeatureConfig::deserialize, false, 0);


    //Seasonal TaigaTrees
    public static final Feature<NoFeatureConfig> BLUEGIANTTAIGA_TREE = new GiantBlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final Feature<NoFeatureConfig> TALL_BLUE_SPRUCE = new TallBlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final Feature<NoFeatureConfig> BLUE_SPRUCE = new BlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final Feature<NoFeatureConfig> SMALL_BLUE_SPRUCE = new SmallBlueTaigaTree(NoFeatureConfig::deserialize, false, 0);

    public static final BYGAbstractTreeFeature<NoFeatureConfig> GIANT_ORANGE_SPRUCE = new GiantOrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALL_ORANGE_SPRUCE = new TallOrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> ORANGE_SPRUCE = new OrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALL_ORANGE_SPRUCE = new SmallOrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);

    public static final BYGAbstractTreeFeature<NoFeatureConfig> GIANT_RED_SPRUCE = new GiantRedSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALL_RED_SPRUCE = new TallRedSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> RED_SPRUCE = new RedSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALL_RED_SPRUCE = new SmallRedSpruceTree(NoFeatureConfig::deserialize, false, 0);

    public static final BYGAbstractTreeFeature<NoFeatureConfig> GIANT_YELLOW_SPRUCE = new GiantYellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALL_YELLOW_SPRUCE = new TallYellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> YELLOW_SPRUCE = new YellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALL_YELLOW_SPRUCE = new SmallYellowTaigaTree(NoFeatureConfig::deserialize, false, 0);

    //Boreal Trees
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BOREALFOREST_TREE = new BorealForestTree1(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BOREALFOREST_TREE2 = new BorealForestTree2(NoFeatureConfig::deserialize, false, 0);

    //Tropical Trees
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TROPICALRAINFORESTTREE = new TropicalRainForestTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SHORTTROPICALRAINFORESTTREE = new ShortTropicalRainForestTree(NoFeatureConfig::deserialize, false, 0);

    //Shrub
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SHRUB = new BYGShrub(NoFeatureConfig::deserialize, false, 0);

    //Coniferous Trees
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALLCONIFEROUSTREE = new SmallFirTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> WIDECONIFEROUSTREE = new WideFirTree(NoFeatureConfig::deserialize, false, 0);

    //Flower & Grass Features
//    public static final FlowersFeature ALLIUMFLOWERS = new AlliumFieldFlowers(NoFeatureConfig::deserialize);
//    public static final FlowersFeature AMARANTHFLOWERS = new AmaranthFieldFlowers(NoFeatureConfig::deserialize);
//    public static final FlowersFeature PRAIRIEGRASS = new PrairieGrass(NoFeatureConfig::deserialize);
//
//    public static final Structure<NoFeatureConfig> REDDESERTPYRAMID = new RedDesertPyramidStructure(NoFeatureConfig::deserialize);
//
//    public static final Feature<NoFeatureConfig> DEADSEA_SPIRE = new DeadSeaSpires(null);
}

