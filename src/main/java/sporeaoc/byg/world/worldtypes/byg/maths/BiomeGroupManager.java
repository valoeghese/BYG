package sporeaoc.byg.world.worldtypes.byg.maths;

import java.util.Random;

import sporeaoc.byg.world.worldtypes.noise.OctaveOpenSimplexNoise;

public class BiomeGroupManager {
	public BiomeGroupManager(long seed) {
		Random rand = new Random(seed);
		this.temperatureRandom = new OctaveOpenSimplexNoise(rand, 1, 224 >> CLIMATE_SCALE_LAYER_ADJUSTMENT);
		this.humidity = new OctaveOpenSimplexNoise(rand, 2, 442 >> CLIMATE_SCALE_LAYER_ADJUSTMENT);
		this.landSea = new OctaveOpenSimplexNoise(rand, 2, 400 >> LAND_SEA_SCALE_LAYER_ADJUSTMENT);
		this.zSpread = (double) (1280 >> CLIMATE_SCALE_LAYER_ADJUSTMENT);
		this.zShift = (double) (1000 - rand.nextInt(2000) >> CLIMATE_SCALE_LAYER_ADJUSTMENT);
	}

	private final OctaveOpenSimplexNoise temperatureRandom, humidity, landSea;
	private final double zSpread, zShift;

	public BiomeGroup getInlandBiomeGroup(int layerX, int layerZ) {
		double temp = this.getTemperature(layerX, layerZ);
		double humidity = this.getHumidity(layerX, layerZ);

		if (temp > 0.5) {
			if (humidity > 0.28) return BiomeGroup.INLAND_TROPICAL_RAINFOREST;
			else if (humidity > -0.28) return BiomeGroup.INLAND_TROPICAL_STEPPE;
			else return BiomeGroup.INLAND_TROPICAL_DESERT;
		} else if (temp > 0.0) {
			return humidity > 0.0 ? BiomeGroup.INLAND_TEMPERATE_LUSH : BiomeGroup.INLAND_TEMPERATE_DRY;
		} else if (temp > -0.5) {
			return humidity > 0.0 ? BiomeGroup.INLAND_COOL_LUSH : BiomeGroup.INLAND_COOL_DRY;
		} else {
			return BiomeGroup.INLAND_COLD;
		}
	}

	public BiomeGroup getCoastalBiomeGroup(int layerX, int layerZ) {
		double temp = this.getTemperature(layerX, layerZ);
		double humidity = this.getHumidity(layerX, layerZ);

		if (temp > 0.5) {
			return humidity > 0.0 ? BiomeGroup.COASTAL_TROPICAL_LUSH : BiomeGroup.COASTAL_TROPICAL_DRY;
		} else if (temp > 0.0) {
			return humidity > 0.0 ? BiomeGroup.COASTAL_TEMPERATE_LUSH : BiomeGroup.COASTAL_TEMPERATE_DRY;
		} else if (temp > -0.5) {
			return BiomeGroup.COASTAL_COOL;
		} else {
			return BiomeGroup.COASTAL_COLD;
		}
	}

	public BiomeGroup getIslandBiomeGroup(int layerX, int layerZ) {
		double temp = this.getTemperature(layerX, layerZ);

		if (temp > 0.4) {
			return BiomeGroup.OCEAN_ISLANDS_TROPICAL;
		} else if (temp > -0.4) {
			return BiomeGroup.OCEAN_ISLANDS_TEMPERATE;
		} else {
			return BiomeGroup.OCEAN_ISLANDS_COOL;
		}
	}

	public Biome getCoastalOceanBiome(int layerX, int layerZ) {
		double temp = this.getTemperature(layerX, layerZ);
		
		if (temp > 0.5) {
			return Biome
		}
	}

	double getTemperature(int layerX, int layerZ) {
		return this.temperatureRandom.sample(layerX) * 0.15 + 1 - Math.abs((double) (layerZ + this.zShift) / this.zSpread) * 2;
	}

	double getHumidity(int layerX, int layerZ) {
		return this.humidity.sample(layerX, layerZ);
	}
	
	ContinentSection getSection(int layerX, int layerZ) {
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
