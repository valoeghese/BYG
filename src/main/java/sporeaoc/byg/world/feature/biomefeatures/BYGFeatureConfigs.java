package sporeaoc.byg.world.feature.biomefeatures;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.DoublePlantBlockPlacer;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.HugeTreeFeatureConfig;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import sporeaoc.byg.byglists.BYGBlockList;

public class BYGFeatureConfigs {
    public static final BlockClusterFeatureConfig PINKALLIUMBUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.PINK_ALLIUM_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig ALLIUMBUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ALLIUM_FLOWER_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig AMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig PURPLEAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.PURPLE_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig ORANGEAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ORANGE_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig MAGENTAAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.MAGENTA_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig CYANAMARANTH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.CYAN_AMARANTH.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();


    public static final BlockClusterFeatureConfig ROSE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.ROSE.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig PRAIRIEGRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.PRAIRIE_GRASS.getDefaultState()), new SimpleBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig TALLPRAIRIEGRASS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.TALL_PRAIRIE_GRASS.getDefaultState()), new DoublePlantBlockPlacer())).tries(32).build();
    public static final BlockClusterFeatureConfig QUAGMIREDEADBUSH_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.DEAD_BUSH.getDefaultState()), new SimpleBlockPlacer())).tries(100).func_227316_a_(ImmutableSet.of(BYGBlockList.MUD_BRICKS.getBlock(), BYGBlockList.MUD_BLOCK.getBlock())).func_227314_a_().func_227317_b_().build();



    public static final BaseTreeFeatureConfig TROPGROUNDBUSH_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LEAVES.getDefaultState()))).baseHeight(4).setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();
    public static final HugeTreeFeatureConfig MEGATROPJUNGLETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LEAVES.getDefaultState()))).baseHeight(10).func_227283_b_(20).func_227282_a_(ImmutableList.of(new TrunkVineTreeDecorator(), new LeaveVineTreeDecorator())).setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();

}
