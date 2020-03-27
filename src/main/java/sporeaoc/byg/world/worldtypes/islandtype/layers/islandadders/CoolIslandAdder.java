package sporeaoc.byg.world.worldtypes.islandtype.layers.islandadders;

import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.config.BYGWorldTypesConfig;
import sporeaoc.byg.world.worldtypes.BYGBiomeGetter;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;


public enum CoolIslandAdder implements ICastleTransformer {
    INSTANCE;
    public int islandRarity = BYGWorldTypesConfig.islandChance.get();

    @Override
    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        if (ClimateBooleans.isColdOcean(centre)) {
            return rand.random(islandRarity + 100) == 0 ? BYGBiomeGetter.getCoolBiome(rand) : BYGBiomeGetter.DEEP_COLD_OCEAN;
        }
        return centre;
    }
}
