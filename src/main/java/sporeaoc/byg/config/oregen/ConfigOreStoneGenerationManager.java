package sporeaoc.byg.config.oregen;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ConfigOreStoneGenerationManager {
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
        ORES.forEach(o -> o.apply(COMMON_BUILDER));
        COMMON_CONFIG = COMMON_BUILDER.build();
    }
    static {
        STONES.forEach(o -> o.apply(COMMON_BUILDER));
        COMMON_CONFIG = COMMON_BUILDER.build();
    }

    public static void LoadConfig2(ForgeConfigSpec spec2, Path path2) {
        CommentedFileConfig configData2 = CommentedFileConfig.builder(path2).sync().autosave().writingMode(WritingMode.REPLACE).build();
        configData2.load();
        spec2.setConfig(configData2);
    }
}
