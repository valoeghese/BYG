package sporeaoc.byg.world.worldtypes.islandtype.layers.shore;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.ICastleTransformer;
import sporeaoc.byg.byglists.BYGBiomeList;
import sporeaoc.byg.world.worldtypes.BYGBiomeGetter;
import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;

public enum BYGShoreLayer implements ICastleTransformer {
    INSTANCE;

    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
        Biome biome = Registry.BIOME.getByValue(centre);
        if (centre == BYGBiomeGetter.ALPS) {
            if (ClimateBooleans.isOcean(n) || ClimateBooleans.isOcean(e) || ClimateBooleans.isOcean(s) || ClimateBooleans.isOcean(w)) {
                return BYGBiomeGetter.SNOWYROCKYBLACKBEACH;
            }
        }
        if (centre == BYGBiomeGetter.DOVERMOUNTAINS) {
            if (ClimateBooleans.isOcean(n) || ClimateBooleans.isOcean(e) || ClimateBooleans.isOcean(s) || ClimateBooleans.isOcean(w)) {
                return BYGBiomeGetter.WHITEBEACH;
            }
        }
        if (biome != null && biome.getPrecipitation() == Biome.RainType.SNOW) {
            if (ClimateBooleans.isOcean(n) || ClimateBooleans.isOcean(e) || ClimateBooleans.isOcean(s) || ClimateBooleans.isOcean(w)) {
                return BYGBiomeGetter.SNOWYBLACKBEACH;
            }
        }
        if (biome.getPrecipitation() == Biome.RainType.RAIN && biome != BYGBiomeList.DOVERMOUNTAINS && biome.getCategory() != Biome.Category.OCEAN) {
            if (ClimateBooleans.isOcean(n) || ClimateBooleans.isOcean(e) || ClimateBooleans.isOcean(s) || ClimateBooleans.isOcean(w)) {
                return BYGBiomeGetter.VANILLABEACH;
            }
        }
        return centre;
    }
}