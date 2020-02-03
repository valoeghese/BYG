package sporeaoc.byg;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sporeaoc.byg.catalogs.ItemCatalogs;
import sporeaoc.byg.config.oregen.ConfigOreStoneGenerationManager;
import sporeaoc.byg.config.weight.ConfigWeightManager;

@Mod("byg")
public class BYG {
    public static Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "byg";
    public static final Init setup = new Init();

    public BYG() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        ConfigWeightManager.LoadConfig(ConfigWeightManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "weights-common.toml"));
        //ConfigBiomeColorsManager.LoadConfig(ConfigBiomeColorsManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "biome-colors-common.toml"));
        ConfigOreStoneGenerationManager.LoadConfig(ConfigOreStoneGenerationManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "ores-stones-common.toml"));

    }
    public static class Init {
        public static ItemGroup creativeTab = new ItemGroup("byg") {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(ItemCatalogs.BYG_LOGO);
            }
        };

        public void init() {
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();

    }
}