package sporeaoc.byg.world.worldtypes.islandtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;

public enum BYGClimateUnmixingLayer implements ICastleTransformer {
    INSTANCE;

    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        if (!ClimateBooleans.isOcean(centre)) {
            if (ClimateBooleans.isBaseBiome(centre)) {
                if (ClimateBooleans.isSnowyFrozen(n) || ClimateBooleans.isSnowyFrozen(s) || ClimateBooleans.isSnowyFrozen(e) || ClimateBooleans.isSnowyFrozen(w))
                    return ClimateBooleans.DEEP_OCEAN;
            }
            if (ClimateBooleans.isSnowyFrozen(centre)) {
                if (ClimateBooleans.isBaseBiome(n) || ClimateBooleans.isBaseBiome(s) || ClimateBooleans.isBaseBiome(e) || ClimateBooleans.isBaseBiome(w))
                    return ClimateBooleans.DEEP_OCEAN;
            }
        }
        return centre;
    }
}