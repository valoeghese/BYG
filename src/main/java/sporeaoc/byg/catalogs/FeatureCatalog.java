package sporeaoc.byg.catalogs;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.features.DeadSeaSpires;
import sporeaoc.byg.world.features.DeadSeaSpires2;
import sporeaoc.byg.world.tree.BaobabTreeFeature;
import sporeaoc.byg.world.tree.TightTrees;

public class FeatureCatalog {
    public static final AbstractTreeFeature<NoFeatureConfig> CYPRESS_TREE = new TightTrees();
    public static final AbstractTreeFeature<NoFeatureConfig> BAOBAB_TREE = new BaobabTreeFeature(null, true, false);
    public static final Feature<NoFeatureConfig> DEADSEA_SPIRE = new DeadSeaSpires(null);
    public static final Feature<NoFeatureConfig> DEADSEA_SPIRE2 = new DeadSeaSpires2(null);
    /*
     * TODO: Implement methods
     */

    // public static final AbstractTreeFeature<NoFeatureConfig> MYT = new MyFirstTree();
    // public static final AbstractTreeFeature<NoFeatureConfig> FIR_TREE = new FirTree();

}

