package sporeaoc.byg.world.feature;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class BYGFeaturesInVanilla {
    public void addFeatures(FMLCommonSetupEvent e) {
        for (Biome biome : ForgeRegistries.BIOMES) {
            if (biome.getCategory() == Biome.Category.PLAINS) {

            }
            if (biome.getCategory() == Biome.Category.FOREST) {

            }
        }
    }
}
