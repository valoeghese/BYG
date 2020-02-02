package sporeaoc.byg.worldtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.worldtype.BYGBiomeLayers;

public enum AddExtraIslandsLayer implements ICastleTransformer {
	INSTANCE;

	@Override
	public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
		if (BYGBiomeLayers.isDeepOcean(centre)) {
			if (BYGBiomeLayers.isDeepOcean(n) && BYGBiomeLayers.isDeepOcean(e) && BYGBiomeLayers.isDeepOcean(s) && BYGBiomeLayers.isDeepOcean(w)) {
				if (rand.random(5) == 0) {
					return BYGBiomeLayers.getRandomBiome(rand);
				}
			}
		}

		return centre;
	}

}