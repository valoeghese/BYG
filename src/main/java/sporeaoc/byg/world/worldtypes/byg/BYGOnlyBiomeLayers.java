package sporeaoc.byg.world.worldtypes.byg;

import java.util.function.LongFunction;

import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.layer.Layer;

final class BYGOnlyBiomeLayers {
	static Layer stackLayers(long seed) {
		LongFunction<IExtendedNoiseRandom<?>> contextProvider = salt -> new LazyAreaLayerContext(1, seed, salt);
		
		IAreaFactory continental = buildContinental(contextProvider);
		IAreaFactory contintentalEdge = buildContinentalEdge(contextProvider);
		IAreaFactory oceanicEdge = buildOceanicEdge(contextProvider);
		IAreaFactory oceanic = buildOceanic(contextProvider);
		return null;
	}

	private static IAreaFactory buildOceanic(LongFunction<IExtendedNoiseRandom<?>> contextProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	private static IAreaFactory buildOceanicEdge(LongFunction<IExtendedNoiseRandom<?>> contextProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	private static IAreaFactory buildContinentalEdge(LongFunction<IExtendedNoiseRandom<?>> contextProvider) {
		// TODO Auto-generated method stub
		return null;
	}

	private static IAreaFactory buildContinental(LongFunction<IExtendedNoiseRandom<?>> contextProvider) {
		// TODO Auto-generated method stub
		return null;
	}
}
