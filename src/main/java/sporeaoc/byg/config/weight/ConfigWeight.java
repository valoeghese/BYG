package sporeaoc.byg.config.weight;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigWeight {
    private String name;
    private int weight;
    private BiomeDictionary.Type[] types;

    private ForgeConfigSpec.IntValue configWeight;

    public ConfigWeight(String name, int weight) /*double scale, double depth)*/ {
        this.name = name;
        this.weight = weight;
        ConfigWeightManager.BIOMES.add(this);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return configWeight.get();
    }

    public boolean shouldSpawn() {
        return configWeight.get() != 0;
    }

    public void apply(ForgeConfigSpec.Builder builder) {
        builder.comment(name + " biome generation").push(name + "_biome");
        configWeight = builder.comment("weight of the biome (set to 0 to disable generation). \ndefault is 10").defineInRange("weight", weight, 0, 256);
        builder.pop();
    }
}
