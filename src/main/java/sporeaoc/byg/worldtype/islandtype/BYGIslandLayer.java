package sporeaoc.byg.worldtype.islandtype;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IAreaTransformer0;

public enum BYGIslandLayer implements IAreaTransformer0 {
    INSTANCE;
    //Higher Values make islands less common.
    public int islandRarity = 55;

    @Override
    public int apply(INoiseRandom rand, int genX, int genZ) {
        //Sets Spawn Island
        if (genX == 0 && genZ == 0) {
            return BYGBiomeGetter.getRandonBYGBiomes(rand);
        } else {
            return rand.random(islandRarity) == 1 ? BYGBiomeGetter.getRandonBYGBiomes(rand) : BYGBiomeGetter.DEEPOCEAN;

        }
    }
}
