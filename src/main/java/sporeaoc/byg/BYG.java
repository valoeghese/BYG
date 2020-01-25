package sporeaoc.byg;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sporeaoc.byg.init.Init;

@Mod("byg")
public class BYG {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "byg";
    public static final Init setup = new Init();

    public BYG() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        // ConfigManager.LoadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-common.toml"));
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
    }
}