package sporeaoc.byg.world.worldtypes.byg.layers;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.INoiseRandom;
import sporeaoc.byg.world.worldtypes.byg.maths.BiomeGroupManager;

public class ContinentalInitLayer extends InitLayer {
	public ContinentalInitLayer(BiomeGroupManager manager) {
		super(manager);
	}

	@SuppressWarnings("deprecation")
	@Override
	public int apply(INoiseRandom rand, int x, int z) {
		return Registry.BIOME.getId(this.manager.getInlandBiomeGroup(x, z).pickBiome(rand));
	}
}
