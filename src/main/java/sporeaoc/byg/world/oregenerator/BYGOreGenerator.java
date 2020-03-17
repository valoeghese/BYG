package sporeaoc.byg.world.oregenerator;

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
import sporeaoc.byg.byglists.BYGBlockList;
import sporeaoc.byg.config.BYGConfig;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BYGOreGenerator {

    @SubscribeEvent
    public static void bygRegisterOreGenerator(RegistryEvent.Register<Feature<?>> event) {
        ForgeRegistries.BIOMES.forEach(biome -> {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlockList.AMETRINE_ORE.getDefaultState(), BYGConfig.AmetrineOreSize.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(BYGConfig.AmetrineOreChance.get(), 0, 0, BYGConfig.AmetrineOreMaxY.get()))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlockList.PENDORITE_ORE.getDefaultState(), BYGConfig.PendoriteOreSize.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(BYGConfig.PendoriteOreChance.get(), 0, 0, BYGConfig.PendoriteOreMaxY.get()))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlockList.DACITE.getDefaultState(), BYGConfig.DaciteSize.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(BYGConfig.DaciteChance.get(), 0, 0, BYGConfig.DaciteMaxY.get()))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlockList.ROCKY_STONE.getDefaultState(), BYGConfig.RockyStoneSize.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(BYGConfig.RockyStoneChance.get(), 0, 0, BYGConfig.RockyStoneMaxY.get()))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BYGBlockList.SCORIA_STONE.getDefaultState(), BYGConfig.ScoriaStoneSize.get())).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(BYGConfig.ScoriaStoneChance.get(), 0, 0, BYGConfig.ScoriaStoneChance.get()))));
        });
    }
}