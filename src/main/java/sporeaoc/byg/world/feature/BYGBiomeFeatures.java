package sporeaoc.byg.world.feature;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import sporeaoc.byg.byglists.BYGFeatureList;

import static net.minecraft.world.biome.DefaultBiomeFeatures.*;


public class BYGBiomeFeatures  {
    public static void addAlliumFieldFlowers(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(BYGFeatureConfigs.ALLIUM_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(200))));

    }

   public static void addAmaranthFieldFlowers(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(BYGFeatureConfigs.AMARANTH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(300))));
    }
//
//    public static void addReeds(Biome biome) {
//        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.REED, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(10)));
//    }
//
//    public static void addPeatDisks(Biome biome) {
//        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.DISK, new SphereReplaceConfig(BlockCatalogs.PEAT_GRASSBLOCK.getDefaultState(), 25, 5, Lists.newArrayList(Blocks.DIRT.getDefaultState(), Blocks.GRASS_BLOCK.getDefaultState())), Placement.COUNT_TOP_SOLID, new FrequencyConfig(100)));
//    }

    public static void addBlueTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_BLUE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_BLUE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).func_227227_a_(0.025641026F), Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_PINE_TREE_CONFIG).func_227227_a_(0.30769232F), Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).func_227227_a_(0.33333334F)), Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
    }

    public static void addBorealTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BOREALFOREST_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BOREALFOREST_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    }

    public static void addCypressTreeVegetation(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.HUGECYPRESS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.DECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    }

    public static void addGiantBlueTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUEGIANTTAIGA_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_BLUE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_BLUE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).func_227227_a_(0.025641026F), Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_PINE_TREE_CONFIG).func_227227_a_(0.30769232F), Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).func_227227_a_(0.33333334F)), Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
    }

    //
    public static void addGiantSeasonalTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.GIANT_ORANGE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ORANGE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_ORANGE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_ORANGE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.GIANT_YELLOW_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.YELLOW_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_YELLOW_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_YELLOW_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.GIANT_RED_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.RED_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_RED_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_RED_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).func_227227_a_(0.025641026F), Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_PINE_TREE_CONFIG).func_227227_a_(0.30769232F), Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).func_227227_a_(0.33333334F)), Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
     }
//
        public static void addJacarandaTrees(Biome biome){
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.JACARANDA_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        }
//
////    public static void addPrairieGrass(Biome biome) {
////        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(BYGFeatureList.PRAIRIEGRASS, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_32, new FrequencyConfig(200)));
////    }
//
    public static void addSeasonalBirchForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BROWNBIRCH_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ORANGEBIRCH_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.REDBIRCH_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.YELLOWBIRCH_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }
//
    public static void addSeasonalDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.REDDECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ORANGEDECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BROWNDECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.YELLOWDECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SEASONALSHRUBS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addSeasonalForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BROWNOAK_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.REDOAK_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ORANGEOAK_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.YELLOWBIRCH_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

    }

    public static void addSeasonalTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_ORANGE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_RED_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALL_YELLOW_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.ORANGE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.RED_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.YELLOW_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_ORANGE_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_RED_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TALL_YELLOW_SPRUCE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addShrubs(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addRedOakForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230129_h_).func_227227_a_(0.2F), Feature.FANCY_TREE.withConfiguration(DefaultBiomeFeatures.field_230131_m_).func_227227_a_(0.1F)), BYGFeatureList.REDOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
    }

    public static void addTropJungleTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.TROPICALRAINFORESTTREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHORTTROPICALRAINFORESTTREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }
}
