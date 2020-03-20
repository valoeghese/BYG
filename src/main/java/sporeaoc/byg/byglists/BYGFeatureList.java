package sporeaoc.byg.byglists;

import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.feature.tree.birch.BrownBirchTree;
import sporeaoc.byg.world.feature.tree.birch.OrangeBirchTree;
import sporeaoc.byg.world.feature.tree.birch.RedBirchTree;
import sporeaoc.byg.world.feature.tree.birch.YellowBirchTree;
import sporeaoc.byg.world.feature.tree.borealforest.BorealForestTree1;
import sporeaoc.byg.world.feature.tree.borealforest.BorealForestTree2;
import sporeaoc.byg.world.feature.tree.coniferousforest.SmallFirTree;
import sporeaoc.byg.world.feature.tree.coniferousforest.TallFirTree;
import sporeaoc.byg.world.feature.tree.coniferousforest.WideFirTree;
import sporeaoc.byg.world.feature.tree.cypressswamplands.HugeCypressTree;
import sporeaoc.byg.world.feature.tree.deciduousforest.*;
import sporeaoc.byg.world.feature.tree.jacaranda.JacarandaTree;
import sporeaoc.byg.world.feature.tree.oak.BrownOakTree;
import sporeaoc.byg.world.feature.tree.oak.OrangeOakTree;
import sporeaoc.byg.world.feature.tree.oak.RedOakTree;
import sporeaoc.byg.world.feature.tree.quagmire.DeadTree;
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
import sporeaoc.byg.world.feature.tree.tropicalrainforest.BYGTropShrub;
import sporeaoc.byg.world.feature.tree.tropicalrainforest.ShortTropicalRainForestTree;
import sporeaoc.byg.world.feature.tree.tropicalrainforest.TropicalRainForestTree;
import sporeaoc.byg.world.feature.tree.util.BYGAbstractTreeFeature;

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
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SEASONAL_SHRUBS = new ColorfulDeciduousShrubs(NoFeatureConfig::deserialize, false, 0);


    //Seasonal TaigaTrees
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BLUEGIANTSPUCE_TREE = new GiantBlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALLBLUESPRUCE_TREE = new TallBlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BLUESPRUCE_TREE = new BlueSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALLBLUESPRUCE_TREE = new SmallBlueTaigaTree(NoFeatureConfig::deserialize, false, 0);

    public static final BYGAbstractTreeFeature<NoFeatureConfig> GIANTORANGESPRUCE_TREE = new GiantOrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALLORANGESPRUCE_TREE = new TallOrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> ORANGESPRUCE_TREE = new OrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALLORANGESPRUCE_TREE = new SmallOrangeSpruceTree(NoFeatureConfig::deserialize, false, 0);

    public static final BYGAbstractTreeFeature<NoFeatureConfig> GIANTREDSPRUCE_TREE = new GiantRedSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALLREDSPRUCE_TREE = new TallRedSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> REDSPRUCE_TREE = new RedSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALLREDSPRUCE_TREE = new SmallRedSpruceTree(NoFeatureConfig::deserialize, false, 0);

    public static final BYGAbstractTreeFeature<NoFeatureConfig> GIANTYELLOWSPRUCE_TREE = new GiantYellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALLYELLOWSPRUCE_TREE = new TallYellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> YELLOWSPRUCE_TREE = new YellowSpruceTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALLYELLOWSPRUCE_TREE = new SmallYellowTaigaTree(NoFeatureConfig::deserialize, false, 0);

    //Boreal Trees
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BOREAL_TREE = new BorealForestTree1(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> BOREAL_TREE2 = new BorealForestTree2(NoFeatureConfig::deserialize, false, 0);

    //Tropical Trees
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TROPICALRAINFOREST_TREE = new TropicalRainForestTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SHORTTROPICALRAINFOREST_TREE = new ShortTropicalRainForestTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TROPJUNGLE_SHRUB = new BYGTropShrub(NoFeatureConfig::deserialize, false, 0);

    //Shrub
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SHRUB = new BYGShrub(NoFeatureConfig::deserialize, false, 0);

    //Coniferous Trees
    public static final BYGAbstractTreeFeature<NoFeatureConfig> SMALLCONIFEROUS_TREE = new SmallFirTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> TALLCONIFEROUS_TREE = new TallFirTree(NoFeatureConfig::deserialize, false, 0);
    public static final BYGAbstractTreeFeature<NoFeatureConfig> WIDECONIFEROUS_TREE = new WideFirTree(NoFeatureConfig::deserialize, false, 0);

    public static final BYGAbstractTreeFeature<NoFeatureConfig> DEAD_TREE = new DeadTree(NoFeatureConfig::deserialize, false, 0);
}

