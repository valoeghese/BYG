package sporeaoc.byg.worldtype.islandtype;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BYGLayers {
    private static final Logger LOGGER = LogManager.getLogger();
    private final LazyArea lazyArea;

    public BYGLayers(IAreaFactory<LazyArea> lazyAreaFactoryIn) {
        this.lazyArea = lazyAreaFactoryIn.make();
    }

    public Biome[] generateBiomes(int startX, int startZ, int xSize, int zSize) {
        Biome[] abiome = new Biome[xSize * zSize];

        for (int i = 0; i < zSize; ++i) {
            for (int j = 0; j < xSize; ++j) {
                int k = this.lazyArea.getValue(startX + j, startZ + i);
                Biome biome = this.BLSamplerGetBiome(k);
                abiome[j + i * xSize] = biome;
            }
        }

        return abiome;
    }

    private Biome BLSamplerGetBiome(int biomeID) {
        Biome biome = Registry.BIOME.getByValue(biomeID);
        assert biome != null;
        if (biome.getCategory() != Biome.Category.OCEAN) {
            return biome;
        }
        return biome;
    }

    public Biome BLSampler(int x, int z) {
        return this.BLSamplerGetBiome(this.lazyArea.getValue(x, z));
    }
}
