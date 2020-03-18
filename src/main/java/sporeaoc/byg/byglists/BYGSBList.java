package sporeaoc.byg.byglists;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import sporeaoc.byg.world.surfacebuilders.BorealForestSB;
import sporeaoc.byg.world.surfacebuilders.DoverMountainSB;
import sporeaoc.byg.world.surfacebuilders.QuagmireSB;

public class BYGSBList {
    //public static final SurfaceBuilderConfig PEATDIRT_SB = new SurfaceBuilderConfig(BYGBlockList.PEAT_GRASSBLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());
    public static final SurfaceBuilder<SurfaceBuilderConfig> BOREAL_SB = new BorealForestSB(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilderConfig QUAGMIREMUD = new SurfaceBuilderConfig(BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilderConfig QUAGMIREMUDBRICK = new SurfaceBuilderConfig(BYGBlockList.MUD_BRICKS.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilderConfig PODZOL = new SurfaceBuilderConfig(Blocks.PODZOL.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());


    public static final SurfaceBuilder<SurfaceBuilderConfig> DOVER_SB = new DoverMountainSB(SurfaceBuilderConfig::deserialize);

    public static final SurfaceBuilder<SurfaceBuilderConfig> QUAGMIRE_SB = new QuagmireSB(SurfaceBuilderConfig::deserialize);

}
