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

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class BYGOreGenerator {

    @SubscribeEvent
    public static void bygRegisterOreGenerator(final RegistryEvent.Register<Feature<?>> event) {
        ForgeRegistries.BIOMES.forEach(biome ->
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.TAMRELITE_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 0, 32)))
        );
        /*ForgeRegistries.BIOMES.forEach(biome ->
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.LATHARIUM_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 0, 32)))

        );*/
        ForgeRegistries.BIOMES.forEach(biome ->
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.PENDORITE_ORE.getDefaultState(), 8), Placement.COUNT_RANGE, new CountRangeConfig(6, 0, 0, 32)))
        );

        ForgeRegistries.BIOMES.forEach(biome ->
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.DACITE.getDefaultState(), 25), Placement.COUNT_RANGE, new CountRangeConfig(8, 0, 0, 256)))
        );ForgeRegistries.BIOMES.forEach(biome ->
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.ROCKY_STONE.getDefaultState(), 25), Placement.COUNT_RANGE, new CountRangeConfig(8, 0, 0, 256)))
        );ForgeRegistries.BIOMES.forEach(biome ->
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.SCORIA_STONE.getDefaultState(), 25), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 256)))
        );ForgeRegistries.BIOMES.forEach(biome ->
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockCatalogs.SOAPSTONE.getDefaultState(), 25), Placement.COUNT_RANGE, new CountRangeConfig(10, 0, 0, 256)))
        );
    }
}