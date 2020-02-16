package sporeaoc.byg.registries;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import sporeaoc.byg.BYG;
import sporeaoc.byg.biomes.DeadSea;
import sporeaoc.byg.catalogs.BiomeCatalog;
import sporeaoc.byg.config.weight.ConfigWeightManager;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBiomeRegistry {


    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registerBiome(registry, BiomeCatalog.AMARANTHFIELDS, "amaranthfields", ConfigWeightManager.amaranthfields.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.RARE, BiomeDictionary.Type.LUSH);
        registerBiome(registry, BiomeCatalog.ALLIUMFIELDS, "alliumfields", ConfigWeightManager.allliumfields.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.RARE, BiomeDictionary.Type.LUSH);
        registerBiome(registry, BiomeCatalog.ALPS, "alps", ConfigWeightManager.alps.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SNOWY);
        registerBiome(registry, BiomeCatalog.BLUETAIGA, "bluetaiga", ConfigWeightManager.bluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.BLUEGIANTTAIGA, "giantbluesprucetaiga", ConfigWeightManager.giantbluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.BOREALFOREST, "borealforest", ConfigWeightManager.borealforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST);
        registerBiome(registry, BiomeCatalog.DECIDUOUSFOREST, "deciduousforest", ConfigWeightManager.deciduousforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        registerBiome(registry, BiomeCatalog.DUNES, "dunes", ConfigWeightManager.dunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, BiomeCatalog.GRASSLANDPLATEAU, "grasslandplateau", ConfigWeightManager.grasslandplateau.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS);
        registerBiome(registry, BiomeCatalog.JACARANDAFOREST, "jacarandaforest", ConfigWeightManager.jacarandaforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WET, BiomeDictionary.Type.DENSE);
        registerBiome(registry, BiomeCatalog.PRAIRIE, "prairie", ConfigWeightManager.prairie.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY);
        registerBiome(registry, BiomeCatalog.QUAGMIRE, "quagmire", ConfigWeightManager.quagmire.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY);
        registerBiome(registry, BiomeCatalog.REDDESERT, "reddesert", ConfigWeightManager.reddesert.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, BiomeCatalog.REDDESERTDUNES, "reddesertdunes", ConfigWeightManager.reddesertdunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, BiomeCatalog.REDOAKFOREST, "redoakforest", ConfigWeightManager.redoakforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WET, BiomeDictionary.Type.DENSE);
        registerBiome(registry, BiomeCatalog.SEASONALDECIDUOUSFOREST, "seasonaldeciduousforest", ConfigWeightManager.seasonaldeciduousforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST);
        registerBiome(registry, BiomeCatalog.SEASONALFOREST, "seasonalforest", ConfigWeightManager.seasonalforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        registerBiome(registry, BiomeCatalog.SEASONALBIRCHFOREST, "seasonalbirchforest", ConfigWeightManager.seasonalbirchforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        registerBiome(registry, BiomeCatalog.SHRUBLANDS, "shrublands", ConfigWeightManager.shrublands.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SNOWY);
        registerBiome(registry, BiomeCatalog.SNOWYBLUETAIGA, "snowybluetaiga", ConfigWeightManager.snowybluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.SNOWYBLUEGIANTTAIGA, "snowygiantbluetaiga", ConfigWeightManager.snowygiantbluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.SEASONALGIANTTAIGA, "giantseasonalsprucetaiga", ConfigWeightManager.seasonalgianttaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.SEASONALTAIGA, "seasonaltaiga", ConfigWeightManager.seasonaltaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, new DeadSea(), "deadman", ConfigWeightManager.seasonaltaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);


        BYG.LOGGER.info("All BYG biomes registered!");

    }

    private static void registerBiome(IForgeRegistry<Biome> registry, Biome biome, String name, int weight, boolean spawn, BiomeManager.BiomeType type, BiomeDictionary.Type... types) {
        registry.register(biome.setRegistryName(BYG.MOD_ID, name));
        if (weight > 0) {
            BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(biome, weight));
            if (spawn) {
                BiomeManager.addSpawnBiome(biome);
            }
            BiomeDictionary.addTypes(biome, types);
        }
    }
}
