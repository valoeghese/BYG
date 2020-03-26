//package sporeaoc.byg.world.worldtypes.islandtype.layers.islandadders;
//
//import net.minecraft.world.gen.INoiseRandom;
//import net.minecraft.world.gen.layer.traits.ICastleTransformer;
//import sporeaoc.byg.config.BYGIslandSettingsConfig;
//import sporeaoc.byg.world.worldtypes.BYGBiomeGetter;
//import sporeaoc.byg.world.worldtypes.islandtype.ClimateBooleans;
//
//public enum  ClimateAssignedIslandAdder implements ICastleTransformer {
//    INSTANCE;
//    public int islandRarity = BYGIslandSettingsConfig.islandChance.get();
//
//    @Override
//    public int apply(INoiseRandom rand, int n, int e, int s, int w, int centre) {
//        if (ClimateBooleans.isOcean(centre)) {
//            if (ClimateBooleans.isWarmOcean(centre)) {
//                return rand.random(islandRarity + 100) == 0 ? BYGBiomeGetter.getHotBiome(rand) : BYGBiomeGetter.DEEP_WARM_OCEAN;
//
//            }
//            if (ClimateBooleans.isLukeWarmOcean(centre)) {
//                return rand.random(islandRarity + 100) == 0 ? BYGBiomeGetter.getTropBiome(rand) : BYGBiomeGetter.DEEP_LUKEWARM_OCEAN;
//
//            }
//            if (ClimateBooleans.isColdFrozenOcean(centre)) {
//                return rand.random(islandRarity + 100) == 0 ? BYGBiomeGetter.getSnowyBiome(rand) : rand.random(10) == 0 ? BYGBiomeGetter.DEEP_FROZEN_OCEAN : BYGBiomeGetter.DEEP_COLD_OCEAN;
//            }
//            if (ClimateBooleans.isBaseOcean(centre)) {
//                return rand.random(islandRarity + 100) == 0 ? BYGBiomeGetter.getNormalBiome(rand) : BYGBiomeGetter.DEEP_OCEAN;
//            }
//        }
//        return centre;
//    }
//
//}
