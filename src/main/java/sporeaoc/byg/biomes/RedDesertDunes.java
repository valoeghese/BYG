package sporeaoc.byg.biomes;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.feature.structure.PillagerOutpostConfig;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import sporeaoc.byg.catalogs.FeatureCatalog;

public class RedDesertDunes extends Biome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState()));
        static final RainType PRECIPATATION = RainType.NONE;
        static final Category CATEGORY = Category.DESERT;
        static final double DEPTH = 1.3F;
        static final double SCALE = 0.5F;
        static final float TEMPERATURE = 2.00F;
        static final float DOWNFALL = 0.0F;
        static final int WATER_COLOR = 4159204;
        static final int WATER_FOG_COLOR = 329011;
        static final String PARENT = null;

        public RedDesertDunes() {
            super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
            this.addStructure(Feature.PILLAGER_OUTPOST, new PillagerOutpostConfig(0.004D));
            this.addStructure(FeatureCatalog.REDDESERTPYRAMID, IFeatureConfig.NO_FEATURE_CONFIG);
            this.addStructure(FeatureCatalog.REDDESERTPYRAMID, IFeatureConfig.NO_FEATURE_CONFIG);
            this.addStructure(FeatureCatalog.REDDESERTPYRAMID, IFeatureConfig.NO_FEATURE_CONFIG);
            this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
            this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);

            this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.HUSK, 160, 10, 10));
        }
    }
