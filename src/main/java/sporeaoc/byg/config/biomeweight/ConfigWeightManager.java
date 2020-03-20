package sporeaoc.byg.config.biomeweight;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigWeightManager {

    public static List<ConfigWeight> BIOMES = new ArrayList<>();
    public static ConfigWeight allliumfields = new ConfigWeight("allliumfields", 10);
    public static ConfigWeight alps = new ConfigWeight("alps", 10);
    //public static ConfigWeight ancientForest = new ConfigWeight("ancientForest", 10);
    public static ConfigWeight amaranthfields = new ConfigWeight("amaranthfields", 10);
    public static ConfigWeight aspenForest = new ConfigWeight("aspenforest", 10);
    //    public static ConfigWeight baobabsavanna = new ConfigWeight("baoababsavanna", 10);
//    public static ConfigWeight bayou = new ConfigWeight("bayou", 10);
    public static ConfigWeight bluetaiga = new ConfigWeight("bluetaiga", 10);
    //    public static ConfigWeight bluffmountains = new ConfigWeight("bluffmountains", 10);
//    public static ConfigWeight bog = new ConfigWeight("bog", 10);
    public static ConfigWeight borealforest = new ConfigWeight("borealforest", 10);
    //public static ConfigWeight canyons = new ConfigWeight("canyons", 10);
//    public static ConfigWeight cherryblossomforest = new ConfigWeight("cherryblossomforest", 10);
//    public static ConfigWeight chapparalcoastals = new ConfigWeight("chapparalcoastals", 10);
//    public static ConfigWeight coastalredwoodtropics = new ConfigWeight("coastalredwoodtropics", 10);
    public static ConfigWeight coniferousforest = new ConfigWeight("dovermountains", 10);
    public static ConfigWeight deciduousforest = new ConfigWeight("deciduousforest", 10);
    public static ConfigWeight dovermountains = new ConfigWeight("snowybluetaiga", 10);
    public static ConfigWeight dunes = new ConfigWeight("dunes", 10);
    //    public static ConfigWeight ebonywoods = new ConfigWeight("ebonywoods", 10);
//    public static ConfigWeight enchantedforest = new ConfigWeight("enchantedforest", 10);
    public static ConfigWeight evergreentaiga = new ConfigWeight("evergreentaiga", 10);
    //    public static ConfigWeight floweringplains = new ConfigWeight("floweringplains", 10);
    public static ConfigWeight giantbluetaiga = new ConfigWeight("bluegianttaiga", 10);
    // public static ConfigWeight glowshroombayou = new ConfigWeight("glowshroombayou", 10);
    public static ConfigWeight grasslandplateau = new ConfigWeight("grasslandplateau", 10);
    //public static ConfigWeight greatlakes = new ConfigWeight("greatlakes", 10);
    public static ConfigWeight guianashield = new ConfigWeight("guianashield", 10);
    public static ConfigWeight jacarandaforest = new ConfigWeight("jacarandaforest", 10);
    //    public static ConfigWeight mangrovemarshes = new ConfigWeight("mangrovemarshes", 10);
//    public static ConfigWeight mapletaiga = new ConfigWeight("mapletaiga", 10);
//    public static ConfigWeight marshlands = new ConfigWeight("marshlands", 10);
//    public static ConfigWeight meadow = new ConfigWeight("meadow", 10);
//    public static ConfigWeight orchard = new ConfigWeight("orchard", 10);
//    public static ConfigWeight pinelowlands = new ConfigWeight("pinelowlands", 10);
//    public static ConfigWeight pinemountains = new ConfigWeight("pinemountains", 10);
    public static ConfigWeight prairie = new ConfigWeight("prairie", 10);
    //public static ConfigWeight quagmire = new ConfigWeight("quagmire", 10);
    public static ConfigWeight reddesert = new ConfigWeight("reddesert", 10);
    public static ConfigWeight reddesertdunes = new ConfigWeight("reddesertdunes", 10);
    public static ConfigWeight redoakforest = new ConfigWeight("redoakforest", 10);
    //public static ConfigWeight savannacanopy = new ConfigWeight("savannacanopy", 10);
    public static ConfigWeight seasonaldeciduousforest = new ConfigWeight("seasonsaldeciduousforest", 10);
    public static ConfigWeight seasonalforest = new ConfigWeight("seasonalforest", 10);
    public static ConfigWeight seasonalbirchforest = new ConfigWeight("seasonalbirchforest", 10);
    public static ConfigWeight shrublands = new ConfigWeight("shrublands", 10);
    public static ConfigWeight seasonalgianttaiga = new ConfigWeight("seasonalgianttaiga", 10);
    public static ConfigWeight seasonaltaiga = new ConfigWeight("seasonaltaiga", 10);
    //    public static ConfigWeight skyristhighlands = new ConfigWeight("skyrishighlands", 10);
    public static ConfigWeight snowyconiferousforest = new ConfigWeight("snowyconiferousforest", 10);
    //    public static ConfigWeight snowydeciduousforest = new ConfigWeight("snowydeciduousforest", 10);
//    public static ConfigWeight snowyevergreentaiga = new ConfigWeight("snowyevergreentaiga", 10);
//    public static ConfigWeight snowypinemountains = new ConfigWeight("snowypinemountains", 10);
    public static ConfigWeight snowybluetaiga = new ConfigWeight("snowybluetaiga", 10);
    public static ConfigWeight snowygiantbluetaiga = new ConfigWeight("snowybluegianttaiga", 10);
    //    public static ConfigWeight sonorandesert = new ConfigWeight("sonorandesert", 10);
//    public static ConfigWeight stonebrushlands = new ConfigWeight("stonebrushlands", 10);
    public static ConfigWeight tropicalfungalforest = new ConfigWeight("tropicalfungalforest", 10);
    //    public static ConfigWeight tropicalislands = new ConfigWeight("tropicalfungalforest", 10);
    public static ConfigWeight tropicalrainforest = new ConfigWeight("tropicalrainforest", 10);
    // public static ConfigWeight weepingwitchforest = new ConfigWeight("weepingwitchforest", 10);
    //public static ConfigWeight woodlands = new ConfigWeight("woodlands", 10);
    //public static ConfigWeight zelkovaforest = new ConfigWeight("zelkovaforest", 10);


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
