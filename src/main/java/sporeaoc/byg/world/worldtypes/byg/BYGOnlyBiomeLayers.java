package sporeaoc.byg.world.worldtypes.byg;

import java.util.function.LongFunction;

import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;
import net.minecraft.world.gen.layer.DeepOceanLayer;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.MixRiverLayer;
import net.minecraft.world.gen.layer.RiverLayer;
import net.minecraft.world.gen.layer.ShoreLayer;
import net.minecraft.world.gen.layer.SmoothLayer;
import net.minecraft.world.gen.layer.ZoomLayer;
import sporeaoc.byg.world.worldtypes.byg.layers.CoastalInitLayer;
import sporeaoc.byg.world.worldtypes.byg.layers.CoastalOceanInitLayer;
import sporeaoc.byg.world.worldtypes.byg.layers.ContinentalInitLayer;
import sporeaoc.byg.world.worldtypes.byg.layers.FarOceanInitLayer;
import sporeaoc.byg.world.worldtypes.byg.layers.LandSeaLayer;
import sporeaoc.byg.world.worldtypes.byg.layers.RandomNoiseLayer;
import sporeaoc.byg.world.worldtypes.byg.maths.BiomeGroupManager;

final class BYGOnlyBiomeLayers {
	static Layer stackLayerTransformers(long seed) {
		LongFunction<IExtendedNoiseRandom<LazyArea>> contextProvider = salt -> new LazyAreaLayerContext(1, seed, salt);

		BiomeGroupManager manager = new BiomeGroupManager(seed);
		IAreaFactory<LazyArea> continental = buildContinental(manager, contextProvider);
		IAreaFactory<LazyArea> contintentalEdge = buildContinentalEdge(manager, contextProvider);
		IAreaFactory<LazyArea> oceanicEdge = buildOceanicEdge(manager, contextProvider);
		IAreaFactory<LazyArea> oceanic = buildOceanic(manager, contextProvider);

		IAreaFactory<LazyArea> land = new LandSeaLayer(manager).apply(contextProvider.apply(4L), oceanic, oceanicEdge, contintentalEdge, continental);

		// river
		IAreaFactory<LazyArea> river = RandomNoiseLayer.INSTANCE.apply(contextProvider.apply(1L));
		river = ZoomLayer.NORMAL.apply(contextProvider.apply(1000L), river);
		river = ZoomLayer.NORMAL.apply(contextProvider.apply(1001L), river);

		for (int i = 0; i < 4; ++i) {
			if (i == 1) {
				land = ShoreLayer.INSTANCE.apply(contextProvider.apply(101L), land);
			}

			land = ZoomLayer.NORMAL.apply(contextProvider.apply(1000L + i), land);
		}

		for (int i = 0; i < 4; ++i) {
			int offset = i & 1;
			river = ZoomLayer.NORMAL.apply(contextProvider.apply(1000L + offset), river);
		}

		river = RiverLayer.INSTANCE.apply(contextProvider.apply(12L), river);
		river = SmoothLayer.INSTANCE.apply(contextProvider.apply(10L), river);

		land = SmoothLayer.INSTANCE.apply(contextProvider.apply(10L), land);
		land = MixRiverLayer.INSTANCE.apply(contextProvider.apply(4L), land, river);

		return new Layer(land);
	}

	private static <R extends IArea, C extends IExtendedNoiseRandom<R>> IAreaFactory<R> buildOceanic(BiomeGroupManager manager, LongFunction<C> contextProvider) {
		IAreaFactory<R> result = new FarOceanInitLayer(manager).apply(contextProvider.apply(1L));
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1000L), result);
		result = DeepOceanLayer.INSTANCE.apply(contextProvider.apply(2L), result);
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1001L), result);
		return result;
	}

	private static <R extends IArea, C extends IExtendedNoiseRandom<R>> IAreaFactory<R> buildOceanicEdge(BiomeGroupManager manager, LongFunction<C> contextProvider) {
		IAreaFactory<R> result = new CoastalOceanInitLayer(manager).apply(contextProvider.apply(1L));
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1000L), result);
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1001L), result);
		return result;
	}

	private static <R extends IArea, C extends IExtendedNoiseRandom<R>> IAreaFactory<R> buildContinentalEdge(BiomeGroupManager manager, LongFunction<C> contextProvider) {
		IAreaFactory<R> result = new CoastalInitLayer(manager).apply(contextProvider.apply(1L));
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1000L), result);
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1001L), result);
		return result;
	}

	private static <R extends IArea, C extends IExtendedNoiseRandom<R>> IAreaFactory<R> buildContinental(BiomeGroupManager manager, LongFunction<C> contextProvider) {
		IAreaFactory<R> result = new ContinentalInitLayer(manager).apply(contextProvider.apply(1L));
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1000L), result);
		result = ZoomLayer.NORMAL.apply(contextProvider.apply(1001L), result);
		return result;
	}
}
