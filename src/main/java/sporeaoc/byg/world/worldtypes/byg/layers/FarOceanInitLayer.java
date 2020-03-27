package sporeaoc.byg.world.worldtypes.byg.layers;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.INoiseRandom;
import sporeaoc.byg.world.worldtypes.byg.maths.BiomeGroupManager;

public class FarOceanInitLayer extends InitLayer {
	public FarOceanInitLayer(BiomeGroupManager manager) {
		super(manager);
	}

	@SuppressWarnings("deprecation")
	@Override
	public int apply(INoiseRandom rand, int x, int z) {
		return Registry.BIOME.getId(rand.random(5) == 0 ? this.manager.getIslandBiomeGroup(x, z).pickBiome(rand) : this.manager.getCoastalOceanBiome(x, z));
	}
}
