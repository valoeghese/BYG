package sporeaoc.byg.byglists;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import sporeaoc.byg.world.surfacebuilders.BorealForestSB;
import sporeaoc.byg.world.surfacebuilders.ConiferousForestSB;
import sporeaoc.byg.world.surfacebuilders.DoverMountainSB;
import sporeaoc.byg.world.surfacebuilders.QuagmireSB;

public class BYGSBList {
    public static final SurfaceBuilder<SurfaceBuilderConfig> BOREAL_SB = new BorealForestSB(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilder<SurfaceBuilderConfig> CONIFEROUS_SB = new ConiferousForestSB(SurfaceBuilderConfig::deserialize);


    public static final SurfaceBuilderConfig QUAGMIREPEAT_SB = new SurfaceBuilderConfig(BYGBlockList.PEAT_GRASSBLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilderConfig QUAGMIREMUD_SB = new SurfaceBuilderConfig(BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BRICKS.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilderConfig GRASSMOUNTAIN_SB = new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState());
    public static final SurfaceBuilderConfig PEATGRASS_SB = new SurfaceBuilderConfig(BYGBlockList.PEAT_GRASSBLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());


    public static final SurfaceBuilderConfig PODZOLDOVERMOUNTAIN_SB = new SurfaceBuilderConfig(BYGBlockList.OVERGROWN_DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
    public static final SurfaceBuilderConfig COARSEDIRTDOVERMOUNTAIN_SB = new SurfaceBuilderConfig(Blocks.COARSE_DIRT.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
    public static final SurfaceBuilderConfig GRASSDOVERMOUNTAIN_SB = new SurfaceBuilderConfig(BYGBlockList.PODZOL_DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
    public static final SurfaceBuilder<SurfaceBuilderConfig> DOVER_SB = new DoverMountainSB(SurfaceBuilderConfig::deserialize);

    public static final SurfaceBuilder<SurfaceBuilderConfig> QUAGMIRE_SB = new QuagmireSB(SurfaceBuilderConfig::deserialize);

}
