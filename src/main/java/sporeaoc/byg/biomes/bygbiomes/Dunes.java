package sporeaoc.byg.biomes.bygbiomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class Dunes extends Biome {
        static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, SurfaceBuilder.SAND_CONFIG);
        static final RainType PRECIPATATION = RainType.NONE;
        static final Category CATEGORY = Category.DESERT;
        static final double DEPTH = 1.3F;
        static final double SCALE = 0.5F;
        static final float TEMPERATURE = 2.00F;
        static final float DOWNFALL = 0.0F;
        static final int WATER_COLOR = 4159204;
        static final int WATER_FOG_COLOR = 329011;
        static final String PARENT = null;

        public Dunes() {
            super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
                this.addStructure(Feature.VILLAGE.withConfiguration(new VillageConfig("village/desert/town_centers", 6)));
                this.addStructure(Feature.PILLAGER_OUTPOST.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                this.addStructure(Feature.DESERT_PYRAMID.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));
                this.addStructure(Feature.MINESHAFT.withConfiguration(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));
                this.addStructure(Feature.STRONGHOLD.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG));

        }
    }
