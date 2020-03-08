package sporeaoc.byg.config.orestones;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import sporeaoc.byg.BYG;

import java.nio.file.Path;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OreStoneConfig {
    private static final ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
    public static ForgeConfigSpec COMMON_CONFIG;

    //public static ForgeConfigSpec.BooleanValue AmplifiedBiomes;

    public static ForgeConfigSpec.IntValue lathariumOreSize;
    public static ForgeConfigSpec.IntValue LathariumOreChance;
    public static ForgeConfigSpec.IntValue LathariumOreMaxY;
   // public static ForgeConfigSpec.IntValue LathariumOreMinY;

    public static ForgeConfigSpec.IntValue PendoriteOreSize;
    public static ForgeConfigSpec.IntValue PendoriteOreChance;
    public static ForgeConfigSpec.IntValue PendoriteOreMaxY;
   // public static ForgeConfigSpec.IntValue PendoriteOreMinY;

    public static ForgeConfigSpec.IntValue TamreliteOreSize;
    public static ForgeConfigSpec.IntValue TamreliteOreChance;
    public static ForgeConfigSpec.IntValue TamreliteOreMaxY;
    //public static ForgeConfigSpec.IntValue TamreliteOreMinY;


    public static ForgeConfigSpec.IntValue DaciteSize;
    public static ForgeConfigSpec.IntValue DaciteChance;
    public static ForgeConfigSpec.IntValue DaciteMaxY;
   // public static ForgeConfigSpec.IntValue DaciteMinY;

    public static ForgeConfigSpec.IntValue RockyStoneSize;
    public static ForgeConfigSpec.IntValue RockyStoneChance;
    public static ForgeConfigSpec.IntValue RockyStoneMaxY;
   // public static ForgeConfigSpec.IntValue RockyStoneMinY;

    public static ForgeConfigSpec.IntValue ScoriaStoneSize;
    public static ForgeConfigSpec.IntValue ScoriaStoneChance;
    public static ForgeConfigSpec.IntValue ScoriaStoneMaxY;
   // public static ForgeConfigSpec.IntValue ScoriaStoneMinY;

    public static ForgeConfigSpec.IntValue SoapStoneSize;
    public static ForgeConfigSpec.IntValue SoapStoneChance;
    public static ForgeConfigSpec.IntValue SoapStoneMaxY;
    //public static ForgeConfigSpec.IntValue SoapStoneMinY;
    public static ForgeConfigSpec.BooleanValue EESupport;


    static {
        COMMON_BUILDER.comment("BYG Config").push("Biome Settings");
        //AmplifiedBiomes = COMMON_BUILDER.define("AmplifiedBiomes", false);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("Ores");
        COMMON_BUILDER.push("LathariumOre");
        lathariumOreSize = COMMON_BUILDER.defineInRange("LathariumSize", 4, 1, 100);
        LathariumOreChance = COMMON_BUILDER.defineInRange("LathariumChance", 4, 1, 100);
        LathariumOreMaxY = COMMON_BUILDER.defineInRange("LathariumMaxY", 32, 1, 256);
        // LathariumOreMinY = COMMON_BUILDER.defineInRange("LathariumMinY", 12, 1, 256);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("PendoriteOre");
        PendoriteOreSize = COMMON_BUILDER.defineInRange("PendoriteSize", 4, 1, 100);
        PendoriteOreChance = COMMON_BUILDER.defineInRange("PendoriteChance", 4, 1, 100);
        PendoriteOreMaxY = COMMON_BUILDER.defineInRange("PendoriteMaxY", 32, 1, 256);
        //  PendoriteOreMinY = COMMON_BUILDER.defineInRange("PendoriteMinY", 12, 1, 256);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("TamreliteOre");
        TamreliteOreSize = COMMON_BUILDER.defineInRange("TamreliteSize", 4, 1, 100);
        TamreliteOreChance = COMMON_BUILDER.defineInRange("TamreliteChance", 4, 1, 100);
        TamreliteOreMaxY = COMMON_BUILDER.defineInRange("TamreliteMaxY", 32, 1, 256);
        //  TamreliteOreMinY = COMMON_BUILDER.defineInRange("TamreliteMinY", 12, 1, 256);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("Stones");
        COMMON_BUILDER.push("DaciteStone");
        DaciteSize = COMMON_BUILDER.defineInRange("DaciteSize", 12, 1, 100);
        DaciteChance = COMMON_BUILDER.defineInRange("DaciteChance", 4, 1, 100);
        DaciteMaxY = COMMON_BUILDER.defineInRange("DaciteMaxY", 256, 1, 256);
        //  DaciteMinY = COMMON_BUILDER.defineInRange("DaciteMinY", 1, 1, 256);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("RockyStone");
        RockyStoneSize = COMMON_BUILDER.defineInRange("RockyStoneSize", 12, 1, 100);
        RockyStoneChance = COMMON_BUILDER.defineInRange("RockyStoneChance", 4, 1, 100);
        RockyStoneMaxY = COMMON_BUILDER.defineInRange("RockyStoneMaxY", 256, 1, 256);
        // RockyStoneMinY = COMMON_BUILDER.defineInRange("RockyStoneMinY", 1, 1, 256);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("ScoriaStone");
        ScoriaStoneSize = COMMON_BUILDER.defineInRange("ScoriaStoneSize", 12, 1, 100);
        ScoriaStoneChance = COMMON_BUILDER.defineInRange("ScoriaStoneChance", 4, 1, 100);
        ScoriaStoneMaxY = COMMON_BUILDER.defineInRange("ScoriaStoneMaxY", 256, 1, 256);
        //ScoriaStoneMinY = COMMON_BUILDER.defineInRange("ScoriaStoneMinY", 1, 1, 256);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.push("SoapStone");
        SoapStoneSize = COMMON_BUILDER.defineInRange("SoapStoneSize", 12, 1, 100);
        SoapStoneChance = COMMON_BUILDER.defineInRange("SoapStoneChance", 4, 1, 100);
        SoapStoneMaxY = COMMON_BUILDER.defineInRange("SoapStoneMaxY", 256, 1, 256);
        // SoapStoneMinY = COMMON_BUILDER.defineInRange("SoapStoneMinY", 1, 1, 256);
        COMMON_BUILDER.pop();
        COMMON_BUILDER.pop();
        COMMON_BUILDER.comment("BYG Config").push("EE Settings");
        EESupport = COMMON_BUILDER.comment("Support for the mod Entombed Ecosystems(https://www.curseforge.com/minecraft/mc-mods/entombed-ecosystems)\nDoes Nothing if EE is not present.Z").define("EESupport", true);

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
