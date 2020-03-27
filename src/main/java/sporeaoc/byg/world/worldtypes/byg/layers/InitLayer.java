package sporeaoc.byg.world.worldtypes.byg.layers;

import net.minecraft.world.gen.layer.traits.IAreaTransformer0;
import sporeaoc.byg.world.worldtypes.byg.maths.BiomeGroupManager;

abstract class InitLayer implements IAreaTransformer0 {
	InitLayer(BiomeGroupManager manager) {
		this.manager = manager;
	}

	BiomeGroupManager manager;
}
