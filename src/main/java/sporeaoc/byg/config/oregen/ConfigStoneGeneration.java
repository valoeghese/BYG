//package sporeaoc.byg.config.oregen;
//
//import net.minecraftforge.common.ForgeConfigSpec;
//
//public class ConfigStoneGeneration {
//    private String stone;
//    private int size;
//    private int chance;
//    private int maxY;
//
//    private ForgeConfigSpec.IntValue configStoneSize;
//    private ForgeConfigSpec.IntValue configSpawnChance;
//    private ForgeConfigSpec.IntValue configMaxYAltitude;
//
//
//    public ConfigStoneGeneration(String stone, int size, int chance, int maxY)  {
//        this.stone = stone;
//        this.size = size;
//        this.chance = chance;
//        this.maxY = maxY;
//    }
//
//
//    public String getName() {
//        return stone;
//    }
//
//    public int getOreSize() {
//        return configStoneSize.get();
//    }
//
//    public int getSpawnChance() {
//        return configSpawnChance.get();
//    }
//
//    public int getmaxY() {
//        return configMaxYAltitude.get() ;
//    }
//
//
//    public void apply(ForgeConfigSpec.Builder builder) {
//        builder.comment(stone + "stone generation").push(stone);
//        configStoneSize = builder.comment("stone size").defineInRange("stone size", size, 0, 10000);
//        configSpawnChance = builder.comment("spawn chance").defineInRange("spawn chance", chance, 0, 10000);
//        configSpawnChance = builder.comment("spawn chance").defineInRange("max y-axis altitude", maxY, 0, 256);
//        builder.pop();
//    }
//}
//
