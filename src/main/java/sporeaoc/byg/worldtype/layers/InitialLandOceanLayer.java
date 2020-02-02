package sporeaoc.byg.worldtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IAreaTransformer0;
import sporeaoc.byg.worldtype.BYGBiomeLayers;

public class InitialLandOceanLayer implements IAreaTransformer0 {
	public InitialLandOceanLayer(int landRarity) {
		this.landRarity = landRarity;
	}

	private final int landRarity;

	@Override
	public int apply(INoiseRandom rand, int genX, int genZ) {
		if (genX == 0 && genZ == 0) {
			return BYGBiomeLayers.getRandomBiome(rand);
		}
		else {
			return rand.random(this.landRarity) == 0 ? BYGBiomeLayers.getRandomBiome(rand) : 0;
		}
	}

}