package sporeaoc.byg.catalogs;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.tree.TightTrees;
import sporeaoc.byg.world.tree.TreeTemplate;
import sporeaoc.byg.world.tree.basictrees.*;
import sporeaoc.byg.world.tree.cypresstrees.HugeCypressTree;
import sporeaoc.byg.world.tree.deciduousforest.*;

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








    //public static final Feature<NoFeatureConfig> DEADSEA_SPIRE = new DeadSeaSpires(null);
    //public static final Feature<NoFeatureConfig> DEADSEA_SPIRE2 = new DeadSeaSpires2(null);
    /*
     * TODO: Implement methods
     */

    // public static final AbstractTreeFeature<NoFeatureConfig> MYT = new MyFirstTree();
    // public static final AbstractTreeFeature<NoFeatureConfig> FIR_TREE = new FirTree();

}

