package sporeaoc.byg.world.worldtypes.islandtype;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.dimension.DimensionType;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraftforge.common.extensions.IForgeWorldType;

public class IslandWorldType extends WorldType implements IForgeWorldType {
	public IslandWorldType() {
		super("bygislands");
	}

	@Override
	public ChunkGenerator<?> createChunkGenerator(World world) {
		if (world.dimension.getType() == DimensionType.OVERWORLD) {
			return ChunkGeneratorType.SURFACE.create(world, new IslandBiomeProvider(world.getSeed()), new OverworldGenSettings());
		}
		return super.createChunkGenerator(world);
	}
}
