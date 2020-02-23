package sporeaoc.byg.world.oregenerator;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import sporeaoc.byg.BYG;
import sporeaoc.byg.catalogs.BlockCatalogs;
import sporeaoc.byg.config.orestones.OreStoneConfig;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BYGOreGenerator {

    @SubscribeEvent
    public static void bygRegisterOreGenerator(final RegistryEvent.Register<Feature<?>> event) {
        ForgeRegistries.BIOMES.forEach(biome -> {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.PENDORITE_ORE.getDefaultState(), OreStoneConfig.PendoriteOreSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(OreStoneConfig.PendoriteOreChance.get(), 0, 0, OreStoneConfig.PendoriteOreMaxY.get())));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.TAMRELITE_ORE.getDefaultState(), OreStoneConfig.TamreliteOreSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(OreStoneConfig.TamreliteOreChance.get(), 0, 0, OreStoneConfig.TamreliteOreMaxY.get())));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.LATHARIUM_ORE.getDefaultState(), OreStoneConfig.lathariumOreSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(OreStoneConfig.LathariumOreChance.get(), 0, 0, OreStoneConfig.LathariumOreMaxY.get())));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.DACITE.getDefaultState(), OreStoneConfig.DaciteSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(OreStoneConfig.DaciteChance.get(), 0, 0, OreStoneConfig.DaciteMaxY.get())));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.ROCKY_STONE.getDefaultState(), OreStoneConfig.RockyStoneSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(OreStoneConfig.RockyStoneChance.get(), 0, 0, OreStoneConfig.RockyStoneMaxY.get())));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.SCORIA_STONE.getDefaultState(), OreStoneConfig.ScoriaStoneSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(OreStoneConfig.ScoriaStoneChance.get(), 0, 0, OreStoneConfig.ScoriaStoneMaxY.get())));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.SOAPSTONE.getDefaultState(), OreStoneConfig.SoapStoneSize.get()), Placement.COUNT_RANGE, new CountRangeConfig(OreStoneConfig.SoapStoneChance.get(), 0, 0, OreStoneConfig.SoapStoneMaxY.get())));

        });
    }
}