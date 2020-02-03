//package sporeaoc.byg.config.oregen;
//
//import net.minecraftforge.common.ForgeConfigSpec;
//
//public class ConfigOreGeneration {
//    private String ore;
//    private int size;
//    private int chance;
//    private int maxY;
//
//    private ForgeConfigSpec.IntValue configOreSize;
//    private ForgeConfigSpec.IntValue configSpawnChance;
//    private ForgeConfigSpec.IntValue configMaxYAltitude;
//
//
//    public ConfigOreGeneration(String ore, int size, int chance, int maxY)  {
//        this.ore = ore;
//        this.size = size;
//        this.chance = chance;
//        this.maxY = maxY;
//    }
//
//
//    public String getName() {
//        return ore;
//    }
//
//    public int getOreSize() {
//        return configOreSize.get();
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
//        builder.comment(ore + "ore generation").push(ore);
//        configOreSize = builder.comment("ore size").defineInRange("ore size", size, 0, 256);
//        configSpawnChance = builder.comment("spawn chance").defineInRange("spawn chance", chance, 0, 256);
//        configSpawnChance = builder.comment("spawn chance").defineInRange("max y-axis altitude", maxY, 0, 256);
//        builder.pop();
//    }
//}
//
