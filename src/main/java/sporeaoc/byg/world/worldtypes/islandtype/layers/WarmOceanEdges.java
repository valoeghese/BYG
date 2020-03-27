package sporeaoc.byg.world.worldtypes.islandtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;

public enum WarmOceanEdges implements ICastleTransformer {
    INSTANCE;

    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        if (ClimateBooleans.isWarmOcean(centre)) {
            if (ClimateBooleans.isFrozenOcean(n) || ClimateBooleans.isFrozenOcean(s) || ClimateBooleans.isFrozenOcean(e) || ClimateBooleans.isFrozenOcean(w)) {
                return ClimateBooleans.DEEP_OCEAN;
            }
        }
        return centre;
    }
}