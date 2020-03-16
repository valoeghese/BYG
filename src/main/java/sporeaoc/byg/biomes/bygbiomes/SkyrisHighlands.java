package sporeaoc.byg.biomes.bygbiomes;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

public class SkyrisHighlands extends Biome {
    static final ConfiguredSurfaceBuilder SURFACE_BUILDER = new ConfiguredSurfaceBuilder<>(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.PODZOL.getDefaultState(), Blocks.DIRT.getDefaultState(), Blocks.DIRT.getDefaultState()));
    static final RainType PRECIPATATION = RainType.RAIN;
    static final Category CATEGORY = Category.EXTREME_HILLS;
    static final double DEPTH = 4.0F;
    static final double SCALE = 1.0F;
    static final float TEMPERATURE = 0.25F;
    static final float DOWNFALL = 0.8F;
    static final int WATER_COLOR = 4159204;
    static final int WATER_FOG_COLOR = 329011;
    static final String PARENT = null;

    public SkyrisHighlands() {
        super(new Builder().surfaceBuilder(SURFACE_BUILDER).precipitation(PRECIPATATION).category(CATEGORY).depth((float) DEPTH).waterColor(WATER_COLOR).scale((float) SCALE).temperature(TEMPERATURE).downfall(DOWNFALL).waterFogColor(WATER_FOG_COLOR).parent(PARENT));

    }
}
