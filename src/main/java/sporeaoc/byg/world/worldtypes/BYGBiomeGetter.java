package sporeaoc.byg.world.worldtypes;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import sporeaoc.byg.byglists.BYGBiomeList;
import sporeaoc.byg.config.BYGIslandSettingsConfig;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("deprecation")
public class BYGBiomeGetter {
    public static ForgeRegistry<Biome> biomeRegistry = ((ForgeRegistry<Biome>) ForgeRegistries.BIOMES);
    public static final Biome Spawn = biomeRegistry.getValue(new ResourceLocation(BYGIslandSettingsConfig.spawnBiome.get()));
    public static final int Spawn2 = biomeRegistry.getID(Spawn);

    public static Set<Biome> getBiomeSet() {
        return new HashSet<>(ForgeRegistries.BIOMES.getValues());
    }

    public static final int WARM_OCEAN = Registry.BIOME.getId(Biomes.WARM_OCEAN);
    public static final int LUKEWARM_OCEAN = Registry.BIOME.getId(Biomes.LUKEWARM_OCEAN);
    public static final int OCEAN = Registry.BIOME.getId(Biomes.OCEAN);
    public static final int COLD_OCEAN = Registry.BIOME.getId(Biomes.COLD_OCEAN);
    public static final int FROZEN_OCEAN = Registry.BIOME.getId(Biomes.FROZEN_OCEAN);
    public static final int DEEP_WARM_OCEAN = Registry.BIOME.getId(Biomes.DEEP_WARM_OCEAN);
    public static final int DEEP_LUKEWARM_OCEAN = Registry.BIOME.getId(Biomes.DEEP_LUKEWARM_OCEAN);
    public static final int DEEP_OCEAN = Registry.BIOME.getId(Biomes.DEEP_OCEAN);
    public static final int DEEP_COLD_OCEAN = Registry.BIOME.getId(Biomes.DEEP_COLD_OCEAN);
    public static final int DEEP_FROZEN_OCEAN = Registry.BIOME.getId(Biomes.DEEP_FROZEN_OCEAN);

    public static final int ALLIUMFIELDS = biomeRegistry.getID(BYGBiomeList.ALLIUMFIELDS);
    public static final int ALPS = biomeRegistry.getID(BYGBiomeList.ALPS);
    public static final int AMARANTHFIELDS = biomeRegistry.getID(BYGBiomeList.AMARANTHFIELDS);
    public static final int BLUEGIANTTAIGA = biomeRegistry.getID(BYGBiomeList.BLUEGIANTTAIGA);
    public static final int BLUETAIGA = biomeRegistry.getID(BYGBiomeList.BLUETAIGA);
    public static final int BOREALFOREST = biomeRegistry.getID(BYGBiomeList.BOREALFOREST);
    public static final int CONIFEROUSFOREST = biomeRegistry.getID(BYGBiomeList.CONIFEROUSFOREST);
    public static final int DECIDUOUSFOREST = biomeRegistry.getID(BYGBiomeList.DECIDUOUSFOREST);
    public static final int DOVERMOUNTAINS = biomeRegistry.getID(BYGBiomeList.DOVERMOUNTAINS);
    public static final int DUNES = biomeRegistry.getID(BYGBiomeList.DUNES);
    public static final int GRASSLANDPLATEAU = biomeRegistry.getID(BYGBiomeList.GRASSLANDPLATEAU);
    public static final int GUIANASHIELD = biomeRegistry.getID(BYGBiomeList.GUIANASHIELD);
    public static final int JACARANDAFOREST = biomeRegistry.getID(BYGBiomeList.JACARANDAFOREST);
    public static final int PRAIRIE = biomeRegistry.getID(BYGBiomeList.PRAIRIE);
    public static final int REDDESERT = biomeRegistry.getID(BYGBiomeList.REDDESERT);
    public static final int REDDESERTDUNES = biomeRegistry.getID(BYGBiomeList.REDDESERTDUNES);
    public static final int REDOAKFOREST = biomeRegistry.getID(BYGBiomeList.REDOAKFOREST);
    public static final int SEASONALBIRCHFOREST = biomeRegistry.getID(BYGBiomeList.SEASONALBIRCHFOREST);
    public static final int SEASONALDECIDUOUSFOREST = biomeRegistry.getID(BYGBiomeList.SEASONALDECIDUOUSFOREST);
    public static final int SEASONALFOREST = biomeRegistry.getID(BYGBiomeList.SEASONALFOREST);
    public static final int SEASONALGIANTTAIGA = biomeRegistry.getID(BYGBiomeList.SEASONALGIANTTAIGA);
    public static final int SEASONALTAIGA = biomeRegistry.getID(BYGBiomeList.SEASONALTAIGA);
    public static final int SHRUBLANDS = biomeRegistry.getID(BYGBiomeList.SHRUBLANDS);
    public static final int SNOWYBLUEGIANTTAIGA = biomeRegistry.getID(BYGBiomeList.SNOWYBLUEGIANTTAIGA);
    public static final int SNOWYBLUETAIGA = biomeRegistry.getID(BYGBiomeList.SNOWYBLUETAIGA);
    public static final int SNOWYCONIFEROUSFOREST = biomeRegistry.getID(BYGBiomeList.SNOWYCONIFEROUSFOREST);
    public static final int TROPICALFUNGALRAINFOREST = biomeRegistry.getID(BYGBiomeList.TROPICALFUNGALRAINFOREST);
    public static final int TROPICALRAINFOREST = biomeRegistry.getID(BYGBiomeList.TROPICALRAINFOREST);

    public static int[] deepOceanArray = {
            DEEP_WARM_OCEAN,
            DEEP_COLD_OCEAN,
            DEEP_LUKEWARM_OCEAN,
            DEEP_FROZEN_OCEAN,
    };

    public static int[] bygBiomeArray = {
            ALLIUMFIELDS,
            ALPS,
            AMARANTHFIELDS,
            BLUEGIANTTAIGA,
            BLUETAIGA,
            BOREALFOREST,
            CONIFEROUSFOREST,
            DECIDUOUSFOREST,
            DOVERMOUNTAINS,
            DUNES,
            GRASSLANDPLATEAU,
            GUIANASHIELD,
            JACARANDAFOREST,
            PRAIRIE,
            REDDESERT,
            REDDESERTDUNES,
            REDOAKFOREST,
            SEASONALBIRCHFOREST,
            SEASONALDECIDUOUSFOREST,
            SEASONALFOREST,
            SEASONALGIANTTAIGA,
            SEASONALTAIGA,
            SHRUBLANDS,
            SNOWYBLUEGIANTTAIGA,
            SNOWYBLUETAIGA,
            SNOWYCONIFEROUSFOREST,
            TROPICALFUNGALRAINFOREST,
            TROPICALRAINFOREST
    };

    public static int[] bygHotArray = {
            DUNES,
            PRAIRIE,
            REDDESERT,
            REDDESERTDUNES,
            SHRUBLANDS,
    };

    public static int[] bygTropicalArray = {
            GUIANASHIELD,
            TROPICALFUNGALRAINFOREST,
            TROPICALRAINFOREST
    };

    public static int[] bygSnowyArray = {
            ALPS,
            SNOWYBLUEGIANTTAIGA,
            SNOWYBLUETAIGA,
            SNOWYCONIFEROUSFOREST,
    };

    public static int[] bygNormalArray = {
            ALLIUMFIELDS,
            AMARANTHFIELDS,
            BLUEGIANTTAIGA,
            BLUETAIGA,
            BOREALFOREST,
            CONIFEROUSFOREST,
            DECIDUOUSFOREST,
            DOVERMOUNTAINS,
            GRASSLANDPLATEAU,
            REDOAKFOREST,
            SEASONALBIRCHFOREST,
            SEASONALDECIDUOUSFOREST,
            SEASONALFOREST,
            SEASONALGIANTTAIGA,
            SEASONALTAIGA,
    };
    public static int[] getDeepOceanArray;
    public static int[] getBYGBiomeArray;
    public static int[] getBYGHotArray;
    public static int[] getBYGTropArray;
    public static int[] getBYGSnowyArray;
    public static int[] getBYGNormalArray;

    static {
        getBYGBiomeArray = new int[bygBiomeArray.length];
        for (int index = 0; index < bygBiomeArray.length; ++index) {
            getBYGBiomeArray[index] = bygBiomeArray[index];
        }
    }

    static {
        getBYGHotArray = new int[bygHotArray.length];
        for (int index = 0; index < bygHotArray.length; ++index) {
            getBYGHotArray[index] = bygHotArray[index];
        }
    }

    static {
        getBYGTropArray = new int[bygTropicalArray.length];
        for (int index = 0; index < bygTropicalArray.length; ++index) {
            getBYGTropArray[index] = bygTropicalArray[index];
        }
    }

    static {
        getBYGSnowyArray = new int[bygSnowyArray.length];
        for (int index = 0; index < bygSnowyArray.length; ++index) {
            getBYGSnowyArray[index] = bygSnowyArray[index];
        }
    }

    static {
        getBYGNormalArray = new int[bygNormalArray.length];
        for (int index = 0; index < bygNormalArray.length; ++index) {
            getBYGNormalArray[index] = bygNormalArray[index];
        }
    }

    static {
        getDeepOceanArray = new int[deepOceanArray.length];
        for (int index = 0; index < deepOceanArray.length; ++index) {
            getDeepOceanArray[index] = deepOceanArray[index];
        }
    }

    public static int getBYGBiome(INoiseRandom rand) {
        return getBYGBiomeArray[rand.random(getBYGBiomeArray.length)];
    }

    public static int getHotBiome(INoiseRandom rand) {
        return getBYGHotArray[rand.random(getBYGHotArray.length)];
    }

    public static int getTropBiome(INoiseRandom rand) {
        return getBYGTropArray[rand.random(getBYGTropArray.length)];
    }

    public static int getSnowyBiome(INoiseRandom rand) {
        return getBYGSnowyArray[rand.random(getBYGSnowyArray.length)];
    }

    public static int getNormalBiome(INoiseRandom rand) {
        return getBYGNormalArray[rand.random(getBYGNormalArray.length)];
    }

    public static int getDeepOcean(INoiseRandom rand) {
        return getDeepOceanArray[rand.random(deepOceanArray.length)];
    }

}





