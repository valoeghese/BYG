package sporeaoc.byg.world.worldtypes.byg;

import java.util.Set;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.layer.Layer;

public class BYGOnlyBiomeProvider extends BiomeProvider {
	public BYGOnlyBiomeProvider(Set<Biome> biomes, long seed) {
		super(biomes);
		this.layer = BYGOnlyBiomeLayers.stackLayerTransformers(seed);
	}

	private final Layer layer;

	@Override
	// noiseY is not actually used even by mojang I think, only noiseX and noiseZ
	public Biome getNoiseBiome(int noiseX, int noiseY, int noiseZ) {
		return layer.func_215738_a(noiseX, noiseZ);
	}
}
