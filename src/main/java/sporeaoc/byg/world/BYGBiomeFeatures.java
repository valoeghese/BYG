package sporeaoc.byg.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import sporeaoc.byg.catalogs.FeatureCatalog;

public class BYGBiomeFeatures extends DefaultBiomeFeatures {
    public static void addDeciduousTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.DECIDUOUS_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig(40, 0.1F, -30)));

    }
    public static void addSeasonalDeciduousTrees(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{FeatureCatalog.SDECIDUOUS_TREE1, FeatureCatalog.SDECIDUOUS_TREE2, FeatureCatalog.SDECIDUOUS_TREE4}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG, IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.2F, 0.1F}, FeatureCatalog.SDECIDUOUS_TREE3, IFeatureConfig.NO_FEATURE_CONFIG), Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig(10, 0.1F, 1)));
    }

    public static void addTreeTemplate(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.TREE_TEMPLATE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig(3, 0.5F, 1)));

    }

    public static void addTightTrees(Biome biome) {
        biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.TIGHT_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig(100, 0.5F, 45)));
    }

    public static void bygAddCanyons(Biome biomeIn) {
        biomeIn.addCarver(GenerationStage.Carving.AIR, Biome.createCarver(WorldCarver.CANYON, new ProbabilityConfig(0.02F)));
    }
    /*public static void addprairiegrass(Biome biomeIn) {
        biomeIn.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.GRASS, new GrassFeatureConfig(Blocks.GRASS.getDefaultState()), Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(1000)));
    }*/
}
