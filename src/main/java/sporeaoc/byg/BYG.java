package sporeaoc.byg;

import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sporeaoc.byg.config.BYGConfig;
import sporeaoc.byg.config.biomeweight.ConfigWeightManager;

@Mod("byg")
public class BYG {
    public static Logger LOGGER = LogManager.getLogger();

    //public static final WorldType BYGISLANDTYPE = new BYGIslandWorldType();


    public static final String MOD_ID = "byg";

    public BYG() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(EntombedEcosystems.BYGEETreeAdd::init);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BYGConfig.COMMON_CONFIG);
        ConfigWeightManager.LoadConfig(ConfigWeightManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-weights-common.toml"));
    }

//    public static class Init {
//        public static ItemGroup creativeTab = new ItemGroup("byg") {
//            @Override
//            public ItemStack createIcon() {
//                return new ItemStack(ItemCatalogs.BYG_LOGO);
//            }
//        };
//
//        public void init() {
//        }
//    }

    private void setup( FMLCommonSetupEvent event) {
        //setup.init();
    }
}