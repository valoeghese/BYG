package sporeaoc.byg;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sporeaoc.byg.catalogs.ItemCatalogs;
import sporeaoc.byg.config.ConfigManager;
import sporeaoc.byg.modsetup.ModSetup;

@Mod("byg")
public class BYG {
    public static final Logger LOGGER = LogManager.getLogger();

    public static final String MODID = "byg";

    public static ModSetup setup = new ModSetup();

    public static ItemGroup creativetab = new ItemGroup("byg") {

        @Override public ItemStack createIcon() {
            return new ItemStack(ItemCatalogs.BLACK_PUFF);
        }
    };
    public BYG() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(setup::init);

        ConfigManager.LoadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(MODID + "-common.toml"));
    }

}