package sporeaoc.byg.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigManager {

    public static List<Config> BIOMES = new ArrayList<>();
    //public static Config amplifiedbamboojungle = new Config("amplifiedbamboojungle", 3);
    public static Config alps = new Config("alps", 3);
    //public static Config bluetaiga = new Config("amplifiedbamboojungle", 3);
    //public static Config canyons = new Config("canyons", 3);
    public static Config deciduousforest = new Config("deciduousforest", 100);
    public static Config seasonaldeciduousforest = new Config("seasonsaldeciduousforest", 100);


    public static Config dunes = new Config("dunes", 3);
    /*public static Config giantbluesprucetaiga = new Config("amplifiedbamboojungle", 3);
    public static Config giantseasonalsprucetaiga = new Config("amplifiedbamboojungle", 3);
    public static Config jacarandaforest = new Config("amplifiedbamboojungle", 3);
    public static Config jacarandaforesthills = new Config("amplifiedbamboojungle", 3);*/
   // public static Config prairie = new Config("amplifiedbamboojungle", 3);
    /*public static Config redoakforest = new Config("amplifiedbamboojungle", 3);
    public static Config redoakforesthills = new Config("amplifiedbamboojungle", 3);
    public static Config seasonalforest = new Config("amplifiedbamboojungle", 3);
    public static Config seasonalforesthills = new Config("amplifiedbamboojungle", 3);
    public static Config seasonaltaiga = new Config("amplifiedbamboojungle", 3);*/
    /*public static Config amplifiedbamboojungle = new Config("amplifiedbamboojungle", 3);
    public static Config amplifiedbamboojungle = new Config("amplifiedbamboojungle", 3);
    public static Config amplifiedbamboojungle = new Config("amplifiedbamboojungle", 3);
    public static Config amplifiedbamboojungle = new Config("amplifiedbamboojungle", 3);*/

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
