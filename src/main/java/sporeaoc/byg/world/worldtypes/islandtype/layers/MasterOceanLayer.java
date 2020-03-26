package sporeaoc.byg.world.worldtypes.islandtype.layers;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IAreaTransformer0;
import sporeaoc.byg.world.worldtypes.BYGBiomeGetter;

public enum MasterOceanLayer implements IAreaTransformer0 {
    INSTANCE;

    @Override
    public int apply(INoiseRandom rand, int genX, int genZ) {
        return BYGBiomeGetter.getDeepOcean(rand);
    }
}