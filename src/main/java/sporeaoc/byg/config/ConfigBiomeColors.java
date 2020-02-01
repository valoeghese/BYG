package sporeaoc.byg.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigBiomeColors {
    private String name;
    private int grassColor;
    private int waterColor;
    private int waterFogColor;
    private boolean enableAdvancedBiomeColorSettings = false;

    private ForgeConfigSpec.IntValue configGrassColor;
    private ForgeConfigSpec.IntValue configWaterColor;
    private ForgeConfigSpec.IntValue configWaterFogColor;
    private ForgeConfigSpec.BooleanValue configBiomeColorSetting;

    public ConfigBiomeColors(String name, int grassColor, int waterColor, int waterFogColor) {
        this.name = name;
        this.grassColor = grassColor;
        this.waterColor = waterColor;
        this.waterFogColor = waterFogColor;
    }


    public String getName() {
        return name;
    }

    public int getGrassColor() {
        return configGrassColor.get();
    }

    public int getWaterColor() {
        return configWaterColor.get();
    }

    public boolean getBiomeColorSetting() {return configBiomeColorSetting.get(); }

    public void apply(ForgeConfigSpec.Builder builder) {
        configBiomeColorSetting = builder.comment("ADVANCED SETTINGS! \nEnabling will allow custom biome colors in every biome \nDefault: false").define("setting", enableAdvancedBiomeColorSettings);

        builder.comment(name + " biome colors").push(name + "_biome");
        configGrassColor = builder.comment("color of the grass.").defineInRange("grass color", grassColor, 0, 999999999);
        configWaterColor = builder.comment("color of the water").defineInRange("water color", waterColor, 0, 999999999);
        configWaterFogColor = builder.comment("color of the water fog").defineInRange("water fog color", waterFogColor, 0, 999999999);
        builder.pop();
    }
}
