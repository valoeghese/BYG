package sporeaoc.byg.catalogs;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.tree.TightTrees;
import sporeaoc.byg.world.tree.TreeTemplate;
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





    //public static final Feature<NoFeatureConfig> DEADSEA_SPIRE = new DeadSeaSpires(null);
    //public static final Feature<NoFeatureConfig> DEADSEA_SPIRE2 = new DeadSeaSpires2(null);
    /*
     * TODO: Implement methods
     */

    // public static final AbstractTreeFeature<NoFeatureConfig> MYT = new MyFirstTree();
    // public static final AbstractTreeFeature<NoFeatureConfig> FIR_TREE = new FirTree();

}

