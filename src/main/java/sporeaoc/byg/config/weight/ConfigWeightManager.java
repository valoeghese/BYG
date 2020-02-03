package sporeaoc.byg.config.weight;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import sporeaoc.byg.config.oregen.ConfigOreGeneration;
import sporeaoc.byg.config.oregen.ConfigStoneGeneration;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigWeightManager {

    public static List<ConfigWeight> BIOMES = new ArrayList<>();
    public static ConfigWeight allliumfields = new ConfigWeight("allliumfields", 10);
    public static ConfigWeight alps = new ConfigWeight("alps", 10);
    public static ConfigWeight amaranthfields = new ConfigWeight("amaranthfields", 10);
    public static ConfigWeight borealforest = new ConfigWeight("borealforest", 10);
    public static ConfigWeight deciduousforest = new ConfigWeight("deciduousforest", 10);
    public static ConfigWeight dunes = new ConfigWeight("dunes", 10);
    public static ConfigWeight grasslandplateau = new ConfigWeight("grasslandplateau", 10);
    public static ConfigWeight jacarandaforest = new ConfigWeight("jacarandaforest", 10);
    public static ConfigWeight prairie = new ConfigWeight("prairie", 10);
    public static ConfigWeight quagmire = new ConfigWeight("quagmire", 10);
    public static ConfigWeight reddesert = new ConfigWeight("reddesert", 10);
    public static ConfigWeight reddesertdunes = new ConfigWeight("reddesertdunes", 10);
    public static ConfigWeight redoakforest = new ConfigWeight("redoakforest", 10);
    public static ConfigWeight seasonaldeciduousforest = new ConfigWeight("seasonsaldeciduousforest", 10);
    public static ConfigWeight seasonalforest = new ConfigWeight("seasonalforest", 10);
    public static ConfigWeight seasonalbirchforest = new ConfigWeight("seasonalbirchforest", 10);
    public static ConfigWeight shrublands = new ConfigWeight("shrublands", 10);
    //public static ConfigBiomeColors testbiome = new ConfigBiomeColors("testbiome", 10);
    public static ConfigWeight seasonalgianttaiga = new ConfigWeight("seasonalgianttaiga", 10);
    public static ConfigWeight seasonaltaiga = new ConfigWeight("seasonaltaiga", 10);
    public static ConfigWeight giantbluetaiga = new ConfigWeight("bluegianttaiga", 10);
    public static ConfigWeight bluetaiga = new ConfigWeight("bluetaiga", 10);
    public static ConfigWeight snowybluetaiga = new ConfigWeight("snowybluetaiga", 10);
    public static ConfigWeight snowygiantbluetaiga = new ConfigWeight("snowybluegianttaiga", 10);


    public static List<ConfigOreGeneration> ORES = new ArrayList<>();
    public static ConfigOreGeneration LATHARIUM_ORE = new ConfigOreGeneration("latharium ore", 8, 4, 32);
    public static ConfigOreGeneration TAMRELITE_ORE = new ConfigOreGeneration("tamrelite ore", 8, 4, 32);
    public static ConfigOreGeneration PENDORITE_ORE = new ConfigOreGeneration("pendorite ore", 8, 4, 32);

    public static List<ConfigStoneGeneration> STONES = new ArrayList<>();
    public static ConfigStoneGeneration DACITE_STONE = new ConfigStoneGeneration("dacite", 25, 10, 256);
    public static ConfigStoneGeneration ROCKY_STONE = new ConfigStoneGeneration("rocky stone", 25, 10, 256);
    public static ConfigStoneGeneration SCORIA_STONE = new ConfigStoneGeneration("dacite", 25, 10, 256);
    public static ConfigStoneGeneration SOAPSTONE = new ConfigStoneGeneration("dacite", 25, 10, 256);




    public static ForgeConfigSpec COMMON_CONFIG;
    private static ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    static {
        BIOMES.forEach(o -> o.apply(COMMON_BUILDER));
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void LoadConfig(ForgeConfigSpec spec, Path path) {
        CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        configData.load();
        spec.setConfig(configData);
    }
}
