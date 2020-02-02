package sporeaoc.byg.worldtype;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.provider.OverworldBiomeProvider;
import net.minecraft.world.biome.provider.OverworldBiomeProviderSettings;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.OverworldChunkGenerator;
import net.minecraft.world.gen.OverworldGenSettings;

public class BYGWorldType extends WorldType {
    public BYGWorldType() {
        super("The_UnderGround");
    }


    @Override
    public ChunkGenerator<?> createChunkGenerator(World world) {
        return new OverworldChunkGenerator(world, new OverworldBiomeProvider(new OverworldBiomeProviderSettings().setWorldInfo(world.getWorldInfo())), new OverworldGenSettings());
    }
}
