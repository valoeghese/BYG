//package sporeaoc.byg.world.oregenerator;
//
//import net.minecraft.world.biome.Biome;
//import net.minecraft.world.gen.GenerationStage;
//import net.minecraft.world.gen.feature.Feature;
//import net.minecraft.world.gen.feature.OreFeatureConfig;
//import net.minecraft.world.gen.placement.CountRangeConfig;
//import net.minecraft.world.gen.placement.Placement;
//import net.minecraftforge.event.RegistryEvent;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.registries.ForgeRegistries;
//import sporeaoc.byg.BYG;
//import sporeaoc.byg.catalogs.BlockCatalogs;
//import sporeaoc.byg.config.oregen.ConfigOreStoneGenerationManager;
//
//@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//
//public class BYGOreGenerator {
//
//    @SubscribeEvent
//    public static void bygRegisterOreGenerator(final RegistryEvent.Register<Feature<?>> event) {
//        ForgeRegistries.BIOMES.forEach(biome ->
//                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.TAMRELITE_ORE.getDefaultState(), ConfigOreStoneGenerationManager.TAMRELITE_ORE.getOreSize()), Placement.COUNT_RANGE, new CountRangeConfig(ConfigOreStoneGenerationManager.TAMRELITE_ORE.getSpawnChance(), 0, 0, ConfigOreStoneGenerationManager.TAMRELITE_ORE.getmaxY())))
//        );
//        ForgeRegistries.BIOMES.forEach(biome ->
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.LATHARIUM_ORE.getDefaultState(), ConfigOreStoneGenerationManager.LATHARIUM_ORE.getOreSize()), Placement.COUNT_RANGE, new CountRangeConfig(ConfigOreStoneGenerationManager.LATHARIUM_ORE.getSpawnChance(), 0, 0, ConfigOreStoneGenerationManager.LATHARIUM_ORE.getmaxY())))
//
//        );
//        ForgeRegistries.BIOMES.forEach(biome ->
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.PENDORITE_ORE.getDefaultState(), ConfigOreStoneGenerationManager.PENDORITE_ORE.getOreSize()), Placement.COUNT_RANGE, new CountRangeConfig(ConfigOreStoneGenerationManager.PENDORITE_ORE.getSpawnChance(), 0, 0, ConfigOreStoneGenerationManager.PENDORITE_ORE.getmaxY())))
//        );
//
//        ForgeRegistries.BIOMES.forEach(biome ->
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.DACITE.getDefaultState(), ConfigOreStoneGenerationManager.DACITE_STONE.getOreSize()), Placement.COUNT_RANGE, new CountRangeConfig(ConfigOreStoneGenerationManager.DACITE_STONE.getSpawnChance(), 0, 0, ConfigOreStoneGenerationManager.DACITE_STONE.getmaxY())))
//        );ForgeRegistries.BIOMES.forEach(biome ->
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.ROCKY_STONE.getDefaultState(), ConfigOreStoneGenerationManager.ROCKY_STONE.getOreSize()), Placement.COUNT_RANGE, new CountRangeConfig(ConfigOreStoneGenerationManager.ROCKY_STONE.getSpawnChance(), 0, 0, ConfigOreStoneGenerationManager.ROCKY_STONE.getmaxY())))
//        );ForgeRegistries.BIOMES.forEach(biome ->
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.SCORIA_STONE.getDefaultState(), ConfigOreStoneGenerationManager.SCORIA_STONE.getOreSize()), Placement.COUNT_RANGE, new CountRangeConfig(ConfigOreStoneGenerationManager.SCORIA_STONE.getSpawnChance(), 0, 0, ConfigOreStoneGenerationManager.SCORIA_STONE.getmaxY())))
//        );ForgeRegistries.BIOMES.forEach(biome ->
//                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.SOAPSTONE.getDefaultState(), ConfigOreStoneGenerationManager.SOAPSTONE.getOreSize()), Placement.COUNT_RANGE, new CountRangeConfig(ConfigOreStoneGenerationManager.SOAPSTONE.getSpawnChance(), 0, 0, ConfigOreStoneGenerationManager.SOAPSTONE.getmaxY())))
//        );
//    }
//}