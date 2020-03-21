package sporeaoc.byg.world.feature.biomefeatures;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import sporeaoc.byg.byglists.BYGFeatureList;

public class BYGFeatures {
    public static void addAlliumFieldFlowers(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.ALLIUMBUSH_CONFIG).func_227227_a_(0.6F)),
                Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.PINKALLIUMBUSH_CONFIG))).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(
                new FrequencyConfig(200))));
    }

    public static void addAmaranthFieldFlowers(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(
                Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.AMARANTH_CONFIG).func_227227_a_(0.3F),
                Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.CYANAMARANTH_CONFIG).func_227227_a_(0.3F),
                Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.MAGENTAAMARANTH_CONFIG).func_227227_a_(0.3F),
                Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.ORANGEAMARANTH_CONFIG).func_227227_a_(0.3F)),
                Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.PURPLEAMARANTH_CONFIG))).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(
                new FrequencyConfig(300))));
    }

    public static void addPrairieGrass(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.TALLPRAIRIEGRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(25))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.PRAIRIEGRASS_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(200))));
    }

    public static void addBlueberries(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.BLUEBERRY_BUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
    }
    public static void addQuagmireFeatures(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.QUAGMIREDEADBUSH_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(100))));
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, BYGFeatureList.DEAD_TREE.withConfiguration(DecoratedFeatureConfig.NO_FEATURE_CONFIG).withPlacement(Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(1, 0.4F, -1))));

    }

}
