package sporeaoc.byg.world.worldtypes.islandtype;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.layer.Layer;
import sporeaoc.byg.world.worldtypes.BYGBiomeGetter;

/*
 *	Credit to @Valoeghese for the World Type Class!
 */

public class IslandBiomeProvider extends BiomeProvider {
	public IslandBiomeProvider(long seed) {
		super(BYGBiomeGetter.getBiomeSet());

		biomeLayer = IslandLayerProvider.build(seed);
	}

	public Layer biomeLayer;

	/**
	 * @param genX (x >> 2)
	 * @param genY (y >> 3)
	 * @param genZ (z >> 2)
	 * @return the biome for the specified position
	 */

	@Override
	public Biome getNoiseBiome(int genX, int genY, int genZ) {
		return biomeLayer.func_215738_a(genX, genZ);
	}
}
