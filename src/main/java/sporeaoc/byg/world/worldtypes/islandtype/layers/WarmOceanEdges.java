package sporeaoc.byg.world.worldtypes.islandtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;

public enum WarmOceanEdges implements ICastleTransformer {
    INSTANCE;

    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        if (ClimateBooleans.isWarmOcean(centre)) {
            if (ClimateBooleans.isColdFrozenOcean(n) || ClimateBooleans.isColdFrozenOcean(s) || ClimateBooleans.isColdFrozenOcean(e) || ClimateBooleans.isColdFrozenOcean(w))
                return ClimateBooleans.DEEP_OCEAN;
        }
        return centre;
    }
}