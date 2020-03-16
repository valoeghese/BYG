package sporeaoc.byg.biomes.bygbiomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class DeadSea extends Biome {
        static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG);
        static final RainType PRECIPATATION = RainType.NONE;
        static final Category CATEGORY = Category.OCEAN;
        static final double DEPTH = -0.3F;
        static final double SCALE = 0.2F;
        static final float TEMPERATURE = 2.0F;
        static final float DOWNFALL = 0.0F;
        static final int WATER_COLOR = 4159204;
        static final int WATER_FOG_COLOR = 329011;
        static final String PARENT = null;

        public DeadSea() {
            super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
            //this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, createDecoratedFeature(FeatureCatalog.TREENAME2, IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP, new FrequencyConfig(3)));
                    }
    @Override
    public Biome getRiver() {
        return Biomes.RIVER;
    }
}