package sporeaoc.byg.biomes.bygbiomes;

import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.feature.structure.PillagerOutpostConfig;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class Alps extends Biome {
        static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.SNOW_BLOCK.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState(), Blocks.SNOW_BLOCK.getDefaultState()));
        static final RainType PRECIPATATION = RainType.SNOW;
        static final Category CATEGORY = Category.ICY;
        static final double DEPTH = 6.0F;
        static final double SCALE = 0.00F;
        static final float TEMPERATURE = -0.5F;
        static final float DOWNFALL = 0.9F;
        static final int WATER_COLOR = 4159204;
        static final int WATER_FOG_COLOR = 329011;
        static final String PARENT = null;

        public Alps() {
            super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
            this.addStructure(Feature.VILLAGE, new VillageConfig("village/snowy/town_centers", 60));
            this.addStructure(Feature.IGLOO, IFeatureConfig.NO_FEATURE_CONFIG);
            this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.008D, MineshaftStructure.Type.NORMAL));
            this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
            this.addStructure(Feature.PILLAGER_OUTPOST, new PillagerOutpostConfig(0.004D));
            DefaultBiomeFeatures.addCarvers(this);
            //BYGBiomeFeatures.addDeciduousTrees(this);
            //BYGBiomeFeatures.addBaobabTrees(this);

            this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.STRAY, 160, 10, 10));


        }
    @Override
    public Biome getRiver() {
        return this;
    }
    }
