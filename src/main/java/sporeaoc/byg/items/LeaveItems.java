package sporeaoc.byg.items;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ObjectHolder;
import sporeaoc.byg.BYG;
import sporeaoc.byg.ModSetup.ModSetup;
import sporeaoc.byg.block.LeaveBlocks;

import java.util.Objects;

public class LeaveItems {
    public static Item BAOBAB_LEAVES;
    public static Item BLOOMING_WITCH_HAZEL_LEAVES;
    public static Item BLUE_ENCHANTED_LEAVES;
    public static Item BLUE_SPRUCE_LEAVES;
    public static Item BROWN_BIRCH_LEAVES;
    public static Item BROWN_OAK_LEAVES;
    public static Item CIKA_LEAVES;
    public static Item CYPRESS_LEAVES;
    public static Item EBONY_LEAVES;
    public static Item FIR_LEAVES;
    public static Item FLOWERING_ORCHARD_LEAVES;
    public static Item FLOWERING_PALO_VERDE_LEAVES;
    public static Item APPLE_SKYRIS_LEAVES;
    public static Item GREEN_ENCHANTED_LEAVES;
    public static Item HOLLY_BETTER_LEAVES;
    public static Item HOLLY_LEAVES;
    public static Item JACARANDA_LEAVES;
    public static Item MAHOGNY_LEAVES;
    public static Item MANGROVE_LEAVES;
    public static Item ORANGE_BIRCH_LEAVES;
    public static Item ORANGE_OAK_LEAVES;
    public static Item ORANGE_SPRUCE_LEAVES;
    public static Item ORCHARD_LEAVES;
    public static Item PALO_VERDE_LEAVES;
    public static Item PINE_lEAVES;
    public static Item PINK_CHERRY_LEAVES;
    public static Item RAINBOW_EUCALYPTUS_LEAVES;
    public static Item RED_BIRCH_LEAVES;
    public static Item RED_MAPLE_LEAVES;
    public static Item RED_OAK_LEAVES;
    public static Item RED_SPRUCE_LEAVES;
    public static Item REDWOOD_LEAVES;
    public static Item RIPE_ORCHARD_LEAVES;
    public static Item SILVER_MAPLE_LEAVES;
    public static Item SKYRIS_LEAVES;
    public static Item WHITE_CHERRY_LEAVES;
    public static Item WILLOW_LEAVES;
    public static Item WITCH_HAZEL_LEAVES;
    public static Item YELLOW_BIRCH_LEAVES;

    public static class AppleSkyrisLeaves extends Item {
        public AppleSkyrisLeaves() {
            super(new Item.Properties()
                    .group(ModSetup.itemGroup)
            );
            setRegistryName(Objects.requireNonNull(LeaveBlocks.APPLE_SKYRIS_LEAVES.getRegistryName()));
        }
    }

    public static class BaobaLeaves extends Item {
        public BaobaLeaves() {
            super(new Item.Properties()
                    .group(ModSetup.itemGroup)
            );
            setRegistryName(Objects.requireNonNull(LeaveBlocks.BAOBAB_LEAVES.getRegistryName()));
        }
    }
}
