package sporeaoc.byg.world.feature;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import sporeaoc.byg.byglists.BYGBlockList;

public class BYGFeatureConfigs {
    public static final BlockClusterFeatureConfig ALLIUM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ALLIUM_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig AMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ALLIUM_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();

}
