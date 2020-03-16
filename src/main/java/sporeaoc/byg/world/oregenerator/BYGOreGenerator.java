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
//import sporeaoc.byg.catalogs.BlockList;
//import sporeaoc.byg.config.BYGConfig;
//
//@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//
//public class BYGOreGenerator {
//
//    @SubscribeEvent
//    public static void bygRegisterOreGenerator(final RegistryEvent.Register<Feature<?>> event) {
//        ForgeRegistries.BIOMES.forEach(biome -> {
//            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.PENDORITE_ORE.getDefaultState(), BYGConfig.PendoriteOreSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(BYGConfig.PendoriteOreChance.get(), 0, 0, BYGConfig.PendoriteOreMaxY.get())));
//            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.AMETRINE_ORE.getDefaultState(), BYGConfig.AmetrineOreSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(BYGConfig.AmetrineOreChance.get(), 0, 0, BYGConfig.AmetrineOreMaxY.get())));
//            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.DACITE.getDefaultState(), BYGConfig.DaciteSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(BYGConfig.DaciteChance.get(), 0, 0, BYGConfig.DaciteMaxY.get())));
//            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.ROCKY_STONE.getDefaultState(), BYGConfig.RockyStoneSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(BYGConfig.RockyStoneChance.get(), 0, 0, BYGConfig.RockyStoneMaxY.get())));
//            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.SCORIA_STONE.getDefaultState(), BYGConfig.ScoriaStoneSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(BYGConfig.ScoriaStoneChance.get(), 0, 0, BYGConfig.ScoriaStoneMaxY.get())));
//            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.SOAPSTONE.getDefaultState(), BYGConfig.SoapStoneSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(BYGConfig.SoapStoneChance.get(), 0, 0, BYGConfig.SoapStoneMaxY.get())));
//        });
//    }
//}