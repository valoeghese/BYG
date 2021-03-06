package sporeaoc.byg.byglists;

import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import sporeaoc.byg.world.surfacebuilders.*;

public class BYGSBList {
    public static final SurfaceBuilder<SurfaceBuilderConfig> BOREAL_SB = new BorealForestSB(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilder<SurfaceBuilderConfig> CONIFEROUS_SB = new ConiferousForestSB(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilder<SurfaceBuilderConfig> YEET_SB = new YeetSB(SurfaceBuilderConfig::deserialize);

    public static final SurfaceBuilderConfig AIR = new SurfaceBuilderConfig(Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState(), Blocks.AIR.getDefaultState());

    public static final SurfaceBuilderConfig QUAGMIREPEAT_SB = new SurfaceBuilderConfig(BYGBlockList.PEAT_GRASSBLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilderConfig QUAGMIREMUD_SB = new SurfaceBuilderConfig(BYGBlockList.MUD_BLOCK.getDefaultState(), BYGBlockList.MUD_BRICKS.getDefaultState(), BYGBlockList.MUD_BLOCK.getDefaultState());
    public static final SurfaceBuilderConfig GRASSMOUNTAIN_SB = new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(), Blocks.STONE.getDefaultState(), Blocks.STONE.getDefaultState());
    public static final SurfaceBuilderConfig PEATGRASS_SB = new SurfaceBuilderConfig(BYGBlockList.PEAT_GRASSBLOCK.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState());


    public static final SurfaceBuilder<SurfaceBuilderConfig> REDDUNE_SB = new RedDunesSB(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilder<SurfaceBuilderConfig> DUNES_SB = new DunesSB(SurfaceBuilderConfig::deserialize);
    public static final SurfaceBuilderConfig SAND_SB = new SurfaceBuilderConfig(Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState(), Blocks.SAND.getDefaultState());
    public static final SurfaceBuilderConfig REDSAND_SB = new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState());


    public static final SurfaceBuilderConfig PODZOLDOVERMOUNTAIN_SB = new SurfaceBuilderConfig(BYGBlockList.OVERGROWN_DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
    public static final SurfaceBuilderConfig COARSEDIRTDOVERMOUNTAIN_SB = new SurfaceBuilderConfig(Blocks.COARSE_DIRT.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
    public static final SurfaceBuilderConfig GRASSDOVERMOUNTAIN_SB = new SurfaceBuilderConfig(BYGBlockList.PODZOL_DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState(), BYGBlockList.DACITE.getDefaultState());
    public static final SurfaceBuilder<SurfaceBuilderConfig> DOVER_SB = new DoverMountainSB(SurfaceBuilderConfig::deserialize);

    public static final SurfaceBuilder<SurfaceBuilderConfig> QUAGMIRE_SB = new QuagmireSB(SurfaceBuilderConfig::deserialize);

    //Beaches
    public static final SurfaceBuilder<SurfaceBuilderConfig> ROCKBLACKBEACH = new RockyBlackBeachSB(SurfaceBuilderConfig::deserialize);

    public static final SurfaceBuilderConfig BLACKSAND = new SurfaceBuilderConfig(BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
    public static final SurfaceBuilderConfig ROCKYBLACKSAND = new SurfaceBuilderConfig(BYGBlockList.ROCKY_STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
    public static final SurfaceBuilderConfig ROCKYBLACKSAND2 = new SurfaceBuilderConfig(BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.ROCKY_STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
    public static final SurfaceBuilderConfig STONEBLACKSAND = new SurfaceBuilderConfig(BYGBlockList.BLACK_SAND.getDefaultState(), Blocks.STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());
    public static final SurfaceBuilderConfig STONEBLACKSAND2 = new SurfaceBuilderConfig(Blocks.STONE.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState(), BYGBlockList.BLACK_SAND.getDefaultState());

    public static final SurfaceBuilderConfig WHITESAND = new SurfaceBuilderConfig(BYGBlockList.WHITE_SAND.getDefaultState(), BYGBlockList.WHITE_SAND.getDefaultState(), BYGBlockList.WHITE_SAND.getDefaultState());

}
