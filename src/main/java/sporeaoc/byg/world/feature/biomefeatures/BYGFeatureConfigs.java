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
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.PineFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;
import sporeaoc.byg.byglists.BYGBlockList;

public class BYGFeatureConfigs {
    //Plants
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


    //TropJungle
    public static final BaseTreeFeatureConfig TROPGROUNDBUSH_CONFIG = (new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LEAVES.getDefaultState()))).baseHeight(4).setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();
    public static final HugeTreeFeatureConfig MEGATROPJUNGLETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.MAHOGANY_LEAVES.getDefaultState()))).baseHeight(10).func_227283_b_(20).func_227282_a_(ImmutableList.of(new TrunkVineTreeDecorator(), new LeaveVineTreeDecorator())).setSapling((net.minecraftforge.common.IPlantable)Blocks.JUNGLE_SAPLING).build();


    //Taiga
    public static final TreeFeatureConfig BLUEPINETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.BLUE_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(1, 0))).baseHeight(7).heightRandA(4).trunkTopOffset(1).foliageHeight(3).foliageHeightRandom(1).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig BLUESPRUCETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.BLUE_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(2, 1))).baseHeight(6).heightRandA(3).trunkHeight(1).trunkHeightRandom(1).trunkTopOffsetRandom(2).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig REDPINETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.RED_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(1, 0))).baseHeight(7).heightRandA(4).trunkTopOffset(1).foliageHeight(3).foliageHeightRandom(1).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig REDSPRUCETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.RED_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(2, 1))).baseHeight(6).heightRandA(3).trunkHeight(1).trunkHeightRandom(1).trunkTopOffsetRandom(2).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig YELLOWPINETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.YELLOW_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(1, 0))).baseHeight(7).heightRandA(4).trunkTopOffset(1).foliageHeight(3).foliageHeightRandom(1).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig YELLOWSPRUCETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.YELLOW_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(2, 1))).baseHeight(6).heightRandA(3).trunkHeight(1).trunkHeightRandom(1).trunkTopOffsetRandom(2).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig ORANGEPINETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.ORANGE_SPRUCE_LEAVES.getDefaultState()), new PineFoliagePlacer(1, 0))).baseHeight(7).heightRandA(4).trunkTopOffset(1).foliageHeight(3).foliageHeightRandom(1).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final TreeFeatureConfig ORANGESPRUCETREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.ORANGE_SPRUCE_LEAVES.getDefaultState()), new SpruceFoliagePlacer(2, 1))).baseHeight(6).heightRandA(3).trunkHeight(1).trunkHeightRandom(1).trunkTopOffsetRandom(2).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig BLUEMEGASPRUCETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.BLUE_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(13).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig BLUEMEGAPINETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.BLUE_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(3).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig REDMEGASPRUCETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.RED_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(13).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig REDMEGAPINETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.RED_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(3).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig YELLOWMEGASPRUCETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.YELLOW_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(13).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig YELLOWMEGAPINETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.YELLOW_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(3).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig ORANGEMEGASPRUCETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.ORANGE_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(13).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();
    public static final HugeTreeFeatureConfig ORANGEMEGAPINETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.ORANGE_SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(3).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(Blocks.PODZOL.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();

    //Jacaranda
    public static final TreeFeatureConfig JACARANDATREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.JACARANDA_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.JACARANDA_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig TALLJACARANDATREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(BYGBlockList.JACARANDA_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.JACARANDA_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(9).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();

    //SeasonalBirch
    public static final TreeFeatureConfig REDBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.RED_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig TALLREDBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.RED_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(6).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig BROWNBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.BROWN_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig TALLBROWNBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.BROWN_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(6).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig ORANGEBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.ORANGE_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig TALLORANGEBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.ORANGE_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(6).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig YELLOWBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.YELLOW_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();
    public static final TreeFeatureConfig TALLYELLOWBIRCHTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.BIRCH_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.YELLOW_BIRCH_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).heightRandA(2).heightRandB(6).foliageHeight(3).ignoreVines().decorators(ImmutableList.of(new BeehiveTreeDecorator(0.002F))).setSapling((net.minecraftforge.common.IPlantable)Blocks.BIRCH_SAPLING).build();

    //Seasonal Oak
    public static final TreeFeatureConfig BROWNOAKTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.BROWN_OAK_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig ORANGEOAKTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.ORANGE_OAK_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();
    public static final TreeFeatureConfig REDOAKTREE_CONFIG = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(BYGBlockList.RED_OAK_LEAVES.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(4).heightRandA(2).foliageHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable)Blocks.OAK_SAPLING).build();

    //Dover
    public static final HugeTreeFeatureConfig DOVERMEGASPRUCETREE_CONFIG = (new HugeTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.SPRUCE_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.SPRUCE_LEAVES.getDefaultState()))).baseHeight(13).func_227283_b_(15).func_227284_c_(13).func_227282_a_(ImmutableList.of(new AlterGroundTreeDecorator(new SimpleBlockStateProvider(BYGBlockList.PODZOL_DACITE.getDefaultState())))).setSapling((net.minecraftforge.common.IPlantable)Blocks.SPRUCE_SAPLING).build();

}
