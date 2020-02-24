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
import sporeaoc.byg.world.tree.*;
import sporeaoc.byg.world.tree.borealforest.BorealForestTree1;
import sporeaoc.byg.world.tree.borealforest.BorealForestTree2;
import sporeaoc.byg.world.tree.cypressswamplands.HugeCypressTree;
import sporeaoc.byg.world.tree.deciduousforest.*;
import sporeaoc.byg.world.tree.oakandbirch.*;
import sporeaoc.byg.world.tree.taiga.*;
import sporeaoc.byg.world.tree.tropicalrainforest.TropicalRainForestTree;
import sporeaoc.byg.world.tree.tropicalrainforest.ShortTropicalRainForestTree;

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
    public static final AbstractTreeFeature<NoFeatureConfig> BROWNOAK_TREE = new BrownOakTree();
    public static final AbstractTreeFeature<NoFeatureConfig> ORANGEOAK_TREE = new OrangeOakTree();
    public static final AbstractTreeFeature<NoFeatureConfig> REDOAK_TREE = new RedOakTree();
    public static final AbstractTreeFeature<NoFeatureConfig> BROWNBIRCH_TREE = new BrownBirch();
    public static final AbstractTreeFeature<NoFeatureConfig> ORANGEBIRCH_TREE = new OrangeBirch();
    public static final AbstractTreeFeature<NoFeatureConfig> REDBIRCH_TREE = new RedBirch();
    public static final AbstractTreeFeature<NoFeatureConfig> YELLOWBIRCH_TREE = new YellowBirch();
    public static final AbstractTreeFeature<NoFeatureConfig> JACARANDA_TREE = new JacarandaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> HUGECYPRESS_TREE = new HugeCypressTree();
    public static final AbstractTreeFeature<NoFeatureConfig> SEASONALTAIGA_TREE = new SeasonalTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> SEASONALSMALLTAIGA_TREE = new SeasonalSmallTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> SEASONALTALLTAIGA_TREE = new SeasonalTallTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> BlUETAIGA_TREE = new BlueTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> BLUESMALLTAIGA_TREE = new BlueSmallTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> BLUETALLTAIGA_TREE = new BlueTallTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> SEASONALGIANTTAIGA_TREE = new SeasonalGiantTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> BLUEGIANTTAIGA_TREE = new BlueGiantTaigaTree();
    public static final AbstractTreeFeature<NoFeatureConfig> BOREALFOREST_TREE = new BorealForestTree1();
    public static final AbstractTreeFeature<NoFeatureConfig> BOREALFOREST_TREE2 = new BorealForestTree2();
    public static final AbstractTreeFeature<NoFeatureConfig> TROPICALRAINFORESTTREE = new TropicalRainForestTree();
    public static final AbstractTreeFeature<NoFeatureConfig> SHORTTROPICALRAINFORESTTREE = new ShortTropicalRainForestTree();
    public static final AbstractTreeFeature<NoFeatureConfig> TREENAME = new TreeName();
    public static final AbstractTreeFeature<NoFeatureConfig> SHRUB = new DeciduousShrub();

    public static final FlowersFeature ALLIUMFLOWERS = new AlliumFieldFlowers(NoFeatureConfig::deserialize);
    public static final FlowersFeature AMARANTHFLOWERS = new AmaranthFieldFlowers(NoFeatureConfig::deserialize);
    public static final FlowersFeature PRAIRIEGRASS = new PrairieGrass(NoFeatureConfig::deserialize);

    public static final Structure<NoFeatureConfig> REDDESERTPYRAMID = new RedDesertPyramidStructure(NoFeatureConfig::deserialize);

    public static final Feature<NoFeatureConfig> DEADSEA_SPIRE = new DeadSeaSpires(null);
}

