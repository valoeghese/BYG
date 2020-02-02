package sporeaoc.byg.worldtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.worldtype.BYGBiomeLayers;

public enum ShallowOceansAroundLandLayer implements ICastleTransformer {
	INSTANCE;

	@Override
	public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
		if (BYGBiomeLayers.isDeepOcean(centre)) {
			if (!BYGBiomeLayers.isOcean(n) || !BYGBiomeLayers.isOcean(e) || !BYGBiomeLayers.isOcean(s) || !BYGBiomeLayers.isOcean(w)) {
				return BYGBiomeLayers.OCEAN;
			}
		}

		return centre;
	}

}