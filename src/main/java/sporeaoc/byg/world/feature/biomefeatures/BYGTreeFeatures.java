package sporeaoc.byg.world.feature.biomefeatures;

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


public class BYGTreeFeatures {

    public static void addBlueTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.SMALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.3F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUEPINETREE_CONFIG).func_227227_a_(0.3F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUESPRUCETREE_CONFIG).func_227227_a_(0.3F),
            BYGFeatureList.TALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F)),
            BYGFeatureList.BLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(55, 0.5F, -20))));
    }

    public static void addBorealTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BOREAL_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BOREAL_TREE2.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }
    public static void addConiferousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SMALLCONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.WIDECONIFEROUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
    }

    public static void addCypressTreeVegetation(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.HUGECYPRESS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.DECIDUOUS_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addGiantBlueTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.BLUEGIANTSPUCE_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(35, 0.3F, -10))));
        
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.SMALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.3F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUEPINETREE_CONFIG).func_227227_a_(0.3F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.BLUESPRUCETREE_CONFIG).func_227227_a_(0.3F),
            BYGFeatureList.TALLBLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F)),
            BYGFeatureList.BLUESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(55, 0.5F, -20))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).func_227227_a_(0.025641026F),
            Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_PINE_TREE_CONFIG).func_227227_a_(0.30769232F),
            Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).func_227227_a_(0.33333334F)),
            Feature.NORMAL_TREE.withConfiguration(SPRUCE_TREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(10, 0.3F, -5))));
    }

    public static void addGiantSeasonalTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.GIANTORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.ORANGEMEGAPINETREE_CONFIG).func_227227_a_(0.666F),
            Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.ORANGEMEGASPRUCETREE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.GIANTYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F),
            Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.YELLOWMEGAPINETREE_CONFIG).func_227227_a_(0.666F),
            Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.YELLOWMEGASPRUCETREE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.GIANTREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.REDMEGAPINETREE_CONFIG).func_227227_a_(0.666F)),
            Feature.MEGA_SPRUCE_TREE.withConfiguration(BYGFeatureConfigs.REDMEGASPRUCETREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(30, 0.3F, -20))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.SMALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.REDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.TALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1f),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDPINETREE_CONFIG).func_227227_a_(0.3F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.REDSPRUCETREE_CONFIG).func_227227_a_(0.3F),
            BYGFeatureList.SMALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F),
            BYGFeatureList.ORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F),
            BYGFeatureList.TALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGEPINETREE_CONFIG).func_227227_a_(0.3F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.ORANGESPRUCETREE_CONFIG).func_227227_a_(0.3F),
            BYGFeatureList.SMALLYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F),
            BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.YELLOWPINETREE_CONFIG).func_227227_a_(0.3F)),
            Feature.NORMAL_TREE.withConfiguration(BYGFeatureConfigs.YELLOWSPRUCETREE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
    }

    public static void addJacarandaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.JACARANDA_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addRedOakForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            Feature.NORMAL_TREE.withConfiguration(DefaultBiomeFeatures.field_230129_h_).func_227227_a_(0.2F),
            Feature.FANCY_TREE.withConfiguration(DefaultBiomeFeatures.field_230131_m_).func_227227_a_(0.1F)),
            BYGFeatureList.REDOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(10, 0.1F, 1))));
    }

    public static void addSeasonalBirchForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.BROWNDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.ORANGEBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F),
            BYGFeatureList.REDBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F)),
            BYGFeatureList.YELLOWBIRCH_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
    }

    public static void addSeasonalDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SEASONAL_SHRUBS.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(15, 0.1F, 1))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.REDDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.25F),
            BYGFeatureList.ORANGEDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.25F),
            BYGFeatureList.DECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.25F),
            BYGFeatureList.BROWNDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.25F)),
            BYGFeatureList.YELLOWDECIDUOUS_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(35, 0.3F, 10))));
    }

    public static void addSeasonalForestTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.YELLOWBIRCH_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.BROWNOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.REDOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F)),
            BYGFeatureList.ORANGEOAK_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
    }

    public static void addSeasonalTaigaTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.SMALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.ORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F)),
            BYGFeatureList.TALLORANGESPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.SMALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.REDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F)),
            BYGFeatureList.TALLREDSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(3, 0.1F, 1))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.SMALLYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.666F),
            BYGFeatureList.YELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.1F)),
            BYGFeatureList.TALLYELLOWSPRUCE_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(3, 0.1F, 1))));
    }

    public static void addShrubs(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.SHRUB.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(5, 0.1F, 1))));
    }

    public static void addTropJungleTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_JUNGLE_TREE.withConfiguration(BYGFeatureConfigs.MEGATROPJUNGLETREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(3, 0.5F, 2))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
            BYGFeatureList.TROPICALRAINFOREST_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).func_227227_a_(0.5F),
            Feature.JUNGLE_GROUND_BUSH.withConfiguration(BYGFeatureConfigs.TROPGROUNDBUSH_CONFIG).func_227227_a_(0.4F)),
            BYGFeatureList.SHORTTROPICALRAINFOREST_TREE.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG))).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(
            new AtSurfaceWithExtraConfig(65, 0.1F, 10))));

        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.VINES.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_HEIGHT_64.configure(new FrequencyConfig(50))));

    }

    public static void addDoverMTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.MEGA_SPRUCE_TREE.withConfiguration(MEGA_SPRUCE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(15, 0.3F, -20))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(PINE_TREE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(2, 0.2F, -20))));

    }
}
