package sporeaoc.byg.registries;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import sporeaoc.byg.BYG;
import sporeaoc.byg.byglists.BYGBiomeList;
import sporeaoc.byg.config.biomeweight.ConfigWeightManager;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBiomeRegistry {


    @SubscribeEvent
    public static void registerBYGBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registerBiome(registry, BYGBiomeList.ALLIUMFIELDS, "alliumfields", ConfigWeightManager.allliumfields.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.RARE, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.ALPS, "alps", ConfigWeightManager.alps.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.AMARANTHFIELDS, "amaranthfields", ConfigWeightManager.amaranthfields.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.RARE, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.ANCIENTFOREST, "ancientforest", ConfigWeightManager.ancientForest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE);
        //registerBiome(registry, BYGBiomeList.ASPENFOREST, "aspenforest", ConfigWeightManager.aspenForest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BYGBiomeList.BAOBABSAVANNA, "baobabsavanna", ConfigWeightManager.baobabsavanna.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.DRY);
        //registerBiome(registry, BYGBiomeList.BAYOU, "bayou", ConfigWeightManager.bayou.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WET);
        registerBiome(registry, BYGBiomeList.BLUETAIGA, "bluetaiga", ConfigWeightManager.bluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.BLUEGIANTTAIGA, "giantbluesprucetaiga", ConfigWeightManager.giantbluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.BLUFFMOUNTAINS, "bluffmountains", ConfigWeightManager.bluffmountains.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.COLD, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.BOG, "bog", ConfigWeightManager.bog.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.BOREALFOREST, "borealforest", ConfigWeightManager.borealforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.CANYONS, "canyons", ConfigWeightManager.canyons.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.HOT, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.CHAPPARALCOASTALS, "chapparalcoastals", ConfigWeightManager.chapparalcoastals.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.BEACH, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.CHERRYBLOSSOMFOREST, "cherryblossomforest", ConfigWeightManager.cherryblossomforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.COASTALREDWOODTROPICS, "coastalredwoodtropics", ConfigWeightManager.coastalredwoodtropics.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.CONIFEROUSFOREST, "coniferousforest", ConfigWeightManager.coniferousforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.DOVERMOUNTAINS, "dovermountains", ConfigWeightManager.dovermountains.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.DEADSEA, "deadsea", ConfigWeightManager.seasonaltaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.DECIDUOUSFOREST, "deciduousforest", ConfigWeightManager.deciduousforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.DUNES, "dunes", ConfigWeightManager.dunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.EBONYWOODS, "ebonywoods", ConfigWeightManager.ebonywoods.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.DENSE);
        //registerBiome(registry, BYGBiomeList.ENCHANTEDFOREST, "enchantedforest", ConfigWeightManager.enchantedforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.RARE, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.EVERGREENTAIGA, "evergreentaiga", ConfigWeightManager.evergreentaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.FLOWERINGPLAINS, "floweringplains", ConfigWeightManager.floweringplains.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.GLOWSHROOMBAYOU, "glowshroombayou", ConfigWeightManager.glowshroombayou.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WET,BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.GRASSLANDPLATEAU, "grasslandplateau", ConfigWeightManager.grasslandplateau.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.GREATLAKES, "greatlakes", ConfigWeightManager.greatlakes.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WATER, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.GUIANASHIELD, "guianashield", ConfigWeightManager.guianashield.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.JACARANDAFOREST, "jacarandaforest", ConfigWeightManager.jacarandaforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        //registerBiome(registry, BYGBiomeList.MANGROVEMARSHES, "mangrovemarshes", ConfigWeightManager.mangrovemarshes.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.WET, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.MAPLETAIGA, "mapletaiga", ConfigWeightManager.mapletaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.MARSHLANDS, "marshlands", ConfigWeightManager.marshlands.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.WET, BiomeDictionary.Type.WATER, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.MEADOW, "meadow", ConfigWeightManager.meadow.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.ORCHARD, "orchard", ConfigWeightManager.orchard.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.LUSH, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.PINELOWANDS, "pinelowlands", ConfigWeightManager.pinelowlands.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.PINEMOUNTAINS, "pinemountains", ConfigWeightManager.pinemountains.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.PRAIRIE, "prairie", ConfigWeightManager.prairie.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.QUAGMIRE, "quagmire", ConfigWeightManager.quagmire.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.SWAMP, BiomeDictionary.Type.WASTELAND);
        registerBiome(registry, BYGBiomeList.REDDESERT, "reddesert", ConfigWeightManager.reddesert.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.REDDESERTDUNES, "reddesertdunes", ConfigWeightManager.reddesertdunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.REDOAKFOREST, "redoakforest", ConfigWeightManager.redoakforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.SAVANNACANOPY, "savannacanopy", ConfigWeightManager.savannacanopy.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.SAVANNA, BiomeDictionary.Type.DRY, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SEASONALBIRCHFOREST, "seasonalbirchforest", ConfigWeightManager.seasonalbirchforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SEASONALDECIDUOUSFOREST, "seasonaldeciduousforest", ConfigWeightManager.seasonaldeciduousforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SEASONALFOREST, "seasonalforest", ConfigWeightManager.seasonalforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        registerBiome(registry, BYGBiomeList.SEASONALGIANTTAIGA, "giantseasonalsprucetaiga", ConfigWeightManager.seasonalgianttaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SEASONALTAIGA, "seasonaltaiga", ConfigWeightManager.seasonaltaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SHRUBLANDS, "shrublands", ConfigWeightManager.shrublands.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.SKYRISHIGHLANDS, "skyrishighlands", ConfigWeightManager.skyristhighlands.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.COLD, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SNOWYBLUETAIGA, "snowybluetaiga", ConfigWeightManager.snowybluetaiga.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SNOWYBLUEGIANTTAIGA, "snowygiantbluetaiga", ConfigWeightManager.snowygiantbluetaiga.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.SNOWYCONIFEROUSFOREST, "snowyconiferousforest", ConfigWeightManager.snowyconiferousforest.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.SNOWYEVERGREENTAIGA, "snowyevergreentaiga", ConfigWeightManager.snowyevergreentaiga.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.SNOWYPINEMOUNTAINS, "snowypinemountains", ConfigWeightManager.snowypinemountains.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.SONORANDESERT, "sonorandesert", ConfigWeightManager.sonorandesert.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        //registerBiome(registry, BYGBiomeList.STONEBRUSHLANDS, "stonebrushlands", ConfigWeightManager.stonebrushlands.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.HILLS, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.COLD);
        registerBiome(registry, BYGBiomeList.TROPICALFUNGALRAINFOREST, "tropicalfungalforest", ConfigWeightManager.tropicalfungalforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.TROPICALISLANDS, "tropicalislands", ConfigWeightManager.tropicalislands.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WET, BiomeDictionary.Type.SPARSE, BiomeDictionary.Type.WATER, BiomeDictionary.Type.OCEAN, BiomeDictionary.Type.OVERWORLD);
        registerBiome(registry, BYGBiomeList.TROPICALRAINFOREST, "tropicalrainforest", ConfigWeightManager.tropicalrainforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.OVERWORLD, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.WEEPINGWITCHFOREST, "weepingwitchforest", ConfigWeightManager.weepingwitchforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.MAGICAL, BiomeDictionary.Type.RARE, BiomeDictionary.Type.OVERWORLD);
        //registerBiome(registry, BYGBiomeList.WOODLANDS, "woodlands", ConfigWeightManager.woodlands.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.DENSE, BiomeDictionary.Type.MAGICAL);
        //registerBiome(registry, BYGBiomeList.ZELKOVAFOREST, "zelkovaforest", ConfigWeightManager.zelkovaforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.CONIFEROUS, BiomeDictionary.Type.COLD, BiomeDictionary.Type.FOREST);

        BYG.LOGGER.info("All BYG biomes registered!");
    }


    @SubscribeEvent
    public static void registerAmplifiedBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();

        BYG.LOGGER.info("All BYG Amplified biomes registered!");
    }


    @SubscribeEvent
    public static void registersubBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();

        BYG.LOGGER.info("All BYG subbiomes registered!");
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
