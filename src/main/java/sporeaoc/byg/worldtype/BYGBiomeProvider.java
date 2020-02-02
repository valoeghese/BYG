package sporeaoc.byg.worldtype;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.layer.Layer;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashSet;
import java.util.Set;

public abstract class BYGBiomeProvider extends BiomeProvider {
    public BYGBiomeProvider(long seed) {
        super();

        biomeLayer = BYGBiomeLayers.build(seed);
    }

    public Layer biomeLayer;

    /**
     * Used for determining possible structures and top blocks.
     * @return the set of biomes that will generate.
     */
    public static Set<Biome> getBiomeSet() {
        Set<Biome> set = new HashSet<>();
        ForgeRegistries.BIOMES.forEach(set::add);
        return set;
    }

    /**
     * @param genX (x >> 2)
     * @param genY (y >> 3)
     * @param genZ (z >> 2)
     * @return the biome for the specified position
     */
    public Biome func_225526_b_(int genX, int genY, int genZ) {
        return biomeLayer.func_215738_a(genX, genZ);
    }

}
