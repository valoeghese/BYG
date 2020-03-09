package sporeaoc.byg.registries;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import sporeaoc.byg.BYG;
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
        //registerBiome(registry, BiomeCatalog.ANCIENTFOREST, "ancientforest", ConfigWeightManager.ancientForest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE);
        //registerBiome(registry, BiomeCatalog.ASPENFOREST, "aspenforest", ConfigWeightManager.aspenForest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BiomeCatalog.BAOBABSAVANNA, "baobabsavanna", ConfigWeightManager.baobabsavanna.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.DRY);
        //registerBiome(registry, BiomeCatalog.BAYOU, "bayou", ConfigWeightManager.bayou.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WET);
        registerBiome(registry, BiomeCatalog.BLUETAIGA, "bluetaiga", ConfigWeightManager.bluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.BLUEGIANTTAIGA, "giantbluesprucetaiga", ConfigWeightManager.giantbluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        //registerBiome(registry, BiomeCatalog.BLUFFMOUNTAINS, "bluffmountains", ConfigWeightManager.bluffmountains.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.COLD);
        //registerBiome(registry, BiomeCatalog.BOG, "bog", ConfigWeightManager.bog.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.SWAMP);
        registerBiome(registry, BiomeCatalog.BOREALFOREST, "borealforest", ConfigWeightManager.borealforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BiomeCatalog.CANYONS, "canyons", ConfigWeightManager.canyons.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.HOT, BiomeDictionary.Type.MOUNTAIN);
        //registerBiome(registry, BiomeCatalog.CHAPPARALCOASTALS, "chapparalcoastals", ConfigWeightManager.chapparalcoastals.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.PLAINS);
        //registerBiome(registry, BiomeCatalog.CHERRYBLOSSOMFOREST, "cherryblossomforest", ConfigWeightManager.cherryblossomforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BiomeCatalog.COASTALREDWOODTROPICS, "coastalredwoodtropics", ConfigWeightManager.coastalredwoodtropics.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.DENSE);
        registerBiome(registry, BiomeCatalog.CONIFEROUSFOREST, "coniferousforest", ConfigWeightManager.coniferousforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.DOVERMOUNTAINS, "dovermountains", ConfigWeightManager.dovermountains.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        //registerBiome(registry, BiomeCatalog.DEADSEA, "deadsea", ConfigWeightManager.seasonaltaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.DECIDUOUSFOREST, "deciduousforest", ConfigWeightManager.deciduousforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        registerBiome(registry, BiomeCatalog.DUNES, "dunes", ConfigWeightManager.dunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        //registerBiome(registry, BiomeCatalog.EBONYWOODS, "ebonywoods", ConfigWeightManager.ebonywoods.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.DENSE);
        //registerBiome(registry, BiomeCatalog.ENCHANTEDFOREST, "enchantedforest", ConfigWeightManager.enchantedforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.RARE, BiomeDictionary.Type.MAGICAL);
        //registerBiome(registry, BiomeCatalog.EVERGREENTAIGA, "evergreentaiga", ConfigWeightManager.evergreentaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        //registerBiome(registry, BiomeCatalog.FLOWERINGPLAINS, "floweringplains", ConfigWeightManager.floweringplains.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.LUSH);
        //registerBiome(registry, BiomeCatalog.GLOWSHROOMBAYOU, "glowshroombayou", ConfigWeightManager.glowshroombayou.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WET,BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE);
        registerBiome(registry, BiomeCatalog.GRASSLANDPLATEAU, "grasslandplateau", ConfigWeightManager.grasslandplateau.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS);
        //registerBiome(registry, BiomeCatalog.GREATLAKES, "greatlakes", ConfigWeightManager.greatlakes.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WATER, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.GUIANASHIELD, "guianashield", ConfigWeightManager.guianashield.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.FOREST);
        registerBiome(registry, BiomeCatalog.JACARANDAFOREST, "jacarandaforest", ConfigWeightManager.jacarandaforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BiomeCatalog.MANGROVEMARSHES, "mangrovemarshes", ConfigWeightManager.mangrovemarshes.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WET, BiomeDictionary.Type.DENSE);
        //registerBiome(registry, BiomeCatalog.MAPLETAIGA, "mapletaiga", ConfigWeightManager.mapletaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        //registerBiome(registry, BiomeCatalog.MARSHLANDS, "marshlands", ConfigWeightManager.marshlands.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.WET, BiomeDictionary.Type.WATER);
        //registerBiome(registry, BiomeCatalog.MEADOW, "meadow", ConfigWeightManager.meadow.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.LUSH);
        //registerBiome(registry, BiomeCatalog.ORCHARD, "orchard", ConfigWeightManager.orchard.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BiomeCatalog.PINELOWANDS, "pinelowlands", ConfigWeightManager.pinelowlands.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        //registerBiome(registry, BiomeCatalog.PINEMOUNTAINS, "pinemountains", ConfigWeightManager.pinemountains.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.MOUNTAIN);
        registerBiome(registry, BiomeCatalog.PRAIRIE, "prairie", ConfigWeightManager.prairie.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY);
        //registerBiome(registry, BiomeCatalog.QUAGMIRE, "quagmire", ConfigWeightManager.quagmire.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.WASTELAND);
        registerBiome(registry, BiomeCatalog.REDDESERT, "reddesert", ConfigWeightManager.reddesert.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, BiomeCatalog.REDDESERTDUNES, "reddesertdunes", ConfigWeightManager.reddesertdunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, BiomeCatalog.REDOAKFOREST, "redoakforest", ConfigWeightManager.redoakforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BiomeCatalog.SAVANNACANOPY, "savannacanopy", ConfigWeightManager.savannacanopy.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DENSE);
        registerBiome(registry, BiomeCatalog.SEASONALBIRCHFOREST, "seasonalbirchforest", ConfigWeightManager.seasonalbirchforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        registerBiome(registry, BiomeCatalog.SEASONALDECIDUOUSFOREST, "seasonaldeciduousforest", ConfigWeightManager.seasonaldeciduousforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST);
        registerBiome(registry, BiomeCatalog.SEASONALFOREST, "seasonalforest", ConfigWeightManager.seasonalforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        registerBiome(registry, BiomeCatalog.SEASONALGIANTTAIGA, "giantseasonalsprucetaiga", ConfigWeightManager.seasonalgianttaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.SEASONALTAIGA, "seasonaltaiga", ConfigWeightManager.seasonaltaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.SHRUBLANDS, "shrublands", ConfigWeightManager.shrublands.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY, BiomeDictionary.Type.SPARSE);
        //registerBiome(registry, BiomeCatalog.SKYRISHIGHLANDS, "skyrishighlands", ConfigWeightManager.skyristhighlands.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.COLD, BiomeDictionary.Type.MOUNTAIN);
        registerBiome(registry, BiomeCatalog.SNOWYBLUETAIGA, "snowybluetaiga", ConfigWeightManager.snowybluetaiga.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.SNOWYBLUEGIANTTAIGA, "snowygiantbluetaiga", ConfigWeightManager.snowygiantbluetaiga.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, BiomeCatalog.SNOWYCONIFEROUSFOREST, "snowyconiferousforest", ConfigWeightManager.snowyconiferousforest.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS);
        //registerBiome(registry, BiomeCatalog.SNOWYEVERGREENTAIGA, "snowyevergreentaiga", ConfigWeightManager.snowyevergreentaiga.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS);
        //registerBiome(registry, BiomeCatalog.SNOWYPINEMOUNTAINS, "snowypinemountains", ConfigWeightManager.snowypinemountains.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.MOUNTAIN);
        //registerBiome(registry, BiomeCatalog.SONORANDESERT, "sonorandesert", ConfigWeightManager.sonorandesert.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        //registerBiome(registry, BiomeCatalog.STONEBRUSHLANDS, "stonebrushlands", ConfigWeightManager.stonebrushlands.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.COLD);
        registerBiome(registry, BiomeCatalog.TROPICALFUNGALRAINFOREST, "tropicalfungalforest", ConfigWeightManager.tropicalfungalforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.MAGICAL);
        //registerBiome(registry, BiomeCatalog.TROPICALISLANDS, "tropicalislands", ConfigWeightManager.tropicalislands.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WET, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.WATER, BiomeDictionary.Type.OCEAN);
        registerBiome(registry, BiomeCatalog.TROPICALRAINFOREST, "tropicalrainforest", ConfigWeightManager.tropicalrainforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DENSE);
        //registerBiome(registry, BiomeCatalog.WEEPINGWITCHFOREST, "weepingwitchforest", ConfigWeightManager.weepingwitchforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE);
        //registerBiome(registry, BiomeCatalog.WOODLANDS, "woodlands", ConfigWeightManager.woodlands.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.MAGICAL);
        //registerBiome(registry, BiomeCatalog.ZELKOVAFOREST, "zelkovaforest", ConfigWeightManager.zelkovaforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.COLD, BiomeDictionary.Type.FOREST);

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
