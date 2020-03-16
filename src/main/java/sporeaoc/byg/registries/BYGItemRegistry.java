package sporeaoc.byg.registries;

import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.catalogs.BlockList;
import sporeaoc.byg.catalogs.ItemCatalogs;
import sporeaoc.byg.itemtiers.BYGItemTiers;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGItemRegistry {

    /**
     * TODO: Change implementation of BlockItem and delete redundant class
     *
     * @see ItemCatalogs
     * <p>
     * Block Items are made from the Block, not out of seperate defined Items
     */

    @SubscribeEvent
    public static void bygRegisterItems(RegistryEvent.Register<Item> event) {
        Item.Properties tab = new Item.Properties().group(BYG.Init.creativeTab);

        event.getRegistry().registerAll(
                ItemCatalogs.AMETRINE_AXE = new AxeItem(BYGItemTiers.AMETRINE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_axe"),
                ItemCatalogs.AMETRINE_PICK = new PickaxeItem(BYGItemTiers.AMETRINE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_pickaxe"),
                ItemCatalogs.AMETRINE_SWORD = new SwordItem(BYGItemTiers.AMETRINE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_sword"),
                ItemCatalogs.AMETRINE_BATTLEAXE = new AxeItem(BYGItemTiers.AMETRINE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_battleaxe"),
               // ItemCatalogs.AMETRINE_HELMET = new ArmorItem(BYGArmorTiers.AMETRINE, EquipmentSlotType.HEAD, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_helmet"),
                //ItemCatalogs.AMETRINE_CHEST = new ArmorItem(BYGArmorTiers.AMETRINE, EquipmentSlotType.CHEST, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_chestplate"),
                //ItemCatalogs.AMETRINE_LEGGINGS = new ArmorItem(BYGArmorTiers.AMETRINE, EquipmentSlotType.LEGS, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_leggings"),
                //ItemCatalogs.AMETRINE_BOOTS = new ArmorItem(BYGArmorTiers.AMETRINE, EquipmentSlotType.FEET, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("ametrine_boots"),
                //ItemCatalogs.AMETRINE_SHIELD = new ShieldItem(new Item.Properties().maxDamage(1000).group(ItemGroup.COMBAT)).setRegistryName("ametrine_blue_shields"),

                ItemCatalogs.PENDORITE_AXE = new AxeItem(BYGItemTiers.PENDORITE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_axe"),
                ItemCatalogs.PENDORITE_PICK = new PickaxeItem(BYGItemTiers.PENDORITE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_pickaxe"),
                ItemCatalogs.PENDORITE_SWORD = new SwordItem(BYGItemTiers.PENDORITE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_sword"),
                ItemCatalogs.PENDORITE_BATTLEAXE = new AxeItem(BYGItemTiers.PENDORITE, 3, -2.4F, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_battleaxe"),
                //ItemCatalogs.PENDORITE_HELMET = new ArmorItem(BYGArmorTiers.PENDORITE, EquipmentSlotType.HEAD, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_helmet"),
                //ItemCatalogs.PENDORITE_CHEST = new ArmorItem(BYGArmorTiers.PENDORITE, EquipmentSlotType.CHEST, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_chestplate"),
                //ItemCatalogs.PENDORITE_LEGGINGS = new ArmorItem(BYGArmorTiers.PENDORITE, EquipmentSlotType.LEGS, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_leggings"),
                //ItemCatalogs.PENDORITE_BOOTS = new ArmorItem(BYGArmorTiers.PENDORITE, EquipmentSlotType.FEET, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName("pendorite_boots"),
                //ItemCatalogs.PENDORITE_SHIELD = new ShieldItem(new Item.Properties().maxDamage(1000).group(ItemGroup.COMBAT)).setRegistryName("pendorite_shield"),


                ItemCatalogs.BYG_LOGO = new Item((new Item.Properties())).setRegistryName("byg_logo"),

                ItemCatalogs.AMETRINE_GEMS = new Item(new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("ametrine_gems"),
                ItemCatalogs.PENDORITE_SCRAPS = new Item(new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("pendorite_scraps"),
                ItemCatalogs.BLUE_BERRY = new BlockNamedItem(BlockList.BLUEBERRY_BUSH, new Item.Properties().group(BYG.Init.creativeTab).food(new Food.Builder().hunger(2).saturation(0.1f).build())).setRegistryName("blueberries"),
                ItemCatalogs.HOLLY_BERRY = new Item(new Item.Properties().group(BYG.Init.creativeTab).food(new Food.Builder().hunger(2).saturation(0.1f).build())).setRegistryName("holly_berries"),
                ItemCatalogs.GREEN_APPLE = new Item(new Item.Properties().group(BYG.Init.creativeTab).food(new Food.Builder().hunger(2).saturation(0.1f).build())).setRegistryName("green_apple"),

                ItemCatalogs.BLUE_GLOWCANE_STALK = new BlockNamedItem(BlockList.BLUE_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("blue_glowcane_stalk"),
                ItemCatalogs.RED_GLOWCANE_STALK = new BlockNamedItem(BlockList.RED_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("red_glowcane_stalk"),
                ItemCatalogs.PINK_GLOWCANE_STALK = new BlockNamedItem(BlockList.PINK_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("pink_glowcane_stalk"),
                ItemCatalogs.PURPLE_GLOWCANE_STALK = new BlockNamedItem(BlockList.PURPLE_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("purple_glowcane_stalk"),



                //PlankItems

                ItemCatalogs.ASPEN_PLANKS = new BlockItem(BlockList.ASPEN_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_PLANKS.getRegistryName()),
                ItemCatalogs.BAOBAB_PLANKS = new BlockItem(BlockList.BAOBAB_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_PLANKS.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_PLANKS = new BlockItem(BlockList.BLUE_ENCHANTED_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_PLANKS.getRegistryName()),
                ItemCatalogs.CHERRY_PLANKS = new BlockItem(BlockList.CHERRY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CHERRY_PLANKS.getRegistryName()),
                ItemCatalogs.CIKA_PLANKS = new BlockItem(BlockList.CIKA_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_PLANKS.getRegistryName()),
                ItemCatalogs.CYPRESS_PLANKS = new BlockItem(BlockList.CYPRESS_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_PLANKS.getRegistryName()),
                ItemCatalogs.EBONY_PLANKS = new BlockItem(BlockList.EBONY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_PLANKS.getRegistryName()),
                ItemCatalogs.FIR_PLANKS = new BlockItem(BlockList.FIR_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_PLANKS.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_PLANKS = new BlockItem(BlockList.GREEN_ENCHANTED_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_PLANKS.getRegistryName()),
                ItemCatalogs.HOLLY_PLANKS = new BlockItem(BlockList.HOLLY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_PLANKS.getRegistryName()),
                ItemCatalogs.JACARANDA_PLANKS = new BlockItem(BlockList.JACARANDA_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_PLANKS.getRegistryName()),
                ItemCatalogs.MAHOGANY_PLANKS = new BlockItem(BlockList.MAHOGANY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGANY_PLANKS.getRegistryName()),
                ItemCatalogs.MANGROVE_PLANKS = new BlockItem(BlockList.MANGROVE_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_PLANKS.getRegistryName()),
                ItemCatalogs.MAPLE_PLANKS = new BlockItem(BlockList.MAPLE_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAPLE_PLANKS.getRegistryName()),
                ItemCatalogs.PINE_PLANKS = new BlockItem(BlockList.PINE_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_PLANKS.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_PLANKS = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_PLANKS.getRegistryName()),
                ItemCatalogs.REDWOOD_PLANKS = new BlockItem(BlockList.REDWOOD_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_PLANKS.getRegistryName()),
                ItemCatalogs.SKYRIS_PLANKS = new BlockItem(BlockList.SKYRIS_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_PLANKS.getRegistryName()),
                ItemCatalogs.WILLOW_PLANKS = new BlockItem(BlockList.WILLOW_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_PLANKS.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_PLANKS = new BlockItem(BlockList.WITCH_HAZEL_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_PLANKS.getRegistryName()),
                ItemCatalogs.ZELKOVA_PLANKS = new BlockItem(BlockList.ZELKOVA_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ZELKOVA_PLANKS.getRegistryName()),

                //Bookshelf
                ItemCatalogs.ASPEN_BOOKSHELF = new BlockItem(BlockList.ASPEN_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_BOOKSHELF.getRegistryName()),
                ItemCatalogs.BAOBAB_BOOKSHELF = new BlockItem(BlockList.BAOBAB_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_BOOKSHELF.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_BOOKSHELF = new BlockItem(BlockList.BLUE_ENCHANTED_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_BOOKSHELF.getRegistryName()),
                ItemCatalogs.CHERRY_BOOKSHELF = new BlockItem(BlockList.CHERRY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CHERRY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.CIKA_BOOKSHELF = new BlockItem(BlockList.CIKA_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_BOOKSHELF.getRegistryName()),
                ItemCatalogs.CYPRESS_BOOKSHELF = new BlockItem(BlockList.CYPRESS_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_BOOKSHELF.getRegistryName()),
                ItemCatalogs.EBONY_BOOKSHELF = new BlockItem(BlockList.EBONY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.FIR_BOOKSHELF = new BlockItem(BlockList.FIR_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_BOOKSHELF.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_BOOKSHELF = new BlockItem(BlockList.GREEN_ENCHANTED_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_BOOKSHELF.getRegistryName()),
                ItemCatalogs.HOLLY_BOOKSHELF = new BlockItem(BlockList.HOLLY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.JACARANDA_BOOKSHELF = new BlockItem(BlockList.JACARANDA_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_BOOKSHELF.getRegistryName()),
                ItemCatalogs.MAHOGANY_BOOKSHELF = new BlockItem(BlockList.MAHOGANY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGANY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.MANGROVE_BOOKSHELF = new BlockItem(BlockList.MANGROVE_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_BOOKSHELF.getRegistryName()),
                ItemCatalogs.MAPLE_BOOKSHELF = new BlockItem(BlockList.MAPLE_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAPLE_BOOKSHELF.getRegistryName()),
                ItemCatalogs.PINE_BOOKSHELF = new BlockItem(BlockList.PINE_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_BOOKSHELF.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_BOOKSHELF = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_BOOKSHELF.getRegistryName()),
                ItemCatalogs.REDWOOD_BOOKSHELF = new BlockItem(BlockList.REDWOOD_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_BOOKSHELF.getRegistryName()),
                ItemCatalogs.SKYRIS_BOOKSHELF = new BlockItem(BlockList.SKYRIS_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_BOOKSHELF.getRegistryName()),
                ItemCatalogs.WILLOW_BOOKSHELF = new BlockItem(BlockList.WILLOW_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_BOOKSHELF.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_BOOKSHELF = new BlockItem(BlockList.WITCH_HAZEL_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_BOOKSHELF.getRegistryName()),
                ItemCatalogs.ZELKOVA_BOOKSHELF = new BlockItem(BlockList.ZELKOVA_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ZELKOVA_BOOKSHELF.getRegistryName()),

                //Slabs
                ItemCatalogs.ASPEN_SLAB = new BlockItem(BlockList.ASPEN_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_SLAB.getRegistryName()),
                ItemCatalogs.BAOBAB_SLAB = new BlockItem(BlockList.BAOBAB_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_SLAB.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_SLAB = new BlockItem(BlockList.BLUE_ENCHANTED_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_SLAB.getRegistryName()),
                ItemCatalogs.CHERRY_SLAB = new BlockItem(BlockList.CHERRY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CHERRY_SLAB.getRegistryName()),
                ItemCatalogs.CIKA_SLAB = new BlockItem(BlockList.CIKA_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_SLAB.getRegistryName()),
                ItemCatalogs.CYPRESS_SLAB = new BlockItem(BlockList.CYPRESS_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_SLAB.getRegistryName()),
                ItemCatalogs.EBONY_SLAB = new BlockItem(BlockList.EBONY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_SLAB.getRegistryName()),
                ItemCatalogs.FIR_SLAB = new BlockItem(BlockList.FIR_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_SLAB.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_SLAB = new BlockItem(BlockList.GREEN_ENCHANTED_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_SLAB.getRegistryName()),
                ItemCatalogs.HOLLY_SLAB = new BlockItem(BlockList.HOLLY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_SLAB.getRegistryName()),
                ItemCatalogs.JACARANDA_SLAB = new BlockItem(BlockList.JACARANDA_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_SLAB.getRegistryName()),
                ItemCatalogs.MAHOGANY_SLAB = new BlockItem(BlockList.MAHOGANY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGANY_SLAB.getRegistryName()),
                ItemCatalogs.MANGROVE_SLAB = new BlockItem(BlockList.MANGROVE_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_SLAB.getRegistryName()),
                ItemCatalogs.MAPLE_SLAB = new BlockItem(BlockList.MAPLE_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAPLE_SLAB.getRegistryName()),
                ItemCatalogs.PINE_SLAB = new BlockItem(BlockList.PINE_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_SLAB.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_SLAB = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_SLAB.getRegistryName()),
                ItemCatalogs.REDWOOD_SLAB = new BlockItem(BlockList.REDWOOD_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_SLAB.getRegistryName()),
                ItemCatalogs.SKYRIS_SLAB = new BlockItem(BlockList.SKYRIS_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_SLAB.getRegistryName()),
                ItemCatalogs.WILLOW_SLAB = new BlockItem(BlockList.WILLOW_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_SLAB.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_SLAB = new BlockItem(BlockList.WITCH_HAZEL_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_SLAB.getRegistryName()),
                ItemCatalogs.ZELKOVA_SLAB = new BlockItem(BlockList.ZELKOVA_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ZELKOVA_SLAB.getRegistryName()),

                //Stairs
                ItemCatalogs.ASPEN_STAIRS = new BlockItem(BlockList.ASPEN_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_STAIRS.getRegistryName()),
                ItemCatalogs.BAOBAB_STAIRS = new BlockItem(BlockList.BAOBAB_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_STAIRS.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_STAIRS = new BlockItem(BlockList.BLUE_ENCHANTED_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_STAIRS.getRegistryName()),
                ItemCatalogs.CHERRY_STAIRS = new BlockItem(BlockList.CHERRY_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CHERRY_STAIRS.getRegistryName()),
                ItemCatalogs.CIKA_STAIRS = new BlockItem(BlockList.CIKA_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_STAIRS.getRegistryName()),
                ItemCatalogs.CYPRESS_STAIRS = new BlockItem(BlockList.CYPRESS_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_STAIRS.getRegistryName()),
                ItemCatalogs.EBONY_STAIRS = new BlockItem(BlockList.EBONY_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_STAIRS.getRegistryName()),
                ItemCatalogs.FIR_STAIRS = new BlockItem(BlockList.FIR_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_STAIRS.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_STAIRS = new BlockItem(BlockList.GREEN_ENCHANTED_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_STAIRS.getRegistryName()),
                ItemCatalogs.HOLLY_STAIRS = new BlockItem(BlockList.HOLLY_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_STAIRS.getRegistryName()),
                ItemCatalogs.JACARANDA_STAIRS = new BlockItem(BlockList.JACARANDA_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_STAIRS.getRegistryName()),
                ItemCatalogs.MAHOGANY_STAIRS = new BlockItem(BlockList.MAHOGANY_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGANY_STAIRS.getRegistryName()),
                ItemCatalogs.MANGROVE_STAIRS = new BlockItem(BlockList.MANGROVE_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_STAIRS.getRegistryName()),
                ItemCatalogs.MAPLE_STAIRS = new BlockItem(BlockList.MAPLE_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAPLE_STAIRS.getRegistryName()),
                ItemCatalogs.PINE_STAIRS = new BlockItem(BlockList.PINE_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_STAIRS.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_STAIRS = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_STAIRS.getRegistryName()),
                ItemCatalogs.REDWOOD_STAIRS = new BlockItem(BlockList.REDWOOD_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_STAIRS.getRegistryName()),
                ItemCatalogs.SKYRIS_STAIRS = new BlockItem(BlockList.SKYRIS_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_STAIRS.getRegistryName()),
                ItemCatalogs.WILLOW_STAIRS = new BlockItem(BlockList.WILLOW_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_STAIRS.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_STAIRS = new BlockItem(BlockList.WITCH_HAZEL_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_STAIRS.getRegistryName()),
                ItemCatalogs.ZELKOVA_STAIRS = new BlockItem(BlockList.ZELKOVA_STAIRS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ZELKOVA_STAIRS.getRegistryName()),


                //PlantItems
                ItemCatalogs.GREEN_MUSHROOM_BLOCK = new BlockItem(BlockList.GREEN_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.MILKCAP_MUSHROOM_BLOCK = new BlockItem(BlockList.MILKCAP_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MILKCAP_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.BLEWIT_MUSHROOM_BLOCK = new BlockItem(BlockList.BLEWIT_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLEWIT_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.PUFF_MUSHROOM_BLOCK = new BlockItem(BlockList.PUFF_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PUFF_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.WHITE_MUSHROOM_STEM = new BlockItem(BlockList.WHITE_MUSHROOM_STEM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WHITE_MUSHROOM_STEM.getRegistryName()),
                ItemCatalogs.BROWN_MUSHROOM_STEM = new BlockItem(BlockList.BROWN_MUSHROOM_STEM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BROWN_MUSHROOM_STEM.getRegistryName()),

                ItemCatalogs.CATTAIL = new BlockItem(BlockList.CATTAIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CATTAIL.getRegistryName()),
                ItemCatalogs.REEDS = new BlockItem(BlockList.REEDS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REEDS.getRegistryName()),
                ItemCatalogs.HORSEWEED = new BlockItem(BlockList.HORSEWEED, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HORSEWEED.getRegistryName()),
                ItemCatalogs.MINI_CACTUS = new BlockItem(BlockList.MINI_CACTUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MINI_CACTUS.getRegistryName()),
                ItemCatalogs.PRICKLY_PEAR_CACTUS = new BlockItem(BlockList.PRICKLY_PEAR_CACTUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PRICKLY_PEAR_CACTUS.getRegistryName()),
                ItemCatalogs.WINTER_SUCCULENT = new BlockItem(BlockList.WINTER_SUCCULENT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WINTER_SUCCULENT.getRegistryName()),
                ItemCatalogs.SHORT_GRASS = new BlockItem(BlockList.SHORT_GRASS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SHORT_GRASS.getRegistryName()),
//                ItemCatalogs.POISON_IVY = new BlockItem(BlockList.POISON_IVY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.POISON_IVY.getRegistryName()),
//                ItemCatalogs.TINY_LILYPADS = (new LilyItem(BlockList.TINY_LILYPADS, (new Item.Properties()).group(BYG.Init.creativeTab)).setRegistryName(BlockList.TINY_LILYPADS.getRegistryName())),

                //Glowcane Blocks
                ItemCatalogs.RED_GLOWCANE_BLOCK = new BlockItem(BlockList.RED_GLOWCANE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_GLOWCANE_BLOCK.getRegistryName()),
                ItemCatalogs.BLUE_GLOWCANE_BLOCK = new BlockItem(BlockList.BLUE_GLOWCANE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_GLOWCANE_BLOCK.getRegistryName()),
                ItemCatalogs.PURPLE_GLOWCANE_BLOCK = new BlockItem(BlockList.PURPLE_GLOWCANE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PURPLE_GLOWCANE_BLOCK.getRegistryName()),
                ItemCatalogs.PINK_GLOWCANE_BLOCK = new BlockItem(BlockList.PINK_GLOWCANE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_GLOWCANE_BLOCK.getRegistryName()),
//
                //Decorations
                ItemCatalogs.REDSTONE_LANTERN = new BlockNamedItem(BlockList.REDSTONE_LANTERN, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("redstone_lantern"),


                //Petal Blocks
                ItemCatalogs.WHITE_PETAL = new BlockItem(BlockList.WHITE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WHITE_PETAL.getRegistryName()),
                ItemCatalogs.BLUE_PETAL = new BlockItem(BlockList.BLUE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_PETAL.getRegistryName()),
                ItemCatalogs.LIGHT_BLUE_PETAL = new BlockItem(BlockList.LIGHT_BLUE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.LIGHT_BLUE_PETAL.getRegistryName()),
                ItemCatalogs.PURPLE_PETAL = new BlockItem(BlockList.PURPLE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PURPLE_PETAL.getRegistryName()),
                ItemCatalogs.RED_PETAL = new BlockItem(BlockList.RED_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_PETAL.getRegistryName()),
                ItemCatalogs.YELLOW_PETAL = new BlockItem(BlockList.YELLOW_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.YELLOW_PETAL.getRegistryName()),
                ItemCatalogs.PLANT_STEM = new BlockItem(BlockList.PLANT_STEM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PLANT_STEM.getRegistryName()),


                //SaplingItems
//                ItemCatalogs.ASPEN_SAPLING = new BlockItem(BlockList.ASPEN_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_SAPLING.getRegistryName()),
//                ItemCatalogs.BAOBAB_SAPLING = new BlockItem(BlockList.BAOBAB_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_SAPLING.getRegistryName()),
//                ItemCatalogs.BLUE_ENCHANTED_SAPLING = new BlockItem(BlockList.BLUE_ENCHANTED_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_SAPLING.getRegistryName()),
//                ItemCatalogs.BLUE_SPRUCE_SAPLING = new BlockItem(BlockList.BLUE_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_SPRUCE_SAPLING.getRegistryName()),
//                ItemCatalogs.BROWN_BIRCH_SAPLING = new BlockItem(BlockList.BROWN_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BROWN_BIRCH_SAPLING.getRegistryName()),
//                ItemCatalogs.BROWN_OAK_SAPLING = new BlockItem(BlockList.BROWN_OAK_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BROWN_OAK_SAPLING.getRegistryName()),
//                ItemCatalogs.CIKA_SAPLING = new BlockItem(BlockList.CIKA_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_SAPLING.getRegistryName()),
//                ItemCatalogs.CYPRESS_SAPLING = new BlockItem(BlockList.CYPRESS_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_SAPLING.getRegistryName()),
//                ItemCatalogs.EBONY_SAPLING = new BlockItem(BlockList.EBONY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_SAPLING.getRegistryName()),
//                ItemCatalogs.FIR_SAPLING = new BlockItem(BlockList.FIR_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_SAPLING.getRegistryName()),
//                ItemCatalogs.GREEN_ENCHANTED_SAPLING = new BlockItem(BlockList.GREEN_ENCHANTED_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_SAPLING.getRegistryName()),
//                ItemCatalogs.HOLLY_SAPLING = new BlockItem(BlockList.HOLLY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_SAPLING.getRegistryName()),
//                ItemCatalogs.JACARANDA_SAPLING = new BlockItem(BlockList.JACARANDA_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_SAPLING.getRegistryName()),
//                ItemCatalogs.MAHOGONY_SAPLING = new BlockItem(BlockList.MAHOGANY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGANY_SAPLING.getRegistryName()),
//                ItemCatalogs.MANGROVE_SAPLING = new BlockItem(BlockList.MANGROVE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_SAPLING.getRegistryName()),
//                ItemCatalogs.ORANGE_BIRCH_SAPLING = new BlockItem(BlockList.ORANGE_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_BIRCH_SAPLING.getRegistryName()),
//                ItemCatalogs.ORANGE_OAK_SAPLING = new BlockItem(BlockList.ORANGE_OAK_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_OAK_SAPLING.getRegistryName()),
//                ItemCatalogs.ORANGE_SPRUCE_SAPLING = new BlockItem(BlockList.ORANGE_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_SPRUCE_SAPLING.getRegistryName()),
//                ItemCatalogs.ORCHARD_SAPLING = new BlockItem(BlockList.ORCHARD_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORCHARD_SAPLING.getRegistryName()),
//                ItemCatalogs.PALO_VERDE_SAPLING = new BlockItem(BlockList.PALO_VERDE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PALO_VERDE_SAPLING.getRegistryName()),
//                ItemCatalogs.PINE_SAPLING = new BlockItem(BlockList.PINE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_SAPLING.getRegistryName()),
//                ItemCatalogs.PINK_CHERRY_SAPLING = new BlockItem(BlockList.PINK_CHERRY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_CHERRY_SAPLING.getRegistryName()),
//                ItemCatalogs.RAINBOW_EUCALYPTUS_SAPLING = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_SAPLING.getRegistryName()),
//                ItemCatalogs.RED_BIRCH_SAPLING = new BlockItem(BlockList.RED_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_BIRCH_SAPLING.getRegistryName()),
//                ItemCatalogs.RED_MAPLE_SAPLING = new BlockItem(BlockList.RED_MAPLE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_MAPLE_SAPLING.getRegistryName()),
//                ItemCatalogs.RED_OAK_SAPLING = new BlockItem(BlockList.RED_OAK_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_OAK_SAPLING.getRegistryName()),
//                ItemCatalogs.RED_SPRUCE_SAPLINGS = new BlockItem(BlockList.RED_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_SPRUCE_SAPLING.getRegistryName()),
//                ItemCatalogs.REDWOOD_SAPLINGS = new BlockItem(BlockList.REDWOOD_SAPLINGS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_SAPLINGS.getRegistryName()),
//                ItemCatalogs.SILVER_MAPLE_SAPLINGS = new BlockItem(BlockList.SILVER_MAPLE_SAPLINGS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SILVER_MAPLE_SAPLINGS.getRegistryName()),
//                ItemCatalogs.SKYRIS_SAPLINGS = new BlockItem(BlockList.SKYRIS_SAPLINGS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_SAPLINGS.getRegistryName()),
//                ItemCatalogs.WHITE_CHERRY_SAPLING = new BlockItem(BlockList.WHITE_CHERRY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WHITE_CHERRY_SAPLING.getRegistryName()),
//                ItemCatalogs.WILLOW_SAPLING = new BlockItem(BlockList.WILLOW_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_SAPLING.getRegistryName()),
//                ItemCatalogs.WITCH_HAZEL_SAPLING = new BlockItem(BlockList.WITCH_HAZEL_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_SAPLING.getRegistryName()),
//                ItemCatalogs.YELLOW_BIRCH_SAPLING = new BlockItem(BlockList.YELLOW_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.YELLOW_BIRCH_SAPLING.getRegistryName()),
//                ItemCatalogs.YELLOW_SPRUCE_SAPLING = new BlockItem(BlockList.YELLOW_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.YELLOW_SPRUCE_SAPLING.getRegistryName()),



                //FenceItems
                ItemCatalogs.ASPEN_FENCE = new BlockItem(BlockList.ASPEN_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_FENCE.getRegistryName()),
                ItemCatalogs.BAOBAB_FENCE = new BlockItem(BlockList.BAOBAB_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_FENCE.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_FENCE = new BlockItem(BlockList.BLUE_ENCHANTED_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_FENCE.getRegistryName()),
                ItemCatalogs.CHERRY_FENCE = new BlockItem(BlockList.CHERRY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CHERRY_FENCE.getRegistryName()),
                ItemCatalogs.CIKA_FENCE = new BlockItem(BlockList.CIKA_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_FENCE.getRegistryName()),
                ItemCatalogs.CYPRESS_FENCE = new BlockItem(BlockList.CYPRESS_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_FENCE.getRegistryName()),
                ItemCatalogs.EBONY_FENCE = new BlockItem(BlockList.EBONY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_FENCE.getRegistryName()),
                ItemCatalogs.FIR_FENCE = new BlockItem(BlockList.FIR_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_FENCE.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_FENCE = new BlockItem(BlockList.GREEN_ENCHANTED_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_FENCE.getRegistryName()),
                ItemCatalogs.HOLLY_FENCE = new BlockItem(BlockList.HOLLY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_FENCE.getRegistryName()),
                ItemCatalogs.JACARANDA_FENCE = new BlockItem(BlockList.JACARANDA_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_FENCE.getRegistryName()),
                ItemCatalogs.MAHOGONY_FENCE = new BlockItem(BlockList.MAHOGONY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGONY_FENCE.getRegistryName()),
                ItemCatalogs.MANGROVE_FENCE = new BlockItem(BlockList.MANGROVE_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_FENCE.getRegistryName()),
                ItemCatalogs.MAPLE_FENCE = new BlockItem(BlockList.MAPLE_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAPLE_FENCE.getRegistryName()),
                ItemCatalogs.PINE_FENCE = new BlockItem(BlockList.PINE_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_FENCE.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_FENCE = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_FENCE.getRegistryName()),
                ItemCatalogs.REDWOOD_FENCE = new BlockItem(BlockList.REDWOOD_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_FENCE.getRegistryName()),
                ItemCatalogs.SKYRIS_FENCE = new BlockItem(BlockList.SKYRIS_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_FENCE.getRegistryName()),
                ItemCatalogs.WILLOW_FENCE = new BlockItem(BlockList.WILLOW_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_FENCE.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_FENCE = new BlockItem(BlockList.WITCH_HAZEL_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_FENCE.getRegistryName()),
                ItemCatalogs.ZELKOVA_FENCE = new BlockItem(BlockList.ZELKOVA_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ZELKOVA_FENCE.getRegistryName()),


                //GrassItems
                ItemCatalogs.PEAT_GRASSBLOCK = new BlockItem(BlockList.PEAT_GRASSBLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PEAT_GRASSBLOCK.getRegistryName()),
//                ItemCatalogs.MEADOW_GRASSBLOCK = new BlockItem(BlockList.MEADOW_GRASSBLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MEADOW_GRASSBLOCK.getRegistryName()),
               ItemCatalogs.MEADOW_DIRT = new BlockItem(BlockList.MEADOW_DIRT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MEADOW_DIRT.getRegistryName()),


                //MushroomItems
                ItemCatalogs.BLACK_PUFF = new BlockItem(BlockList.BLACK_PUFF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLACK_PUFF.getRegistryName()),
                ItemCatalogs.WEEPING_MILKCAP = new BlockItem(BlockList.WEEPING_MILKCAP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WEEPING_MILKCAP.getRegistryName()),
                ItemCatalogs.WOOD_BLEWIT = new BlockItem(BlockList.WOOD_BLEWIT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WOOD_BLEWIT.getRegistryName()),
                ItemCatalogs.GREEN_MUSHSHROOM = new BlockItem(BlockList.GREEN_MUSHSHROOM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_MUSHSHROOM.getRegistryName()),


                //OreItems
                ItemCatalogs.PENDORITE_ORE = new BlockItem(BlockList.PENDORITE_ORE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PENDORITE_ORE.getRegistryName()),
                ItemCatalogs.AMETRINE_ORE = new BlockItem(BlockList.AMETRINE_ORE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.AMETRINE_ORE.getRegistryName()),
                ItemCatalogs.PENDORITE_BLOCK = new BlockItem(BlockList.PENDORITE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PENDORITE_BLOCK.getRegistryName()),
                ItemCatalogs.AMETRINE_BLOCK = new BlockItem(BlockList.AMETRINE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.AMETRINE_BLOCK.getRegistryName()),


                //StoneItems
                ItemCatalogs.DACITE = new BlockItem(BlockList.DACITE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.DACITE.getRegistryName()),
                ItemCatalogs.DACITE_BRICKS = new BlockItem(BlockList.DACITE_BRICKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.DACITE_BRICKS.getRegistryName()),
                ItemCatalogs.DACITE_COBBLESTONE = new BlockItem(BlockList.DACITE_COBBLESTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.DACITE_COBBLESTONE.getRegistryName()),
                ItemCatalogs.DACITE_PILLAR = new BlockItem(BlockList.DACITE_PILLAR, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.DACITE_PILLAR.getRegistryName()),
                ItemCatalogs.DACITE_TILE = new BlockItem(BlockList.DACITE_TILE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.DACITE_TILE.getRegistryName()),


                ItemCatalogs.MOSSY_STONE = new BlockItem(BlockList.MOSSY_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MOSSY_STONE.getRegistryName()),
                ItemCatalogs.OVERGROWN_STONE = new BlockItem(BlockList.OVERGROWN_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("yeet"),
                ItemCatalogs.ROCKY_STONE = new BlockItem(BlockList.ROCKY_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ROCKY_STONE.getRegistryName()),


                ItemCatalogs.SCORIA_STONE = new BlockItem(BlockList.SCORIA_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SCORIA_STONE.getRegistryName()),
                ItemCatalogs.SCORIA_COBBLESTONE = new BlockItem(BlockList.SCORIA_COBBLESTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SCORIA_COBBLESTONE.getRegistryName()),
                ItemCatalogs.SCORIA_PILLAR = new BlockItem(BlockList.SCORIA_PILLAR, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SCORIA_PILLAR.getRegistryName()),
                ItemCatalogs.SCORIA_STONEBRICKS = new BlockItem(BlockList.SCORIA_STONEBRICKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SCORIA_STONEBRICKS.getRegistryName()),


                ItemCatalogs.SOAPSTONE = new BlockItem(BlockList.SOAPSTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SOAPSTONE.getRegistryName()),
                ItemCatalogs.POLISHED_SOAPSTONE = new BlockItem(BlockList.POLISHED_SOAPSTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.POLISHED_SOAPSTONE.getRegistryName()),
                ItemCatalogs.SOAPSTONE_BRICKS = new BlockItem(BlockList.SOAPSTONE_BRICKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SOAPSTONE_BRICKS.getRegistryName()),
                ItemCatalogs.SOAPSTONE_PILLAR = new BlockItem(BlockList.SOAPSTONE_PILLAR, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SOAPSTONE_PILLAR.getRegistryName()),
                ItemCatalogs.SOAPSTONE_TILE = new BlockItem(BlockList.SOAPSTONE_TILE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SOAPSTONE_TILE.getRegistryName()),


                //StrippedLogItems
                ItemCatalogs.STRIPPED_ASPEN_LOG = new BlockItem(BlockList.STRIPPED_ASPEN_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_ASPEN_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_BAOBAB_LOG = new BlockItem(BlockList.STRIPPED_BAOBAB_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_BAOBAB_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_BLUE_ENCHANTED_LOG = new BlockItem(BlockList.STRIPPED_BLUE_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_BLUE_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_CHERRY_LOG = new BlockItem(BlockList.STRIPPED_CHERRY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_CHERRY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_CIKA_LOG = new BlockItem(BlockList.STRIPPED_CIKA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_CIKA_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_CYPRESS_LOG = new BlockItem(BlockList.STRIPPED_CYPRESS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_CYPRESS_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_EBONY_LOG = new BlockItem(BlockList.STRIPPED_EBONY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_EBONY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_FIR_LOG = new BlockItem(BlockList.STRIPPED_FIR_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_FIR_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_GREEN_ENCHANTED_LOG = new BlockItem(BlockList.STRIPPED_GREEN_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_GREEN_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_HOLLY_LOG = new BlockItem(BlockList.STRIPPED_HOLLY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_HOLLY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_JACARANDA_LOG = new BlockItem(BlockList.STRIPPED_JACARANDA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_JACARANDA_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_MAHOGANY_LOG = new BlockItem(BlockList.STRIPPED_MAHOGANY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_MAHOGANY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_MANGROVE_LOG = new BlockItem(BlockList.STRIPPED_MANGROVE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_MANGROVE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_MAPLE_LOG = new BlockItem(BlockList.STRIPPED_MAPLE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_MAPLE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_PALO_VERDE_LOG = new BlockItem(BlockList.STRIPPED_PALO_VERDE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_PALO_VERDE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_PINE_LOG = new BlockItem(BlockList.STRIPPED_PINE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_PINE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BlockItem(BlockList.STRIPPED_RAINBOW_EUCALYPTUS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_RAINBOW_EUCALYPTUS_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_SKYRIS_LOG = new BlockItem(BlockList.STRIPPED_SKYRIS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_SKYRIS_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_WILLOW_LOG = new BlockItem(BlockList.STRIPPED_WILLOW_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_WILLOW_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_REDWOOD_LOG = new BlockItem(BlockList.STRIPPED_REDWOOD_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_REDWOOD_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_WITCH_HAZEL_LOG = new BlockItem(BlockList.STRIPPED_WITCH_HAZEL_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_WITCH_HAZEL_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_ZELKOVA_LOG = new BlockItem(BlockList.STRIPPED_ZELKOVA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.STRIPPED_ZELKOVA_LOG.getRegistryName()),

                //LeaveItems
                ItemCatalogs.ASPEN_LEAVES = new BlockItem(BlockList.ASPEN_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_LEAVES.getRegistryName()),
                ItemCatalogs.BAOBAB_LEAVES = new BlockItem(BlockList.BAOBAB_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_LEAVES.getRegistryName()),
                ItemCatalogs.BLOOMING_WITCH_HAZEL_LEAVES = new BlockItem(BlockList.BLOOMING_WITCH_HAZEL_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLOOMING_WITCH_HAZEL_LEAVES.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_LEAVES = new BlockItem(BlockList.BLUE_ENCHANTED_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_LEAVES.getRegistryName()),
                ItemCatalogs.BLUE_SPRUCE_LEAVES = new BlockItem(BlockList.BLUE_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_SPRUCE_LEAVES.getRegistryName()),
                ItemCatalogs.BROWN_BIRCH_LEAVES = new BlockItem(BlockList.BROWN_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BROWN_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.BROWN_OAK_LEAVES = new BlockItem(BlockList.BROWN_OAK_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BROWN_OAK_LEAVES.getRegistryName()),
                ItemCatalogs.CIKA_LEAVES = new BlockItem(BlockList.CIKA_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_LEAVES.getRegistryName()),
                ItemCatalogs.CYPRESS_LEAVES = new BlockItem(BlockList.CYPRESS_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_LEAVES.getRegistryName()),
                ItemCatalogs.EBONY_LEAVES = new BlockItem(BlockList.EBONY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_LEAVES.getRegistryName()),
                ItemCatalogs.FIR_LEAVES = new BlockItem(BlockList.FIR_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_LEAVES.getRegistryName()),
                ItemCatalogs.FLOWERING_ORCHARD_LEAVES = new BlockItem(BlockList.FLOWERING_ORCHARD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FLOWERING_ORCHARD_LEAVES.getRegistryName()),
                ItemCatalogs.FLOWERING_PALO_VERDE_LEAVES = new BlockItem(BlockList.FLOWERING_PALO_VERDE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FLOWERING_PALO_VERDE_LEAVES.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_LEAVES = new BlockItem(BlockList.GREEN_ENCHANTED_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_LEAVES.getRegistryName()),
                ItemCatalogs.HOLLY_BERRY_LEAVES = new BlockItem(BlockList.HOLLY_BERRY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_BERRY_LEAVES.getRegistryName()),
                ItemCatalogs.HOLLY_LEAVES = new BlockItem(BlockList.HOLLY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_LEAVES.getRegistryName()),
                ItemCatalogs.JACARANDA_LEAVES = new BlockItem(BlockList.JACARANDA_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_LEAVES.getRegistryName()),
                ItemCatalogs.MAHOGANY_LEAVES = new BlockItem(BlockList.MAHOGANY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGANY_LEAVES.getRegistryName()),
                ItemCatalogs.MANGROVE_LEAVES = new BlockItem(BlockList.MANGROVE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_LEAVES.getRegistryName()),
                ItemCatalogs.ORANGE_BIRCH_LEAVES = new BlockItem(BlockList.ORANGE_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.ORANGE_OAK_LEAVES = new BlockItem(BlockList.ORANGE_OAK_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_OAK_LEAVES.getRegistryName()),
                ItemCatalogs.ORANGE_SPRUCE_LEAVES = new BlockItem(BlockList.ORANGE_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_SPRUCE_LEAVES.getRegistryName()),
                ItemCatalogs.ORCHARD_LEAVES = new BlockItem(BlockList.ORCHARD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORCHARD_LEAVES.getRegistryName()),
                ItemCatalogs.PALO_VERDE_LEAVES = new BlockItem(BlockList.PALO_VERDE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PALO_VERDE_LEAVES.getRegistryName()),
                ItemCatalogs.PINE_lEAVES = new BlockItem(BlockList.PINE_lEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_lEAVES.getRegistryName()),
                ItemCatalogs.PINK_CHERRY_LEAVES = new BlockItem(BlockList.PINK_CHERRY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_CHERRY_LEAVES.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_LEAVES = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_LEAVES.getRegistryName()),
                ItemCatalogs.RED_BIRCH_LEAVES = new BlockItem(BlockList.RED_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.RED_MAPLE_LEAVES = new BlockItem(BlockList.RED_MAPLE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_MAPLE_LEAVES.getRegistryName()),
                ItemCatalogs.RED_OAK_LEAVES = new BlockItem(BlockList.RED_OAK_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_OAK_LEAVES.getRegistryName()),
                ItemCatalogs.RED_SPRUCE_LEAVES = new BlockItem(BlockList.RED_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_SPRUCE_LEAVES.getRegistryName()),
                ItemCatalogs.REDWOOD_LEAVES = new BlockItem(BlockList.REDWOOD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_LEAVES.getRegistryName()),
                ItemCatalogs.RIPE_ORCHARD_LEAVES = new BlockItem(BlockList.RIPE_ORCHARD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RIPE_ORCHARD_LEAVES.getRegistryName()),
                ItemCatalogs.SILVER_MAPLE_LEAVES = new BlockItem(BlockList.SILVER_MAPLE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SILVER_MAPLE_LEAVES.getRegistryName()),
                ItemCatalogs.SKYRIS_LEAVES_GREEN_APPLE = new BlockItem(BlockList.SKYRIS_LEAVES_GREEN_APPLE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_LEAVES_GREEN_APPLE.getRegistryName()),
                ItemCatalogs.SKYRIS_LEAVES = new BlockItem(BlockList.SKYRIS_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_LEAVES.getRegistryName()),
                ItemCatalogs.WHITE_CHERRY_LEAVES = new BlockItem(BlockList.WHITE_CHERRY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WHITE_CHERRY_LEAVES.getRegistryName()),
                ItemCatalogs.WILLOW_LEAVES = new BlockItem(BlockList.WILLOW_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_LEAVES.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_LEAVES = new BlockItem(BlockList.WITCH_HAZEL_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_LEAVES.getRegistryName()),
                ItemCatalogs.YELLOW_BIRCH_LEAVES = new BlockItem(BlockList.YELLOW_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.YELLOW_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.YELLOW_SPRUCE_LEAVES = new BlockItem(BlockList.YELLOW_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.YELLOW_SPRUCE_LEAVES.getRegistryName()),

                //LogItems
                ItemCatalogs.ASPEN_LOG = new BlockItem(BlockList.ASPEN_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ASPEN_LOG.getRegistryName()),
                ItemCatalogs.BAOBAB_LOG = new BlockItem(BlockList.BAOBAB_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BAOBAB_LOG.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_LOG = new BlockItem(BlockList.BLUE_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.CHERRY_LOG = new BlockItem(BlockList.CHERRY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CHERRY_LOG.getRegistryName()),
                ItemCatalogs.CIKA_LOG = new BlockItem(BlockList.CIKA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CIKA_LOG.getRegistryName()),
                ItemCatalogs.CYPRESS_LOG = new BlockItem(BlockList.CYPRESS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYPRESS_LOG.getRegistryName()),
                ItemCatalogs.EBONY_LOG = new BlockItem(BlockList.EBONY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.EBONY_LOG.getRegistryName()),
                ItemCatalogs.FIR_LOG = new BlockItem(BlockList.FIR_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIR_LOG.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_LOG = new BlockItem(BlockList.GREEN_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.HOLLY_LOG = new BlockItem(BlockList.HOLLY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.HOLLY_LOG.getRegistryName()),
                ItemCatalogs.JACARANDA_LOG = new BlockItem(BlockList.JACARANDA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JACARANDA_LOG.getRegistryName()),
                ItemCatalogs.MAHOGANY_LOG = new BlockItem(BlockList.MAHOGANY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAHOGANY_LOG.getRegistryName()),
                ItemCatalogs.MANGROVE_LOG = new BlockItem(BlockList.MANGROVE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MANGROVE_LOG.getRegistryName()),
                ItemCatalogs.MAPLE_LOG = new BlockItem(BlockList.MAPLE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAPLE_LOG.getRegistryName()),
                ItemCatalogs.PALO_VERDE_LOG = new BlockItem(BlockList.PALO_VERDE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PALO_VERDE_LOG.getRegistryName()),
                ItemCatalogs.PINE_LOG = new BlockItem(BlockList.PINE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINE_LOG.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_LOG = new BlockItem(BlockList.RAINBOW_EUCALYPTUS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RAINBOW_EUCALYPTUS_LOG.getRegistryName()),
                ItemCatalogs.REDWOOD_LOG = new BlockItem(BlockList.REDWOOD_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.REDWOOD_LOG.getRegistryName()),
                ItemCatalogs.SKYRIS_LOG = new BlockItem(BlockList.SKYRIS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SKYRIS_LOG.getRegistryName()),
                ItemCatalogs.WILLOW_LOG = new BlockItem(BlockList.WILLOW_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WILLOW_LOG.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_LOG = new BlockItem(BlockList.WITCH_HAZEL_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WITCH_HAZEL_LOG.getRegistryName()),
                ItemCatalogs.ZELKOVA_LOG = new BlockItem(BlockList.ZELKOVA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ZELKOVA_LOG.getRegistryName()),

                //FlowerItems
                ItemCatalogs.ALLIUM_FLOWER_BUSH = new BlockItem(BlockList.ALLIUM_FLOWER_BUSH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ALLIUM_FLOWER_BUSH.getRegistryName()),
                ItemCatalogs.ALPINE_BELLFLOWER = new BlockItem(BlockList.ALPINE_BELLFLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ALPINE_BELLFLOWER.getRegistryName()),
                ItemCatalogs.PINK_ALLIUM_FLOWER_BUSH = new BlockItem(BlockList.PINK_ALLIUM_FLOWER_BUSH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_ALLIUM_FLOWER_BUSH.getRegistryName()),
                ItemCatalogs.ANGELICA = new BlockItem(BlockList.ANGELICA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ANGELICA.getRegistryName()),
                ItemCatalogs.AZALEA = new BlockItem(BlockList.AZALEA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.AZALEA.getRegistryName()),
                ItemCatalogs.BEGONIA = new BlockItem(BlockList.BEGONIA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BEGONIA.getRegistryName()),
                ItemCatalogs.BISTORT = new BlockItem(BlockList.BISTORT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BISTORT.getRegistryName()),
                ItemCatalogs.BLACK_ROSE = new BlockItem(BlockList.BLACK_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLACK_ROSE.getRegistryName()),
                ItemCatalogs.BLUE_SAGE = new BlockItem(BlockList.BLUE_SAGE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.BLUE_SAGE.getRegistryName()),
                ItemCatalogs.CALIFORNIA_POPPY = new BlockItem(BlockList.CALIFORNIA_POPPY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CALIFORNIA_POPPY.getRegistryName()),
                ItemCatalogs.CROCUS = new BlockItem(BlockList.CROCUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CROCUS.getRegistryName()),
                ItemCatalogs.CYAN_ROSE = new BlockItem(BlockList.CYAN_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYAN_ROSE.getRegistryName()),
                ItemCatalogs.CYAN_TULIP = new BlockItem(BlockList.CYAN_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYAN_TULIP.getRegistryName()),
                ItemCatalogs.DAFFODIL = new BlockItem(BlockList.DAFFODIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.DAFFODIL.getRegistryName()),
                ItemCatalogs.DELPHINIUM = new BlockItem(BlockList.DELPHINIUM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.DELPHINIUM.getRegistryName()),
                ItemCatalogs.FAIRY_SLIPPER = new BlockItem(BlockList.FAIRY_SLIPPER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FAIRY_SLIPPER.getRegistryName()),
                ItemCatalogs.FIRECRACKER_FLOWER_BUSH = new BlockItem(BlockList.FIRECRACKER_FLOWER_BUSH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FIRECRACKER_FLOWER_BUSH.getRegistryName()),
                ItemCatalogs.FOXGLOVE = new BlockItem(BlockList.FOXGLOVE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.FOXGLOVE.getRegistryName()),
                ItemCatalogs.GOLDEN_SPINED_CACTUS = new BlockItem(BlockList.GOLDEN_SPINED_CACTUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GOLDEN_SPINED_CACTUS.getRegistryName()),
                ItemCatalogs.GREEN_TULIP = new BlockItem(BlockList.GREEN_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GREEN_TULIP.getRegistryName()),
                ItemCatalogs.GUZMANIA = new BlockItem(BlockList.GUZMANIA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.GUZMANIA.getRegistryName()),
                ItemCatalogs.INCAN_LILY = new BlockItem(BlockList.INCAN_LILY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.INCAN_LILY.getRegistryName()),
                ItemCatalogs.IRIS = new BlockItem(BlockList.IRIS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.IRIS.getRegistryName()),
                ItemCatalogs.JAPANESE_ORCHID = new BlockItem(BlockList.JAPANESE_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.JAPANESE_ORCHID.getRegistryName()),
                ItemCatalogs.KOVAN_FLOWER = new BlockItem(BlockList.KOVAN_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.KOVAN_FLOWER.getRegistryName()),
                ItemCatalogs.LAZARUS_BELLFLOWER = new BlockItem(BlockList.LAZARUS_BELLFLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.LAZARUS_BELLFLOWER.getRegistryName()),
                ItemCatalogs.LOLIPOP_FLOWER = new BlockItem(BlockList.LOLIPOP_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.LOLIPOP_FLOWER.getRegistryName()),
                ItemCatalogs.MAGENTA_TULIP = new BlockItem(BlockList.MAGENTA_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAGENTA_TULIP.getRegistryName()),
                ItemCatalogs.ORANGE_DAISY = new BlockItem(BlockList.ORANGE_DAISY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_DAISY.getRegistryName()),
                ItemCatalogs.ORSIRIA_ROSE = new BlockItem(BlockList.ORSIRIA_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORSIRIA_ROSE.getRegistryName()),
                ItemCatalogs.PEACH_LEATHER_FLOWER = new BlockItem(BlockList.PEACH_LEATHER_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PEACH_LEATHER_FLOWER.getRegistryName()),
                ItemCatalogs.PINK_ALLIUM = new BlockItem(BlockList.PINK_ALLIUM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_ALLIUM.getRegistryName()),
                ItemCatalogs.PINK_ANEMONE = new BlockItem(BlockList.PINK_ANEMONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_ANEMONE.getRegistryName()),
                ItemCatalogs.PINK_DAFFODIL = new BlockItem(BlockList.PINK_DAFFODIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_DAFFODIL.getRegistryName()),
                ItemCatalogs.PINK_ORCHID = new BlockItem(BlockList.PINK_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PINK_ORCHID.getRegistryName()),
                ItemCatalogs.PRAIRIE_GRASS = new BlockItem(BlockList.PRAIRIE_GRASS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PRAIRIE_GRASS.getRegistryName()),
                ItemCatalogs.PROTEA_FLOWER = new BlockItem(BlockList.PROTEA_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PROTEA_FLOWER.getRegistryName()),
                ItemCatalogs.PURPLE_ORCHID = new BlockItem(BlockList.PURPLE_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PURPLE_ORCHID.getRegistryName()),
                ItemCatalogs.PURPLE_SAGE = new BlockItem(BlockList.PURPLE_SAGE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PURPLE_SAGE.getRegistryName()),
                ItemCatalogs.PURPLE_TULIP = new BlockItem(BlockList.PURPLE_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PURPLE_TULIP.getRegistryName()),
                ItemCatalogs.RED_CORNFLOWER = new BlockItem(BlockList.RED_CORNFLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_CORNFLOWER.getRegistryName()),
                ItemCatalogs.RED_ORCHID = new BlockItem(BlockList.RED_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RED_ORCHID.getRegistryName()),
                ItemCatalogs.RICHEA = new BlockItem(BlockList.RICHEA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.RICHEA.getRegistryName()),
                ItemCatalogs.ROSE = new BlockItem(BlockList.ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ROSE.getRegistryName()),
                ItemCatalogs.SILVER_VASE_FLOWER = new BlockItem(BlockList.SILVER_VASE_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SILVER_VASE_FLOWER.getRegistryName()),
                ItemCatalogs.SNOWDROPS = new BlockItem(BlockList.SNOWDROPS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.SNOWDROPS.getRegistryName()),
                ItemCatalogs.TORCH_GINGER = new BlockItem(BlockList.TORCH_GINGER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.TORCH_GINGER.getRegistryName()),
                ItemCatalogs.VIOLET_LEATHER_FLOWER = new BlockItem(BlockList.VIOLET_LEATHER_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.VIOLET_LEATHER_FLOWER.getRegistryName()),
                ItemCatalogs.WHITE_ANEMONE = new BlockItem(BlockList.WHITE_ANEMONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WHITE_ANEMONE.getRegistryName()),
                ItemCatalogs.WHITE_SAGE = new BlockItem(BlockList.WHITE_SAGE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WHITE_SAGE.getRegistryName()),
                ItemCatalogs.WINTER_CYCLAMEN = new BlockItem(BlockList.WINTER_CYCLAMEN, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WINTER_CYCLAMEN.getRegistryName()),
                ItemCatalogs.WINTER_ROSE = new BlockItem(BlockList.WINTER_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WINTER_ROSE.getRegistryName()),
                ItemCatalogs.WINTER_SCILLA = new BlockItem(BlockList.WINTER_SCILLA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.WINTER_SCILLA.getRegistryName()),
                ItemCatalogs.YELLOW_DAFFODIL = new BlockItem(BlockList.YELLOW_DAFFODIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.YELLOW_DAFFODIL.getRegistryName()),
                ItemCatalogs.YELLOW_TULIP = new BlockItem(BlockList.YELLOW_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.YELLOW_TULIP.getRegistryName()),
                ItemCatalogs.AMARANTH = new BlockItem(BlockList.AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.AMARANTH.getRegistryName()),
                ItemCatalogs.CYAN_AMARANTH = new BlockItem(BlockList.CYAN_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.CYAN_AMARANTH.getRegistryName()),
                ItemCatalogs.ORANGE_AMARANTH = new BlockItem(BlockList.ORANGE_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.ORANGE_AMARANTH.getRegistryName()),
                ItemCatalogs.MAGENTA_AMARANTH = new BlockItem(BlockList.MAGENTA_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.MAGENTA_AMARANTH.getRegistryName()),
                ItemCatalogs.PURPLE_AMARANTH = new BlockItem(BlockList.PURPLE_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockList.PURPLE_AMARANTH.getRegistryName())
        );
        BYG.LOGGER.info("All BYG items registered!");

    }
}
