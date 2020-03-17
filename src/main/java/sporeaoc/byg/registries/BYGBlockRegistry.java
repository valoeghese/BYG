package sporeaoc.byg.registries;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.bygproperties.BYGBlockProperties;
import sporeaoc.byg.bygproperties.otherproperties.BYGSaplingProperties;
import sporeaoc.byg.catalogs.BYGBlockList;
import sporeaoc.byg.world.tree.BYGSaplingToTree;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBlockRegistry {
    // Plank Blocks
    @SubscribeEvent
    public static void registerPlankBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_PLANKS = new BYGBlockProperties.BlockPlanks("aspen_planks"),
                BYGBlockList.BAOBAB_PLANKS = new BYGBlockProperties.BlockPlanks("baobab_planks"),
                BYGBlockList.BLUE_ENCHANTED_PLANKS = new BYGBlockProperties.BlockPlanks("blue_enchanted_planks"),
                BYGBlockList.CHERRY_PLANKS = new BYGBlockProperties.BlockPlanks("cherry_planks"),
                BYGBlockList.CIKA_PLANKS = new BYGBlockProperties.BlockPlanks("cika_planks"),
                BYGBlockList.CYPRESS_PLANKS = new BYGBlockProperties.BlockPlanks("cypress_planks"),
                BYGBlockList.EBONY_PLANKS = new BYGBlockProperties.BlockPlanks("ebony_planks"),
                BYGBlockList.FIR_PLANKS = new BYGBlockProperties.BlockPlanks("fir_planks"),
                BYGBlockList.GREEN_ENCHANTED_PLANKS = new BYGBlockProperties.BlockPlanks("green_enchanted_planks"),
                BYGBlockList.HOLLY_PLANKS = new BYGBlockProperties.BlockPlanks("holly_planks"),
                BYGBlockList.JACARANDA_PLANKS = new BYGBlockProperties.BlockPlanks("jacaranda_planks"),
                BYGBlockList.MAHOGANY_PLANKS = new BYGBlockProperties.BlockPlanks("mahogany_planks"),
                BYGBlockList.MANGROVE_PLANKS = new BYGBlockProperties.BlockPlanks("mangrove_planks"),
                BYGBlockList.MAPLE_PLANKS = new BYGBlockProperties.BlockPlanks("maple_planks"),
                BYGBlockList.PINE_PLANKS = new BYGBlockProperties.BlockPlanks("pine_planks"),
                BYGBlockList.RAINBOW_EUCALYPTUS_PLANKS = new BYGBlockProperties.BlockPlanks("rainbow_eucalyptus_planks"),
                BYGBlockList.REDWOOD_PLANKS = new BYGBlockProperties.BlockPlanks("redwood_planks"),
                BYGBlockList.SKYRIS_PLANKS = new BYGBlockProperties.BlockPlanks("skyris_planks"),
                BYGBlockList.WILLOW_PLANKS = new BYGBlockProperties.BlockPlanks("willow_planks"),
                BYGBlockList.WITCH_HAZEL_PLANKS = new BYGBlockProperties.BlockPlanks("witch_hazel_planks"),
                BYGBlockList.ZELKOVA_PLANKS = new BYGBlockProperties.BlockPlanks("zelkova_planks"),

                //Bookshelves
                BYGBlockList.ASPEN_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("aspen_bookshelf"),
                BYGBlockList.BAOBAB_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("baobab_bookshelf"),
                BYGBlockList.BLUE_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("blue_enchanted_bookshelf"),
                BYGBlockList.CHERRY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cherry_bookshelf"),
                BYGBlockList.CIKA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cika_bookshelf"),
                BYGBlockList.CYPRESS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("cypress_bookshelf"),
                BYGBlockList.EBONY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("ebony_bookshelf"),
                BYGBlockList.FIR_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("fir_bookshelf"),
                BYGBlockList.GREEN_ENCHANTED_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("green_enchanted_bookshelf"),
                BYGBlockList.HOLLY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("holly_bookshelf"),
                BYGBlockList.JACARANDA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("jacaranda_bookshelf"),
                BYGBlockList.MAHOGANY_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mahogany_bookshelf"),
                BYGBlockList.MANGROVE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("mangrove_bookshelf"),
                BYGBlockList.MAPLE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("maple_bookshelf"),
                BYGBlockList.PINE_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("pine_bookshelf"),
                BYGBlockList.RAINBOW_EUCALYPTUS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("rainbow_eucalyptus_bookshelf"),
                BYGBlockList.REDWOOD_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("redwood_bookshelf"),
                BYGBlockList.SKYRIS_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("skyris_bookshelf"),
                BYGBlockList.WILLOW_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("willow_bookshelf"),
                BYGBlockList.WITCH_HAZEL_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("witch_hazel_bookshelf"),
                BYGBlockList.ZELKOVA_BOOKSHELF = new BYGBlockProperties.BlockBookshelf("zelkova_bookshelf"),

            //Slabs
                BYGBlockList.ASPEN_SLAB = new BYGBlockProperties.BlockSlab("aspen_slab"),
                BYGBlockList.BAOBAB_SLAB = new BYGBlockProperties.BlockSlab("baobab_slab"),
                BYGBlockList.BLUE_ENCHANTED_SLAB = new BYGBlockProperties.BlockSlab("blue_enchanted_slab"),
                BYGBlockList.CHERRY_SLAB = new BYGBlockProperties.BlockSlab("cherry_slab"),
                BYGBlockList.CIKA_SLAB = new BYGBlockProperties.BlockSlab("cika_slab"),
                BYGBlockList.CYPRESS_SLAB = new BYGBlockProperties.BlockSlab("cypress_slab"),
                BYGBlockList.EBONY_SLAB = new BYGBlockProperties.BlockSlab("ebony_slab"),
                BYGBlockList.FIR_SLAB = new BYGBlockProperties.BlockSlab("fir_slab"),
                BYGBlockList.GREEN_ENCHANTED_SLAB = new BYGBlockProperties.BlockSlab("green_enchanted_slab"),
                BYGBlockList.HOLLY_SLAB = new BYGBlockProperties.BlockSlab("holly_slab"),
                BYGBlockList.JACARANDA_SLAB = new BYGBlockProperties.BlockSlab("jacaranda_slab"),
                BYGBlockList.MAHOGANY_SLAB = new BYGBlockProperties.BlockSlab("mahogany_slab"),
                BYGBlockList.MANGROVE_SLAB = new BYGBlockProperties.BlockSlab("mangrove_slab"),
                BYGBlockList.MAPLE_SLAB = new BYGBlockProperties.BlockSlab("maple_slab"),
                BYGBlockList.PINE_SLAB = new BYGBlockProperties.BlockSlab("pine_slab"),
                BYGBlockList.RAINBOW_EUCALYPTUS_SLAB = new BYGBlockProperties.BlockSlab("rainbow_eucalyptus_slab"),
                BYGBlockList.REDWOOD_SLAB = new BYGBlockProperties.BlockSlab("redwood_slab"),
                BYGBlockList.SKYRIS_SLAB = new BYGBlockProperties.BlockSlab("skyris_slab"),
                BYGBlockList.WILLOW_SLAB = new BYGBlockProperties.BlockSlab("willow_slab"),
                BYGBlockList.WITCH_HAZEL_SLAB = new BYGBlockProperties.BlockSlab("witch_hazel_slab"),
                BYGBlockList.ZELKOVA_SLAB = new BYGBlockProperties.BlockSlab("zelkova_slab"),

            //Stairs
                BYGBlockList.ASPEN_STAIRS = new BYGBlockProperties.BlockPlanks("aspen_stairs"),
                BYGBlockList.BAOBAB_STAIRS = new BYGBlockProperties.BlockPlanks("baobab_stairs"),
                BYGBlockList.BLUE_ENCHANTED_STAIRS = new BYGBlockProperties.BlockPlanks("blue_enchanted_stairs"),
                BYGBlockList.CHERRY_STAIRS = new BYGBlockProperties.BlockPlanks("cherry_stairs"),
                BYGBlockList.CIKA_STAIRS = new BYGBlockProperties.BlockPlanks("cika_stairs"),
                BYGBlockList.CYPRESS_STAIRS = new BYGBlockProperties.BlockPlanks("cypress_stairs"),
                BYGBlockList.EBONY_STAIRS = new BYGBlockProperties.BlockPlanks("ebony_stairs"),
                BYGBlockList.FIR_STAIRS = new BYGBlockProperties.BlockPlanks("fir_stairs"),
                BYGBlockList.GREEN_ENCHANTED_STAIRS = new BYGBlockProperties.BlockPlanks("green_enchanted_stairs"),
                BYGBlockList.HOLLY_STAIRS = new BYGBlockProperties.BlockPlanks("holly_stairs"),
                BYGBlockList.JACARANDA_STAIRS = new BYGBlockProperties.BlockPlanks("jacaranda_stairs"),
                BYGBlockList.MAHOGANY_STAIRS = new BYGBlockProperties.BlockPlanks("mahogany_stairs"),
                BYGBlockList.MANGROVE_STAIRS = new BYGBlockProperties.BlockPlanks("mangrove_stairs"),
                BYGBlockList.MAPLE_STAIRS = new BYGBlockProperties.BlockPlanks("maple_stairs"),
                BYGBlockList.PINE_STAIRS = new BYGBlockProperties.BlockPlanks("pine_stairs"),
                BYGBlockList.RAINBOW_EUCALYPTUS_STAIRS = new BYGBlockProperties.BlockPlanks("rainbow_eucalyptus_stairs"),
                BYGBlockList.REDWOOD_STAIRS = new BYGBlockProperties.BlockPlanks("redwood_stairs"),
                BYGBlockList.SKYRIS_STAIRS = new BYGBlockProperties.BlockPlanks("skyris_stairs"),
                BYGBlockList.WILLOW_STAIRS = new BYGBlockProperties.BlockPlanks("willow_stairs"),
                BYGBlockList.WITCH_HAZEL_STAIRS = new BYGBlockProperties.BlockPlanks("witch_hazel_stairs"),
                BYGBlockList.ZELKOVA_STAIRS = new BYGBlockProperties.BlockPlanks("zelkova_stairs")



                );
    }

    // Fence Blocks
    @SubscribeEvent
    public static void registerFenceBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_FENCE = new BYGBlockProperties.BlockFence("aspen_fence"),
                BYGBlockList.BAOBAB_FENCE = new BYGBlockProperties.BlockFence("baobab_fence"),
                BYGBlockList.BLUE_ENCHANTED_FENCE = new BYGBlockProperties.BlockFence("blue_enchanted_fence"),
                BYGBlockList.CHERRY_FENCE = new BYGBlockProperties.BlockFence("cherry_fence"),
                BYGBlockList.CIKA_FENCE = new BYGBlockProperties.BlockFence("cika_fence"),
                BYGBlockList.CYPRESS_FENCE = new BYGBlockProperties.BlockFence("cypress_fence"),
                BYGBlockList.EBONY_FENCE = new BYGBlockProperties.BlockFence("ebony_fence"),
                BYGBlockList.FIR_FENCE = new BYGBlockProperties.BlockFence("fir_fence"),
                BYGBlockList.GREEN_ENCHANTED_FENCE = new BYGBlockProperties.BlockFence("green_enchanted_fence"),
                BYGBlockList.HOLLY_FENCE = new BYGBlockProperties.BlockFence("holly_fence"),
                BYGBlockList.JACARANDA_FENCE = new BYGBlockProperties.BlockFence("jacaranda_fence"),
                BYGBlockList.MAHOGONY_FENCE = new BYGBlockProperties.BlockFence("mahogany_fence"),
                BYGBlockList.MANGROVE_FENCE = new BYGBlockProperties.BlockFence("mangrove_fence"),
                BYGBlockList.MAPLE_FENCE = new BYGBlockProperties.BlockFence("maple_fence"),
                BYGBlockList.PINE_FENCE = new BYGBlockProperties.BlockFence("pine_fence"),
                BYGBlockList.RAINBOW_EUCALYPTUS_FENCE = new BYGBlockProperties.BlockFence("rainbow_eucalyptus_fence"),
                BYGBlockList.REDWOOD_FENCE = new BYGBlockProperties.BlockFence("redwood_fence"),
                BYGBlockList.SKYRIS_FENCE = new BYGBlockProperties.BlockFence("skyris_fence"),
                BYGBlockList.WILLOW_FENCE = new BYGBlockProperties.BlockFence("willow_fence"),
                BYGBlockList.WITCH_HAZEL_FENCE = new BYGBlockProperties.BlockFence("witch_hazel_fence"),
                BYGBlockList.ZELKOVA_FENCE = new BYGBlockProperties.BlockFence("zelkova_fence")
        );
    }
    @SubscribeEvent
    public static void registerDirtBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                BYGBlockList.PEAT_GRASSBLOCK = new BYGBlockProperties.BlockGrass("peat_grass"),
                //BYGBlockList.MEADOW_GRASSBLOCK = new BYGBlockProperties.BlockMeadowGrass("meadow_grass_block"),
                BYGBlockList.MEADOW_DIRT = new BYGBlockProperties.BlockDirt("meadow_dirt"),
                BYGBlockList.MUD_BLOCK = new BYGBlockProperties.BlockDirt("mud_block"),
                BYGBlockList.MUD_BRICKS = new BYGBlockProperties.BlockDirt("mud_bricks")

        );
    }

    // Sapling Blocks
    @SubscribeEvent
    public static void registerSaplingBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_SAPLING = new BYGBlockProperties.BlockFlower("aspen_sapling"),
                BYGBlockList.BAOBAB_SAPLING = new BYGBlockProperties.BlockFlower("baobab_sapling"),
                BYGBlockList.BLUE_ENCHANTED_SAPLING = new BYGBlockProperties.BlockFlower("blue_enchanted_sapling"),
                BYGBlockList.BLUE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BlueSpruceSaplingToTree(), "blue_spruce_sapling"),
                BYGBlockList.BROWN_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownBirchSaplingToTree(), "brown_birch_sapling"),
                BYGBlockList.BROWN_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownOakSaplingToTree(), "brown_oak_sapling"),
                BYGBlockList.CIKA_SAPLING = new BYGBlockProperties.BlockFlower("cika_sapling"),
                BYGBlockList.CYPRESS_SAPLING = new BYGBlockProperties.BlockFlower("cypress_sapling"),
                BYGBlockList.EBONY_SAPLING = new BYGBlockProperties.BlockFlower("ebony_sapling"),
                BYGBlockList.FIR_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.FirSaplingToTree(), "fir_sapling"),
                BYGBlockList.GREEN_ENCHANTED_SAPLING = new BYGBlockProperties.BlockFlower("green_enchanted_sapling"),
                BYGBlockList.HOLLY_SAPLING = new BYGBlockProperties.BlockFlower("holly_sapling"),
                BYGBlockList.JACARANDA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.JacarandaSaplingToTree(), "jacaranda_sapling"),
                BYGBlockList.MAHOGANY_SAPLING = new BYGBlockProperties.BlockFlower("mahogany_sapling"),
                BYGBlockList.MANGROVE_SAPLING = new BYGBlockProperties.BlockFlower("mangrove_sapling"),
                BYGBlockList.ORANGE_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeBirchSaplingToTree(), "orange_birch_sapling"),
                BYGBlockList.ORANGE_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeOakSaplingToTree(), "orange_oak_sapling"),
                BYGBlockList.ORANGE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeSpruceSaplingToTree(), "orange_spruce_sapling"),
                BYGBlockList.ORCHARD_SAPLING = new BYGBlockProperties.BlockFlower("orchard_sapling"),
                BYGBlockList.PALO_VERDE_SAPLING = new BYGBlockProperties.BlockFlower("palo_verde_sapling"),
                BYGBlockList.PINE_SAPLING = new BYGBlockProperties.BlockFlower("pine_sapling"),
                BYGBlockList.PINK_CHERRY_SAPLING = new BYGBlockProperties.BlockFlower("pink_cherry_sapling"),
                BYGBlockList.RAINBOW_EUCALYPTUS_SAPLING = new BYGBlockProperties.BlockFlower("rainbow_eucalyptus_sapling"),
                BYGBlockList.RED_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedBirchSaplingToTree(), "red_birch_sapling"),
                BYGBlockList.RED_MAPLE_SAPLING = new BYGBlockProperties.BlockFlower("red_maple_sapling"),
                BYGBlockList.RED_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedOakSaplingToTree(), "red_oak_sapling"),
                BYGBlockList.RED_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedSpruceSaplingToTree(), "red_spruce_sapling"),
                BYGBlockList.REDWOOD_SAPLINGS = new BYGBlockProperties.BlockFlower("redwood_sapling"),
                BYGBlockList.SILVER_MAPLE_SAPLINGS = new BYGBlockProperties.BlockFlower("silver_maple_sapling"),
                BYGBlockList.SKYRIS_SAPLINGS = new BYGBlockProperties.BlockFlower("skyris_sapling"),
                BYGBlockList.WHITE_CHERRY_SAPLING = new BYGBlockProperties.BlockFlower("white_cherry_sapling"),
                BYGBlockList.WILLOW_SAPLING = new BYGBlockProperties.BlockFlower("willow_sapling"),
                BYGBlockList.WITCH_HAZEL_SAPLING = new BYGBlockProperties.BlockFlower("witch_hazel_sapling"),
                BYGBlockList.YELLOW_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowBirchSaplingToTree(), "yellow_birch_sapling"),
                BYGBlockList.YELLOW_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowSpruceSaplingToTree(), "yellow_spruce_sapling")
                /*
                 * TODO: Add Sapling Blocks
                 */

                //BYGBlockList.CYPRESS_SAPLING =-props -> new CypressTreeSapling(new CypressTree2(), props))
        );
    }

    // Leave Blocks
    @SubscribeEvent
    public static void registerLeaveBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_LEAVES = new BYGBlockProperties.BlockLeave("aspen_leaves"),
                BYGBlockList.BAOBAB_LEAVES = new BYGBlockProperties.BlockLeave("baobab_leaves"),
                BYGBlockList.BLOOMING_WITCH_HAZEL_LEAVES = new BYGBlockProperties.BlockLeave("blooming_witch_hazel_leaves"),
                BYGBlockList.BLUE_ENCHANTED_LEAVES = new BYGBlockProperties.BlockLeave("blue_enchanted_leaves"),
                BYGBlockList.BLUE_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("blue_spruce_leaves"),
                BYGBlockList.BROWN_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("brown_birch_leaves"),
                BYGBlockList.BROWN_OAK_LEAVES = new BYGBlockProperties.BlockLeave("brown_oak_leaves"),
                BYGBlockList.CIKA_LEAVES = new BYGBlockProperties.BlockLeave("cika_leaves"),
                BYGBlockList.CYPRESS_LEAVES = new BYGBlockProperties.BlockLeave("cypress_leaves"),
                BYGBlockList.EBONY_LEAVES = new BYGBlockProperties.BlockLeave("ebony_leaves"),
                BYGBlockList.FIR_LEAVES = new BYGBlockProperties.BlockLeave("fir_leaves"),
                BYGBlockList.FLOWERING_ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("flowering_orchard_leaves"),
                BYGBlockList.FLOWERING_PALO_VERDE_LEAVES = new BYGBlockProperties.BlockLeave("flowering_palo_verde_leaves"),
                BYGBlockList.GREEN_ENCHANTED_LEAVES = new BYGBlockProperties.BlockLeave("green_enchanted_leaves"),
                BYGBlockList.HOLLY_BERRY_LEAVES = new BYGBlockProperties.BlockLeave("holly_berry_leaves"),
                BYGBlockList.HOLLY_LEAVES = new BYGBlockProperties.BlockLeave("holly_leaves"),
                BYGBlockList.JACARANDA_LEAVES = new BYGBlockProperties.BlockLeave("jacaranda_leaves"),
                BYGBlockList.MAHOGANY_LEAVES = new BYGBlockProperties.BlockLeave("mahogany_leaves"),
                BYGBlockList.MANGROVE_LEAVES = new BYGBlockProperties.BlockLeave("mangrove_leaves"),
                BYGBlockList.ORANGE_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("orange_birch_leaves"),
                BYGBlockList.ORANGE_OAK_LEAVES = new BYGBlockProperties.BlockLeave("orange_oak_leaves"),
                BYGBlockList.ORANGE_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("orange_spruce_leaves"),
                BYGBlockList.ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("orchard_leaves"),
                BYGBlockList.PALO_VERDE_LEAVES = new BYGBlockProperties.BlockLeave("palo_verde_leaves"),
                BYGBlockList.PINE_lEAVES = new BYGBlockProperties.BlockLeave("pine_leaves"),
                BYGBlockList.PINK_CHERRY_LEAVES = new BYGBlockProperties.BlockLeave("pink_cherry_leaves"),
                BYGBlockList.RAINBOW_EUCALYPTUS_LEAVES = new BYGBlockProperties.BlockLeave("rainbow_eucalyptus_leaves"),
                BYGBlockList.RED_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("red_birch_leaves"),
                BYGBlockList.RED_MAPLE_LEAVES = new BYGBlockProperties.BlockLeave("red_maple_leaves"),
                BYGBlockList.RED_OAK_LEAVES = new BYGBlockProperties.BlockLeave("red_oak_leaves"),
                BYGBlockList.RED_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("red_spruce_leaves"),
                BYGBlockList.REDWOOD_LEAVES = new BYGBlockProperties.BlockLeave("redwood_leaves"),
                BYGBlockList.RIPE_ORCHARD_LEAVES = new BYGBlockProperties.BlockLeave("ripe_orchard_leaves"),
                BYGBlockList.SILVER_MAPLE_LEAVES = new BYGBlockProperties.BlockLeave("silver_maple_leaves"),
                BYGBlockList.SKYRIS_LEAVES_GREEN_APPLE = new BYGBlockProperties.BlockLeave("green_apple_skyris_leaves"),
                BYGBlockList.SKYRIS_LEAVES = new BYGBlockProperties.BlockLeave("skyris_leaves"),
                BYGBlockList.WHITE_CHERRY_LEAVES = new BYGBlockProperties.BlockLeave("white_cherry_leaves"),
                BYGBlockList.WILLOW_LEAVES = new BYGBlockProperties.BlockLeave("willow_leaves"),
                BYGBlockList.WITCH_HAZEL_LEAVES = new BYGBlockProperties.BlockLeave("witch_hazel_leaves"),
                BYGBlockList.YELLOW_BIRCH_LEAVES = new BYGBlockProperties.BlockLeave("yellow_birch_leaves"),
                BYGBlockList.YELLOW_SPRUCE_LEAVES = new BYGBlockProperties.BlockLeave("yellow_spruce_leaves")

        );
    }

    // Plant Blocks
    @SubscribeEvent
    public static void registerPlantBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.GREEN_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("green_mushroom_block"),
                BYGBlockList.MILKCAP_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("weeping_milkcap_mushroom_block"),
                BYGBlockList.BLEWIT_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("wood_blewit_mushroom_block"),
                BYGBlockList.PUFF_MUSHROOM_BLOCK = new BYGBlockProperties.BlockHugeMushroom("black_puff_mushroom_block"),
                BYGBlockList.WHITE_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("white_mushroom_stem"),
                BYGBlockList.BROWN_MUSHROOM_STEM = new BYGBlockProperties.BlockHugeMushroom("brown_mushroom_stem"),

                BYGBlockList.CATTAIL = new BYGBlockProperties.BlockCattail("cattail"),
                BYGBlockList.REEDS = new BYGBlockProperties.BlockCattail("reeds"),
                BYGBlockList.HORSEWEED = new BYGBlockProperties.BlockFlower("horseweed"),
                BYGBlockList.MINI_CACTUS = new BYGBlockProperties.BlockFlower("mini_cactus"),
                BYGBlockList.PRICKLY_PEAR_CACTUS = new BYGBlockProperties.BlockFlower("prickly_pear_cactus"),
                BYGBlockList.WINTER_SUCCULENT = new BYGBlockProperties.BlockFlower("winter_succulent"),
                BYGBlockList.SHORT_GRASS = new BYGBlockProperties.BlockTallGrass("short_grass"),
                BYGBlockList.BLUE_GLOWCANE = new BYGBlockProperties.BlockStalk("blue_glowcane"),
                BYGBlockList.RED_GLOWCANE = new BYGBlockProperties.BlockStalk("red_glowcane"),
                BYGBlockList.PURPLE_GLOWCANE = new BYGBlockProperties.BlockStalk("purple_glowcane"),
                BYGBlockList.PINK_GLOWCANE = new BYGBlockProperties.BlockStalk("pink_glowcane"),
                //BYGBlockList.POISON_IVY = new BYGBlockProperties.BlockVine("poison_ivy"),
                //BYGBlockList.BLUEBERRY_BUSH = new BYGBlockProperties.BlockBerryBush("blueberry_bush"),
                BYGBlockList.TINY_LILYPADS = new BYGBlockProperties.BlockLily("tiny_lilypads"),

                //Glowcane Blocks

                BYGBlockList.BLUE_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("blue_glowcane_block"),
                BYGBlockList.RED_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("red_glowcane_block"),
                BYGBlockList.PINK_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("pink_glowcane_block"),
                BYGBlockList.PURPLE_GLOWCANE_BLOCK = new BYGBlockProperties.BlockGlow("purple_glowcane_block"),

                //Decorations

                //BYGBlockList.REDSTONE_LANTERN = new BYGRedStoneLantern("redstone_lantern_block"),
//EEEE

                //Petal Blocks
                BYGBlockList.WHITE_PETAL = new BYGBlockProperties.BlockPetal("white_petal_block"),
                BYGBlockList.RED_PETAL = new BYGBlockProperties.BlockPetal("red_petal_block"),
                BYGBlockList.PURPLE_PETAL = new BYGBlockProperties.BlockPetal("purple_petal_block"),
                BYGBlockList.BLUE_PETAL = new BYGBlockProperties.BlockPetal("blue_petal_block"),
                BYGBlockList.LIGHT_BLUE_PETAL = new BYGBlockProperties.BlockPetal("light_blue_petal_block"),
                BYGBlockList.YELLOW_PETAL = new BYGBlockProperties.BlockPetal("yellow_petal_block"),
                BYGBlockList.PLANT_STEM = new BYGBlockProperties.BlockLog("plant_stem")




        );
    }

    // Log Blocks
    @SubscribeEvent
    public static void registerLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_LOG = new BYGBlockProperties.BlockLog("aspen_log"),
                BYGBlockList.BAOBAB_LOG = new BYGBlockProperties.BlockLog("baobab_log"),
                BYGBlockList.BLUE_ENCHANTED_LOG = new BYGBlockProperties.BlockLog("blue_enchanted_log"),
                BYGBlockList.CHERRY_LOG = new BYGBlockProperties.BlockLog("cherry_log"),
                BYGBlockList.CIKA_LOG = new BYGBlockProperties.BlockLog("cika_log"),
                BYGBlockList.CYPRESS_LOG = new BYGBlockProperties.BlockLog("cypress_log"),
                BYGBlockList.EBONY_LOG = new BYGBlockProperties.BlockLog("ebony_log"),
                BYGBlockList.FIR_LOG = new BYGBlockProperties.BlockLog("fir_log"),
                BYGBlockList.GREEN_ENCHANTED_LOG = new BYGBlockProperties.BlockLog("green_enchanted_log"),
                BYGBlockList.HOLLY_LOG = new BYGBlockProperties.BlockLog("holly_log"),
                BYGBlockList.JACARANDA_LOG = new BYGBlockProperties.BlockLog("jacaranda_log"),
                BYGBlockList.MAHOGANY_LOG = new BYGBlockProperties.BlockLog("mahogany_log"),
                BYGBlockList.MANGROVE_LOG = new BYGBlockProperties.BlockLog("mangrove_log"),
                BYGBlockList.MAPLE_LOG = new BYGBlockProperties.BlockLog("maple_log"),
                BYGBlockList.PALO_VERDE_LOG = new BYGBlockProperties.BlockLog("palo_verde_log"),
                BYGBlockList.PINE_LOG = new BYGBlockProperties.BlockLog("pine_log"),
                BYGBlockList.RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BlockLog("rainbow_eucalyptus_log"),
                BYGBlockList.REDWOOD_LOG = new BYGBlockProperties.BlockLog("redwood_log"),
                BYGBlockList.SKYRIS_LOG = new BYGBlockProperties.BlockLog("skyris_log"),
                BYGBlockList.WILLOW_LOG = new BYGBlockProperties.BlockLog("willow_log"),
                BYGBlockList.WITCH_HAZEL_LOG = new BYGBlockProperties.BlockLog("witch_hazel_log"),
                BYGBlockList.ZELKOVA_LOG = new BYGBlockProperties.BlockLog("zelkova_log")
        );
    }

    //MushroomBlocks
    @SubscribeEvent
    public static void registerMushroomBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.BLACK_PUFF = new BYGBlockProperties.BlockMushroom("black_puff"),
                BYGBlockList.WEEPING_MILKCAP = new BYGBlockProperties.BlockMushroom("weeping_milkcap"),
                BYGBlockList.WOOD_BLEWIT = new BYGBlockProperties.BlockMushroom("wood_blewit"),
                BYGBlockList.GREEN_MUSHSHROOM = new BYGBlockProperties.BlockMushroom("green_mushroom")

        );
    }

    //OreBlocks
    @SubscribeEvent
    public static void registerOreBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.PENDORITE_ORE = new BYGBlockProperties.BlockOre("pendorite_ore"),
                BYGBlockList.AMETRINE_ORE = new BYGBlockProperties.BlockOre("ametrine_ore"),
                BYGBlockList.PENDORITE_BLOCK = new BYGBlockProperties.BlockOre("pendorite_block"),
                BYGBlockList.AMETRINE_BLOCK = new BYGBlockProperties.BlockOre("ametrine_block")

        );
    }

    //StoneBlocks
    @SubscribeEvent
    public static void registerStoneBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.DACITE = new BYGBlockProperties.BlockStone("dacite"),
                BYGBlockList.DACITE_BRICKS = new BYGBlockProperties.BlockStone("dacite_bricks"),
                BYGBlockList.DACITE_COBBLESTONE = new BYGBlockProperties.BlockStone("dacite_cobblestone"),
                BYGBlockList.DACITE_PILLAR = new BYGBlockProperties.BlockPillar("dacite_pillar"),
                BYGBlockList.DACITE_TILE = new BYGBlockProperties.BlockStone("dacite_tile"),

                BYGBlockList.MOSSY_STONE = new BYGBlockProperties.BlockStone("mossy_stone"),
                //BYGBlockList.OVERGROWN_STONE = new BYGBlockProperties.BlockOvergrownStone("overgrown_stone"),
                BYGBlockList.ROCKY_STONE = new BYGBlockProperties.BlockStone("rocky_stone"),

                BYGBlockList.SCORIA_STONE = new BYGBlockProperties.BlockStone("scoria_stone"),
                BYGBlockList.SCORIA_COBBLESTONE = new BYGBlockProperties.BlockStone("scoria_cobblestone"),
                BYGBlockList.SCORIA_PILLAR = new BYGBlockProperties.BlockPillar("scoria_pillar"),
                BYGBlockList.SCORIA_STONEBRICKS = new BYGBlockProperties.BlockStone("scoria_stonebricks"),

                BYGBlockList.SOAPSTONE = new BYGBlockProperties.BlockStone("soapstone"),
                BYGBlockList.POLISHED_SOAPSTONE = new BYGBlockProperties.BlockStone("polished_soapstone"),
                BYGBlockList.SOAPSTONE_BRICKS = new BYGBlockProperties.BlockStone("soapstone_bricks"),
                BYGBlockList.SOAPSTONE_PILLAR = new BYGBlockProperties.BlockPillar("soapstone_pillar"),
                BYGBlockList.SOAPSTONE_TILE = new BYGBlockProperties.BlockStone("soapstone_tile")

                );
    }

    //Stripped Logs
    @SubscribeEvent
    public static void registerStrippedLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.STRIPPED_ASPEN_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_aspen_log"),
                BYGBlockList.STRIPPED_BAOBAB_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_baobab_log"),
                BYGBlockList.STRIPPED_BLUE_ENCHANTED_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_blue_enchanted_log"),
                BYGBlockList.STRIPPED_CHERRY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cherry_log"),
                BYGBlockList.STRIPPED_CIKA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cika_log"),
                BYGBlockList.STRIPPED_CYPRESS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_cypress_log"),
                BYGBlockList.STRIPPED_EBONY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_ebony_log"),
                BYGBlockList.STRIPPED_FIR_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_fir_log"),
                BYGBlockList.STRIPPED_GREEN_ENCHANTED_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_green_enchanted_log"),
                BYGBlockList.STRIPPED_HOLLY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_holly_log"),
                BYGBlockList.STRIPPED_JACARANDA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_jacaranda_log"),
                BYGBlockList.STRIPPED_MAHOGANY_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_mahogany_log"),
                BYGBlockList.STRIPPED_MANGROVE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_mangrove_log"),
                BYGBlockList.STRIPPED_MAPLE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_maple_log"),
                BYGBlockList.STRIPPED_PALO_VERDE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_palo_verde_log"),
                BYGBlockList.STRIPPED_PINE_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_pine_log"),
                BYGBlockList.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_rainbow_eucalyptus_log"),
                BYGBlockList.STRIPPED_SKYRIS_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_skyris_log"),
                BYGBlockList.STRIPPED_WILLOW_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_willow_log"),
                BYGBlockList.STRIPPED_REDWOOD_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_redwood_log"),
                BYGBlockList.STRIPPED_WITCH_HAZEL_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_witch_hazel_log"),
                BYGBlockList.STRIPPED_ZELKOVA_LOG = new BYGBlockProperties.BlockStrippedLog("stripped_zelkova_log")
        );

    }

    //FlowerBlocks
    @SubscribeEvent
    public static void registerFlowerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("allium_flower_bush"),
                BYGBlockList.ALPINE_BELLFLOWER = new BYGBlockProperties.BlockFlower("alpine_bellflower"),
                BYGBlockList.AMARANTH = new BYGBlockProperties.BlockFlower("amaranth"),
                BYGBlockList.ANGELICA = new BYGBlockProperties.BlockFlower("angelica"),
                BYGBlockList.AZALEA = new BYGBlockProperties.BlockFlower("azalea"),
                BYGBlockList.BEGONIA = new BYGBlockProperties.BlockFlower("begonia"),
                BYGBlockList.BISTORT = new BYGBlockProperties.BlockFlower("bistort"),
                BYGBlockList.BLUE_SAGE = new BYGBlockProperties.BlockFlower("blue_sage"),
                BYGBlockList.CALIFORNIA_POPPY = new BYGBlockProperties.BlockFlower("california_poppy"),
                BYGBlockList.CROCUS = new BYGBlockProperties.BlockFlower("crocus"),
                BYGBlockList.BLACK_ROSE = new BYGBlockProperties.BlockFlower("black_rose"),
                BYGBlockList.CYAN_AMARANTH = new BYGBlockProperties.BlockFlower("cyan_amaranth"),
                BYGBlockList.CYAN_ROSE = new BYGBlockProperties.BlockFlower("cyan_rose"),
                BYGBlockList.CYAN_TULIP = new BYGBlockProperties.BlockFlower("cyan_tulip"),
                BYGBlockList.DAFFODIL = new BYGBlockProperties.BlockFlower("daffodil"),
                BYGBlockList.DELPHINIUM = new BYGBlockProperties.BlockFlower("delphinium"),
                BYGBlockList.FAIRY_SLIPPER = new BYGBlockProperties.BlockFlower("fairy_slipper"),
                BYGBlockList.FIRECRACKER_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("firecracker_flower_bush"),
                BYGBlockList.FOXGLOVE = new BYGBlockProperties.BlockFlower("foxglove"),
                BYGBlockList.GOLDEN_SPINED_CACTUS = new BYGBlockProperties.BlockFlower("golden_spined_cactus"),
                BYGBlockList.GREEN_TULIP = new BYGBlockProperties.BlockFlower("green_tulip"),
                BYGBlockList.GUZMANIA = new BYGBlockProperties.BlockFlower("guzmania"),
                BYGBlockList.INCAN_LILY = new BYGBlockProperties.BlockFlower("incan_lily"),
                BYGBlockList.IRIS = new BYGBlockProperties.BlockFlower("iris"),
                BYGBlockList.JAPANESE_ORCHID = new BYGBlockProperties.BlockFlower("japanese_orchid"),
                BYGBlockList.KOVAN_FLOWER = new BYGBlockProperties.BlockFlower("kovan_flower"),
                BYGBlockList.LAZARUS_BELLFLOWER = new BYGBlockProperties.BlockFlower("lazarus_bellflower"),
                BYGBlockList.LOLIPOP_FLOWER = new BYGBlockProperties.BlockFlower("lolipop_flower"),
                BYGBlockList.MAGENTA_AMARANTH = new BYGBlockProperties.BlockFlower("magenta_amaranth"),
                BYGBlockList.MAGENTA_TULIP = new BYGBlockProperties.BlockFlower("magenta_tulip"),
                BYGBlockList.ORANGE_AMARANTH = new BYGBlockProperties.BlockFlower("orange_amaranth"),
                BYGBlockList.ORANGE_DAISY = new BYGBlockProperties.BlockFlower("orange_daisy"),
                BYGBlockList.ORSIRIA_ROSE = new BYGBlockProperties.BlockFlower("osiria_rose"),
                BYGBlockList.PEACH_LEATHER_FLOWER = new BYGBlockProperties.BlockFlower("peach_leather_flower"),
                BYGBlockList.PINK_ALLIUM = new BYGBlockProperties.BlockFlower("pink_allium"),
                BYGBlockList.PINK_ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BlockFlower("pink_allium_flower_bush"),
                BYGBlockList.PINK_ANEMONE = new BYGBlockProperties.BlockFlower("pink_anemone"),
                BYGBlockList.PINK_DAFFODIL = new BYGBlockProperties.BlockFlower("pink_daffodil"),
                BYGBlockList.PINK_ORCHID = new BYGBlockProperties.BlockFlower("pink_orchid"),
                BYGBlockList.PRAIRIE_GRASS = new BYGBlockProperties.BlockTallGrass("prairie_grass"),
                BYGBlockList.PROTEA_FLOWER = new BYGBlockProperties.BlockFlower("protea_flower"),
                BYGBlockList.PURPLE_AMARANTH = new BYGBlockProperties.BlockFlower("purple_amaranth"),
                BYGBlockList.PURPLE_ORCHID = new BYGBlockProperties.BlockFlower("purple_orchid"),
                BYGBlockList.PURPLE_SAGE = new BYGBlockProperties.BlockFlower("purple_sage"),
                BYGBlockList.PURPLE_TULIP = new BYGBlockProperties.BlockFlower("purple_tulip"),
                BYGBlockList.RED_CORNFLOWER = new BYGBlockProperties.BlockFlower("red_cornflower"),
                BYGBlockList.RED_ORCHID = new BYGBlockProperties.BlockFlower("red_orchid"),
                BYGBlockList.RICHEA = new BYGBlockProperties.BlockFlower("richea"),
                BYGBlockList.ROSE = new BYGBlockProperties.BlockFlower("rose"),
                BYGBlockList.SNOWDROPS = new BYGBlockProperties.BlockFlower("snowdrops"),
                BYGBlockList.SILVER_VASE_FLOWER = new BYGBlockProperties.BlockFlower("silver_vase_flower"),
                BYGBlockList.TORCH_GINGER = new BYGBlockProperties.BlockFlower("torch_ginger"),
                BYGBlockList.VIOLET_LEATHER_FLOWER = new BYGBlockProperties.BlockFlower("violet_leather_flower"),
                BYGBlockList.WHITE_ANEMONE = new BYGBlockProperties.BlockFlower("white_anemone"),
                BYGBlockList.WHITE_SAGE = new BYGBlockProperties.BlockFlower("white_sage"),
                BYGBlockList.WINTER_CYCLAMEN = new BYGBlockProperties.BlockFlower("winter_cyclamen"),
                BYGBlockList.WINTER_ROSE = new BYGBlockProperties.BlockFlower("winter_rose"),
                BYGBlockList.WINTER_SCILLA = new BYGBlockProperties.BlockFlower("winter_scilla"),
                BYGBlockList.YELLOW_DAFFODIL = new BYGBlockProperties.BlockFlower("yellow_daffodil"),
                BYGBlockList.YELLOW_TULIP = new BYGBlockProperties.BlockFlower("yellow_tulip")
        );
        BYG.LOGGER.info("All BYG blocks registered!");
    }
}
