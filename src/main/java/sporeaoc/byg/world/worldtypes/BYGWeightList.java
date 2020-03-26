package sporeaoc.byg.world.worldtypes;

import net.minecraft.util.WeightedRandom;
import net.minecraft.world.biome.Biome;

public class BYGWeightList {


    public static class BiomeEntry extends WeightedRandom.Item {
        public final Biome biome;

        public BiomeEntry(Biome biome, int weight) {
            super(weight);

            this.biome = biome;
        }
    }
}
