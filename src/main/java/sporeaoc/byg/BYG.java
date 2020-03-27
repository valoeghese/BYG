package sporeaoc.byg;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.world.WorldType;
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
import sporeaoc.byg.config.BYGWorldTypesConfig;
import sporeaoc.byg.config.biomeweight.ConfigWeightManager;
import sporeaoc.byg.textures.renders.BYGCutoutRenders;
import sporeaoc.byg.world.feature.BYGFeaturesInVanilla;
import sporeaoc.byg.world.worldtypes.islandtype.IslandWorldType;

@Mod("byg")
public class BYG {
    public static final String MOD_ID = "byg";
    public static Logger LOGGER = LogManager.getLogger();

    public BYG() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(bygFeaturesInVanilla::addFeatures);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(cutoutRenders::renderCutOuts);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(strippablesBYG::strippableLogsBYG);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(flammablesBYG::flammableBlocksBYG);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(compostablesBYG::compostableBlocksBYG);
        //Configs
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, BYGConfig.COMMON_CONFIG);
        ConfigWeightManager.loadConfig(ConfigWeightManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-weights-common.toml"));
        BYGWorldTypesConfig.loadConfig(BYGWorldTypesConfig.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MOD_ID + "-worldtypes-common.toml"));
    }

    private void setup(FMLCommonSetupEvent event) {
        setup.init();
    }


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

    public static final WorldType BYGISLANDTYPE = new IslandWorldType();
    public static final Init setup = new Init();
    public static final BYGCutoutRenders cutoutRenders = new BYGCutoutRenders();
    public static final BYGFeaturesInVanilla bygFeaturesInVanilla = new BYGFeaturesInVanilla();
    public static final BYGStrippables strippablesBYG = new BYGStrippables();
    public static final BYGFlammables flammablesBYG = new BYGFlammables();
    public static final BYGCompostables compostablesBYG = new BYGCompostables();
}