package sporeaoc.byg.world.worldtypes.islandtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;


public enum OneBiomePerIslandLayer implements ICastleTransformer {
    INSTANCE;

    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        if (!ClimateBooleans.isOcean(centre)) {
            if (!ClimateBooleans.isOcean(n) || !ClimateBooleans.isOcean(s) || !ClimateBooleans.isOcean(e) || !ClimateBooleans.isOcean(w))
                return ClimateBooleans.DEEP_OCEAN;
        }
        return centre;
    }
}
