package sporeaoc.byg.catalogs;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.tree.FirTree;
import sporeaoc.byg.world.tree.MyFirstTree;
import sporeaoc.byg.world.tree.RealCypressTree;

public class FeatureCatalog {
    public static final AbstractTreeFeature<NoFeatureConfig> CYPRESS_TREE = new RealCypressTree();
    public static final AbstractTreeFeature<NoFeatureConfig> MYT = new MyFirstTree();
    public static final AbstractTreeFeature<NoFeatureConfig> FIR_TREE = new FirTree();

}

