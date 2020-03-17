//package sporeaoc.byg.world.worldtype.islandtype;
//
//import net.minecraft.world.biome.Biome;
//import net.minecraft.world.biome.Biomes;
//import net.minecraft.world.gen.INoiseRandom;
//import net.minecraftforge.registries.ForgeRegistries;
//import net.minecraftforge.registries.ForgeRegistry;
//import sporeaoc.byg.catalogs.BYGBiomeList;
//
//public class BYGBiomeGetter {
//    public static ForgeRegistry<Biome> BiomeRegistry = ((ForgeRegistry<Biome>) ForgeRegistries.BIOMES);
//    //SHORE
//    public static final int SHORE = BiomeRegistry.getID(Biomes.BEACH);
//    public static final int SNOWYSHORE = BiomeRegistry.getID(Biomes.SNOWY_BEACH);
//
//    //Rivers
//    public static final int RIVER = BiomeRegistry.getID(Biomes.RIVER);
//    public static final int FROZEN = BiomeRegistry.getID(Biomes.FROZEN_RIVER);
//
//    //Oceans
//    public static final int OCEAN = BiomeRegistry.getID(Biomes.OCEAN);
//    public static final int DEEPOCEAN = BiomeRegistry.getID(Biomes.DEEP_OCEAN);
//    //Warm/Hot Oceans
//    public static final int WARMOCEAN = BiomeRegistry.getID(Biomes.WARM_OCEAN);
//    public static final int DEEPWARMOCEAN = BiomeRegistry.getID(Biomes.DEEP_LUKEWARM_OCEAN);
//    //Cold Oceans
//    public static final int COLDOCEAN = BiomeRegistry.getID(Biomes.COLD_OCEAN);
//    public static final int DEEPCOLDOCEAN = BiomeRegistry.getID(Biomes.DEEP_COLD_OCEAN);
//    //Icy Oceans
//    public static final int DEEPFROZENOCEAN = BiomeRegistry.getID(Biomes.DEEP_FROZEN_OCEAN);
//
//    //Plains Biomes
//    public static final int PLAINS = BiomeRegistry.getID(Biomes.PLAINS);
//    public static final int ALLIUMFIELDS = BiomeRegistry.getID(BYGBiomeList.ALLIUMFIELDS);
//    public static final int AMARANTHFIELDS = BiomeRegistry.getID(BYGBiomeList.AMARANTHFIELDS);
//    //Warm Plains
//    public static final int PRAIRIE = BiomeRegistry.getID(BYGBiomeList.PRAIRIE);
//    //Hot Plains
//    public static final int SHRUBLANDS = BiomeRegistry.getID(BYGBiomeList.SHRUBLANDS);
//    //Jungles(Warm)
//
//    //Taiga Biomes
//    public static final int BLUEGIANTTAIGA = BiomeRegistry.getID(BYGBiomeList.BLUEGIANTTAIGA);
//    public static final int BLUETAIGA = BiomeRegistry.getID(BYGBiomeList.BLUETAIGA);
//    public static final int SEASONALTAIGA = BiomeRegistry.getID(BYGBiomeList.SEASONALTAIGA);
//    public static final int SEASONALGIANTTAIGA = BiomeRegistry.getID(BYGBiomeList.SEASONALGIANTTAIGA);
//    //Snowy Taigas
//    public static final int SNOWYBLUEGIANTTAIGA = BiomeRegistry.getID(BYGBiomeList.SNOWYBLUEGIANTTAIGA);
//    public static final int SNOWYBLUETAIGA = BiomeRegistry.getID(BYGBiomeList.SNOWYBLUETAIGA);
//    public static final int ICESPIKES = BiomeRegistry.getID(Biomes.ICE_SPIKES);
//
//    //Deserts(Hot)
//    public static final int DUNES = BiomeRegistry.getID(BYGBiomeList.DUNES);
//    public static final int REDDESERTDUNES = BiomeRegistry.getID(BYGBiomeList.REDDESERTDUNES);
//    public static final int REDDESERT = BiomeRegistry.getID(BYGBiomeList.REDDESERT);
//
//    //Forests
//    public static final int BOREALFOREST = BiomeRegistry.getID(BYGBiomeList.BOREALFOREST);
//    public static final int DECIDUOUSFOREST = BiomeRegistry.getID(BYGBiomeList.DECIDUOUSFOREST);
//    public static final int SEASONALDECIDUOUSFOREST = BiomeRegistry.getID(BYGBiomeList.SEASONALDECIDUOUSFOREST);
//    public static final int SEASONALBIRCHFOREST = BiomeRegistry.getID(BYGBiomeList.SEASONALBIRCHFOREST);
//    public static final int JACARANDAFOREST = BiomeRegistry.getID(BYGBiomeList.JACARANDAFOREST);
//    public static final int REDOAKFOREST = BiomeRegistry.getID(BYGBiomeList.REDOAKFOREST);
//    public static final int SEASONALFOREST = BiomeRegistry.getID(BYGBiomeList.SEASONALFOREST);
//
//    //Mountains
//    public static final int ALPS = BiomeRegistry.getID(BYGBiomeList.ALPS);
//
//    //Plateaus
//    public static final int GPLATEAU = BiomeRegistry.getID(BYGBiomeList.GRASSLANDPLATEAU);
//
//
//    public static int[] RandomArray = {
//            ALLIUMFIELDS,
//            AMARANTHFIELDS,
//            ALPS,
//            PRAIRIE,
//            SHRUBLANDS,
//            BLUEGIANTTAIGA,
//            BLUETAIGA,
//            SEASONALTAIGA,
//            SEASONALGIANTTAIGA,
//            SNOWYBLUEGIANTTAIGA,
//            SNOWYBLUETAIGA,
//            REDDESERT,
//            REDDESERTDUNES,
//            REDOAKFOREST,
//            BOREALFOREST,
//            DECIDUOUSFOREST,
//            SEASONALBIRCHFOREST,
//            SEASONALDECIDUOUSFOREST,
//            JACARANDAFOREST,
//            SEASONALFOREST
//    };
//    public static int[] getRandomArray;
//    static {
//        getRandomArray = new int[RandomArray.length];
//        for (int index = 0; index < RandomArray.length; ++index) {
//            getRandomArray[index] = RandomArray[index];
//        }
//    }
//    public static int getRandonBYGBiomes(INoiseRandom rand) {
//        return getRandomArray[rand.random(RandomArray.length)];
//    }
//
//
//
//
//    public static int[] ForestArray = {
//            BOREALFOREST,
//            SEASONALDECIDUOUSFOREST,
//            SEASONALBIRCHFOREST,
//            SEASONALFOREST
//    };
//    public static int[] getForestArray;
//    static {
//        getForestArray = new int[ForestArray.length];
//        for (int index = 0; index < ForestArray.length; ++index) {
//            getForestArray[index] = ForestArray[index];
//        }
//    }
//    public static int getCoolForestBiomes(INoiseRandom rand) {
//        return getForestArray[rand.random(ForestArray.length)];
//    }
//
//
//
//
//
//
//
//
//    public static int[] WarmForestArray = {
//            JACARANDAFOREST,
//            REDOAKFOREST,
//            DECIDUOUSFOREST
//    };
//    public static int[] getWarmForestArray;
//    static {
//        getWarmForestArray = new int[WarmForestArray.length];
//        for (int index = 0; index < WarmForestArray.length; ++index) {
//            getWarmForestArray[index] = WarmForestArray[index];
//        }
//    }
//    public static int getWarmForestBiomes(INoiseRandom rand) {
//        return getForestArray[rand.random(ForestArray.length)];
//    }
//
//
//
//
//
//
//
//    public static int[] TaigaArray = {
//            BLUEGIANTTAIGA,
//            SEASONALGIANTTAIGA,
//            SEASONALTAIGA,
//            BLUETAIGA
//    };
//    public static int[] getTaigaArray;
//    static {
//        getTaigaArray = new int[TaigaArray.length];
//        for (int index = 0; index < TaigaArray.length; ++index) {
//            getTaigaArray[index] = TaigaArray[index];
//        }
//    }
//
//    public static int getTaigaArray(INoiseRandom rand) {
//        return getTaigaArray[rand.random(TaigaArray.length)];
//    }
//
//
//    public static int[] PlainsArray = {
//            AMARANTHFIELDS,
//            ALLIUMFIELDS,
//            PLAINS
//    };
//    public static int[] getPlainsArray;
//    static {
//        getPlainsArray = new int[PlainsArray.length];
//        for (int index = 0; index < PlainsArray.length; ++index) {
//            PlainsArray[index] = PlainsArray[index];
//        }
//    }
//
//    public static int getPlainBiomes(INoiseRandom rand) {
//        return getPlainsArray[rand.random(ForestArray.length)];
//    }
//
//
//
//
//
//
//    public static int[] WarmOceanArray = {
//            OCEAN,
//            DEEPOCEAN
//    };
//    public static int[] getWarmOceanArray;
//    static {
//        getWarmOceanArray = new int[WarmOceanArray.length];
//        for (int index = 0; index < WarmOceanArray.length; ++index) {
//            getWarmOceanArray[index] = WarmOceanArray[index];
//        }
//    }
//    public static int getWarmoceanBiomes(INoiseRandom rand) {
//        return getWarmOceanArray[rand.random(ForestArray.length)];
//    }
//    public static boolean isDeepOcean(int biomeId) {
//        return biomeId == DEEPOCEAN;
//    }
//    public static boolean isOcean(int biomeId) {
//        return biomeId == OCEAN;
//    }
//    public static boolean isLand(int biomeId) {
//        return biomeId == PLAINS ||biomeId == ALLIUMFIELDS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS ||biomeId == PLAINS;
//    }
//}
//
//
//
