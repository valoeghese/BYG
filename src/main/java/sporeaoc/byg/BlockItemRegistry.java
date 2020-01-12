package sporeaoc.byg;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import sporeaoc.byg.blocks.LeaveBlocks;

@Mod.EventBusSubscriber(modid = BYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockItemRegistry {

    @SubscribeEvent
    public static void bygRegisterBlocks(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        //LeaveBlocks
        LeaveBlocks.BAOBAB_LEAVES
                BLOOMING_WITCH_HAZEL_LEAVES
        BLUE_ENCHANTED_LEAVES
                BLUE_SPRUCE_LEAVES
        BROWN_BIRCH_LEAVES
                BROWN_OAK_LEAVES
        CIKA_LEAVES
                CYPRESS_LEAVES
        EBONY_LEAVES
                FIR_LEAVES
        FLOWERING_ORCHARD_LEAVES
                FLOWERING_PALO_VERDE_LEAVES
        APPLE_SKYRIS_LEAVES
                GREEN_ENCHANTED_LEAVES
        HOLLY_BETTER_LEAVES
                HOLLY_LEAVES
        JACARANDA_LEAVES
                MAHOGNY_LEAVES
        MANGROVE_LEAVES
                ORANGE_BIRCH_LEAVES
        ORANGE_OAK_LEAVES
                ORANGE_SPRUCE_LEAVES
        ORCHARD_LEAVES
                PALO_VERDE_LEAVES
        PINE_lEAVES
                PINK_CHERRY_LEAVES
        RAINBOW_EUCALYPTUS_LEAVES
                RED_BIRCH_LEAVES
        RED_MAPLE_LEAVES
                RED_OAK_LEAVES
        RED_SPRUCE_LEAVES
                REDWOOD_LEAVES
        RIPE_ORCHARD_LEAVES
                SILVER_MAPLE_LEAVES
        SKYRIS_LEAVES
                WHITE_CHERRY_LEAVES
        WILLOW_LEAVES
                WITCH_HAZEL_LEAVES
        YELLOW_BIRCH_LEAVES

    }

    @SubscribeEvent
    public static void bygRegisterItems(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();


    }
}
