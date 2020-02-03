package sporeaoc.byg.config.biomecolors;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigBiomeColorsManager {

    public static List<ConfigBiomeColors> BIOMECOLORS = new ArrayList<>();
    public static ConfigBiomeColors alps = new ConfigBiomeColors("alps", 10, 0, 0);
    public static ConfigBiomeColors deciduousforest = new ConfigBiomeColors("deciduousforest", 10, 0, 0);
    public static ConfigBiomeColors dunes = new ConfigBiomeColors("dunes", 10, 0, 0);
    public static ConfigBiomeColors jacarandaforest = new ConfigBiomeColors("jacarandaforest", 10, 0, 0);
    public static ConfigBiomeColors redoakforest = new ConfigBiomeColors("redoakforest", 10, 0 , 0);
    public static ConfigBiomeColors seasonaldeciduousforest = new ConfigBiomeColors("seasonsaldeciduousforest", 10, 0, 0);
    public static ConfigBiomeColors seasonalforest = new ConfigBiomeColors("seasonalforest", 10, 0, 0);
    public static ConfigBiomeColors seasonalbirchforest = new ConfigBiomeColors("seasonalbirchforest", 10, 0, 0);
    //public static ConfigBiomeColors testbiome = new ConfigBiomeColors("testbiome", 10);
    public static ConfigBiomeColors seasonaltaiga = new ConfigBiomeColors("seasonaltaiga", 10, 0, 0);
    public static ConfigBiomeColors giantbluetaiga = new ConfigBiomeColors("giantbluetaiga", 10, 0, 0);
    public static ConfigBiomeColors bluetaiga = new ConfigBiomeColors("bluetaiga", 10, 0, 0);



    public static ForgeConfigSpec COMMON_CONFIG;
    private static ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();

    static {
        BIOMECOLORS.forEach(o -> o.apply(COMMON_BUILDER));
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void LoadConfig(ForgeConfigSpec spec, Path path) {
        CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().autosave().writingMode(WritingMode.REPLACE).build();
        configData.load();
        spec.setConfig(configData);
    }
}
