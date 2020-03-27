package sporeaoc.byg.world.worldtypes.byg.maths;

import java.util.Random;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import sporeaoc.byg.world.worldtypes.noise.OctaveOpenSimplexNoise;

public class BiomeGroupManager {
	public BiomeGroupManager(long seed) {
		Random rand = new Random(seed);
		this.temperatureRandom = new OctaveOpenSimplexNoise(rand, 1, temperatureScale());
		this.humidity = new OctaveOpenSimplexNoise(rand, 2, 442 >> CLIMATE_SCALE_LAYER_ADJUSTMENT);
		this.landSea = new OctaveOpenSimplexNoise(rand, 2, 400 >> LAND_SEA_SCALE_LAYER_ADJUSTMENT);
		this.zSpread = (double) (1280 >> CLIMATE_SCALE_LAYER_ADJUSTMENT);
		// z shift, so you don't always spawn in the same climate
		this.zShift = (double) (1000 - rand.nextInt(2000) >> CLIMATE_SCALE_LAYER_ADJUSTMENT);
	}

	// if the scale of the noise is zero, it will always return the same result due to multiplication by 0
	// therefore we catch this case in the temperature random noise, which has a low scale and is integer bit shifted
	private double temperatureScale() {
		double output = 224 >> CLIMATE_SCALE_LAYER_ADJUSTMENT;
		return output == 0 ? 0.2 : output;
	}

	private final OctaveOpenSimplexNoise temperatureRandom, humidity, landSea;
	private final double zSpread, zShift;

	public BiomeGroup getInlandBiomeGroup(int layerX, int layerZ) {
		int tempCategory = this.getTempCategory(layerX, layerZ);
		double humidity = this.getHumidity(layerX, layerZ);

		switch (tempCategory) {
		case 3:
			if (humidity > 0.28) return BiomeGroup.INLAND_TROPICAL_RAINFOREST;
			else if (humidity > -0.28) return BiomeGroup.INLAND_TROPICAL_STEPPE;
			else return BiomeGroup.INLAND_TROPICAL_DESERT;
		case 2:
			return humidity > 0.0 ? BiomeGroup.INLAND_TEMPERATE_LUSH : BiomeGroup.INLAND_TEMPERATE_DRY;
		case 1:
			return humidity > 0.0 ? BiomeGroup.INLAND_COOL_LUSH : BiomeGroup.INLAND_COOL_DRY;
		case 0:
		default:
			return BiomeGroup.INLAND_COLD;
		}
	}

	public BiomeGroup getCoastalBiomeGroup(int layerX, int layerZ) {
		int tempCategory = this.getTempCategory(layerX, layerZ);
		double humidity = this.getHumidity(layerX, layerZ);

		switch (tempCategory) {
		case 3:
			return humidity > 0.0 ? BiomeGroup.COASTAL_TROPICAL_LUSH : BiomeGroup.COASTAL_TROPICAL_DRY;
		case 2:
			return humidity > 0.0 ? BiomeGroup.COASTAL_TEMPERATE_LUSH : BiomeGroup.COASTAL_TEMPERATE_DRY;
		case 1:
			return BiomeGroup.COASTAL_COOL;
		case 0:
		default:
			return BiomeGroup.COASTAL_COLD;
		}
	}

	public BiomeGroup getIslandBiomeGroup(int layerX, int layerZ) {
		switch (this.getTempCategory(layerX, layerZ)) {
		case 3:
			return BiomeGroup.OCEAN_ISLANDS_TROPICAL;
		case 2:
		case 1:
			return BiomeGroup.OCEAN_ISLANDS_TEMPERATE;
		case 0:
		default:
			return BiomeGroup.OCEAN_ISLANDS_SNOWY;
		}
	}

	public Biome getCoastalOceanBiome(int layerX, int layerZ) {
		switch (this.getTempCategory(layerX, layerZ)) {
		case 3:
			return Biomes.WARM_OCEAN;
		case 2:
			return Biomes.LUKEWARM_OCEAN;
		case 1:
			return Biomes.COLD_OCEAN;
		case 0:
		default:
			return Biomes.FROZEN_OCEAN;
		}
	}

	double getTemperature(int layerX, int layerZ) {
		return this.temperatureRandom.sample(layerX) * 0.2 + 1 - Math.abs((double) (layerZ + this.zShift) / this.zSpread) * 2;
	}

	double getHumidity(int layerX, int layerZ) {
		return this.humidity.sample(layerX, layerZ);
	}

	int getTempCategory(int layerX, int layerZ) {
		double temp = this.getTemperature(layerX, layerZ);

		if (temp > 0.55) return 3;
		else if (temp > -0.3) return 2;
		else if (temp > -1.0) return 1;
		else return 0;
	}

	public ContinentSection getSection(int layerX, int layerZ) {
		double sample = this.landSea.sample(layerX, layerZ);
		ContinentSection result;

		if (sample > 0.3) result = ContinentSection.INLAND_CONTINENT;
		else if (sample > -0.1) result = ContinentSection.COASTAL_CONTINENT;
		else if (sample > -0.35) result = ContinentSection.COASTAL_SEAS;
		else result = ContinentSection.THE_OCEAN;

		if ((layerX >> 2) == 0 && (layerZ >> 2) == 0 && (result == ContinentSection.COASTAL_SEAS)) {
			result = ContinentSection.COASTAL_CONTINENT;
		}

		return result;
	}

	static final int CLIMATE_SCALE_LAYER_ADJUSTMENT = 6 + 2;
	static final int LAND_SEA_SCALE_LAYER_ADJUSTMENT = 4 + 2;

	public static enum ContinentSection {
		INLAND_CONTINENT,
		COASTAL_CONTINENT,
		COASTAL_SEAS,
		THE_OCEAN
	}
}
