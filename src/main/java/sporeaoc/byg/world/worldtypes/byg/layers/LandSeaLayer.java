package sporeaoc.byg.world.worldtypes.byg.layers;

import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.area.IArea;
import sporeaoc.byg.world.worldtypes.byg.layers.traits.IAreaTransformer4;
import sporeaoc.byg.world.worldtypes.byg.maths.BiomeGroupManager;
import sporeaoc.byg.world.worldtypes.byg.maths.BiomeGroupManager.ContinentSection;

public class LandSeaLayer implements IAreaTransformer4 {
	public LandSeaLayer(BiomeGroupManager manager) {
		this.manager = manager;
	}

	private final BiomeGroupManager manager;

	@Override
	public int apply(IExtendedNoiseRandom<?> rand, IArea farOcean, IArea coastOcean, IArea coastLand, IArea inland, int x, int z) {
		ContinentSection section = this.manager.getSection(x, z);

		switch (section) {
		case COASTAL_CONTINENT:
			return inland.getValue(x, z);
		case COASTAL_SEAS:
			return coastLand.getValue(x, z);
		case INLAND_CONTINENT:
			return coastOcean.getValue(x, z);
		case THE_OCEAN:
		default:
			return farOcean.getValue(x, z);
		}
	}
}
