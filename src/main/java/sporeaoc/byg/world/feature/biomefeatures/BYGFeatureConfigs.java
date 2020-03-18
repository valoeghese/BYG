package sporeaoc.byg.world.feature.biomefeatures;

import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import sporeaoc.byg.byglists.BYGBlockList;

public class BYGFeatureConfigs {
    public static final BlockClusterFeatureConfig ALLIUMBUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ALLIUM_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig AMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig PURPLEAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.PURPLE_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig ORANGEAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ORANGE_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig MAGENTAAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.MAGENTA_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig CYANAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.CYAN_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();



    public static final BlockClusterFeatureConfig ROSE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ROSE.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig PRAIRIEGRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.PRAIRIE_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig QUAGMIREDEADBUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(100).func_227316_a_(ImmutableSet.of(BYGBlockList.MUD_BRICKS.getBlock(), BYGBlockList.MUD_BLOCK.getBlock())).func_227314_a_().func_227317_b_().build();

}
