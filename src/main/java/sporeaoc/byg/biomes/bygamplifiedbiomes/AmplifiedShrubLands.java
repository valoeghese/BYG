package sporeaoc.byg.biomes.bygamplifiedbiomes;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class AmplifiedShrubLands extends Biome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG);
    static final RainType PRECIPATATION = RainType.RAIN;
    static final Category CATEGORY = Category.DESERT;
    static final double DEPTH = 0.1125F;
    static final double SCALE = 0.05F;
    static final float TEMPERATURE = 2.0F;
    static final float DOWNFALL = 0.4F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public AmplifiedShrubLands() {
        super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));
//        this.addStructure(Feature.VILLAGE, new VillageConfig("village/plains/town_centers", 6));
//        this.addStructure(Feature.PILLAGER_OUTPOST, new PillagerOutpostConfig(0.004D));
//        this.addStructure(Feature.MINESHAFT, new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL));
//        this.addStructure(Feature.STRONGHOLD, IFeatureConfig.NO_FEATURE_CONFIG);
//        BYGTreeFeatures.addShrubs(this);
//        DefaultBiomeFeatures.addCarvers(this);
//        DefaultBiomeFeatures.addStructures(this);
//        DefaultBiomeFeatures.addMonsterRooms(this);
//        DefaultBiomeFeatures.addStoneVariants(this);
//        DefaultBiomeFeatures.addOres(this);
//        DefaultBiomeFeatures.addSedimentDisks(this);
//        DefaultBiomeFeatures.addGrass(this);
//        DefaultBiomeFeatures.addMushrooms(this);
//        BYGTreeFeatures.addReeds(this);
//        DefaultBiomeFeatures.addFreezeTopLayer(this);
//        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
//        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.PIG, 10, 4, 4));
//        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
//        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.COW, 8, 4, 4));
//        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.HORSE, 5, 2, 6));
//        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.DONKEY, 1, 1, 3));
//        this.addSpawn(EntityClassification.AMBIENT, new SpawnListEntry(EntityType.BAT, 10, 8, 8));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SPIDER, 100, 4, 4));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SKELETON, 100, 4, 4));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.SLIME, 100, 4, 4));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
//        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.WITCH, 5, 1, 1));

    }

    @Override
    public Biome getRiver() {
        return this;
    }

    @OnlyIn(Dist.CLIENT)
    public int getGrassColor(BlockPos pos) {

        return 9874031;
    }

    @OnlyIn(Dist.CLIENT)
    public int getFoliageColor(BlockPos pos) {
        return 7048739;
    }

}