package sporeaoc.byg.world.worldtype.islandtype;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

public class BYGIslandWorldType extends WorldType {
    public BYGIslandWorldType() {
        super("byg_island");
    }


        @Override
        public ChunkGenerator<?> createChunkGenerator(World world) {
        return new OverworldChunkGenerator(world, new BYGBiomeProvider(new OverworldBiomeProviderSettings().setWorldInfo(world.getWorldInfo())), new OverworldGenSettings());
    }
}
