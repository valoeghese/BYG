package sporeaoc.byg.registries;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import sporeaoc.byg.BYG;
import sporeaoc.byg.biomes.*;
import sporeaoc.byg.config.ConfigWeightManager;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBiomeRegistry {


    @SubscribeEvent
    public static void registerBiomes(RegistryEvent.Register<Biome> event) {
        IForgeRegistry<Biome> registry = event.getRegistry();
        registerBiome(registry, new AmaranthFields(), "amaranthfields", ConfigWeightManager.amaranthfields.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.RARE, BiomeDictionary.Type.LUSH);
        registerBiome(registry, new AlliumFields(), "alliumfields", ConfigWeightManager.allliumfields.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.RARE, BiomeDictionary.Type.LUSH);
        registerBiome(registry, new Alps(), "alps", ConfigWeightManager.alps.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SNOWY);
        registerBiome(registry, new BlueTaiga(), "bluetaiga", ConfigWeightManager.bluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, new BlueGiantTaiga(), "giantbluesprucetaiga", ConfigWeightManager.giantbluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, new DeciduousForest(), "deciduousforest", ConfigWeightManager.deciduousforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.FOREST);
        registerBiome(registry, new Dunes(), "dunes", ConfigWeightManager.dunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, new GrassLandPlateau(), "grasslandplateau", ConfigWeightManager.grasslandplateau.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS);
        registerBiome(registry, new JacarandaForest(), "jacarandaforest", ConfigWeightManager.jacarandaforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WET, BiomeDictionary.Type.DENSE);
        registerBiome(registry, new Prairie(), "prairie", ConfigWeightManager.prairie.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.PLAINS, BiomeDictionary.Type.DRY);
        registerBiome(registry, new RedDesert(), "reddesert", ConfigWeightManager.reddesert.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, new RedDesertDunes(), "reddesertdunes", ConfigWeightManager.reddesertdunes.getWeight(), true, BiomeManager.BiomeType.DESERT, BiomeDictionary.Type.DRY, BiomeDictionary.Type.HOT, BiomeDictionary.Type.SANDY);
        registerBiome(registry, new RedOakForest(), "redoakforest", ConfigWeightManager.redoakforest.getWeight(), true, BiomeManager.BiomeType.WARM, BiomeDictionary.Type.JUNGLE, BiomeDictionary.Type.HOT, BiomeDictionary.Type.WET, BiomeDictionary.Type.DENSE);
        registerBiome(registry, new SeasonalDeciduousForest(), "seasonaldeciduousforest", ConfigWeightManager.seasonaldeciduousforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST);
        registerBiome(registry, new SeasonalForest(), "seasonalforest", ConfigWeightManager.seasonalforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        registerBiome(registry, new SeasonalBirchForest(), "seasonalbirchforest", ConfigWeightManager.seasonalbirchforest.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD);
        registerBiome(registry, new ShrubLands(), "shrublands", ConfigWeightManager.shrublands.getWeight(), true, BiomeManager.BiomeType.ICY, BiomeDictionary.Type.MOUNTAIN, BiomeDictionary.Type.COLD, BiomeDictionary.Type.SNOWY);
        registerBiome(registry, new SnowyBlueTaiga(), "snowybluetaiga", ConfigWeightManager.snowybluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, new SnowyBlueGiantTaiga(), "snowygiantbluetaiga", ConfigWeightManager.snowygiantbluetaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, new SeasonalGiantTaiga(), "giantseasonalsprucetaiga", ConfigWeightManager.seasonalgianttaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);
        registerBiome(registry, new SeasonalTaiga(), "seasonaltaiga", ConfigWeightManager.seasonaltaiga.getWeight(), true, BiomeManager.BiomeType.COOL, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.COLD, BiomeDictionary.Type.CONIFEROUS);


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
