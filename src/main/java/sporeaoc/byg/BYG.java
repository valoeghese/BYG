package sporeaoc.byg;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sporeaoc.byg.modSetup.ModSetup;
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

   /* @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {

        @SubscribeEvent
        public static void bygRegisterBlocks(final RegistryEvent.Register<Block> event)
        {
            LeaveBlocks.BAOBAB_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("baobab_leaves"));

        }
        @SubscribeEvent
        public static void bygRegisterItems(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll();
            LeaveItems.APPLE_SKYRIS_LEAVES = new BlockItem(LeaveBlocks.APPLE_SKYRIS_LEAVES, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(LeaveBlocks.APPLE_SKYRIS_LEAVES.getRegistryName());
            LeaveItems.BAOBAB_LEAVES = new BlockItem(LeaveBlocks.BAOBAB_LEAVES, new Item.Properties().group(ItemGroup.DECORATIONS)).setRegistryName(LeaveBlocks.BAOBAB_LEAVES.getRegistryName());
        }    }
    private static ResourceLocation location(String name)
    {
        return new ResourceLocation(BYG.MODID, name);
    }
}
*/
}