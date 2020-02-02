package sporeaoc.byg.worldtype;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.ChunkGeneratorType;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraftforge.common.extensions.IForgeWorldType;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class BYGWorldType extends WorldType implements IForgeWorldType {
    public BYGWorldType(String name) {
        super(name);
    }

    @Override
    public ChunkGenerator<?> createChunkGenerator(World world) {
        return ChunkGeneratorType.SURFACE.create(world, new BYGBiomeProvider(world.getSeed()) {
            @Override
            public Biome getBiome(int x, int y) {
                return null;
            }

            @Override
            public Biome[] getBiomes(int x, int z, int width, int length, boolean cacheFlag) {
                return new Biome[0];
            }

            @Override
            public Set<Biome> getBiomesInSquare(int centerX, int centerZ, int sideLength) {
                return null;
            }

            @Nullable
            @Override
            public BlockPos findBiomePosition(int x, int z, int range, List<Biome> biomes, Random random) {
                return null;
            }

            @Override
            public boolean hasStructure(Structure<?> structureIn) {
                return false;
            }

            @Override
            public Set<BlockState> getSurfaceBlocks() {
                return null;
            }
        }, new OverworldGenSettings());
    }
}