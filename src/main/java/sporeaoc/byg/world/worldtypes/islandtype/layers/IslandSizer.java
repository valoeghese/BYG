package sporeaoc.byg.world.worldtypes.islandtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;

public enum IslandSizer implements ICastleTransformer {
    INSTANCE;

    @Override
    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        if (ClimateBooleans.isOcean(centre)) {
            if (!ClimateBooleans.isOcean(e)) {
                return (rand.random(3) == 1) ? n : e;
            } else if (!ClimateBooleans.isOcean(w)) {
                return (rand.random(3) == 1) ? e : w;
            } else if (!ClimateBooleans.isOcean(s)) {
                return (rand.random(3) == 1) ? w : s;
            } else if (!ClimateBooleans.isOcean(n)) {
                return (rand.random(3) == 1) ? s : n;
            }
        }
        return centre;
    }
}