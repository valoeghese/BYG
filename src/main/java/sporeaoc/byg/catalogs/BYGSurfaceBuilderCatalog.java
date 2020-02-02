package sporeaoc.byg.catalogs;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import sporeaoc.byg.world.surfacebuilders.BorealForestSB;
import sporeaoc.byg.world.surfacebuilders.QuagmireSB;

public class BYGSurfaceBuilderCatalog {
    public static final SurfaceBuilderConfig PEAT_DIRT = new SurfaceBuilderConfig(BlockCatalogs.PEAT_GRASSBLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());
    public static final SurfaceBuilder<SurfaceBuilderConfig> BOREAL = new BorealForestSB(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilderConfig QUAGMIREMUD = new SurfaceBuilderConfig(BlockCatalogs.MUD_BLOCK.getDefaultState(), BlockCatalogs.MUD_BLOCK.getDefaultState(), BlockCatalogs.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilderConfig QUAGMIREMUDBRICK = new SurfaceBuilderConfig(BlockCatalogs.MUD_BRICKS.getDefaultState(), BlockCatalogs.MUD_BLOCK.getDefaultState(), BlockCatalogs.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilder<SurfaceBuilderConfig> QUAGMIRE = new QuagmireSB(SurfaceBuilderConfig::deserialize);

}
