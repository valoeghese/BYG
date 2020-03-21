package sporeaoc.byg;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sporeaoc.byg.byglists.BYGItemList;
import sporeaoc.byg.bygproperties.vanillaproperties.BYGCompostables;
import sporeaoc.byg.bygproperties.vanillaproperties.BYGFlammables;
import sporeaoc.byg.bygproperties.vanillaproperties.BYGStrippables;
import sporeaoc.byg.config.BYGConfig;
import sporeaoc.byg.config.biomeweight.ConfigWeightManager;
import sporeaoc.byg.textures.renders.BYGCutoutRenders;
import sporeaoc.byg.world.feature.BYGFeaturesInVanilla;

@Mod("byg")
public class BYG {
    public static final String MOD_ID = "byg";
    public static Logger LOGGER = LogManager.getLogger();

    public BYG() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        //FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup2);
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(BlockColorManager::onBlockColorsInit);
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(BlockColorManager::onItemColorsInit);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(bygFeaturesInVanilla::addFeatures);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(cutoutRenders::renderCutOuts);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(strippablesBYG::strippableLogsBYG);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(flammablesBYG::flammableBlocksBYG);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(compostablesBYG::compostableBlocksBYG);
        //Configs
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BYGConfig.COMMON_CONFIG);
        ConfigWeightManager.LoadConfig(ConfigWeightManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-weights-common.toml"));

    }

    private void setup(FMLCommonSetupEvent event) {
        setup.init();
    }
//    private void setup2(FMLClientSetupEvent event) {
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(BlockColorManager::onBlockColorsInit);
//        FMLJavaModLoadingContext.get().getModEventBus().addListener(BlockColorManager::onItemColorsInit);
//    }

    public static class Init {
        public static ItemGroup creativeTab = new ItemGroup("byg") {
            @Override
            public ItemStack createIcon() {
                return new ItemStack(BYGItemList.BYG_LOGO);
            }
        };

        public void init() {
        }
    }
    //public static final WorldType BYGISLANDTYPE = new BYGIslandWorldType();
    public static final Init setup = new Init();
    public static final BYGCutoutRenders cutoutRenders = new BYGCutoutRenders();
    public static final BYGFeaturesInVanilla bygFeaturesInVanilla = new BYGFeaturesInVanilla();
    public static final BYGStrippables strippablesBYG = new BYGStrippables();
    public static final BYGFlammables flammablesBYG = new BYGFlammables();
    public static final BYGCompostables compostablesBYG = new BYGCompostables();
}