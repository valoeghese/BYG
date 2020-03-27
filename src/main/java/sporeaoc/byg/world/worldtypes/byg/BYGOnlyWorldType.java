package sporeaoc.byg.world.worldtypes.byg;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

public final class BYGOnlyWorldType extends WorldType {
	public BYGOnlyWorldType() {
		super("byg_only");
	}

	@Override
	// this forge method will likely be replaced by mojang's wacky new blursed 20w12a code in 1.16
	public ChunkGenerator<?> createChunkGenerator(World world) {
		long seed = world.getSeed();
		return new OverworldChunkGenerator(world, new BYGOnlyBiomeProvider(BIOMES, seed), new OverworldGenSettings());
	}
	
	private static final Set<Biome> BIOMES = ImmutableSet.of();
}
