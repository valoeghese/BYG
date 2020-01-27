package sporeaoc.byg.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigManager {

    public static List<Config> BIOMES = new ArrayList<>();
    public static Config alps = new Config("alps", 10);
    public static Config deciduousforest = new Config("deciduousforest", 10);
    public static Config dunes = new Config("dunes", 10);
    public static Config jacarandaforest = new Config("jacarandaforest", 10);
    public static Config redoakforest = new Config("redoakforest", 10);
    public static Config seasonaldeciduousforest = new Config("seasonsaldeciduousforest", 10);
    public static Config seasonalforest = new Config("seasonalforest", 10);
    public static Config seasonalbirchforest = new Config("seasonalbirchforest", 10);
    public static Config testbiome = new Config("testbiome", 10);

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
