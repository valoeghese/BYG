package sporeaoc.byg;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sporeaoc.byg.ModSetup.ModSetup;
import sporeaoc.byg.config.ConfigManager;

@Mod("byg")
public class BYG {
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "byg";

    public static ModSetup setup = new ModSetup();

    public BYG() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(setup::init);

        ConfigManager.LoadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-common.toml"));
    }
}

