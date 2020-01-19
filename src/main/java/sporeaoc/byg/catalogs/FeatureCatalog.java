package sporeaoc.byg.catalogs;

import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.world.tree.CypressTree;
import sporeaoc.byg.world.tree.CypressTree2;

public class FeatureCatalog {
    public static final AbstractTreeFeature<NoFeatureConfig> CYPRESS_TREE = new CypressTree2();
    //public static final AbstractTreeFeature<NoFeatureConfig> BAOBAB_TREE = new BaobabTree();

}

