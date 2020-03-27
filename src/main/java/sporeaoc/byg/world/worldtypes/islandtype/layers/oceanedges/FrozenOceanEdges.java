package sporeaoc.byg.world.worldtypes.islandtype.layers.oceanedges;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;

public enum FrozenOceanEdges implements ICastleTransformer {
    INSTANCE;

    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        if (ClimateBooleans.isFrozenOcean(centre)) {
            if (ClimateBooleans.isBaseOcean(n) || ClimateBooleans.isBaseOcean(s) || ClimateBooleans.isBaseOcean(e) || ClimateBooleans.isBaseOcean(w)) {
                return ClimateBooleans.DEEP_COLD_OCEAN;
            }
        }
        return centre;
    }
}