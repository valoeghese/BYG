package sporeaoc.byg.registries;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.catalogs.BlockCatalogs;
import sporeaoc.byg.catalogs.ItemCatalogs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGItemRegistry {

    /**
     * TODO: Change implementation of BlockItem and delete redundant class
     * @see sporeaoc.byg.catalogs.ItemCatalogs
     *
     * Block Items are made from the Block, not out of seperate defined Items
     */

    @SubscribeEvent
    public static void bygRegisterItems(final RegistryEvent.Register<Item> event) {
        Item.Properties tab = new Item.Properties().group(BYG.Init.creativeTab);

        event.getRegistry().registerAll(

                ItemCatalogs.BYG_LOGO = new Item((new Item.Properties())).setRegistryName("byg_logo"),
                ItemCatalogs.AMETRINE_GEMS = new Item(new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("ametrine_gems"),
                ItemCatalogs.PENDORITE_SCRAPS = new Item(new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName("pendorite_scraps"),
                ItemCatalogs.BLUE_BERRY = new BlockNamedItem(BlockCatalogs.BLUEBERRY_BUSH, new Item.Properties().food(new Food.Builder().hunger(2).saturation(0.1f).build())).setRegistryName("blueberries"),
                ItemCatalogs.HOLLY_BERRY = new Item(new Item.Properties().group(BYG.Init.creativeTab).food(new Food.Builder().hunger(2).saturation(0.1f).build())).setRegistryName("holly_berries"),
                ItemCatalogs.GREEN_APPLE = new Item(new Item.Properties().group(BYG.Init.creativeTab).food(new Food.Builder().hunger(2).saturation(0.1f).build())).setRegistryName("green_apple"),

//Yeeet
                //PlankItems

                ItemCatalogs.ASPEN_PLANKS = new BlockItem(BlockCatalogs.ASPEN_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ASPEN_PLANKS.getRegistryName()),
                ItemCatalogs.BAOBAB_PLANKS = new BlockItem(BlockCatalogs.BAOBAB_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BAOBAB_PLANKS.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_PLANKS = new BlockItem(BlockCatalogs.BLUE_ENCHANTED_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_ENCHANTED_PLANKS.getRegistryName()),
                ItemCatalogs.CHERRY_PLANKS = new BlockItem(BlockCatalogs.CHERRY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CHERRY_PLANKS.getRegistryName()),
                ItemCatalogs.CIKA_PLANKS = new BlockItem(BlockCatalogs.CIKA_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CIKA_PLANKS.getRegistryName()),
                ItemCatalogs.CYPRESS_PLANKS = new BlockItem(BlockCatalogs.CYPRESS_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYPRESS_PLANKS.getRegistryName()),
                ItemCatalogs.EBONY_PLANKS = new BlockItem(BlockCatalogs.EBONY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.EBONY_PLANKS.getRegistryName()),
                ItemCatalogs.FIR_PLANKS = new BlockItem(BlockCatalogs.FIR_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIR_PLANKS.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_PLANKS = new BlockItem(BlockCatalogs.GREEN_ENCHANTED_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_ENCHANTED_PLANKS.getRegistryName()),
                ItemCatalogs.HOLLY_PLANKS = new BlockItem(BlockCatalogs.HOLLY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_PLANKS.getRegistryName()),
                ItemCatalogs.JACARANDA_PLANKS = new BlockItem(BlockCatalogs.JACARANDA_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JACARANDA_PLANKS.getRegistryName()),
                ItemCatalogs.MAHOGONY_PLANKS = new BlockItem(BlockCatalogs.MAHOGONY_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAHOGONY_PLANKS.getRegistryName()),
                ItemCatalogs.MANGROVE_PLANKS = new BlockItem(BlockCatalogs.MANGROVE_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MANGROVE_PLANKS.getRegistryName()),
                ItemCatalogs.MAPLE_PLANKS = new BlockItem(BlockCatalogs.MAPLE_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAPLE_PLANKS.getRegistryName()),
                ItemCatalogs.PINE_PLANKS = new BlockItem(BlockCatalogs.PINE_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINE_PLANKS.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_PLANKS = new BlockItem(BlockCatalogs.RAINBOW_EUCALYPTUS_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RAINBOW_EUCALYPTUS_PLANKS.getRegistryName()),
                ItemCatalogs.REDWOOD_PLANKS = new BlockItem(BlockCatalogs.REDWOOD_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REDWOOD_PLANKS.getRegistryName()),
                ItemCatalogs.SKYRIS_PLANKS = new BlockItem(BlockCatalogs.SKYRIS_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_PLANKS.getRegistryName()),
                ItemCatalogs.WILLOW_PLANKS = new BlockItem(BlockCatalogs.WILLOW_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WILLOW_PLANKS.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_PLANKS = new BlockItem(BlockCatalogs.WITCH_HAZEL_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WITCH_HAZEL_PLANKS.getRegistryName()),
                ItemCatalogs.ZELKOVA_PLANKS = new BlockItem(BlockCatalogs.ZELKOVA_PLANKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ZELKOVA_PLANKS.getRegistryName()),

                //Bookshelf
                ItemCatalogs.ASPEN_BOOKSHELF = new BlockItem(BlockCatalogs.ASPEN_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ASPEN_BOOKSHELF.getRegistryName()),
                ItemCatalogs.BAOBAB_BOOKSHELF = new BlockItem(BlockCatalogs.BAOBAB_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BAOBAB_BOOKSHELF.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_BOOKSHELF = new BlockItem(BlockCatalogs.BLUE_ENCHANTED_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_ENCHANTED_BOOKSHELF.getRegistryName()),
                ItemCatalogs.CHERRY_BOOKSHELF = new BlockItem(BlockCatalogs.CHERRY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CHERRY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.CIKA_BOOKSHELF = new BlockItem(BlockCatalogs.CIKA_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CIKA_BOOKSHELF.getRegistryName()),
                ItemCatalogs.CYPRESS_BOOKSHELF = new BlockItem(BlockCatalogs.CYPRESS_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYPRESS_BOOKSHELF.getRegistryName()),
                ItemCatalogs.EBONY_BOOKSHELF = new BlockItem(BlockCatalogs.EBONY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.EBONY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.FIR_BOOKSHELF = new BlockItem(BlockCatalogs.FIR_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIR_BOOKSHELF.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_BOOKSHELF = new BlockItem(BlockCatalogs.GREEN_ENCHANTED_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_ENCHANTED_BOOKSHELF.getRegistryName()),
                ItemCatalogs.HOLLY_BOOKSHELF = new BlockItem(BlockCatalogs.HOLLY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.JACARANDA_BOOKSHELF = new BlockItem(BlockCatalogs.JACARANDA_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JACARANDA_BOOKSHELF.getRegistryName()),
                ItemCatalogs.MAHOGONY_BOOKSHELF = new BlockItem(BlockCatalogs.MAHOGONY_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAHOGONY_BOOKSHELF.getRegistryName()),
                ItemCatalogs.MANGROVE_BOOKSHELF = new BlockItem(BlockCatalogs.MANGROVE_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MANGROVE_BOOKSHELF.getRegistryName()),
                ItemCatalogs.MAPLE_BOOKSHELF = new BlockItem(BlockCatalogs.MAPLE_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAPLE_BOOKSHELF.getRegistryName()),
                ItemCatalogs.PINE_BOOKSHELF = new BlockItem(BlockCatalogs.PINE_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINE_BOOKSHELF.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_BOOKSHELF = new BlockItem(BlockCatalogs.RAINBOW_EUCALYPTUS_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RAINBOW_EUCALYPTUS_BOOKSHELF.getRegistryName()),
                ItemCatalogs.REDWOOD_BOOKSHELF = new BlockItem(BlockCatalogs.REDWOOD_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REDWOOD_BOOKSHELF.getRegistryName()),
                ItemCatalogs.SKYRIS_BOOKSHELF = new BlockItem(BlockCatalogs.SKYRIS_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_BOOKSHELF.getRegistryName()),
                ItemCatalogs.WILLOW_BOOKSHELF = new BlockItem(BlockCatalogs.WILLOW_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WILLOW_BOOKSHELF.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_BOOKSHELF = new BlockItem(BlockCatalogs.WITCH_HAZEL_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WITCH_HAZEL_BOOKSHELF.getRegistryName()),
                ItemCatalogs.ZELKOVA_BOOKSHELF = new BlockItem(BlockCatalogs.ZELKOVA_BOOKSHELF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ZELKOVA_BOOKSHELF.getRegistryName()),

                //Slabs
                ItemCatalogs.ASPEN_SLAB = new BlockItem(BlockCatalogs.ASPEN_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ASPEN_SLAB.getRegistryName()),
                ItemCatalogs.BAOBAB_SLAB = new BlockItem(BlockCatalogs.BAOBAB_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BAOBAB_SLAB.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_SLAB = new BlockItem(BlockCatalogs.BLUE_ENCHANTED_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_ENCHANTED_SLAB.getRegistryName()),
                ItemCatalogs.CHERRY_SLAB = new BlockItem(BlockCatalogs.CHERRY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CHERRY_SLAB.getRegistryName()),
                ItemCatalogs.CIKA_SLAB = new BlockItem(BlockCatalogs.CIKA_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CIKA_SLAB.getRegistryName()),
                ItemCatalogs.EBONY_SLAB = new BlockItem(BlockCatalogs.EBONY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.EBONY_SLAB.getRegistryName()),
                ItemCatalogs.FIR_SLAB = new BlockItem(BlockCatalogs.FIR_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIR_SLAB.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_SLAB = new BlockItem(BlockCatalogs.GREEN_ENCHANTED_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_ENCHANTED_SLAB.getRegistryName()),
                ItemCatalogs.HOLLY_SLAB = new BlockItem(BlockCatalogs.HOLLY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_SLAB.getRegistryName()),
                ItemCatalogs.JACARANDA_SLAB = new BlockItem(BlockCatalogs.JACARANDA_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JACARANDA_SLAB.getRegistryName()),
                ItemCatalogs.MAHOGONY_SLAB = new BlockItem(BlockCatalogs.MAHOGONY_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAHOGONY_SLAB.getRegistryName()),
                ItemCatalogs.MANGROVE_SLAB = new BlockItem(BlockCatalogs.MANGROVE_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MANGROVE_SLAB.getRegistryName()),
                ItemCatalogs.MAPLE_SLAB = new BlockItem(BlockCatalogs.MAPLE_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAPLE_SLAB.getRegistryName()),
                ItemCatalogs.PINE_SLAB = new BlockItem(BlockCatalogs.PINE_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINE_SLAB.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_SLAB = new BlockItem(BlockCatalogs.RAINBOW_EUCALYPTUS_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RAINBOW_EUCALYPTUS_SLAB.getRegistryName()),
                ItemCatalogs.REDWOOD_SLAB = new BlockItem(BlockCatalogs.REDWOOD_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REDWOOD_SLAB.getRegistryName()),
                ItemCatalogs.SKYRIS_SLAB = new BlockItem(BlockCatalogs.SKYRIS_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_SLAB.getRegistryName()),
                ItemCatalogs.WILLOW_SLAB = new BlockItem(BlockCatalogs.WILLOW_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WILLOW_SLAB.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_SLAB = new BlockItem(BlockCatalogs.WITCH_HAZEL_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WITCH_HAZEL_SLAB.getRegistryName()),
                ItemCatalogs.ZELKOVA_SLAB = new BlockItem(BlockCatalogs.ZELKOVA_SLAB, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ZELKOVA_SLAB.getRegistryName()),

                //PlantItems
                ItemCatalogs.GREEN_MUSHROOM_BLOCK = new BlockItem(BlockCatalogs.GREEN_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.MILKCAP_MUSHROOM_BLOCK = new BlockItem(BlockCatalogs.MILKCAP_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MILKCAP_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.BLEWIT_MUSHROOM_BLOCK = new BlockItem(BlockCatalogs.BLEWIT_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLEWIT_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.PUFF_MUSHROOM_BLOCK = new BlockItem(BlockCatalogs.PUFF_MUSHROOM_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PUFF_MUSHROOM_BLOCK.getRegistryName()),
                ItemCatalogs.WHITE_MUSHROOM_STEM = new BlockItem(BlockCatalogs.WHITE_MUSHROOM_STEM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WHITE_MUSHROOM_STEM.getRegistryName()),
                ItemCatalogs.BROWN_MUSHROOM_STEM = new BlockItem(BlockCatalogs.BROWN_MUSHROOM_STEM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BROWN_MUSHROOM_STEM.getRegistryName()),

                ItemCatalogs.CATTAIL = new BlockItem(BlockCatalogs.CATTAIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CATTAIL.getRegistryName()),
                ItemCatalogs.REEDS = new BlockItem(BlockCatalogs.REEDS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REEDS.getRegistryName()),
                ItemCatalogs.HORSEWEED = new BlockItem(BlockCatalogs.HORSEWEED, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HORSEWEED.getRegistryName()),
                ItemCatalogs.MINI_CACTUS = new BlockItem(BlockCatalogs.MINI_CACTUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MINI_CACTUS.getRegistryName()),
                ItemCatalogs.PRICKLY_PEAR_CACTUS = new BlockItem(BlockCatalogs.PRICKLY_PEAR_CACTUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PRICKLY_PEAR_CACTUS.getRegistryName()),
                ItemCatalogs.WINTER_SUCCULENT = new BlockItem(BlockCatalogs.WINTER_SUCCULENT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WINTER_SUCCULENT.getRegistryName()),
                ItemCatalogs.DEAD_GRASS = new BlockItem(BlockCatalogs.DEAD_GRASS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DEAD_GRASS.getRegistryName()),
                ItemCatalogs.SHORT_DEAD_GRASS = new BlockItem(BlockCatalogs.SHORT_DEAD_GRASS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SHORT_DEAD_GRASS.getRegistryName()),
                ItemCatalogs.BLUE_GLOWCANE = new BlockItem(BlockCatalogs.BLUE_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_GLOWCANE.getRegistryName()),
                ItemCatalogs.RED_GLOWCANE = new BlockItem(BlockCatalogs.RED_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_GLOWCANE.getRegistryName()),
                ItemCatalogs.PURPLE_GLOWCANE = new BlockItem(BlockCatalogs.PURPLE_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PURPLE_GLOWCANE.getRegistryName()),
                ItemCatalogs.PINK_GLOWCANE = new BlockItem(BlockCatalogs.PINK_GLOWCANE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_GLOWCANE.getRegistryName()),
                ItemCatalogs.POISON_IVY = new BlockItem(BlockCatalogs.POISON_IVY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.POISON_IVY.getRegistryName()),

                //Petal Blocks
                ItemCatalogs.WHITE_PETAL = new BlockItem(BlockCatalogs.WHITE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WHITE_PETAL.getRegistryName()),
                ItemCatalogs.BLUE_PETAL = new BlockItem(BlockCatalogs.BLUE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_PETAL.getRegistryName()),
                ItemCatalogs.LIGHT_BLUE_PETAL = new BlockItem(BlockCatalogs.LIGHT_BLUE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.LIGHT_BLUE_PETAL.getRegistryName()),
                ItemCatalogs.PURPLE_PETAL = new BlockItem(BlockCatalogs.PURPLE_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PURPLE_PETAL.getRegistryName()),
                ItemCatalogs.RED_PETAL = new BlockItem(BlockCatalogs.RED_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_PETAL.getRegistryName()),
                ItemCatalogs.YELLOW_PETAL = new BlockItem(BlockCatalogs.YELLOW_PETAL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.YELLOW_PETAL.getRegistryName()),
                ItemCatalogs.PLANT_STEM = new BlockItem(BlockCatalogs.PLANT_STEM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PLANT_STEM.getRegistryName()),


                //SaplingItems
                ItemCatalogs.ASPEN_SAPLING = new BlockItem(BlockCatalogs.ASPEN_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ASPEN_SAPLING.getRegistryName()),
                ItemCatalogs.BAOBAB_SAPLING = new BlockItem(BlockCatalogs.BAOBAB_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BAOBAB_SAPLING.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_SAPLING = new BlockItem(BlockCatalogs.BLUE_ENCHANTED_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_ENCHANTED_SAPLING.getRegistryName()),
                ItemCatalogs.BLUE_SPRUCE_SAPLING = new BlockItem(BlockCatalogs.BLUE_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_SPRUCE_SAPLING.getRegistryName()),
                ItemCatalogs.BROWN_BIRCH_SAPLING = new BlockItem(BlockCatalogs.BROWN_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BROWN_BIRCH_SAPLING.getRegistryName()),
                ItemCatalogs.BROWN_OAK_SAPLING = new BlockItem(BlockCatalogs.BROWN_OAK_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BROWN_OAK_SAPLING.getRegistryName()),
                ItemCatalogs.CIKA_SAPLING = new BlockItem(BlockCatalogs.CIKA_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CIKA_SAPLING.getRegistryName()),
                ItemCatalogs.CYPRESS_SAPLING = new BlockItem(BlockCatalogs.CYPRESS_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYPRESS_SAPLING.getRegistryName()),
                ItemCatalogs.EBONY_SAPLING = new BlockItem(BlockCatalogs.EBONY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.EBONY_SAPLING.getRegistryName()),
                ItemCatalogs.FIR_SAPLING = new BlockItem(BlockCatalogs.FIR_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIR_SAPLING.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_SAPLING = new BlockItem(BlockCatalogs.GREEN_ENCHANTED_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_ENCHANTED_SAPLING.getRegistryName()),
                ItemCatalogs.HOLLY_SAPLING = new BlockItem(BlockCatalogs.HOLLY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_SAPLING.getRegistryName()),
                ItemCatalogs.JACARANDA_SAPLING = new BlockItem(BlockCatalogs.JACARANDA_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JACARANDA_SAPLING.getRegistryName()),
                ItemCatalogs.MAHOGONY_SAPLING = new BlockItem(BlockCatalogs.MAHOGONY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAHOGONY_SAPLING.getRegistryName()),
                ItemCatalogs.MANGROVE_SAPLING = new BlockItem(BlockCatalogs.MANGROVE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MANGROVE_SAPLING.getRegistryName()),
                ItemCatalogs.ORANGE_BIRCH_SAPLING = new BlockItem(BlockCatalogs.ORANGE_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_BIRCH_SAPLING.getRegistryName()),
                ItemCatalogs.ORANGE_OAK_SAPLING = new BlockItem(BlockCatalogs.ORANGE_OAK_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_OAK_SAPLING.getRegistryName()),
                ItemCatalogs.ORANGE_SPRUCE_SAPLING = new BlockItem(BlockCatalogs.ORANGE_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_SPRUCE_SAPLING.getRegistryName()),
                ItemCatalogs.ORCHARD_SAPLING = new BlockItem(BlockCatalogs.ORCHARD_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORCHARD_SAPLING.getRegistryName()),
                ItemCatalogs.PALO_VERDE_SAPLING = new BlockItem(BlockCatalogs.PALO_VERDE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PALO_VERDE_SAPLING.getRegistryName()),
                ItemCatalogs.PINE_SAPLING = new BlockItem(BlockCatalogs.PINE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINE_SAPLING.getRegistryName()),
                ItemCatalogs.PINK_CHERRY_SAPLING = new BlockItem(BlockCatalogs.PINK_CHERRY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_CHERRY_SAPLING.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_SAPLING = new BlockItem(BlockCatalogs.RAINBOW_EUCALYPTUS_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RAINBOW_EUCALYPTUS_SAPLING.getRegistryName()),
                ItemCatalogs.RED_BIRCH_SAPLING = new BlockItem(BlockCatalogs.RED_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_BIRCH_SAPLING.getRegistryName()),
                ItemCatalogs.RED_MAPLE_SAPLING = new BlockItem(BlockCatalogs.RED_MAPLE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_MAPLE_SAPLING.getRegistryName()),
                ItemCatalogs.RED_OAK_SAPLING = new BlockItem(BlockCatalogs.RED_OAK_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_OAK_SAPLING.getRegistryName()),
                ItemCatalogs.RED_SPRUCE_SAPLINGS = new BlockItem(BlockCatalogs.RED_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_SPRUCE_SAPLING.getRegistryName()),
                ItemCatalogs.REDWOOD_SAPLINGS = new BlockItem(BlockCatalogs.REDWOOD_SAPLINGS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REDWOOD_SAPLINGS.getRegistryName()),
                ItemCatalogs.SILVER_MAPLE_SAPLINGS = new BlockItem(BlockCatalogs.SILVER_MAPLE_SAPLINGS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SILVER_MAPLE_SAPLINGS.getRegistryName()),
                ItemCatalogs.SKYRIS_SAPLINGS = new BlockItem(BlockCatalogs.SKYRIS_SAPLINGS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_SAPLINGS.getRegistryName()),
                ItemCatalogs.WHITE_CHERRY_SAPLING = new BlockItem(BlockCatalogs.WHITE_CHERRY_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WHITE_CHERRY_SAPLING.getRegistryName()),
                ItemCatalogs.WILLOW_SAPLING = new BlockItem(BlockCatalogs.WILLOW_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WILLOW_SAPLING.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_SAPLING = new BlockItem(BlockCatalogs.WITCH_HAZEL_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WITCH_HAZEL_SAPLING.getRegistryName()),
                ItemCatalogs.YELLOW_BIRCH_SAPLING = new BlockItem(BlockCatalogs.YELLOW_BIRCH_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.YELLOW_BIRCH_SAPLING.getRegistryName()),
                ItemCatalogs.YELLOW_SPRUCE_SAPLING = new BlockItem(BlockCatalogs.YELLOW_SPRUCE_SAPLING, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.YELLOW_SPRUCE_SAPLING.getRegistryName()),



                //FenceItems
                ItemCatalogs.ASPEN_FENCE = new BlockItem(BlockCatalogs.ASPEN_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ASPEN_FENCE.getRegistryName()),
                ItemCatalogs.BAOBAB_FENCE = new BlockItem(BlockCatalogs.BAOBAB_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BAOBAB_FENCE.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_FENCE = new BlockItem(BlockCatalogs.BLUE_ENCHANTED_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_ENCHANTED_FENCE.getRegistryName()),
                ItemCatalogs.CHERRY_FENCE = new BlockItem(BlockCatalogs.CHERRY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CHERRY_FENCE.getRegistryName()),
                ItemCatalogs.CIKA_FENCE = new BlockItem(BlockCatalogs.CIKA_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CIKA_FENCE.getRegistryName()),
                ItemCatalogs.CYPRESS_FENCE = new BlockItem(BlockCatalogs.CYPRESS_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYPRESS_FENCE.getRegistryName()),
                ItemCatalogs.EBONY_FENCE = new BlockItem(BlockCatalogs.EBONY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.EBONY_FENCE.getRegistryName()),
                ItemCatalogs.FIR_FENCE = new BlockItem(BlockCatalogs.FIR_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIR_FENCE.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_FENCE = new BlockItem(BlockCatalogs.GREEN_ENCHANTED_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_ENCHANTED_FENCE.getRegistryName()),
                ItemCatalogs.HOLLY_FENCE = new BlockItem(BlockCatalogs.HOLLY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_FENCE.getRegistryName()),
                ItemCatalogs.JACARANDA_FENCE = new BlockItem(BlockCatalogs.JACARANDA_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JACARANDA_FENCE.getRegistryName()),
                ItemCatalogs.MAHOGONY_FENCE = new BlockItem(BlockCatalogs.MAHOGONY_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAHOGONY_FENCE.getRegistryName()),
                ItemCatalogs.MANGROVE_FENCE = new BlockItem(BlockCatalogs.MANGROVE_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MANGROVE_FENCE.getRegistryName()),
                ItemCatalogs.MAPLE_FENCE = new BlockItem(BlockCatalogs.MAPLE_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAPLE_FENCE.getRegistryName()),
                ItemCatalogs.PINE_FENCE = new BlockItem(BlockCatalogs.PINE_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINE_FENCE.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_FENCE = new BlockItem(BlockCatalogs.RAINBOW_EUCALYPTUS_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RAINBOW_EUCALYPTUS_FENCE.getRegistryName()),
                ItemCatalogs.REDWOOD_FENCE = new BlockItem(BlockCatalogs.REDWOOD_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REDWOOD_FENCE.getRegistryName()),
                ItemCatalogs.SKYRIS_FENCE = new BlockItem(BlockCatalogs.SKYRIS_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_FENCE.getRegistryName()),
                ItemCatalogs.WILLOW_FENCE = new BlockItem(BlockCatalogs.WILLOW_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WILLOW_FENCE.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_FENCE = new BlockItem(BlockCatalogs.WITCH_HAZEL_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WITCH_HAZEL_FENCE.getRegistryName()),
                ItemCatalogs.ZELKOVA_FENCE = new BlockItem(BlockCatalogs.ZELKOVA_FENCE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ZELKOVA_FENCE.getRegistryName()),


                //GrassItems
                ItemCatalogs.PEAT_GRASSBLOCK = new BlockItem(BlockCatalogs.PEAT_GRASSBLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PEAT_GRASSBLOCK.getRegistryName()),
                ItemCatalogs.MEADOW_GRASSBLOCK = new BlockItem(BlockCatalogs.MEADOW_GRASSBLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MEADOW_GRASSBLOCK.getRegistryName()),
                ItemCatalogs.MEADOW_DIRT = new BlockItem(BlockCatalogs.MEADOW_DIRT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MEADOW_DIRT.getRegistryName()),


                //MushroomItems
                ItemCatalogs.BLACK_PUFF = new BlockItem(BlockCatalogs.BLACK_PUFF, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLACK_PUFF.getRegistryName()),
                ItemCatalogs.WEEPING_MILKCAP = new BlockItem(BlockCatalogs.WEEPING_MILKCAP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WEEPING_MILKCAP.getRegistryName()),
                ItemCatalogs.WOOD_BLEWIT = new BlockItem(BlockCatalogs.WOOD_BLEWIT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WOOD_BLEWIT.getRegistryName()),
                ItemCatalogs.GREEN_MUSHSHROOM = new BlockItem(BlockCatalogs.GREEN_MUSHSHROOM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_MUSHSHROOM.getRegistryName()),


                //OreItems
                ItemCatalogs.PENDORITE_ORE = new BlockItem(BlockCatalogs.PENDORITE_ORE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PENDORITE_ORE.getRegistryName()),
                ItemCatalogs.AMETRINE_ORE = new BlockItem(BlockCatalogs.AMETRINE_ORE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.AMETRINE_ORE.getRegistryName()),
                ItemCatalogs.PENDORITE_BLOCK = new BlockItem(BlockCatalogs.PENDORITE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PENDORITE_BLOCK.getRegistryName()),
                ItemCatalogs.AMETRINE_BLOCK = new BlockItem(BlockCatalogs.AMETRINE_BLOCK, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.AMETRINE_BLOCK.getRegistryName()),


                //StoneItems
                ItemCatalogs.DACITE = new BlockItem(BlockCatalogs.DACITE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DACITE.getRegistryName()),
                ItemCatalogs.DACITE_BRICKS = new BlockItem(BlockCatalogs.DACITE_BRICKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DACITE_BRICKS.getRegistryName()),
                ItemCatalogs.DACITE_COBBLESTONE = new BlockItem(BlockCatalogs.DACITE_COBBLESTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DACITE_COBBLESTONE.getRegistryName()),
                ItemCatalogs.DACITE_PILLAR = new BlockItem(BlockCatalogs.DACITE_PILLAR, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DACITE_PILLAR.getRegistryName()),
                ItemCatalogs.DACITE_TILE = new BlockItem(BlockCatalogs.DACITE_TILE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DACITE_TILE.getRegistryName()),


                ItemCatalogs.MOSSY_STONE = new BlockItem(BlockCatalogs.MOSSY_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MOSSY_STONE.getRegistryName()),
                ItemCatalogs.OVERGROWN_STONE = new BlockItem(BlockCatalogs.OVERGROWN_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.OVERGROWN_STONE.getRegistryName()),
                ItemCatalogs.ROCKY_STONE = new BlockItem(BlockCatalogs.ROCKY_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ROCKY_STONE.getRegistryName()),


                ItemCatalogs.SCORIA_STONE = new BlockItem(BlockCatalogs.SCORIA_STONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SCORIA_STONE.getRegistryName()),
                ItemCatalogs.SCORIA_COBBLESTONE = new BlockItem(BlockCatalogs.SCORIA_COBBLESTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SCORIA_COBBLESTONE.getRegistryName()),
                ItemCatalogs.SCORIA_PILLAR = new BlockItem(BlockCatalogs.SCORIA_PILLAR, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SCORIA_PILLAR.getRegistryName()),
                ItemCatalogs.SCORIA_STONEBRICKS = new BlockItem(BlockCatalogs.SCORIA_STONEBRICKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SCORIA_STONEBRICKS.getRegistryName()),


                ItemCatalogs.SOAPSTONE = new BlockItem(BlockCatalogs.SOAPSTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SOAPSTONE.getRegistryName()),
                ItemCatalogs.POLISHED_SOAPSTONE = new BlockItem(BlockCatalogs.POLISHED_SOAPSTONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.POLISHED_SOAPSTONE.getRegistryName()),
                ItemCatalogs.SOAPSTONE_BRICKS = new BlockItem(BlockCatalogs.SOAPSTONE_BRICKS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SOAPSTONE_BRICKS.getRegistryName()),
                ItemCatalogs.SOAPSTONE_PILLAR = new BlockItem(BlockCatalogs.SOAPSTONE_PILLAR, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SOAPSTONE_PILLAR.getRegistryName()),
                ItemCatalogs.SOAPSTONE_TILE = new BlockItem(BlockCatalogs.SOAPSTONE_TILE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SOAPSTONE_TILE.getRegistryName()),


                //StrippedLogItems
                ItemCatalogs.STRIPPED_ASPEN_LOG = new BlockItem(BlockCatalogs.STRIPPED_ASPEN_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_ASPEN_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_BAOBAB_LOG = new BlockItem(BlockCatalogs.STRIPPED_BAOBAB_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_BAOBAB_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_BLUE_ENCHANTED_LOG = new BlockItem(BlockCatalogs.STRIPPED_BLUE_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_BLUE_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_CHERRY_LOG = new BlockItem(BlockCatalogs.STRIPPED_CHERRY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_CHERRY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_CIKA_LOG = new BlockItem(BlockCatalogs.STRIPPED_CIKA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_CIKA_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_CYPRESS_LOG = new BlockItem(BlockCatalogs.STRIPPED_CYPRESS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_CYPRESS_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_EBONY_LOG = new BlockItem(BlockCatalogs.STRIPPED_EBONY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_EBONY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_FIR_LOG = new BlockItem(BlockCatalogs.STRIPPED_FIR_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_FIR_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_GREEN_ENCHANTED_LOG = new BlockItem(BlockCatalogs.STRIPPED_GREEN_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_GREEN_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_HOLLY_LOG = new BlockItem(BlockCatalogs.STRIPPED_HOLLY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_HOLLY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_JACARANDA_LOG = new BlockItem(BlockCatalogs.STRIPPED_JACARANDA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_JACARANDA_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_MAHOGANY_LOG = new BlockItem(BlockCatalogs.STRIPPED_MAHOGANY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_MAHOGANY_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_MANGROVE_LOG = new BlockItem(BlockCatalogs.STRIPPED_MANGROVE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_MANGROVE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_MAPLE_LOG = new BlockItem(BlockCatalogs.STRIPPED_MAPLE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_MAPLE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_PALO_VERDE_LOG = new BlockItem(BlockCatalogs.STRIPPED_PALO_VERDE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_PALO_VERDE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_PINE_LOG = new BlockItem(BlockCatalogs.STRIPPED_PINE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_PINE_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BlockItem(BlockCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_SKYRIS_LOG = new BlockItem(BlockCatalogs.STRIPPED_SKYRIS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_SKYRIS_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_WILLOW_LOG = new BlockItem(BlockCatalogs.STRIPPED_WILLOW_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_WILLOW_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_REDWOOD_LOG = new BlockItem(BlockCatalogs.STRIPPED_REDWOOD_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_REDWOOD_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_WITCH_HAZEL_LOG = new BlockItem(BlockCatalogs.STRIPPED_WITCH_HAZEL_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_WITCH_HAZEL_LOG.getRegistryName()),
                ItemCatalogs.STRIPPED_ZELKOVA_LOG = new BlockItem(BlockCatalogs.STRIPPED_ZELKOVA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.STRIPPED_ZELKOVA_LOG.getRegistryName()),

                //LeaveItems
                ItemCatalogs.ASPEN_LEAVES = new BlockItem(BlockCatalogs.ASPEN_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ASPEN_LEAVES.getRegistryName()),
                ItemCatalogs.BAOBAB_LEAVES = new BlockItem(BlockCatalogs.BAOBAB_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BAOBAB_LEAVES.getRegistryName()),
                ItemCatalogs.BLOOMING_WITCH_HAZEL_LEAVES = new BlockItem(BlockCatalogs.BLOOMING_WITCH_HAZEL_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLOOMING_WITCH_HAZEL_LEAVES.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_LEAVES = new BlockItem(BlockCatalogs.BLUE_ENCHANTED_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_ENCHANTED_LEAVES.getRegistryName()),
                ItemCatalogs.BLUE_SPRUCE_LEAVES = new BlockItem(BlockCatalogs.BLUE_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_SPRUCE_LEAVES.getRegistryName()),
                ItemCatalogs.BROWN_BIRCH_LEAVES = new BlockItem(BlockCatalogs.BROWN_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BROWN_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.BROWN_OAK_LEAVES = new BlockItem(BlockCatalogs.BROWN_OAK_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BROWN_OAK_LEAVES.getRegistryName()),
                ItemCatalogs.CIKA_LEAVES = new BlockItem(BlockCatalogs.CIKA_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CIKA_LEAVES.getRegistryName()),
                ItemCatalogs.CYPRESS_LEAVES = new BlockItem(BlockCatalogs.CYPRESS_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYPRESS_LEAVES.getRegistryName()),
                ItemCatalogs.EBONY_LEAVES = new BlockItem(BlockCatalogs.EBONY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.EBONY_LEAVES.getRegistryName()),
                ItemCatalogs.FIR_LEAVES = new BlockItem(BlockCatalogs.FIR_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIR_LEAVES.getRegistryName()),
                ItemCatalogs.FLOWERING_ORCHARD_LEAVES = new BlockItem(BlockCatalogs.FLOWERING_ORCHARD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FLOWERING_ORCHARD_LEAVES.getRegistryName()),
                ItemCatalogs.FLOWERING_PALO_VERDE_LEAVES = new BlockItem(BlockCatalogs.FLOWERING_PALO_VERDE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FLOWERING_PALO_VERDE_LEAVES.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_LEAVES = new BlockItem(BlockCatalogs.GREEN_ENCHANTED_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_ENCHANTED_LEAVES.getRegistryName()),
                ItemCatalogs.HOLLY_BERRY_LEAVES = new BlockItem(BlockCatalogs.HOLLY_BERRY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_BERRY_LEAVES.getRegistryName()),
                ItemCatalogs.HOLLY_LEAVES = new BlockItem(BlockCatalogs.HOLLY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_LEAVES.getRegistryName()),
                ItemCatalogs.JACARANDA_LEAVES = new BlockItem(BlockCatalogs.JACARANDA_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JACARANDA_LEAVES.getRegistryName()),
                ItemCatalogs.MAHOGANY_LEAVES = new BlockItem(BlockCatalogs.MAHOGANY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAHOGANY_LEAVES.getRegistryName()),
                ItemCatalogs.MANGROVE_LEAVES = new BlockItem(BlockCatalogs.MANGROVE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MANGROVE_LEAVES.getRegistryName()),
                ItemCatalogs.ORANGE_BIRCH_LEAVES = new BlockItem(BlockCatalogs.ORANGE_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.ORANGE_OAK_LEAVES = new BlockItem(BlockCatalogs.ORANGE_OAK_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_OAK_LEAVES.getRegistryName()),
                ItemCatalogs.ORANGE_SPRUCE_LEAVES = new BlockItem(BlockCatalogs.ORANGE_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_SPRUCE_LEAVES.getRegistryName()),
                ItemCatalogs.ORCHARD_LEAVES = new BlockItem(BlockCatalogs.ORCHARD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORCHARD_LEAVES.getRegistryName()),
                ItemCatalogs.PALO_VERDE_LEAVES = new BlockItem(BlockCatalogs.PALO_VERDE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PALO_VERDE_LEAVES.getRegistryName()),
                ItemCatalogs.PINE_lEAVES = new BlockItem(BlockCatalogs.PINE_lEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINE_lEAVES.getRegistryName()),
                ItemCatalogs.PINK_CHERRY_LEAVES = new BlockItem(BlockCatalogs.PINK_CHERRY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_CHERRY_LEAVES.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_LEAVES = new BlockItem(BlockCatalogs.RAINBOW_EUCALYPTUS_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RAINBOW_EUCALYPTUS_LEAVES.getRegistryName()),
                ItemCatalogs.RED_BIRCH_LEAVES = new BlockItem(BlockCatalogs.RED_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.RED_MAPLE_LEAVES = new BlockItem(BlockCatalogs.RED_MAPLE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_MAPLE_LEAVES.getRegistryName()),
                ItemCatalogs.RED_OAK_LEAVES = new BlockItem(BlockCatalogs.RED_OAK_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_OAK_LEAVES.getRegistryName()),
                ItemCatalogs.RED_SPRUCE_LEAVES = new BlockItem(BlockCatalogs.RED_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_SPRUCE_LEAVES.getRegistryName()),
                ItemCatalogs.REDWOOD_LEAVES = new BlockItem(BlockCatalogs.REDWOOD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REDWOOD_LEAVES.getRegistryName()),
                ItemCatalogs.RIPE_ORCHARD_LEAVES = new BlockItem(BlockCatalogs.RIPE_ORCHARD_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RIPE_ORCHARD_LEAVES.getRegistryName()),
                ItemCatalogs.SILVER_MAPLE_LEAVES = new BlockItem(BlockCatalogs.SILVER_MAPLE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SILVER_MAPLE_LEAVES.getRegistryName()),
                ItemCatalogs.SKYRIS_LEAVES_GREEN_APPLE = new BlockItem(BlockCatalogs.SKYRIS_LEAVES_GREEN_APPLE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_LEAVES_GREEN_APPLE.getRegistryName()),
                ItemCatalogs.SKYRIS_LEAVES = new BlockItem(BlockCatalogs.SKYRIS_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_LEAVES.getRegistryName()),
                ItemCatalogs.WHITE_CHERRY_LEAVES = new BlockItem(BlockCatalogs.WHITE_CHERRY_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WHITE_CHERRY_LEAVES.getRegistryName()),
                ItemCatalogs.WILLOW_LEAVES = new BlockItem(BlockCatalogs.WILLOW_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WILLOW_LEAVES.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_LEAVES = new BlockItem(BlockCatalogs.WITCH_HAZEL_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WITCH_HAZEL_LEAVES.getRegistryName()),
                ItemCatalogs.YELLOW_BIRCH_LEAVES = new BlockItem(BlockCatalogs.YELLOW_BIRCH_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.YELLOW_BIRCH_LEAVES.getRegistryName()),
                ItemCatalogs.YELLOW_SPRUCE_LEAVES = new BlockItem(BlockCatalogs.YELLOW_SPRUCE_LEAVES, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.YELLOW_SPRUCE_LEAVES.getRegistryName()),

                //LogItems
                ItemCatalogs.ASPEN_LOG = new BlockItem(BlockCatalogs.ASPEN_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ASPEN_LOG.getRegistryName()),
                ItemCatalogs.BAOBAB_LOG = new BlockItem(BlockCatalogs.BAOBAB_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BAOBAB_LOG.getRegistryName()),
                ItemCatalogs.BLUE_ENCHANTED_LOG = new BlockItem(BlockCatalogs.BLUE_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.CHERRY_LOG = new BlockItem(BlockCatalogs.CHERRY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CHERRY_LOG.getRegistryName()),
                ItemCatalogs.CIKA_LOG = new BlockItem(BlockCatalogs.CIKA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CIKA_LOG.getRegistryName()),
                ItemCatalogs.CYPRESS_LOG = new BlockItem(BlockCatalogs.CYPRESS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYPRESS_LOG.getRegistryName()),
                ItemCatalogs.EBONY_LOG = new BlockItem(BlockCatalogs.EBONY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.EBONY_LOG.getRegistryName()),
                ItemCatalogs.FIR_LOG = new BlockItem(BlockCatalogs.FIR_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIR_LOG.getRegistryName()),
                ItemCatalogs.GREEN_ENCHANTED_LOG = new BlockItem(BlockCatalogs.GREEN_ENCHANTED_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_ENCHANTED_LOG.getRegistryName()),
                ItemCatalogs.HOLLY_LOG = new BlockItem(BlockCatalogs.HOLLY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.HOLLY_LOG.getRegistryName()),
                ItemCatalogs.JACARANDA_LOG = new BlockItem(BlockCatalogs.JACARANDA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JACARANDA_LOG.getRegistryName()),
                ItemCatalogs.MAHOGANY_LOG = new BlockItem(BlockCatalogs.MAHOGANY_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAHOGANY_LOG.getRegistryName()),
                ItemCatalogs.MANGROVE_LOG = new BlockItem(BlockCatalogs.MANGROVE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MANGROVE_LOG.getRegistryName()),
                ItemCatalogs.MAPLE_LOG = new BlockItem(BlockCatalogs.MAPLE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAPLE_LOG.getRegistryName()),
                ItemCatalogs.PALO_VERDE_LOG = new BlockItem(BlockCatalogs.PALO_VERDE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PALO_VERDE_LOG.getRegistryName()),
                ItemCatalogs.PINE_LOG = new BlockItem(BlockCatalogs.PINE_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINE_LOG.getRegistryName()),
                ItemCatalogs.RAINBOW_EUCALYPTUS_LOG = new BlockItem(BlockCatalogs.RAINBOW_EUCALYPTUS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RAINBOW_EUCALYPTUS_LOG.getRegistryName()),
                ItemCatalogs.REDWOOD_LOG = new BlockItem(BlockCatalogs.REDWOOD_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.REDWOOD_LOG.getRegistryName()),
                ItemCatalogs.SKYRIS_LOG = new BlockItem(BlockCatalogs.SKYRIS_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SKYRIS_LOG.getRegistryName()),
                ItemCatalogs.WILLOW_LOG = new BlockItem(BlockCatalogs.WILLOW_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WILLOW_LOG.getRegistryName()),
                ItemCatalogs.WITCH_HAZEL_LOG = new BlockItem(BlockCatalogs.WITCH_HAZEL_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WITCH_HAZEL_LOG.getRegistryName()),
                ItemCatalogs.ZELKOVA_LOG = new BlockItem(BlockCatalogs.ZELKOVA_LOG, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ZELKOVA_LOG.getRegistryName()),

                //FlowerItems
                ItemCatalogs.ALLIUM_FLOWER_BUSH = new BlockItem(BlockCatalogs.ALLIUM_FLOWER_BUSH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ALLIUM_FLOWER_BUSH.getRegistryName()),
                ItemCatalogs.ALPINE_BELLFLOWER = new BlockItem(BlockCatalogs.ALPINE_BELLFLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ALPINE_BELLFLOWER.getRegistryName()),
                ItemCatalogs.PINK_ALLIUM_FLOWER_BUSH = new BlockItem(BlockCatalogs.PINK_ALLIUM_FLOWER_BUSH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_ALLIUM_FLOWER_BUSH.getRegistryName()),
                ItemCatalogs.ANGELICA = new BlockItem(BlockCatalogs.ANGELICA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ANGELICA.getRegistryName()),
                ItemCatalogs.AZALEA = new BlockItem(BlockCatalogs.AZALEA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.AZALEA.getRegistryName()),
                ItemCatalogs.BEGONIA = new BlockItem(BlockCatalogs.BEGONIA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BEGONIA.getRegistryName()),
                ItemCatalogs.BISTORT = new BlockItem(BlockCatalogs.BISTORT, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BISTORT.getRegistryName()),
                ItemCatalogs.BLACK_ROSE = new BlockItem(BlockCatalogs.BLACK_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLACK_ROSE.getRegistryName()),
                ItemCatalogs.BLUE_SAGE = new BlockItem(BlockCatalogs.BLUE_SAGE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.BLUE_SAGE.getRegistryName()),
                ItemCatalogs.CALIFORNIA_POPPY = new BlockItem(BlockCatalogs.CALIFORNIA_POPPY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CALIFORNIA_POPPY.getRegistryName()),
                ItemCatalogs.CROCUS = new BlockItem(BlockCatalogs.CROCUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CROCUS.getRegistryName()),
                ItemCatalogs.CYAN_ROSE = new BlockItem(BlockCatalogs.CYAN_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYAN_ROSE.getRegistryName()),
                ItemCatalogs.CYAN_TULIP = new BlockItem(BlockCatalogs.CYAN_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYAN_TULIP.getRegistryName()),
                ItemCatalogs.DAFFODIL = new BlockItem(BlockCatalogs.DAFFODIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DAFFODIL.getRegistryName()),
                ItemCatalogs.DELPHINIUM = new BlockItem(BlockCatalogs.DELPHINIUM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.DELPHINIUM.getRegistryName()),
                ItemCatalogs.FAIRY_SLIPPER = new BlockItem(BlockCatalogs.FAIRY_SLIPPER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FAIRY_SLIPPER.getRegistryName()),
                ItemCatalogs.FIRECRACKER_FLOWER_BUSH = new BlockItem(BlockCatalogs.FIRECRACKER_FLOWER_BUSH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FIRECRACKER_FLOWER_BUSH.getRegistryName()),
                ItemCatalogs.FOXGLOVE = new BlockItem(BlockCatalogs.FOXGLOVE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.FOXGLOVE.getRegistryName()),
                ItemCatalogs.GOLDEN_SPINED_CACTUS = new BlockItem(BlockCatalogs.GOLDEN_SPINED_CACTUS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GOLDEN_SPINED_CACTUS.getRegistryName()),
                ItemCatalogs.GREEN_TULIP = new BlockItem(BlockCatalogs.GREEN_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GREEN_TULIP.getRegistryName()),
                ItemCatalogs.GUZMANIA = new BlockItem(BlockCatalogs.GUZMANIA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.GUZMANIA.getRegistryName()),
                ItemCatalogs.INCAN_LILY = new BlockItem(BlockCatalogs.INCAN_LILY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.INCAN_LILY.getRegistryName()),
                ItemCatalogs.IRIS = new BlockItem(BlockCatalogs.IRIS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.IRIS.getRegistryName()),
                ItemCatalogs.JAPANESE_ORCHID = new BlockItem(BlockCatalogs.JAPANESE_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.JAPANESE_ORCHID.getRegistryName()),
                ItemCatalogs.KOVAN_FLOWER = new BlockItem(BlockCatalogs.KOVAN_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.KOVAN_FLOWER.getRegistryName()),
                ItemCatalogs.LAZARUS_BELLFLOWER = new BlockItem(BlockCatalogs.LAZARUS_BELLFLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.LAZARUS_BELLFLOWER.getRegistryName()),
                ItemCatalogs.LOLIPOP_FLOWER = new BlockItem(BlockCatalogs.LOLIPOP_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.LOLIPOP_FLOWER.getRegistryName()),
                ItemCatalogs.MAGENTA_TULIP = new BlockItem(BlockCatalogs.MAGENTA_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAGENTA_TULIP.getRegistryName()),
                ItemCatalogs.ORANGE_DAISY = new BlockItem(BlockCatalogs.ORANGE_DAISY, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_DAISY.getRegistryName()),
                ItemCatalogs.ORSIRIA_ROSE = new BlockItem(BlockCatalogs.ORSIRIA_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORSIRIA_ROSE.getRegistryName()),
                ItemCatalogs.PEACH_LEATHER_FLOWER = new BlockItem(BlockCatalogs.PEACH_LEATHER_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PEACH_LEATHER_FLOWER.getRegistryName()),
                ItemCatalogs.PINK_ALLIUM = new BlockItem(BlockCatalogs.PINK_ALLIUM, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_ALLIUM.getRegistryName()),
                ItemCatalogs.PINK_ANEMONE = new BlockItem(BlockCatalogs.PINK_ANEMONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_ANEMONE.getRegistryName()),
                ItemCatalogs.PINK_DAFFODIL = new BlockItem(BlockCatalogs.PINK_DAFFODIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_DAFFODIL.getRegistryName()),
                ItemCatalogs.PINK_ORCHID = new BlockItem(BlockCatalogs.PINK_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PINK_ORCHID.getRegistryName()),
                ItemCatalogs.PRAIRIE_GRASS = new BlockItem(BlockCatalogs.PRAIRIE_GRASS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PRAIRIE_GRASS.getRegistryName()),
                ItemCatalogs.PROTEA_FLOWER = new BlockItem(BlockCatalogs.PROTEA_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PROTEA_FLOWER.getRegistryName()),
                ItemCatalogs.PURPLE_ORCHID = new BlockItem(BlockCatalogs.PURPLE_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PURPLE_ORCHID.getRegistryName()),
                ItemCatalogs.PURPLE_SAGE = new BlockItem(BlockCatalogs.PURPLE_SAGE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PURPLE_SAGE.getRegistryName()),
                ItemCatalogs.PURPLE_TULIP = new BlockItem(BlockCatalogs.PURPLE_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PURPLE_TULIP.getRegistryName()),
                ItemCatalogs.RED_CORNFLOWER = new BlockItem(BlockCatalogs.RED_CORNFLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_CORNFLOWER.getRegistryName()),
                ItemCatalogs.RED_ORCHID = new BlockItem(BlockCatalogs.RED_ORCHID, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RED_ORCHID.getRegistryName()),
                ItemCatalogs.RICHEA = new BlockItem(BlockCatalogs.RICHEA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.RICHEA.getRegistryName()),
                ItemCatalogs.ROSE = new BlockItem(BlockCatalogs.ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ROSE.getRegistryName()),
                ItemCatalogs.SILVER_VASE_FLOWER = new BlockItem(BlockCatalogs.SILVER_VASE_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SILVER_VASE_FLOWER.getRegistryName()),
                ItemCatalogs.SNOWDROPS = new BlockItem(BlockCatalogs.SNOWDROPS, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.SNOWDROPS.getRegistryName()),
                ItemCatalogs.TORCH_GINGER = new BlockItem(BlockCatalogs.TORCH_GINGER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.TORCH_GINGER.getRegistryName()),
                ItemCatalogs.VIOLET_LEATHER_FLOWER = new BlockItem(BlockCatalogs.VIOLET_LEATHER_FLOWER, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.VIOLET_LEATHER_FLOWER.getRegistryName()),
                ItemCatalogs.WHITE_ANEMONE = new BlockItem(BlockCatalogs.WHITE_ANEMONE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WHITE_ANEMONE.getRegistryName()),
                ItemCatalogs.WHITE_SAGE = new BlockItem(BlockCatalogs.WHITE_SAGE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WHITE_SAGE.getRegistryName()),
                ItemCatalogs.WINTER_CYCLAMEN = new BlockItem(BlockCatalogs.WINTER_CYCLAMEN, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WINTER_CYCLAMEN.getRegistryName()),
                ItemCatalogs.WINTER_ROSE = new BlockItem(BlockCatalogs.WINTER_ROSE, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WINTER_ROSE.getRegistryName()),
                ItemCatalogs.WINTER_SCILLA = new BlockItem(BlockCatalogs.WINTER_SCILLA, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.WINTER_SCILLA.getRegistryName()),
                ItemCatalogs.YELLOW_DAFFODIL = new BlockItem(BlockCatalogs.YELLOW_DAFFODIL, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.YELLOW_DAFFODIL.getRegistryName()),
                ItemCatalogs.YELLOW_TULIP = new BlockItem(BlockCatalogs.YELLOW_TULIP, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.YELLOW_TULIP.getRegistryName()),
                ItemCatalogs.AMARANTH = new BlockItem(BlockCatalogs.AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.AMARANTH.getRegistryName()),
                ItemCatalogs.CYAN_AMARANTH = new BlockItem(BlockCatalogs.CYAN_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.CYAN_AMARANTH.getRegistryName()),
                ItemCatalogs.ORANGE_AMARANTH = new BlockItem(BlockCatalogs.ORANGE_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.ORANGE_AMARANTH.getRegistryName()),
                ItemCatalogs.MAGENTA_AMARANTH = new BlockItem(BlockCatalogs.MAGENTA_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.MAGENTA_AMARANTH.getRegistryName()),
                ItemCatalogs.PURPLE_AMARANTH = new BlockItem(BlockCatalogs.PURPLE_AMARANTH, new Item.Properties().group(BYG.Init.creativeTab)).setRegistryName(BlockCatalogs.PURPLE_AMARANTH.getRegistryName())
        );
        BYG.LOGGER.info("All BYG items registered!");

    }
}
