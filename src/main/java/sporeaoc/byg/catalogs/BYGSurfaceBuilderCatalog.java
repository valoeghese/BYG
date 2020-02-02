package sporeaoc.byg.catalogs;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import sporeaoc.byg.world.surfacebuilders.BorealForestSB;

public class BYGSurfaceBuilderCatalog {
    public static final SurfaceBuilderConfig PEAT_DIRT = new SurfaceBuilderConfig(BlockCatalogs.PEAT_GRASSBLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());
    public static final SurfaceBuilder<SurfaceBuilderConfig> BOREAL = new BorealForestSB(SurfaceBuilderConfig::deserialize);
}
