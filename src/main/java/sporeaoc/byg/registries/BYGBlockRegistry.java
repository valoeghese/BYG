package sporeaoc.byg.registries;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.bygproperties.BYGBlockProperties;
import sporeaoc.byg.bygproperties.otherproperties.BYGSaplingProperties;
import sporeaoc.byg.bygproperties.otherproperties.blocks.BYGRedStoneLantern;
import sporeaoc.byg.catalogs.BlockCatalogs;
import sporeaoc.byg.world.tree.BYGSaplingToTree;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBlockRegistry {
    // Plank Blocks
    @SubscribeEvent
    public static void registerPlankBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_PLANKS = new BYGBlockProperties.BlockPlanks("aspen_planks"),
                BlockCatalogs.BAOBAB_PLANKS = new BYGBlockProperties.BlockPlanks("baobab_planks"),
                BlockCatalogs.BLUE_ENCHANTED_PLANKS = new BYGBlockProperties.BlockPlanks("blue_enchanted_planks"),
                BlockCatalogs.CHERRY_PLANKS = new BYGBlockProperties.BlockPlanks("cherry_planks"),
                BlockCatalogs.CIKA_PLANKS = new BYGBlockProperties.BlockPlanks("cika_planks"),
                BlockCatalogs.CYPRESS_PLANKS = new BYGBlockProperties.BlockPlanks("cypress_planks"),
                BlockCatalogs.EBONY_PLANKS = new BYGBlockProperties.BlockPlanks("ebony_planks"),
                BlockCatalogs.FIR_PLANKS = new BYGBlockProperties.BlockPlanks("fir_planks"),
                BlockCatalogs.GREEN_ENCHANTED_PLANKS = new BYGBlockProperties.BlockPlanks("green_enchanted_planks"),
                BlockCatalogs.HOLLY_PLANKS = new BYGBlockProperties.BlockPlanks("holly_planks"),
                BlockCatalogs.JACARANDA_PLANKS = new BYGBlockProperties.BlockPlanks("jacaranda_planks"),
                BlockCatalogs.MAHOGANY_PLANKS = new BYGBlockProperties.BlockPlanks("mahogany_planks"),
                BlockCatalogs.MANGROVE_PLANKS = new BYGBlockProperties.BlockPlanks("mangrove_planks"),
                BlockCatalogs.MAPLE_PLANKS = new BYGBlockProperties.BlockPlanks("maple_planks"),
                BlockCatalogs.PINE_PLANKS = new BYGBlockProperties.BlockPlanks("pine_planks"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_PLANKS = new BYGBlockProperties.BlockPlanks("rainbow_eucalyptus_planks"),
                BlockCatalogs.REDWOOD_PLANKS = new BYGBlockProperties.BlockPlanks("redwood_planks"),
                BlockCatalogs.SKYRIS_PLANKS = new BYGBlockProperties.BlockPlanks("skyris_planks"),
                BlockCatalogs.WILLOW_PLANKS = new BYGBlockProperties.BlockPlanks("willow_planks"),
                BlockCatalogs.WITCH_HAZEL_PLANKS = new BYGBlockProperties.BlockPlanks("witch_hazel_planks"),
                BlockCatalogs.ZELKOVA_PLANKS = new BYGBlockProperties.BlockPlanks("zelkova_planks"),

                //Bookshelves
                BlockCatalogs.ASPEN_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("aspen_bookshelf"),
                BlockCatalogs.BAOBAB_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("baobab_bookshelf"),
                BlockCatalogs.BLUE_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("blue_enchanted_bookshelf"),
                BlockCatalogs.CHERRY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cherry_bookshelf"),
                BlockCatalogs.CIKA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cika_bookshelf"),
                BlockCatalogs.CYPRESS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cypress_bookshelf"),
                BlockCatalogs.EBONY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("ebony_bookshelf"),
                BlockCatalogs.FIR_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("fir_bookshelf"),
                BlockCatalogs.GREEN_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("green_enchanted_bookshelf"),
                BlockCatalogs.HOLLY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("holly_bookshelf"),
                BlockCatalogs.JACARANDA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("jacaranda_bookshelf"),
                BlockCatalogs.MAHOGANY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mahogany_bookshelf"),
                BlockCatalogs.MANGROVE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mangrove_bookshelf"),
                BlockCatalogs.MAPLE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("maple_bookshelf"),
                BlockCatalogs.PINE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("pine_bookshelf"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("rainbow_eucalyptus_bookshelf"),
                BlockCatalogs.REDWOOD_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("redwood_bookshelf"),
                BlockCatalogs.SKYRIS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("skyris_bookshelf"),
                BlockCatalogs.WILLOW_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("willow_bookshelf"),
                BlockCatalogs.WITCH_HAZEL_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("witch_hazel_bookshelf"),
                BlockCatalogs.ZELKOVA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("zelkova_bookshelf"),

            //Slabs
                BlockCatalogs.ASPEN_SLAB = new BYGBlockProperties.BlockSlab("aspen_slab"),
                BlockCatalogs.BAOBAB_SLAB = new BYGBlockProperties.BlockSlab("baobab_slab"),
                BlockCatalogs.BLUE_ENCHANTED_SLAB = new BYGBlockProperties.BlockSlab("blue_enchanted_slab"),
                BlockCatalogs.CHERRY_SLAB = new BYGBlockProperties.BlockSlab("cherry_slab"),
                BlockCatalogs.CIKA_SLAB = new BYGBlockProperties.BlockSlab("cika_slab"),
                BlockCatalogs.CYPRESS_SLAB = new BYGBlockProperties.BlockSlab("cypress_slab"),
                BlockCatalogs.EBONY_SLAB = new BYGBlockProperties.BlockSlab("ebony_slab"),
                BlockCatalogs.FIR_SLAB = new BYGBlockProperties.BlockSlab("fir_slab"),
                BlockCatalogs.GREEN_ENCHANTED_SLAB = new BYGBlockProperties.BlockSlab("green_enchanted_slab"),
                BlockCatalogs.HOLLY_SLAB = new BYGBlockProperties.BlockSlab("holly_slab"),
                BlockCatalogs.JACARANDA_SLAB = new BYGBlockProperties.BlockSlab("jacaranda_slab"),
                BlockCatalogs.MAHOGANY_SLAB = new BYGBlockProperties.BlockSlab("mahogany_slab"),
                BlockCatalogs.MANGROVE_SLAB = new BYGBlockProperties.BlockSlab("mangrove_slab"),
                BlockCatalogs.MAPLE_SLAB = new BYGBlockProperties.BlockSlab("maple_slab"),
                BlockCatalogs.PINE_SLAB = new BYGBlockProperties.BlockSlab("pine_slab"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_SLAB = new BYGBlockProperties.BlockSlab("rainbow_eucalyptus_slab"),
                BlockCatalogs.REDWOOD_SLAB = new BYGBlockProperties.BlockSlab("redwood_slab"),
                BlockCatalogs.SKYRIS_SLAB = new BYGBlockProperties.BlockSlab("skyris_slab"),
                BlockCatalogs.WILLOW_SLAB = new BYGBlockProperties.BlockSlab("willow_slab"),
                BlockCatalogs.WITCH_HAZEL_SLAB = new BYGBlockProperties.BlockSlab("witch_hazel_slab"),
                BlockCatalogs.ZELKOVA_SLAB = new BYGBlockProperties.BlockSlab("zelkova_slab"),

            //Stairs
                BlockCatalogs.ASPEN_STAIRS = new BYGBlockProperties.BlockPlanks("aspen_stairs"),
                BlockCatalogs.BAOBAB_STAIRS = new BYGBlockProperties.BlockPlanks("baobab_stairs"),
                BlockCatalogs.BLUE_ENCHANTED_STAIRS = new BYGBlockProperties.BlockPlanks("blue_enchanted_stairs"),
                BlockCatalogs.CHERRY_STAIRS = new BYGBlockProperties.BlockPlanks("cherry_stairs"),
                BlockCatalogs.CIKA_STAIRS = new BYGBlockProperties.BlockPlanks("cika_stairs"),
                BlockCatalogs.CYPRESS_STAIRS = new BYGBlockProperties.BlockPlanks("cypress_stairs"),
                BlockCatalogs.EBONY_STAIRS = new BYGBlockProperties.BlockPlanks("ebony_stairs"),
                BlockCatalogs.FIR_STAIRS = new BYGBlockProperties.BlockPlanks("fir_stairs"),
                BlockCatalogs.GREEN_ENCHANTED_STAIRS = new BYGBlockProperties.BlockPlanks("green_enchanted_stairs"),
                BlockCatalogs.HOLLY_STAIRS = new BYGBlockProperties.BlockPlanks("holly_stairs"),
                BlockCatalogs.JACARANDA_STAIRS = new BYGBlockProperties.BlockPlanks("jacaranda_stairs"),
                BlockCatalogs.MAHOGANY_STAIRS = new BYGBlockProperties.BlockPlanks("mahogany_stairs"),
                BlockCatalogs.MANGROVE_STAIRS = new BYGBlockProperties.BlockPlanks("mangrove_stairs"),
                BlockCatalogs.MAPLE_STAIRS = new BYGBlockProperties.BlockPlanks("maple_stairs"),
                BlockCatalogs.PINE_STAIRS = new BYGBlockProperties.BlockPlanks("pine_stairs"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_STAIRS = new BYGBlockProperties.BlockPlanks("rainbow_eucalyptus_stairs"),
                BlockCatalogs.REDWOOD_STAIRS = new BYGBlockProperties.BlockPlanks("redwood_stairs"),
                BlockCatalogs.SKYRIS_STAIRS = new BYGBlockProperties.BlockPlanks("skyris_stairs"),
                BlockCatalogs.WILLOW_STAIRS = new BYGBlockProperties.BlockPlanks("willow_stairs"),
                BlockCatalogs.WITCH_HAZEL_STAIRS = new BYGBlockProperties.BlockPlanks("witch_hazel_stairs"),
                BlockCatalogs.ZELKOVA_STAIRS = new BYGBlockProperties.BlockPlanks("zelkova_stairs")



                );
    }

    // Fence Blocks
    @SubscribeEvent
    public static void registerFenceBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_FENCE = new BYGBlockProperties.BlockFence("aspen_fence"),
                BlockCatalogs.BAOBAB_FENCE = new BYGBlockProperties.BlockFence("baobab_fence"),
                BlockCatalogs.BLUE_ENCHANTED_FENCE = new BYGBlockProperties.BlockFence("blue_enchanted_fence"),
                BlockCatalogs.CHERRY_FENCE = new BYGBlockProperties.BlockFence("cherry_fence"),
                BlockCatalogs.CIKA_FENCE = new BYGBlockProperties.BlockFence("cika_fence"),
                BlockCatalogs.CYPRESS_FENCE = new BYGBlockProperties.BlockFence("cypress_fence"),
                BlockCatalogs.EBONY_FENCE = new BYGBlockProperties.BlockFence("ebony_fence"),
                BlockCatalogs.FIR_FENCE = new BYGBlockProperties.BlockFence("fir_fence"),
                BlockCatalogs.GREEN_ENCHANTED_FENCE = new BYGBlockProperties.BlockFence("green_enchanted_fence"),
                BlockCatalogs.HOLLY_FENCE = new BYGBlockProperties.BlockFence("holly_fence"),
                BlockCatalogs.JACARANDA_FENCE = new BYGBlockProperties.BlockFence("jacaranda_fence"),
                BlockCatalogs.MAHOGONY_FENCE = new BYGBlockProperties.BlockFence("mahogany_fence"),
                BlockCatalogs.MANGROVE_FENCE = new BYGBlockProperties.BlockFence("mangrove_fence"),
                BlockCatalogs.MAPLE_FENCE = new BYGBlockProperties.BlockFence("maple_fence"),
                BlockCatalogs.PINE_FENCE = new BYGBlockProperties.BlockFence("pine_fence"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_FENCE = new BYGBlockProperties.BlockFence("rainbow_eucalyptus_fence"),
                BlockCatalogs.REDWOOD_FENCE = new BYGBlockProperties.BlockFence("redwood_fence"),
                BlockCatalogs.SKYRIS_FENCE = new BYGBlockProperties.BlockFence("skyris_fence"),
                BlockCatalogs.WILLOW_FENCE = new BYGBlockProperties.BlockFence("willow_fence"),
                BlockCatalogs.WITCH_HAZEL_FENCE = new BYGBlockProperties.BlockFence("witch_hazel_fence"),
                BlockCatalogs.ZELKOVA_FENCE = new BYGBlockProperties.BlockFence("zelkova_fence")
        );
    }
    @SubscribeEvent
    public static void registerDirtBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                BlockCatalogs.PEAT_GRASSBLOCK = new BYGBlockProperties.BlockGrass("peat_grass"),
                BlockCatalogs.MEADOW_GRASSBLOCK = new BYGBlockProperties.BlockMeadowGrass("meadow_grass_block"),
                BlockCatalogs.MEADOW_DIRT = new BYGBlockProperties.BlockDirt("meadow_dirt"),
                BlockCatalogs.MUD_BLOCK = new BYGBlockProperties.BlockDirt("mud_block"),
                BlockCatalogs.MUD_BRICKS = new BYGBlockProperties.BlockDirt("mud_bricks")

        );
    }

    // Sapling Blocks
    @SubscribeEvent
    public static void registerSaplingBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_SAPLING = new BYGBlockProperties.BlockFlower("aspen_sapling"),
                BlockCatalogs.BAOBAB_SAPLING = new BYGBlockProperties.BlockFlower("baobab_sapling"),
                BlockCatalogs.BLUE_ENCHANTED_SAPLING = new BYGBlockProperties.BlockFlower("blue_enchanted_sapling"),
                BlockCatalogs.BLUE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BlueSpruceSaplingToTree(), "blue_spruce_sapling"),
                BlockCatalogs.BROWN_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownBirchSaplingToTree(), "brown_birch_sapling"),
                BlockCatalogs.BROWN_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownOakSaplingToTree(), "brown_oak_sapling"),
                BlockCatalogs.CIKA_SAPLING = new BYGBlockProperties.BlockFlower("cika_sapling"),
                BlockCatalogs.CYPRESS_SAPLING = new BYGBlockProperties.BlockFlower("cypress_sapling"),
                BlockCatalogs.EBONY_SAPLING = new BYGBlockProperties.BlockFlower("ebony_sapling"),
                BlockCatalogs.FIR_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.FirSaplingToTree(), "fir_sapling"),
                BlockCatalogs.GREEN_ENCHANTED_SAPLING = new BYGBlockProperties.BlockFlower("green_enchanted_sapling"),
                BlockCatalogs.HOLLY_SAPLING = new BYGBlockProperties.BlockFlower("holly_sapling"),
                BlockCatalogs.JACARANDA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.JacarandaSaplingToTree(), "jacaranda_sapling"),
                BlockCatalogs.MAHOGANY_SAPLING = new BYGBlockProperties.BlockFlower("mahogany_sapling"),
                BlockCatalogs.MANGROVE_SAPLING = new BYGBlockProperties.BlockFlower("mangrove_sapling"),
                BlockCatalogs.ORANGE_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeBirchSaplingToTree(), "orange_birch_sapling"),
                BlockCatalogs.ORANGE_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeOakSaplingToTree(), "orange_oak_sapling"),
                BlockCatalogs.ORANGE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeSpruceSaplingToTree(), "orange_spruce_sapling"),
                BlockCatalogs.ORCHARD_SAPLING = new BYGBlockProperties.BlockFlower("orchard_sapling"),
                BlockCatalogs.PALO_VERDE_SAPLING = new BYGBlockProperties.BlockFlower("palo_verde_sapling"),
                BlockCatalogs.PINE_SAPLING = new BYGBlockProperties.BlockFlower("pine_sapling"),
                BlockCatalogs.PINK_CHERRY_SAPLING = new BYGBlockProperties.BlockFlower("pink_cherry_sapling"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_SAPLING = new BYGBlockProperties.BlockFlower("rainbow_eucalyptus_sapling"),
                BlockCatalogs.RED_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedBirchSaplingToTree(), "red_birch_sapling"),
                BlockCatalogs.RED_MAPLE_SAPLING = new BYGBlockProperties.BlockFlower("red_maple_sapling"),
                BlockCatalogs.RED_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedOakSaplingToTree(), "red_oak_sapling"),
                BlockCatalogs.RED_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedSpruceSaplingToTree(), "red_spruce_sapling"),
                BlockCatalogs.REDWOOD_SAPLINGS = new BYGBlockProperties.BlockFlower("redwood_sapling"),
                BlockCatalogs.SILVER_MAPLE_SAPLINGS = new BYGBlockProperties.BlockFlower("silver_maple_sapling"),
                BlockCatalogs.SKYRIS_SAPLINGS = new BYGBlockProperties.BlockFlower("skyris_sapling"),
                BlockCatalogs.WHITE_CHERRY_SAPLING = new BYGBlockProperties.BlockFlower("white_cherry_sapling"),
                BlockCatalogs.WILLOW_SAPLING = new BYGBlockProperties.BlockFlower("willow_sapling"),
                BlockCatalogs.WITCH_HAZEL_SAPLING = new BYGBlockProperties.BlockFlower("witch_hazel_sapling"),
                BlockCatalogs.YELLOW_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowBirchSaplingToTree(), "yellow_birch_sapling"),
                BlockCatalogs.YELLOW_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowSpruceSaplingToTree(), "yellow_spruce_sapling")
                /*
                 * TODO: Add Sapling Blocks
                 */

                //BlockCatalogs.CYPRESS_SAPLING =-props -> new CypressTreeSapling(new CypressTree2(), props))
        );
    }

    // Leave Blocks
    @SubscribeEvent
    public static void registerLeaveBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_LEAVES = new BYGBlockProperties.BlockLeave("aspen_leaves"),
                BlockCatalogs.BAOBAB_LEAVES = new BYGBlockProperties.BlockLeave("baobab_leaves"),
                BlockCatalogs.BLOOMING_WITCH_HAZEL_LEAVES = new BYGBlockProperties.BlockLeave("blooming_witch_hazel_leaves"),
                BlockCatalogs.BLUE_ENCHANTED_LEAVES = new BYGBlockProperties.BlockLeave("blue_enchanted_leaves"),
                BlockCatalogs.BLUE_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("blue_spruce_leaves"),
                BlockCatalogs.BROWN_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("brown_birch_leaves"),
                BlockCatalogs.BROWN_OAK_LEAVES = new BYGBlockProperties.BlockLeave("brown_oak_leaves"),
                BlockCatalogs.CIKA_LEAVES = new BYGBlockProperties.BlockLeave("cika_leaves"),
                BlockCatalogs.CYPRESS_LEAVES = new BYGBlockProperties.BlockLeave("cypress_leaves"),
                BlockCatalogs.EBONY_LEAVES = new BYGBlockProperties.BlockLeave("ebony_leaves"),
                BlockCatalogs.FIR_LEAVES = new BYGBlockProperties.BlockLeave("fir_leaves"),
                BlockCatalogs.FLOWERING_ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("flowering_orchard_leaves"),
                BlockCatalogs.FLOWERING_PALO_VERDE_LEAVES = new BYGBlockProperties.BlockLeave("flowering_palo_verde_leaves"),
                BlockCatalogs.GREEN_ENCHANTED_LEAVES = new BYGBlockProperties.BlockLeave("green_enchanted_leaves"),
                BlockCatalogs.HOLLY_BERRY_LEAVES = new BYGBlockProperties.BlockLeave("holly_berry_leaves"),
                BlockCatalogs.HOLLY_LEAVES = new BYGBlockProperties.BlockLeave("holly_leaves"),
                BlockCatalogs.JACARANDA_LEAVES = new BYGBlockProperties.BlockLeave("jacaranda_leaves"),
                BlockCatalogs.MAHOGANY_LEAVES = new BYGBlockProperties.BlockLeave("mahogany_leaves"),
                BlockCatalogs.MANGROVE_LEAVES = new BYGBlockProperties.BlockLeave("mangrove_leaves"),
                BlockCatalogs.ORANGE_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("orange_birch_leaves"),
                BlockCatalogs.ORANGE_OAK_LEAVES = new BYGBlockProperties.BlockLeave("orange_oak_leaves"),
                BlockCatalogs.ORANGE_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("orange_spruce_leaves"),
                BlockCatalogs.ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("orchard_leaves"),
                BlockCatalogs.PALO_VERDE_LEAVES = new BYGBlockProperties.BlockLeave("palo_verde_leaves"),
                BlockCatalogs.PINE_lEAVES = new BYGBlockProperties.BlockLeave("pine_leaves"),
                BlockCatalogs.PINK_CHERRY_LEAVES = new BYGBlockProperties.BlockLeave("pink_cherry_leaves"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LEAVES = new BYGBlockProperties.BlockLeave("rainbow_eucalyptus_leaves"),
                BlockCatalogs.RED_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("red_birch_leaves"),
                BlockCatalogs.RED_MAPLE_LEAVES = new BYGBlockProperties.BlockLeave("red_maple_leaves"),
                BlockCatalogs.RED_OAK_LEAVES = new BYGBlockProperties.BlockLeave("red_oak_leaves"),
                BlockCatalogs.RED_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("red_spruce_leaves"),
                BlockCatalogs.REDWOOD_LEAVES = new BYGBlockProperties.BlockLeave("redwood_leaves"),
                BlockCatalogs.RIPE_ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("ripe_orchard_leaves"),
                BlockCatalogs.SILVER_MAPLE_LEAVES = new BYGBlockProperties.BlockLeave("silver_maple_leaves"),
                BlockCatalogs.SKYRIS_LEAVES_GREEN_APPLE = new BYGBlockProperties.BlockLeave("green_apple_skyris_leaves"),
                BlockCatalogs.SKYRIS_LEAVES = new BYGBlockProperties.BlockLeave("skyris_leaves"),
                BlockCatalogs.WHITE_CHERRY_LEAVES = new BYGBlockProperties.BlockLeave("white_cherry_leaves"),
                BlockCatalogs.WILLOW_LEAVES = new BYGBlockProperties.BlockLeave("willow_leaves"),
                BlockCatalogs.WITCH_HAZEL_LEAVES = new BYGBlockProperties.BlockLeave("witch_hazel_leaves"),
                BlockCatalogs.YELLOW_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("yellow_birch_leaves"),
                BlockCatalogs.YELLOW_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("yellow_spruce_leaves")

        );
    }

    // Plant Blocks
    @SubscribeEvent
    public static void registerPlantBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.GREEN_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("green_mushroom_block"),
                BlockCatalogs.MILKCAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("weeping_milkcap_mushroom_block"),
                BlockCatalogs.BLEWIT_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("wood_blewit_mushroom_block"),
                BlockCatalogs.PUFF_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("black_puff_mushroom_block"),
                BlockCatalogs.WHITE_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("white_mushroom_stem"),
                BlockCatalogs.BROWN_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("brown_mushroom_stem"),

                BlockCatalogs.CATTAIL = new BYGBlockProperties.BlockCattail("cattail"),
                BlockCatalogs.REEDS = new BYGBlockProperties.BlockCattail("reeds"),
                BlockCatalogs.HORSEWEED = new BYGBlockProperties.BlockFlower("horseweed"),
                BlockCatalogs.MINI_CACTUS = new BYGBlockProperties.BlockFlower("mini_cactus"),
                BlockCatalogs.PRICKLY_PEAR_CACTUS = new BYGBlockProperties.BlockFlower("prickly_pear_cactus"),
                BlockCatalogs.WINTER_SUCCULENT = new BYGBlockProperties.BlockFlower("winter_succulent"),
                BlockCatalogs.SHORT_GRASS = new BYGBlockProperties.BlockTallGrass("short_grass"),
                BlockCatalogs.BLUE_GLOWCANE = new BYGBlockProperties.BlockStalk("blue_glowcane"),
                BlockCatalogs.RED_GLOWCANE = new BYGBlockProperties.BlockStalk("red_glowcane"),
                BlockCatalogs.PURPLE_GLOWCANE = new BYGBlockProperties.BlockStalk("purple_glowcane"),
                BlockCatalogs.PINK_GLOWCANE = new BYGBlockProperties.BlockStalk("pink_glowcane"),
                BlockCatalogs.POISON_IVY = new BYGBlockProperties.BlockVine("poison_ivy"),
                BlockCatalogs.BLUEBERRY_BUSH = new BYGBlockProperties.BlockBerryBush("blueberry_bush"),
                BlockCatalogs.TINY_LILYPADS = new BYGBlockProperties.BlockLily("tiny_lilypads"),

                //Glowcane Blocks

                BlockCatalogs.BLUE_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("blue_glowcane_block"),
                BlockCatalogs.RED_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("red_glowcane_block"),
                BlockCatalogs.PINK_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("pink_glowcane_block"),
                BlockCatalogs.PURPLE_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("purple_glowcane_block"),

                //Decorations

                BlockCatalogs.REDSTONE_LANTERN = new BYGRedStoneLantern("redstone_lantern_block"),
//EEEE

                //Petal Blocks
                BlockCatalogs.WHITE_PETAL = new BYGBlockProperties.BlockPetal("white_petal_block"),
                BlockCatalogs.RED_PETAL = new BYGBlockProperties.BlockPetal("red_petal_block"),
                BlockCatalogs.PURPLE_PETAL = new BYGBlockProperties.BlockPetal("purple_petal_block"),
                BlockCatalogs.BLUE_PETAL = new BYGBlockProperties.BlockPetal("blue_petal_block"),
                BlockCatalogs.LIGHT_BLUE_PETAL = new BYGBlockProperties.BlockPetal("light_blue_petal_block"),
                BlockCatalogs.YELLOW_PETAL = new BYGBlockProperties.BlockPetal("yellow_petal_block"),
                BlockCatalogs.PLANT_STEM = new BYGBlockProperties.BlockLog("plant_stem")




        );
    }

    // Log Blocks
    @SubscribeEvent
    public static void registerLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_LOG = new BYGBlockProperties.BlockLog("aspen_log"),
                BlockCatalogs.BAOBAB_LOG = new BYGBlockProperties.BlockLog("baobab_log"),
                BlockCatalogs.BLUE_ENCHANTED_LOG = new BYGBlockProperties.BlockLog("blue_enchanted_log"),
                BlockCatalogs.CHERRY_LOG = new BYGBlockProperties.BlockLog("cherry_log"),
                BlockCatalogs.CIKA_LOG = new BYGBlockProperties.BlockLog("cika_log"),
                BlockCatalogs.CYPRESS_LOG = new BYGBlockProperties.BlockLog("cypress_log"),
                BlockCatalogs.EBONY_LOG = new BYGBlockProperties.BlockLog("ebony_log"),
                BlockCatalogs.FIR_LOG = new BYGBlockProperties.BlockLog("fir_log"),
                BlockCatalogs.GREEN_ENCHANTED_LOG = new BYGBlockProperties.BlockLog("green_enchanted_log"),
                BlockCatalogs.HOLLY_LOG = new BYGBlockProperties.BlockLog("holly_log"),
                BlockCatalogs.JACARANDA_LOG = new BYGBlockProperties.BlockLog("jacaranda_log"),
                BlockCatalogs.MAHOGANY_LOG = new BYGBlockProperties.BlockLog("mahogany_log"),
                BlockCatalogs.MANGROVE_LOG = new BYGBlockProperties.BlockLog("mangrove_log"),
                BlockCatalogs.MAPLE_LOG = new BYGBlockProperties.BlockLog("maple_log"),
                BlockCatalogs.PALO_VERDE_LOG = new BYGBlockProperties.BlockLog("palo_verde_log"),
                BlockCatalogs.PINE_LOG = new BYGBlockProperties.BlockLog("pine_log"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BlockLog("rainbow_eucalyptus_log"),
                BlockCatalogs.REDWOOD_LOG = new BYGBlockProperties.BlockLog("redwood_log"),
                BlockCatalogs.SKYRIS_LOG = new BYGBlockProperties.BlockLog("skyris_log"),
                BlockCatalogs.WILLOW_LOG = new BYGBlockProperties.BlockLog("willow_log"),
                BlockCatalogs.WITCH_HAZEL_LOG = new BYGBlockProperties.BlockLog("witch_hazel_log"),
                BlockCatalogs.ZELKOVA_LOG = new BYGBlockProperties.BlockLog("zelkova_log")
        );
    }

    //MushroomBlocks
    @SubscribeEvent
    public static void registerMushroomBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.BLACK_PUFF = new BYGBlockProperties.BlockMushroom("black_puff"),
                BlockCatalogs.WEEPING_MILKCAP = new BYGBlockProperties.BlockMushroom("weeping_milkcap"),
                BlockCatalogs.WOOD_BLEWIT = new BYGBlockProperties.BlockMushroom("wood_blewit"),
                BlockCatalogs.GREEN_MUSHSHROOM = new BYGBlockProperties.BlockMushroom("green_mushroom")

        );
    }

    //OreBlocks
    @SubscribeEvent
    public static void registerOreBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.PENDORITE_ORE = new BYGBlockProperties.BlockOre("pendorite_ore"),
                BlockCatalogs.AMETRINE_ORE = new BYGBlockProperties.BlockOre("ametrine_ore"),
                BlockCatalogs.PENDORITE_BLOCK = new BYGBlockProperties.BlockOre("pendorite_block"),
                BlockCatalogs.AMETRINE_BLOCK = new BYGBlockProperties.BlockOre("ametrine_block")

        );
    }

    //StoneBlocks
    @SubscribeEvent
    public static void registerStoneBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.DACITE = new BYGBlockProperties.BlockStone("dacite"),
                BlockCatalogs.DACITE_BRICKS = new BYGBlockProperties.BlockStone("dacite_bricks"),
                BlockCatalogs.DACITE_COBBLESTONE = new BYGBlockProperties.BlockStone("dacite_cobblestone"),
                BlockCatalogs.DACITE_PILLAR = new BYGBlockProperties.BlockPillar("dacite_pillar"),
                BlockCatalogs.DACITE_TILE = new BYGBlockProperties.BlockStone("dacite_tile"),

                BlockCatalogs.MOSSY_STONE = new BYGBlockProperties.BlockStone("mossy_stone"),
                BlockCatalogs.OVERGROWN_STONE = new BYGBlockProperties.BlockOvergrownStone("overgrown_stone"),
                BlockCatalogs.ROCKY_STONE = new BYGBlockProperties.BlockStone("rocky_stone"),

                BlockCatalogs.SCORIA_STONE = new BYGBlockProperties.BlockStone("scoria_stone"),
                BlockCatalogs.SCORIA_COBBLESTONE = new BYGBlockProperties.BlockStone("scoria_cobblestone"),
                BlockCatalogs.SCORIA_PILLAR = new BYGBlockProperties.BlockPillar("scoria_pillar"),
                BlockCatalogs.SCORIA_STONEBRICKS = new BYGBlockProperties.BlockStone("scoria_stonebricks"),

                BlockCatalogs.SOAPSTONE = new BYGBlockProperties.BlockStone("soapstone"),
                BlockCatalogs.POLISHED_SOAPSTONE = new BYGBlockProperties.BlockStone("polished_soapstone"),
                BlockCatalogs.SOAPSTONE_BRICKS = new BYGBlockProperties.BlockStone("soapstone_bricks"),
                BlockCatalogs.SOAPSTONE_PILLAR = new BYGBlockProperties.BlockPillar("soapstone_pillar"),
                BlockCatalogs.SOAPSTONE_TILE = new BYGBlockProperties.BlockStone("soapstone_tile")

                );
    }

    //Stripped Logs
    @SubscribeEvent
    public static void registerStrippedLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.STRIPPED_ASPEN_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_aspen_log"),
                BlockCatalogs.STRIPPED_BAOBAB_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_baobab_log"),
                BlockCatalogs.STRIPPED_BLUE_ENCHANTED_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_blue_enchanted_log"),
                BlockCatalogs.STRIPPED_CHERRY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cherry_log"),
                BlockCatalogs.STRIPPED_CIKA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cika_log"),
                BlockCatalogs.STRIPPED_CYPRESS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cypress_log"),
                BlockCatalogs.STRIPPED_EBONY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_ebony_log"),
                BlockCatalogs.STRIPPED_FIR_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_fir_log"),
                BlockCatalogs.STRIPPED_GREEN_ENCHANTED_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_green_enchanted_log"),
                BlockCatalogs.STRIPPED_HOLLY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_holly_log"),
                BlockCatalogs.STRIPPED_JACARANDA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_jacaranda_log"),
                BlockCatalogs.STRIPPED_MAHOGANY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_mahogany_log"),
                BlockCatalogs.STRIPPED_MANGROVE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_mangrove_log"),
                BlockCatalogs.STRIPPED_MAPLE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_maple_log"),
                BlockCatalogs.STRIPPED_PALO_VERDE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_palo_verde_log"),
                BlockCatalogs.STRIPPED_PINE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_pine_log"),
                BlockCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_rainbow_eucalyptus_log"),
                BlockCatalogs.STRIPPED_SKYRIS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_skyris_log"),
                BlockCatalogs.STRIPPED_WILLOW_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_willow_log"),
                BlockCatalogs.STRIPPED_REDWOOD_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_redwood_log"),
                BlockCatalogs.STRIPPED_WITCH_HAZEL_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_witch_hazel_log"),
                BlockCatalogs.STRIPPED_ZELKOVA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_zelkova_log")
        );

    }

    //FlowerBlocks
    @SubscribeEvent
    public static void registerFlowerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("allium_flower_bush"),
                BlockCatalogs.ALPINE_BELLFLOWER = new BYGBlockProperties.BlockFlower("alpine_bellflower"),
                BlockCatalogs.AMARANTH = new BYGBlockProperties.BlockFlower("amaranth"),
                BlockCatalogs.ANGELICA = new BYGBlockProperties.BlockFlower("angelica"),
                BlockCatalogs.AZALEA = new BYGBlockProperties.BlockFlower("azalea"),
                BlockCatalogs.BEGONIA = new BYGBlockProperties.BlockFlower("begonia"),
                BlockCatalogs.BISTORT = new BYGBlockProperties.BlockFlower("bistort"),
                BlockCatalogs.BLUE_SAGE = new BYGBlockProperties.BlockFlower("blue_sage"),
                BlockCatalogs.CALIFORNIA_POPPY = new BYGBlockProperties.BlockFlower("california_poppy"),
                BlockCatalogs.CROCUS = new BYGBlockProperties.BlockFlower("crocus"),
                BlockCatalogs.BLACK_ROSE = new BYGBlockProperties.BlockFlower("black_rose"),
                BlockCatalogs.CYAN_AMARANTH = new BYGBlockProperties.BlockFlower("cyan_amaranth"),
                BlockCatalogs.CYAN_ROSE = new BYGBlockProperties.BlockFlower("cyan_rose"),
                BlockCatalogs.CYAN_TULIP = new BYGBlockProperties.BlockFlower("cyan_tulip"),
                BlockCatalogs.DAFFODIL = new BYGBlockProperties.BlockFlower("daffodil"),
                BlockCatalogs.DELPHINIUM = new BYGBlockProperties.BlockFlower("delphinium"),
                BlockCatalogs.FAIRY_SLIPPER = new BYGBlockProperties.BlockFlower("fairy_slipper"),
                BlockCatalogs.FIRECRACKER_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("firecracker_flower_bush"),
                BlockCatalogs.FOXGLOVE = new BYGBlockProperties.BlockFlower("foxglove"),
                BlockCatalogs.GOLDEN_SPINED_CACTUS = new BYGBlockProperties.BlockFlower("golden_spined_cactus"),
                BlockCatalogs.GREEN_TULIP = new BYGBlockProperties.BlockFlower("green_tulip"),
                BlockCatalogs.GUZMANIA = new BYGBlockProperties.BlockFlower("guzmania"),
                BlockCatalogs.INCAN_LILY = new BYGBlockProperties.BlockFlower("incan_lily"),
                BlockCatalogs.IRIS = new BYGBlockProperties.BlockFlower("iris"),
                BlockCatalogs.JAPANESE_ORCHID = new BYGBlockProperties.BlockFlower("japanese_orchid"),
                BlockCatalogs.KOVAN_FLOWER = new BYGBlockProperties.BlockFlower("kovan_flower"),
                BlockCatalogs.LAZARUS_BELLFLOWER = new BYGBlockProperties.BlockFlower("lazarus_bellflower"),
                BlockCatalogs.LOLIPOP_FLOWER = new BYGBlockProperties.BlockFlower("lolipop_flower"),
                BlockCatalogs.MAGENTA_AMARANTH = new BYGBlockProperties.BlockFlower("magenta_amaranth"),
                BlockCatalogs.MAGENTA_TULIP = new BYGBlockProperties.BlockFlower("magenta_tulip"),
                BlockCatalogs.ORANGE_AMARANTH = new BYGBlockProperties.BlockFlower("orange_amaranth"),
                BlockCatalogs.ORANGE_DAISY = new BYGBlockProperties.BlockFlower("orange_daisy"),
                BlockCatalogs.ORSIRIA_ROSE = new BYGBlockProperties.BlockFlower("osiria_rose"),
                BlockCatalogs.PEACH_LEATHER_FLOWER = new BYGBlockProperties.BlockFlower("peach_leather_flower"),
                BlockCatalogs.PINK_ALLIUM = new BYGBlockProperties.BlockFlower("pink_allium"),
                BlockCatalogs.PINK_ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("pink_allium_flower_bush"),
                BlockCatalogs.PINK_ANEMONE = new BYGBlockProperties.BlockFlower("pink_anemone"),
                BlockCatalogs.PINK_DAFFODIL = new BYGBlockProperties.BlockFlower("pink_daffodil"),
                BlockCatalogs.PINK_ORCHID = new BYGBlockProperties.BlockFlower("pink_orchid"),
                BlockCatalogs.PRAIRIE_GRASS = new BYGBlockProperties.BlockTallGrass("prairie_grass"),
                BlockCatalogs.PROTEA_FLOWER = new BYGBlockProperties.BlockFlower("protea_flower"),
                BlockCatalogs.PURPLE_AMARANTH = new BYGBlockProperties.BlockFlower("purple_amaranth"),
                BlockCatalogs.PURPLE_ORCHID = new BYGBlockProperties.BlockFlower("purple_orchid"),
                BlockCatalogs.PURPLE_SAGE = new BYGBlockProperties.BlockFlower("purple_sage"),
                BlockCatalogs.PURPLE_TULIP = new BYGBlockProperties.BlockFlower("purple_tulip"),
                BlockCatalogs.RED_CORNFLOWER = new BYGBlockProperties.BlockFlower("red_cornflower"),
                BlockCatalogs.RED_ORCHID = new BYGBlockProperties.BlockFlower("red_orchid"),
                BlockCatalogs.RICHEA = new BYGBlockProperties.BlockFlower("richea"),
                BlockCatalogs.ROSE = new BYGBlockProperties.BlockFlower("rose"),
                BlockCatalogs.SNOWDROPS = new BYGBlockProperties.BlockFlower("snowdrops"),
                BlockCatalogs.SILVER_VASE_FLOWER = new BYGBlockProperties.BlockFlower("silver_vase_flower"),
                BlockCatalogs.TORCH_GINGER = new BYGBlockProperties.BlockFlower("torch_ginger"),
                BlockCatalogs.VIOLET_LEATHER_FLOWER = new BYGBlockProperties.BlockFlower("violet_leather_flower"),
                BlockCatalogs.WHITE_ANEMONE = new BYGBlockProperties.BlockFlower("white_anemone"),
                BlockCatalogs.WHITE_SAGE = new BYGBlockProperties.BlockFlower("white_sage"),
                BlockCatalogs.WINTER_CYCLAMEN = new BYGBlockProperties.BlockFlower("winter_cyclamen"),
                BlockCatalogs.WINTER_ROSE = new BYGBlockProperties.BlockFlower("winter_rose"),
                BlockCatalogs.WINTER_SCILLA = new BYGBlockProperties.BlockFlower("winter_scilla"),
                BlockCatalogs.YELLOW_DAFFODIL = new BYGBlockProperties.BlockFlower("yellow_daffodil"),
                BlockCatalogs.YELLOW_TULIP = new BYGBlockProperties.BlockFlower("yellow_tulip")
        );
        BYG.LOGGER.info("All BYG blocks registered!");
    }
}
