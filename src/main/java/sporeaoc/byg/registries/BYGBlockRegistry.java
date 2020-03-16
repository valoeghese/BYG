package sporeaoc.byg.registries;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.bygproperties.BYGBlockProperties;
import sporeaoc.byg.catalogs.BlockList;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBlockRegistry {
    // Plank Blocks
    @SubscribeEvent
    public static void registerPlankBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.ASPEN_PLANKS = new BYGBlockProperties.BlockPlanks("aspen_planks"),
                BlockList.BAOBAB_PLANKS = new BYGBlockProperties.BlockPlanks("baobab_planks"),
                BlockList.BLUE_ENCHANTED_PLANKS = new BYGBlockProperties.BlockPlanks("blue_enchanted_planks"),
                BlockList.CHERRY_PLANKS = new BYGBlockProperties.BlockPlanks("cherry_planks"),
                BlockList.CIKA_PLANKS = new BYGBlockProperties.BlockPlanks("cika_planks"),
                BlockList.CYPRESS_PLANKS = new BYGBlockProperties.BlockPlanks("cypress_planks"),
                BlockList.EBONY_PLANKS = new BYGBlockProperties.BlockPlanks("ebony_planks"),
                BlockList.FIR_PLANKS = new BYGBlockProperties.BlockPlanks("fir_planks"),
                BlockList.GREEN_ENCHANTED_PLANKS = new BYGBlockProperties.BlockPlanks("green_enchanted_planks"),
                BlockList.HOLLY_PLANKS = new BYGBlockProperties.BlockPlanks("holly_planks"),
                BlockList.JACARANDA_PLANKS = new BYGBlockProperties.BlockPlanks("jacaranda_planks"),
                BlockList.MAHOGANY_PLANKS = new BYGBlockProperties.BlockPlanks("mahogany_planks"),
                BlockList.MANGROVE_PLANKS = new BYGBlockProperties.BlockPlanks("mangrove_planks"),
                BlockList.MAPLE_PLANKS = new BYGBlockProperties.BlockPlanks("maple_planks"),
                BlockList.PINE_PLANKS = new BYGBlockProperties.BlockPlanks("pine_planks"),
                BlockList.RAINBOW_EUCALYPTUS_PLANKS = new BYGBlockProperties.BlockPlanks("rainbow_eucalyptus_planks"),
                BlockList.REDWOOD_PLANKS = new BYGBlockProperties.BlockPlanks("redwood_planks"),
                BlockList.SKYRIS_PLANKS = new BYGBlockProperties.BlockPlanks("skyris_planks"),
                BlockList.WILLOW_PLANKS = new BYGBlockProperties.BlockPlanks("willow_planks"),
                BlockList.WITCH_HAZEL_PLANKS = new BYGBlockProperties.BlockPlanks("witch_hazel_planks"),
                BlockList.ZELKOVA_PLANKS = new BYGBlockProperties.BlockPlanks("zelkova_planks"),

                //Bookshelves
                BlockList.ASPEN_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("aspen_bookshelf"),
                BlockList.BAOBAB_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("baobab_bookshelf"),
                BlockList.BLUE_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("blue_enchanted_bookshelf"),
                BlockList.CHERRY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cherry_bookshelf"),
                BlockList.CIKA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cika_bookshelf"),
                BlockList.CYPRESS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cypress_bookshelf"),
                BlockList.EBONY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("ebony_bookshelf"),
                BlockList.FIR_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("fir_bookshelf"),
                BlockList.GREEN_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("green_enchanted_bookshelf"),
                BlockList.HOLLY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("holly_bookshelf"),
                BlockList.JACARANDA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("jacaranda_bookshelf"),
                BlockList.MAHOGANY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mahogany_bookshelf"),
                BlockList.MANGROVE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mangrove_bookshelf"),
                BlockList.MAPLE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("maple_bookshelf"),
                BlockList.PINE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("pine_bookshelf"),
                BlockList.RAINBOW_EUCALYPTUS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("rainbow_eucalyptus_bookshelf"),
                BlockList.REDWOOD_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("redwood_bookshelf"),
                BlockList.SKYRIS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("skyris_bookshelf"),
                BlockList.WILLOW_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("willow_bookshelf"),
                BlockList.WITCH_HAZEL_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("witch_hazel_bookshelf"),
                BlockList.ZELKOVA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("zelkova_bookshelf"),

            //Slabs
                BlockList.ASPEN_SLAB = new BYGBlockProperties.BlockSlab("aspen_slab"),
                BlockList.BAOBAB_SLAB = new BYGBlockProperties.BlockSlab("baobab_slab"),
                BlockList.BLUE_ENCHANTED_SLAB = new BYGBlockProperties.BlockSlab("blue_enchanted_slab"),
                BlockList.CHERRY_SLAB = new BYGBlockProperties.BlockSlab("cherry_slab"),
                BlockList.CIKA_SLAB = new BYGBlockProperties.BlockSlab("cika_slab"),
                BlockList.CYPRESS_SLAB = new BYGBlockProperties.BlockSlab("cypress_slab"),
                BlockList.EBONY_SLAB = new BYGBlockProperties.BlockSlab("ebony_slab"),
                BlockList.FIR_SLAB = new BYGBlockProperties.BlockSlab("fir_slab"),
                BlockList.GREEN_ENCHANTED_SLAB = new BYGBlockProperties.BlockSlab("green_enchanted_slab"),
                BlockList.HOLLY_SLAB = new BYGBlockProperties.BlockSlab("holly_slab"),
                BlockList.JACARANDA_SLAB = new BYGBlockProperties.BlockSlab("jacaranda_slab"),
                BlockList.MAHOGANY_SLAB = new BYGBlockProperties.BlockSlab("mahogany_slab"),
                BlockList.MANGROVE_SLAB = new BYGBlockProperties.BlockSlab("mangrove_slab"),
                BlockList.MAPLE_SLAB = new BYGBlockProperties.BlockSlab("maple_slab"),
                BlockList.PINE_SLAB = new BYGBlockProperties.BlockSlab("pine_slab"),
                BlockList.RAINBOW_EUCALYPTUS_SLAB = new BYGBlockProperties.BlockSlab("rainbow_eucalyptus_slab"),
                BlockList.REDWOOD_SLAB = new BYGBlockProperties.BlockSlab("redwood_slab"),
                BlockList.SKYRIS_SLAB = new BYGBlockProperties.BlockSlab("skyris_slab"),
                BlockList.WILLOW_SLAB = new BYGBlockProperties.BlockSlab("willow_slab"),
                BlockList.WITCH_HAZEL_SLAB = new BYGBlockProperties.BlockSlab("witch_hazel_slab"),
                BlockList.ZELKOVA_SLAB = new BYGBlockProperties.BlockSlab("zelkova_slab"),

            //Stairs
                BlockList.ASPEN_STAIRS = new BYGBlockProperties.BlockPlanks("aspen_stairs"),
                BlockList.BAOBAB_STAIRS = new BYGBlockProperties.BlockPlanks("baobab_stairs"),
                BlockList.BLUE_ENCHANTED_STAIRS = new BYGBlockProperties.BlockPlanks("blue_enchanted_stairs"),
                BlockList.CHERRY_STAIRS = new BYGBlockProperties.BlockPlanks("cherry_stairs"),
                BlockList.CIKA_STAIRS = new BYGBlockProperties.BlockPlanks("cika_stairs"),
                BlockList.CYPRESS_STAIRS = new BYGBlockProperties.BlockPlanks("cypress_stairs"),
                BlockList.EBONY_STAIRS = new BYGBlockProperties.BlockPlanks("ebony_stairs"),
                BlockList.FIR_STAIRS = new BYGBlockProperties.BlockPlanks("fir_stairs"),
                BlockList.GREEN_ENCHANTED_STAIRS = new BYGBlockProperties.BlockPlanks("green_enchanted_stairs"),
                BlockList.HOLLY_STAIRS = new BYGBlockProperties.BlockPlanks("holly_stairs"),
                BlockList.JACARANDA_STAIRS = new BYGBlockProperties.BlockPlanks("jacaranda_stairs"),
                BlockList.MAHOGANY_STAIRS = new BYGBlockProperties.BlockPlanks("mahogany_stairs"),
                BlockList.MANGROVE_STAIRS = new BYGBlockProperties.BlockPlanks("mangrove_stairs"),
                BlockList.MAPLE_STAIRS = new BYGBlockProperties.BlockPlanks("maple_stairs"),
                BlockList.PINE_STAIRS = new BYGBlockProperties.BlockPlanks("pine_stairs"),
                BlockList.RAINBOW_EUCALYPTUS_STAIRS = new BYGBlockProperties.BlockPlanks("rainbow_eucalyptus_stairs"),
                BlockList.REDWOOD_STAIRS = new BYGBlockProperties.BlockPlanks("redwood_stairs"),
                BlockList.SKYRIS_STAIRS = new BYGBlockProperties.BlockPlanks("skyris_stairs"),
                BlockList.WILLOW_STAIRS = new BYGBlockProperties.BlockPlanks("willow_stairs"),
                BlockList.WITCH_HAZEL_STAIRS = new BYGBlockProperties.BlockPlanks("witch_hazel_stairs"),
                BlockList.ZELKOVA_STAIRS = new BYGBlockProperties.BlockPlanks("zelkova_stairs")



                );
    }

    // Fence Blocks
    @SubscribeEvent
    public static void registerFenceBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.ASPEN_FENCE = new BYGBlockProperties.BlockFence("aspen_fence"),
                BlockList.BAOBAB_FENCE = new BYGBlockProperties.BlockFence("baobab_fence"),
                BlockList.BLUE_ENCHANTED_FENCE = new BYGBlockProperties.BlockFence("blue_enchanted_fence"),
                BlockList.CHERRY_FENCE = new BYGBlockProperties.BlockFence("cherry_fence"),
                BlockList.CIKA_FENCE = new BYGBlockProperties.BlockFence("cika_fence"),
                BlockList.CYPRESS_FENCE = new BYGBlockProperties.BlockFence("cypress_fence"),
                BlockList.EBONY_FENCE = new BYGBlockProperties.BlockFence("ebony_fence"),
                BlockList.FIR_FENCE = new BYGBlockProperties.BlockFence("fir_fence"),
                BlockList.GREEN_ENCHANTED_FENCE = new BYGBlockProperties.BlockFence("green_enchanted_fence"),
                BlockList.HOLLY_FENCE = new BYGBlockProperties.BlockFence("holly_fence"),
                BlockList.JACARANDA_FENCE = new BYGBlockProperties.BlockFence("jacaranda_fence"),
                BlockList.MAHOGONY_FENCE = new BYGBlockProperties.BlockFence("mahogany_fence"),
                BlockList.MANGROVE_FENCE = new BYGBlockProperties.BlockFence("mangrove_fence"),
                BlockList.MAPLE_FENCE = new BYGBlockProperties.BlockFence("maple_fence"),
                BlockList.PINE_FENCE = new BYGBlockProperties.BlockFence("pine_fence"),
                BlockList.RAINBOW_EUCALYPTUS_FENCE = new BYGBlockProperties.BlockFence("rainbow_eucalyptus_fence"),
                BlockList.REDWOOD_FENCE = new BYGBlockProperties.BlockFence("redwood_fence"),
                BlockList.SKYRIS_FENCE = new BYGBlockProperties.BlockFence("skyris_fence"),
                BlockList.WILLOW_FENCE = new BYGBlockProperties.BlockFence("willow_fence"),
                BlockList.WITCH_HAZEL_FENCE = new BYGBlockProperties.BlockFence("witch_hazel_fence"),
                BlockList.ZELKOVA_FENCE = new BYGBlockProperties.BlockFence("zelkova_fence")
        );
    }
    @SubscribeEvent
    public static void registerDirtBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                BlockList.PEAT_GRASSBLOCK = new BYGBlockProperties.BlockGrass("peat_grass"),
                //BlockList.MEADOW_GRASSBLOCK = new BYGBlockProperties.BlockMeadowGrass("meadow_grass_block"),
                BlockList.MEADOW_DIRT = new BYGBlockProperties.BlockDirt("meadow_dirt"),
                BlockList.MUD_BLOCK = new BYGBlockProperties.BlockDirt("mud_block"),
                BlockList.MUD_BRICKS = new BYGBlockProperties.BlockDirt("mud_bricks")

        );
    }

    // Sapling Blocks
    @SubscribeEvent
    public static void registerSaplingBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
//                BlockList.ASPEN_SAPLING = new BYGBlockProperties.BlockFlower("aspen_sapling"),
//                BlockList.BAOBAB_SAPLING = new BYGBlockProperties.BlockFlower("baobab_sapling"),
//                BlockList.BLUE_ENCHANTED_SAPLING = new BYGBlockProperties.BlockFlower("blue_enchanted_sapling"),
//                BlockList.BLUE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BlueSpruceSaplingToTree(), "blue_spruce_sapling"),
//                BlockList.BROWN_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownBirchSaplingToTree(), "brown_birch_sapling"),
//                BlockList.BROWN_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownOakSaplingToTree(), "brown_oak_sapling"),
//                BlockList.CIKA_SAPLING = new BYGBlockProperties.BlockFlower("cika_sapling"),
//                BlockList.CYPRESS_SAPLING = new BYGBlockProperties.BlockFlower("cypress_sapling"),
//                BlockList.EBONY_SAPLING = new BYGBlockProperties.BlockFlower("ebony_sapling"),
//                BlockList.FIR_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.FirSaplingToTree(), "fir_sapling"),
//                BlockList.GREEN_ENCHANTED_SAPLING = new BYGBlockProperties.BlockFlower("green_enchanted_sapling"),
//                BlockList.HOLLY_SAPLING = new BYGBlockProperties.BlockFlower("holly_sapling"),
//                BlockList.JACARANDA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.JacarandaSaplingToTree(), "jacaranda_sapling"),
//                BlockList.MAHOGANY_SAPLING = new BYGBlockProperties.BlockFlower("mahogany_sapling"),
//                BlockList.MANGROVE_SAPLING = new BYGBlockProperties.BlockFlower("mangrove_sapling"),
//                BlockList.ORANGE_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeBirchSaplingToTree(), "orange_birch_sapling"),
//                BlockList.ORANGE_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeOakSaplingToTree(), "orange_oak_sapling"),
//                BlockList.ORANGE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeSpruceSaplingToTree(), "orange_spruce_sapling"),
//                BlockList.ORCHARD_SAPLING = new BYGBlockProperties.BlockFlower("orchard_sapling"),
//                BlockList.PALO_VERDE_SAPLING = new BYGBlockProperties.BlockFlower("palo_verde_sapling"),
//                BlockList.PINE_SAPLING = new BYGBlockProperties.BlockFlower("pine_sapling"),
//                BlockList.PINK_CHERRY_SAPLING = new BYGBlockProperties.BlockFlower("pink_cherry_sapling"),
//                BlockList.RAINBOW_EUCALYPTUS_SAPLING = new BYGBlockProperties.BlockFlower("rainbow_eucalyptus_sapling"),
//                BlockList.RED_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedBirchSaplingToTree(), "red_birch_sapling"),
//                BlockList.RED_MAPLE_SAPLING = new BYGBlockProperties.BlockFlower("red_maple_sapling"),
//                BlockList.RED_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedOakSaplingToTree(), "red_oak_sapling"),
//                BlockList.RED_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedSpruceSaplingToTree(), "red_spruce_sapling"),
//                BlockList.REDWOOD_SAPLINGS = new BYGBlockProperties.BlockFlower("redwood_sapling"),
//                BlockList.SILVER_MAPLE_SAPLINGS = new BYGBlockProperties.BlockFlower("silver_maple_sapling"),
//                BlockList.SKYRIS_SAPLINGS = new BYGBlockProperties.BlockFlower("skyris_sapling"),
//                BlockList.WHITE_CHERRY_SAPLING = new BYGBlockProperties.BlockFlower("white_cherry_sapling"),
//                BlockList.WILLOW_SAPLING = new BYGBlockProperties.BlockFlower("willow_sapling"),
//                BlockList.WITCH_HAZEL_SAPLING = new BYGBlockProperties.BlockFlower("witch_hazel_sapling"),
//                BlockList.YELLOW_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowBirchSaplingToTree(), "yellow_birch_sapling"),
//                BlockList.YELLOW_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowSpruceSaplingToTree(), "yellow_spruce_sapling")
                /*
                 * TODO: Add Sapling Blocks
                 */

                //BlockList.CYPRESS_SAPLING =-props -> new CypressTreeSapling(new CypressTree2(), props))
        );
    }

    // Leave Blocks
    @SubscribeEvent
    public static void registerLeaveBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.ASPEN_LEAVES = new BYGBlockProperties.BlockLeave("aspen_leaves"),
                BlockList.BAOBAB_LEAVES = new BYGBlockProperties.BlockLeave("baobab_leaves"),
                BlockList.BLOOMING_WITCH_HAZEL_LEAVES = new BYGBlockProperties.BlockLeave("blooming_witch_hazel_leaves"),
                BlockList.BLUE_ENCHANTED_LEAVES = new BYGBlockProperties.BlockLeave("blue_enchanted_leaves"),
                BlockList.BLUE_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("blue_spruce_leaves"),
                BlockList.BROWN_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("brown_birch_leaves"),
                BlockList.BROWN_OAK_LEAVES = new BYGBlockProperties.BlockLeave("brown_oak_leaves"),
                BlockList.CIKA_LEAVES = new BYGBlockProperties.BlockLeave("cika_leaves"),
                BlockList.CYPRESS_LEAVES = new BYGBlockProperties.BlockLeave("cypress_leaves"),
                BlockList.EBONY_LEAVES = new BYGBlockProperties.BlockLeave("ebony_leaves"),
                BlockList.FIR_LEAVES = new BYGBlockProperties.BlockLeave("fir_leaves"),
                BlockList.FLOWERING_ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("flowering_orchard_leaves"),
                BlockList.FLOWERING_PALO_VERDE_LEAVES = new BYGBlockProperties.BlockLeave("flowering_palo_verde_leaves"),
                BlockList.GREEN_ENCHANTED_LEAVES = new BYGBlockProperties.BlockLeave("green_enchanted_leaves"),
                BlockList.HOLLY_BERRY_LEAVES = new BYGBlockProperties.BlockLeave("holly_berry_leaves"),
                BlockList.HOLLY_LEAVES = new BYGBlockProperties.BlockLeave("holly_leaves"),
                BlockList.JACARANDA_LEAVES = new BYGBlockProperties.BlockLeave("jacaranda_leaves"),
                BlockList.MAHOGANY_LEAVES = new BYGBlockProperties.BlockLeave("mahogany_leaves"),
                BlockList.MANGROVE_LEAVES = new BYGBlockProperties.BlockLeave("mangrove_leaves"),
                BlockList.ORANGE_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("orange_birch_leaves"),
                BlockList.ORANGE_OAK_LEAVES = new BYGBlockProperties.BlockLeave("orange_oak_leaves"),
                BlockList.ORANGE_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("orange_spruce_leaves"),
                BlockList.ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("orchard_leaves"),
                BlockList.PALO_VERDE_LEAVES = new BYGBlockProperties.BlockLeave("palo_verde_leaves"),
                BlockList.PINE_lEAVES = new BYGBlockProperties.BlockLeave("pine_leaves"),
                BlockList.PINK_CHERRY_LEAVES = new BYGBlockProperties.BlockLeave("pink_cherry_leaves"),
                BlockList.RAINBOW_EUCALYPTUS_LEAVES = new BYGBlockProperties.BlockLeave("rainbow_eucalyptus_leaves"),
                BlockList.RED_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("red_birch_leaves"),
                BlockList.RED_MAPLE_LEAVES = new BYGBlockProperties.BlockLeave("red_maple_leaves"),
                BlockList.RED_OAK_LEAVES = new BYGBlockProperties.BlockLeave("red_oak_leaves"),
                BlockList.RED_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("red_spruce_leaves"),
                BlockList.REDWOOD_LEAVES = new BYGBlockProperties.BlockLeave("redwood_leaves"),
                BlockList.RIPE_ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("ripe_orchard_leaves"),
                BlockList.SILVER_MAPLE_LEAVES = new BYGBlockProperties.BlockLeave("silver_maple_leaves"),
                BlockList.SKYRIS_LEAVES_GREEN_APPLE = new BYGBlockProperties.BlockLeave("green_apple_skyris_leaves"),
                BlockList.SKYRIS_LEAVES = new BYGBlockProperties.BlockLeave("skyris_leaves"),
                BlockList.WHITE_CHERRY_LEAVES = new BYGBlockProperties.BlockLeave("white_cherry_leaves"),
                BlockList.WILLOW_LEAVES = new BYGBlockProperties.BlockLeave("willow_leaves"),
                BlockList.WITCH_HAZEL_LEAVES = new BYGBlockProperties.BlockLeave("witch_hazel_leaves"),
                BlockList.YELLOW_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("yellow_birch_leaves"),
                BlockList.YELLOW_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("yellow_spruce_leaves")

        );
    }

    // Plant Blocks
    @SubscribeEvent
    public static void registerPlantBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.GREEN_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("green_mushroom_block"),
                BlockList.MILKCAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("weeping_milkcap_mushroom_block"),
                BlockList.BLEWIT_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("wood_blewit_mushroom_block"),
                BlockList.PUFF_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("black_puff_mushroom_block"),
                BlockList.WHITE_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("white_mushroom_stem"),
                BlockList.BROWN_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("brown_mushroom_stem"),

                BlockList.CATTAIL = new BYGBlockProperties.BlockCattail("cattail"),
                BlockList.REEDS = new BYGBlockProperties.BlockCattail("reeds"),
                BlockList.HORSEWEED = new BYGBlockProperties.BlockFlower("horseweed"),
                BlockList.MINI_CACTUS = new BYGBlockProperties.BlockFlower("mini_cactus"),
                BlockList.PRICKLY_PEAR_CACTUS = new BYGBlockProperties.BlockFlower("prickly_pear_cactus"),
                BlockList.WINTER_SUCCULENT = new BYGBlockProperties.BlockFlower("winter_succulent"),
                BlockList.SHORT_GRASS = new BYGBlockProperties.BlockTallGrass("short_grass"),
                BlockList.BLUE_GLOWCANE = new BYGBlockProperties.BlockStalk("blue_glowcane"),
                BlockList.RED_GLOWCANE = new BYGBlockProperties.BlockStalk("red_glowcane"),
                BlockList.PURPLE_GLOWCANE = new BYGBlockProperties.BlockStalk("purple_glowcane"),
                BlockList.PINK_GLOWCANE = new BYGBlockProperties.BlockStalk("pink_glowcane"),
                //BlockList.POISON_IVY = new BYGBlockProperties.BlockVine("poison_ivy"),
                //BlockList.BLUEBERRY_BUSH = new BYGBlockProperties.BlockBerryBush("blueberry_bush"),
                BlockList.TINY_LILYPADS = new BYGBlockProperties.BlockLily("tiny_lilypads"),

                //Glowcane Blocks

                BlockList.BLUE_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("blue_glowcane_block"),
                BlockList.RED_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("red_glowcane_block"),
                BlockList.PINK_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("pink_glowcane_block"),
                BlockList.PURPLE_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("purple_glowcane_block"),

                //Decorations

                //BlockList.REDSTONE_LANTERN = new BYGRedStoneLantern("redstone_lantern_block"),
//EEEE

                //Petal Blocks
                BlockList.WHITE_PETAL = new BYGBlockProperties.BlockPetal("white_petal_block"),
                BlockList.RED_PETAL = new BYGBlockProperties.BlockPetal("red_petal_block"),
                BlockList.PURPLE_PETAL = new BYGBlockProperties.BlockPetal("purple_petal_block"),
                BlockList.BLUE_PETAL = new BYGBlockProperties.BlockPetal("blue_petal_block"),
                BlockList.LIGHT_BLUE_PETAL = new BYGBlockProperties.BlockPetal("light_blue_petal_block"),
                BlockList.YELLOW_PETAL = new BYGBlockProperties.BlockPetal("yellow_petal_block"),
                BlockList.PLANT_STEM = new BYGBlockProperties.BlockLog("plant_stem")




        );
    }

    // Log Blocks
    @SubscribeEvent
    public static void registerLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.ASPEN_LOG = new BYGBlockProperties.BlockLog("aspen_log"),
                BlockList.BAOBAB_LOG = new BYGBlockProperties.BlockLog("baobab_log"),
                BlockList.BLUE_ENCHANTED_LOG = new BYGBlockProperties.BlockLog("blue_enchanted_log"),
                BlockList.CHERRY_LOG = new BYGBlockProperties.BlockLog("cherry_log"),
                BlockList.CIKA_LOG = new BYGBlockProperties.BlockLog("cika_log"),
                BlockList.CYPRESS_LOG = new BYGBlockProperties.BlockLog("cypress_log"),
                BlockList.EBONY_LOG = new BYGBlockProperties.BlockLog("ebony_log"),
                BlockList.FIR_LOG = new BYGBlockProperties.BlockLog("fir_log"),
                BlockList.GREEN_ENCHANTED_LOG = new BYGBlockProperties.BlockLog("green_enchanted_log"),
                BlockList.HOLLY_LOG = new BYGBlockProperties.BlockLog("holly_log"),
                BlockList.JACARANDA_LOG = new BYGBlockProperties.BlockLog("jacaranda_log"),
                BlockList.MAHOGANY_LOG = new BYGBlockProperties.BlockLog("mahogany_log"),
                BlockList.MANGROVE_LOG = new BYGBlockProperties.BlockLog("mangrove_log"),
                BlockList.MAPLE_LOG = new BYGBlockProperties.BlockLog("maple_log"),
                BlockList.PALO_VERDE_LOG = new BYGBlockProperties.BlockLog("palo_verde_log"),
                BlockList.PINE_LOG = new BYGBlockProperties.BlockLog("pine_log"),
                BlockList.RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BlockLog("rainbow_eucalyptus_log"),
                BlockList.REDWOOD_LOG = new BYGBlockProperties.BlockLog("redwood_log"),
                BlockList.SKYRIS_LOG = new BYGBlockProperties.BlockLog("skyris_log"),
                BlockList.WILLOW_LOG = new BYGBlockProperties.BlockLog("willow_log"),
                BlockList.WITCH_HAZEL_LOG = new BYGBlockProperties.BlockLog("witch_hazel_log"),
                BlockList.ZELKOVA_LOG = new BYGBlockProperties.BlockLog("zelkova_log")
        );
    }

    //MushroomBlocks
    @SubscribeEvent
    public static void registerMushroomBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.BLACK_PUFF = new BYGBlockProperties.BlockMushroom("black_puff"),
                BlockList.WEEPING_MILKCAP = new BYGBlockProperties.BlockMushroom("weeping_milkcap"),
                BlockList.WOOD_BLEWIT = new BYGBlockProperties.BlockMushroom("wood_blewit"),
                BlockList.GREEN_MUSHSHROOM = new BYGBlockProperties.BlockMushroom("green_mushroom")

        );
    }

    //OreBlocks
    @SubscribeEvent
    public static void registerOreBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.PENDORITE_ORE = new BYGBlockProperties.BlockOre("pendorite_ore"),
                BlockList.AMETRINE_ORE = new BYGBlockProperties.BlockOre("ametrine_ore"),
                BlockList.PENDORITE_BLOCK = new BYGBlockProperties.BlockOre("pendorite_block"),
                BlockList.AMETRINE_BLOCK = new BYGBlockProperties.BlockOre("ametrine_block")

        );
    }

    //StoneBlocks
    @SubscribeEvent
    public static void registerStoneBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.DACITE = new BYGBlockProperties.BlockStone("dacite"),
                BlockList.DACITE_BRICKS = new BYGBlockProperties.BlockStone("dacite_bricks"),
                BlockList.DACITE_COBBLESTONE = new BYGBlockProperties.BlockStone("dacite_cobblestone"),
                BlockList.DACITE_PILLAR = new BYGBlockProperties.BlockPillar("dacite_pillar"),
                BlockList.DACITE_TILE = new BYGBlockProperties.BlockStone("dacite_tile"),

                BlockList.MOSSY_STONE = new BYGBlockProperties.BlockStone("mossy_stone"),
                //BlockList.OVERGROWN_STONE = new BYGBlockProperties.BlockOvergrownStone("overgrown_stone"),
                BlockList.ROCKY_STONE = new BYGBlockProperties.BlockStone("rocky_stone"),

                BlockList.SCORIA_STONE = new BYGBlockProperties.BlockStone("scoria_stone"),
                BlockList.SCORIA_COBBLESTONE = new BYGBlockProperties.BlockStone("scoria_cobblestone"),
                BlockList.SCORIA_PILLAR = new BYGBlockProperties.BlockPillar("scoria_pillar"),
                BlockList.SCORIA_STONEBRICKS = new BYGBlockProperties.BlockStone("scoria_stonebricks"),

                BlockList.SOAPSTONE = new BYGBlockProperties.BlockStone("soapstone"),
                BlockList.POLISHED_SOAPSTONE = new BYGBlockProperties.BlockStone("polished_soapstone"),
                BlockList.SOAPSTONE_BRICKS = new BYGBlockProperties.BlockStone("soapstone_bricks"),
                BlockList.SOAPSTONE_PILLAR = new BYGBlockProperties.BlockPillar("soapstone_pillar"),
                BlockList.SOAPSTONE_TILE = new BYGBlockProperties.BlockStone("soapstone_tile")

                );
    }

    //Stripped Logs
    @SubscribeEvent
    public static void registerStrippedLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.STRIPPED_ASPEN_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_aspen_log"),
                BlockList.STRIPPED_BAOBAB_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_baobab_log"),
                BlockList.STRIPPED_BLUE_ENCHANTED_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_blue_enchanted_log"),
                BlockList.STRIPPED_CHERRY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cherry_log"),
                BlockList.STRIPPED_CIKA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cika_log"),
                BlockList.STRIPPED_CYPRESS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cypress_log"),
                BlockList.STRIPPED_EBONY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_ebony_log"),
                BlockList.STRIPPED_FIR_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_fir_log"),
                BlockList.STRIPPED_GREEN_ENCHANTED_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_green_enchanted_log"),
                BlockList.STRIPPED_HOLLY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_holly_log"),
                BlockList.STRIPPED_JACARANDA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_jacaranda_log"),
                BlockList.STRIPPED_MAHOGANY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_mahogany_log"),
                BlockList.STRIPPED_MANGROVE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_mangrove_log"),
                BlockList.STRIPPED_MAPLE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_maple_log"),
                BlockList.STRIPPED_PALO_VERDE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_palo_verde_log"),
                BlockList.STRIPPED_PINE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_pine_log"),
                BlockList.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_rainbow_eucalyptus_log"),
                BlockList.STRIPPED_SKYRIS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_skyris_log"),
                BlockList.STRIPPED_WILLOW_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_willow_log"),
                BlockList.STRIPPED_REDWOOD_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_redwood_log"),
                BlockList.STRIPPED_WITCH_HAZEL_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_witch_hazel_log"),
                BlockList.STRIPPED_ZELKOVA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_zelkova_log")
        );

    }

    //FlowerBlocks
    @SubscribeEvent
    public static void registerFlowerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockList.ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("allium_flower_bush"),
                BlockList.ALPINE_BELLFLOWER = new BYGBlockProperties.BlockFlower("alpine_bellflower"),
                BlockList.AMARANTH = new BYGBlockProperties.BlockFlower("amaranth"),
                BlockList.ANGELICA = new BYGBlockProperties.BlockFlower("angelica"),
                BlockList.AZALEA = new BYGBlockProperties.BlockFlower("azalea"),
                BlockList.BEGONIA = new BYGBlockProperties.BlockFlower("begonia"),
                BlockList.BISTORT = new BYGBlockProperties.BlockFlower("bistort"),
                BlockList.BLUE_SAGE = new BYGBlockProperties.BlockFlower("blue_sage"),
                BlockList.CALIFORNIA_POPPY = new BYGBlockProperties.BlockFlower("california_poppy"),
                BlockList.CROCUS = new BYGBlockProperties.BlockFlower("crocus"),
                BlockList.BLACK_ROSE = new BYGBlockProperties.BlockFlower("black_rose"),
                BlockList.CYAN_AMARANTH = new BYGBlockProperties.BlockFlower("cyan_amaranth"),
                BlockList.CYAN_ROSE = new BYGBlockProperties.BlockFlower("cyan_rose"),
                BlockList.CYAN_TULIP = new BYGBlockProperties.BlockFlower("cyan_tulip"),
                BlockList.DAFFODIL = new BYGBlockProperties.BlockFlower("daffodil"),
                BlockList.DELPHINIUM = new BYGBlockProperties.BlockFlower("delphinium"),
                BlockList.FAIRY_SLIPPER = new BYGBlockProperties.BlockFlower("fairy_slipper"),
                BlockList.FIRECRACKER_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("firecracker_flower_bush"),
                BlockList.FOXGLOVE = new BYGBlockProperties.BlockFlower("foxglove"),
                BlockList.GOLDEN_SPINED_CACTUS = new BYGBlockProperties.BlockFlower("golden_spined_cactus"),
                BlockList.GREEN_TULIP = new BYGBlockProperties.BlockFlower("green_tulip"),
                BlockList.GUZMANIA = new BYGBlockProperties.BlockFlower("guzmania"),
                BlockList.INCAN_LILY = new BYGBlockProperties.BlockFlower("incan_lily"),
                BlockList.IRIS = new BYGBlockProperties.BlockFlower("iris"),
                BlockList.JAPANESE_ORCHID = new BYGBlockProperties.BlockFlower("japanese_orchid"),
                BlockList.KOVAN_FLOWER = new BYGBlockProperties.BlockFlower("kovan_flower"),
                BlockList.LAZARUS_BELLFLOWER = new BYGBlockProperties.BlockFlower("lazarus_bellflower"),
                BlockList.LOLIPOP_FLOWER = new BYGBlockProperties.BlockFlower("lolipop_flower"),
                BlockList.MAGENTA_AMARANTH = new BYGBlockProperties.BlockFlower("magenta_amaranth"),
                BlockList.MAGENTA_TULIP = new BYGBlockProperties.BlockFlower("magenta_tulip"),
                BlockList.ORANGE_AMARANTH = new BYGBlockProperties.BlockFlower("orange_amaranth"),
                BlockList.ORANGE_DAISY = new BYGBlockProperties.BlockFlower("orange_daisy"),
                BlockList.ORSIRIA_ROSE = new BYGBlockProperties.BlockFlower("osiria_rose"),
                BlockList.PEACH_LEATHER_FLOWER = new BYGBlockProperties.BlockFlower("peach_leather_flower"),
                BlockList.PINK_ALLIUM = new BYGBlockProperties.BlockFlower("pink_allium"),
                BlockList.PINK_ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("pink_allium_flower_bush"),
                BlockList.PINK_ANEMONE = new BYGBlockProperties.BlockFlower("pink_anemone"),
                BlockList.PINK_DAFFODIL = new BYGBlockProperties.BlockFlower("pink_daffodil"),
                BlockList.PINK_ORCHID = new BYGBlockProperties.BlockFlower("pink_orchid"),
                BlockList.PRAIRIE_GRASS = new BYGBlockProperties.BlockTallGrass("prairie_grass"),
                BlockList.PROTEA_FLOWER = new BYGBlockProperties.BlockFlower("protea_flower"),
                BlockList.PURPLE_AMARANTH = new BYGBlockProperties.BlockFlower("purple_amaranth"),
                BlockList.PURPLE_ORCHID = new BYGBlockProperties.BlockFlower("purple_orchid"),
                BlockList.PURPLE_SAGE = new BYGBlockProperties.BlockFlower("purple_sage"),
                BlockList.PURPLE_TULIP = new BYGBlockProperties.BlockFlower("purple_tulip"),
                BlockList.RED_CORNFLOWER = new BYGBlockProperties.BlockFlower("red_cornflower"),
                BlockList.RED_ORCHID = new BYGBlockProperties.BlockFlower("red_orchid"),
                BlockList.RICHEA = new BYGBlockProperties.BlockFlower("richea"),
                BlockList.ROSE = new BYGBlockProperties.BlockFlower("rose"),
                BlockList.SNOWDROPS = new BYGBlockProperties.BlockFlower("snowdrops"),
                BlockList.SILVER_VASE_FLOWER = new BYGBlockProperties.BlockFlower("silver_vase_flower"),
                BlockList.TORCH_GINGER = new BYGBlockProperties.BlockFlower("torch_ginger"),
                BlockList.VIOLET_LEATHER_FLOWER = new BYGBlockProperties.BlockFlower("violet_leather_flower"),
                BlockList.WHITE_ANEMONE = new BYGBlockProperties.BlockFlower("white_anemone"),
                BlockList.WHITE_SAGE = new BYGBlockProperties.BlockFlower("white_sage"),
                BlockList.WINTER_CYCLAMEN = new BYGBlockProperties.BlockFlower("winter_cyclamen"),
                BlockList.WINTER_ROSE = new BYGBlockProperties.BlockFlower("winter_rose"),
                BlockList.WINTER_SCILLA = new BYGBlockProperties.BlockFlower("winter_scilla"),
                BlockList.YELLOW_DAFFODIL = new BYGBlockProperties.BlockFlower("yellow_daffodil"),
                BlockList.YELLOW_TULIP = new BYGBlockProperties.BlockFlower("yellow_tulip")
        );
        BYG.LOGGER.info("All BYG blocks registered!");
    }
}
