package sporeaoc.byg.worldtype;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.ZoomLayer;
import sporeaoc.byg.catalogs.BiomeCatalog;
import sporeaoc.byg.worldtype.layers2.ContinentLayer;

import java.util.function.LongFunction;

@SuppressWarnings("deprecation")
public final class BYGBiomeLayers {
	private static <A extends IArea, R extends IExtendedNoiseRandom<A>> IAreaFactory<A> stackLayers(LongFunction<R> randomProvider) {
		// Initial land/sea, with random biomes
		//IAreaFactory<A> factory = new InitialLandOceanLayer(8).apply(randomProvider.apply(1L));

		// Add deep ocean and more land with random biomes
//		for (int i = 0; i < extraIslands; ++i) {
//			factory = DeepOceanLayer.INSTANCE.apply(randomProvider.apply(2L + i), factory);
//			factory = ZoomLayer.NORMAL.apply(randomProvider.apply(100L + i), factory);
//			factory = AddExtraIslandsLayer.INSTANCE.apply(randomProvider.apply(i), factory);
//		}
//		factory = ZoomLayer.NORMAL.apply(randomProvider.apply(1000L), factory);
//		// Add beaches and small edges
//		factory = ShallowOceansAroundLandLayer.INSTANCE.apply(randomProvider.apply(9L), factory);
//		factory = ShoreLayer.INSTANCE.apply(randomProvider.apply(10L), factory);
//		factory = LayerUtil.repeat(1001L, ZoomLayer.NORMAL, factory, islandSizeMin - 1, randomProvider);
		IAreaFactory<A> factory = ContinentLayer.INSTANCE.apply(randomProvider.apply(1000));
		factory = ZoomLayer.NORMAL.apply(randomProvider.apply(1000), factory);


		return factory;
	}

	private static final int islandSizeMin = 4;
	private static final int extraIslands = 3;
	private static final int[] randomBiomesArray;

	public static Layer build(long seed) {
		return new Layer(stackLayers(salt -> new LazyAreaLayerContext(25, seed, salt)));
	}

	public static boolean isDeepOcean(int biomeId) {
		return biomeId == DEEP_WARM_OCEAN || biomeId == DEEP_LUKEWARM_OCEAN || biomeId == DEEP_OCEAN || biomeId == DEEP_COLD_OCEAN || biomeId == DEEP_FROZEN_OCEAN;
	}

	public static boolean isOcean(int biomeId) {
		return biomeId == WARM_OCEAN || biomeId == LUKEWARM_OCEAN || biomeId == OCEAN || biomeId == COLD_OCEAN || biomeId == FROZEN_OCEAN || biomeId == DEEP_WARM_OCEAN || biomeId == DEEP_LUKEWARM_OCEAN || biomeId == DEEP_OCEAN || biomeId == DEEP_COLD_OCEAN || biomeId == DEEP_FROZEN_OCEAN;
	}

	public static int getRandomBiome(INoiseRandom rand) {
		return randomBiomesArray[rand.random(randomBiomesArray.length)];
	}

	static {
		Biome[] biomes = BYGBiomeProvider.getBiomeSet().toArray(new Biome[0]);
		randomBiomesArray = new int[biomes.length];

		for (int index = 0; index < biomes.length; ++index) {
			if (biomes[index].getCategory() != Biome.Category.OCEAN) {
				randomBiomesArray[index] = Registry.BIOME.getId(biomes[index]);
			}
		}
	}

	public static final int OCEAN = Registry.BIOME.getId(Biomes.OCEAN);
	protected static final int WARM_OCEAN = Registry.BIOME.getId(Biomes.WARM_OCEAN);
	protected static final int LUKEWARM_OCEAN = Registry.BIOME.getId(Biomes.LUKEWARM_OCEAN);
	protected static final int COLD_OCEAN = Registry.BIOME.getId(Biomes.COLD_OCEAN);
	protected static final int FROZEN_OCEAN = Registry.BIOME.getId(Biomes.FROZEN_OCEAN);
	private static final int DEEP_WARM_OCEAN = Registry.BIOME.getId(Biomes.DEEP_WARM_OCEAN);
	private static final int DEEP_LUKEWARM_OCEAN = Registry.BIOME.getId(Biomes.DEEP_LUKEWARM_OCEAN);
	private static final int DEEP_OCEAN = Registry.BIOME.getId(Biomes.DEEP_OCEAN);
	private static final int DEEP_COLD_OCEAN = Registry.BIOME.getId(Biomes.DEEP_COLD_OCEAN);
	private static final int DEEP_FROZEN_OCEAN = Registry.BIOME.getId(BiomeCatalog.AMARANTH_FIELDS);
}