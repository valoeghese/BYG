package sporeaoc.byg.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import sporeaoc.byg.BYG;

import java.nio.file.Path;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGWorldTypesConfig {
    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    public static ForgeConfigSpec COMMON_CONFIG;

    public static ForgeConfigSpec.IntValue islandsize;
    public static ForgeConfigSpec.IntValue islandChance;
    public static ForgeConfigSpec.ConfigValue<String> spawnBiome;
    public static ForgeConfigSpec.BooleanValue beaches;
    public static ForgeConfigSpec.BooleanValue survivalIslandMode;
    public static ForgeConfigSpec.IntValue oceanBiomeSize;


    static {
        COMMON_BUILDER.comment("Island Configuration powered by Survival Island Generator, FoundSpore's Mod.\nhttps://www.curseforge.com/minecraft/mc-mods/survival-island-generator").push("Islands_Settings");
        islandsize = COMMON_BUILDER.comment("The average size of all islands & oceans.\nOcean size increases with this too resulting in fewer islands.\nEach Size increase is exponential.\nDefault is 2").defineInRange("IslandSize", 3, 0, 30);
        islandChance = COMMON_BUILDER.comment("The chance at which islands spawn. Lower Values increase the frequency.\nDefault chance is 10.").defineInRange("IslandChance", 10, 0, 1000000000);
        spawnBiome = COMMON_BUILDER.comment("The spawn island's biome at which you spawn.\nMUST MATCH BIOME NAME/CASE IN F3.\nModded biomes work too!\nDefault is `minecraft:forest`").define("SpawnIslandBiome", "minecraft:forest");
        beaches = COMMON_BUILDER.comment("Decide whether or not islands have beaches\ndefault is true").define("Beaches", true);
        survivalIslandMode = COMMON_BUILDER.comment("Setting this to true will ONLY generate the spawn island.\nDO NOT USE `/locate` OR IT WILL CRASH YOUR GAME IN THIS MODE!\n Default is false.").define("SurvivalIslandMode", false);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("Ocean_Settings");
        oceanBiomeSize = COMMON_BUILDER.comment("The size of ocean biomes/regions.\nEach size increase is exponential.\nDefault is 4").defineInRange("OceanBiomeSize", 4, 1, 30);
        COMMON_BUILDER.pop();
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void loadConfig(ForgeConfigSpec config, Path path) {
        BYG.LOGGER.info("Loading config: " + path);
        CommentedFileConfig file = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        file.load();
        config.setConfig(file);
    }

    @SubscribeEvent
    public static void onLoad(final ModConfig.Loading configEvent) {

    }
}
