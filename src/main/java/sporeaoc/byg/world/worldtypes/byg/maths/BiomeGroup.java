package sporeaoc.byg.world.worldtypes.byg.maths;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import sporeaoc.byg.byglists.BYGBiomeList;

/**
 * Represents a list of weighted biome entries.
 */
public class BiomeGroup {
	private List<BiomeEntry> entries = new ArrayList<>();
	private double weightTotal = 0.0;

	public Biome pickBiome(INoiseRandom random) {
		double randVal = nextDouble(random) * weightTotal;
		int i = -1;

		while (randVal >= 0) {
			++i;
			randVal -= entries.get(i).weight;
		}

		return entries.get(i).biome;
	}

	public void addBiome(Biome biome, double weight) {
		this.entries.add(new BiomeEntry(biome, weight));
		this.weightTotal += weight;
	}

	private static double nextDouble(INoiseRandom random) {
		return (double) random.random(Integer.MAX_VALUE) / Integer.MAX_VALUE;
	}

	public static void initDefaultBiomes() {
		// inland tropical
		INLAND_TROPICAL_DESERT.addBiome(BYGBiomeList.DUNES, 1.0);
		INLAND_TROPICAL_DESERT.addBiome(BYGBiomeList.REDDESERT, 1.0);
		INLAND_TROPICAL_DESERT.addBiome(BYGBiomeList.REDDESERTDUNES, 1.0);
		INLAND_TROPICAL_STEPPE.addBiome(BYGBiomeList.AMARANTHFIELDS, 1.0);
		INLAND_TROPICAL_STEPPE.addBiome(BYGBiomeList.GRASSLANDPLATEAU, 1.0);
		INLAND_TROPICAL_RAINFOREST.addBiome(BYGBiomeList.TROPICALRAINFOREST, 1.0);
		INLAND_TROPICAL_RAINFOREST.addBiome(BYGBiomeList.TROPICALFUNGALRAINFOREST, 0.9);
		INLAND_TROPICAL_RAINFOREST.addBiome(BYGBiomeList.JACARANDAFOREST, 1.0);
		INLAND_TROPICAL_RAINFOREST.addBiome(BYGBiomeList.GUIANASHIELD, 0.9);
		// inland temperate
		INLAND_TEMPERATE_DRY.addBiome(BYGBiomeList.PRAIRIE, 1.0);
		INLAND_TEMPERATE_DRY.addBiome(BYGBiomeList.SHRUBLANDS, 1.0);
		INLAND_TEMPERATE_DRY.addBiome(BYGBiomeList.DECIDUOUSFOREST, 1.0);
		INLAND_TEMPERATE_ALL.addBiome(BYGBiomeList.ALLIUMFIELDS, 1.0);
		// inland cool
		INLAND_COOL_DRY.addBiome(BYGBiomeList.BLUETAIGA, 1.0);
		INLAND_COOL_DRY.addBiome(BYGBiomeList.BLUEGIANTTAIGA, 0.8);
		INLAND_COOL_DRY.addBiome(BYGBiomeList.DOVERMOUNTAINS, 1.0);
		INLAND_COOL_DRY.addBiome(BYGBiomeList.BOREALFOREST, 1.0);
		INLAND_COOL_ALL.addBiome(BYGBiomeList.CONIFEROUSFOREST, 1.0);
		INLAND_COOL_ALL.addBiome(BYGBiomeList.ALPS, 0.5);
		// inland cold
		INLAND_COLD.addBiome(BYGBiomeList.SNOWYBLUETAIGA, 1.0);
		INLAND_COLD.addBiome(BYGBiomeList.SNOWYCONIFEROUSFOREST, 1.0);
		INLAND_COLD.addBiome(BYGBiomeList.ALPS, 0.5);

		// coastal tropical
		COASTAL_TROPICAL_DRY.addBiome(BYGBiomeList.GRASSLANDPLATEAU, 1.0);
		COASTAL_TROPICAL_DRY.addBiome(BYGBiomeList.AMARANTHFIELDS, 1.0);
		COASTAL_TROPICAL_DRY.addBiome(BYGBiomeList.REDDESERT, 0.4); // less common to have a desert biome at the coast than inland
		COASTAL_TROPICAL_DRY.addBiome(BYGBiomeList.DUNES, 0.4); // see above comment
		COASTAL_TROPICAL_LUSH.addBiome(BYGBiomeList.TROPICALRAINFOREST, 1.0);
		COASTAL_TROPICAL_LUSH.addBiome(BYGBiomeList.JACARANDAFOREST, 1.0);
		COASTAL_TROPICAL_LUSH.addBiome(BYGBiomeList.GUIANASHIELD, 0.9);
		INLAND_TROPICAL_RAINFOREST.addBiome(BYGBiomeList.TROPICALFUNGALRAINFOREST, 0.9);
		// coastal temperate
		COASTAL_TEMPERATE_DRY.addBiome(BYGBiomeList.SHRUBLANDS, 1.0);
		COASTAL_TEMPERATE_DRY.addBiome(BYGBiomeList.DECIDUOUSFOREST, 1.0);
		COASTAL_TEMPERATE_ALL.addBiome(BYGBiomeList.REDOAKFOREST, 1.0);
		COASTAL_TEMPERATE_ALL.addBiome(BYGBiomeList.ALLIUMFIELDS, 1.0);
		// coastal cool
		COASTAL_COOL.addBiome(BYGBiomeList.SEASONALBIRCHFOREST, 1.0);
		COASTAL_COOL.addBiome(BYGBiomeList.BOREALFOREST, 1.0);
		COASTAL_COOL.addBiome(BYGBiomeList.BLUETAIGA, 1.0);
		COASTAL_COOL.addBiome(BYGBiomeList.CONIFEROUSFOREST, 1.0);
		// coastal cold
		COASTAL_COLD.addBiome(BYGBiomeList.SNOWYBLUETAIGA, 1.0);
		COASTAL_COLD.addBiome(BYGBiomeList.SNOWYBLUEGIANTTAIGA, 0.8);
		COASTAL_COLD.addBiome(BYGBiomeList.SNOWYCONIFEROUSFOREST, 1.0);

		// islands
		OCEAN_ISLANDS_TROPICAL.addBiome(BYGBiomeList.TROPICALRAINFOREST, 1.0);
		OCEAN_ISLANDS_TEMPERATE.addBiome(BYGBiomeList.SEASONALFOREST, 1.0);
		OCEAN_ISLANDS_COOL.addBiome(BYGBiomeList.SNOWYBLUETAIGA, 1.0);
	}

	public static final BiomeGroup INLAND_TROPICAL_DESERT = new BiomeGroup();
	public static final BiomeGroup INLAND_TROPICAL_STEPPE = new BiomeGroup();
	public static final BiomeGroup INLAND_TROPICAL_RAINFOREST = new BiomeGroup();
	public static final BiomeGroup INLAND_TEMPERATE_DRY = new BiomeGroup();
	public static final BiomeGroup INLAND_TEMPERATE_LUSH = new BiomeGroup();
	public static final DummyBiomeGroup INLAND_TEMPERATE_ALL = new DummyBiomeGroup(INLAND_TEMPERATE_DRY, INLAND_TEMPERATE_LUSH);
	public static final BiomeGroup INLAND_COOL_DRY = new BiomeGroup();
	public static final BiomeGroup INLAND_COOL_LUSH = new BiomeGroup();
	public static final DummyBiomeGroup INLAND_COOL_ALL = new DummyBiomeGroup(INLAND_COOL_DRY, INLAND_COOL_LUSH);
	public static final BiomeGroup INLAND_COLD = new BiomeGroup();

	public static final BiomeGroup COASTAL_TROPICAL_DRY = new BiomeGroup();
	public static final BiomeGroup COASTAL_TROPICAL_LUSH = new BiomeGroup();
	public static final BiomeGroup COASTAL_TEMPERATE_DRY = new BiomeGroup();
	public static final BiomeGroup COASTAL_TEMPERATE_LUSH = new BiomeGroup();
	public static final DummyBiomeGroup COASTAL_TEMPERATE_ALL = new DummyBiomeGroup(COASTAL_TEMPERATE_DRY, COASTAL_TEMPERATE_LUSH);
	public static final BiomeGroup COASTAL_COOL = new BiomeGroup();
	public static final BiomeGroup COASTAL_COLD = new BiomeGroup();

	public static final BiomeGroup OCEAN_ISLANDS_TROPICAL = new BiomeGroup();
	public static final BiomeGroup OCEAN_ISLANDS_TEMPERATE = new BiomeGroup();
	public static final BiomeGroup OCEAN_ISLANDS_COOL = new BiomeGroup();

	private static class BiomeEntry {
		BiomeEntry(Biome biome, double weight) {
			this.biome = biome;
			this.weight = weight;
		}

		Biome biome;
		double weight;
	}
}

class DummyBiomeGroup extends BiomeGroup {
	DummyBiomeGroup(BiomeGroup...parents) {
		this.parents = parents;
	}

	final BiomeGroup[] parents;

	@Override
	public void addBiome(Biome biome, double weight) {
		for (BiomeGroup b : this.parents) {
			b.addBiome(biome, weight);
		}
	}
}