package sporeaoc.byg.world.feature;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import sporeaoc.byg.world.feature.biomefeatures.BYGFeatureConfigs;

public class BYGFeaturesInVanilla {
    public void addFeatures(FMLCommonSetupEvent e) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome == Biomes.FOREST) {
                biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(BYGFeatureConfigs.ROSE_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));

            }
        }
    }
}
