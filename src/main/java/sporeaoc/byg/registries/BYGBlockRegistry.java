package sporeaoc.byg.registries;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.blockproperties.BYGSaplingProperties;
import sporeaoc.byg.blockproperties.BlockProperties;
import sporeaoc.byg.catalogs.BlockCatalogs;
import sporeaoc.byg.world.BYGSaplingToTree;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBlockRegistry {
    // Plank Blocks
    @SubscribeEvent
    public static void registerPlankBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_PLANKS = new BlockProperties.BlockPlanks("aspen_planks"),
                BlockCatalogs.BAOBAB_PLANKS = new BlockProperties.BlockPlanks("baobab_planks"),
                BlockCatalogs.BLUE_ENCHANTED_PLANKS = new BlockProperties.BlockPlanks("blue_enchanted_planks"),
                BlockCatalogs.CHERRY_PLANKS = new BlockProperties.BlockPlanks("cherry_planks"),
                BlockCatalogs.CIKA_PLANKS = new BlockProperties.BlockPlanks("cika_planks"),
                BlockCatalogs.CYPRESS_PLANKS = new BlockProperties.BlockPlanks("cypress_planks"),
                BlockCatalogs.EBONY_PLANKS = new BlockProperties.BlockPlanks("ebony_planks"),
                BlockCatalogs.FIR_PLANKS = new BlockProperties.BlockPlanks("fir_planks"),
                BlockCatalogs.GREEN_ENCHANTED_PLANKS = new BlockProperties.BlockPlanks("green_enchanted_planks"),
                BlockCatalogs.HOLLY_PLANKS = new BlockProperties.BlockPlanks("holly_planks"),
                BlockCatalogs.JACARANDA_PLANKS = new BlockProperties.BlockPlanks("jacaranda_planks"),
                BlockCatalogs.MAHOGONY_PLANKS = new BlockProperties.BlockPlanks("mahogany_planks"),
                BlockCatalogs.MANGROVE_PLANKS = new BlockProperties.BlockPlanks("mangrove_planks"),
                BlockCatalogs.MAPLE_PLANKS = new BlockProperties.BlockPlanks("maple_planks"),
                BlockCatalogs.PINE_PLANKS = new BlockProperties.BlockPlanks("pine_planks"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_PLANKS = new BlockProperties.BlockPlanks("rainbow_eucalyptus_planks"),
                BlockCatalogs.REDWOOD_PLANKS = new BlockProperties.BlockPlanks("redwood_planks"),
                BlockCatalogs.SKYRIS_PLANKS = new BlockProperties.BlockPlanks("skyris_planks"),
                BlockCatalogs.WILLOW_PLANKS = new BlockProperties.BlockPlanks("willow_planks"),
                BlockCatalogs.WITCH_HAZEL_PLANKS = new BlockProperties.BlockPlanks("witch_hazel_planks"),
                BlockCatalogs.ZELKOVA_PLANKS = new BlockProperties.BlockPlanks("zelkova_planks"),

                //Bookshelves
                BlockCatalogs.ASPEN_BOOKSHELF = new BlockProperties.BlockPlanks("aspen_bookshelf"),
                BlockCatalogs.BAOBAB_BOOKSHELF = new BlockProperties.BlockPlanks("baobab_bookshelf"),
                BlockCatalogs.BLUE_ENCHANTED_BOOKSHELF = new BlockProperties.BlockPlanks("blue_enchanted_bookshelf"),
                BlockCatalogs.CHERRY_BOOKSHELF = new BlockProperties.BlockPlanks("cherry_bookshelf"),
                BlockCatalogs.CIKA_BOOKSHELF = new BlockProperties.BlockPlanks("cika_bookshelf"),
                BlockCatalogs.CYPRESS_BOOKSHELF = new BlockProperties.BlockPlanks("cypress_bookshelf"),
                BlockCatalogs.EBONY_BOOKSHELF = new BlockProperties.BlockPlanks("ebony_bookshelf"),
                BlockCatalogs.FIR_BOOKSHELF = new BlockProperties.BlockPlanks("fir_bookshelf"),
                BlockCatalogs.GREEN_ENCHANTED_BOOKSHELF = new BlockProperties.BlockPlanks("green_enchanted_bookshelf"),
                BlockCatalogs.HOLLY_BOOKSHELF = new BlockProperties.BlockPlanks("holly_bookshelf"),
                BlockCatalogs.JACARANDA_BOOKSHELF = new BlockProperties.BlockPlanks("jacaranda_bookshelf"),
                BlockCatalogs.MAHOGONY_BOOKSHELF = new BlockProperties.BlockPlanks("mahogany_bookshelf"),
                BlockCatalogs.MANGROVE_BOOKSHELF = new BlockProperties.BlockPlanks("mangrove_bookshelf"),
                BlockCatalogs.MAPLE_BOOKSHELF = new BlockProperties.BlockPlanks("maple_bookshelf"),
                BlockCatalogs.PINE_BOOKSHELF = new BlockProperties.BlockPlanks("pine_bookshelf"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_BOOKSHELF = new BlockProperties.BlockPlanks("rainbow_eucalyptus_bookshelf"),
                BlockCatalogs.REDWOOD_BOOKSHELF = new BlockProperties.BlockPlanks("redwood_bookshelf"),
                BlockCatalogs.SKYRIS_BOOKSHELF = new BlockProperties.BlockPlanks("skyris_bookshelf"),
                BlockCatalogs.WILLOW_BOOKSHELF = new BlockProperties.BlockPlanks("willow_bookshelf"),
                BlockCatalogs.WITCH_HAZEL_BOOKSHELF = new BlockProperties.BlockPlanks("witch_hazel_bookshelf"),
                BlockCatalogs.ZELKOVA_BOOKSHELF = new BlockProperties.BlockPlanks("zelkova_bookshelf"),

            //Slabs
                BlockCatalogs.ASPEN_SLAB = new BlockProperties.BlockPlanks("aspen_slab"),
                BlockCatalogs.BAOBAB_SLAB = new BlockProperties.BlockPlanks("baobab_slab"),
                BlockCatalogs.BLUE_ENCHANTED_SLAB = new BlockProperties.BlockPlanks("blue_enchanted_slab"),
                BlockCatalogs.CHERRY_SLAB = new BlockProperties.BlockPlanks("cherry_slab"),
                BlockCatalogs.CIKA_SLAB = new BlockProperties.BlockPlanks("cika_slab"),
                BlockCatalogs.CYPRESS_SLAB = new BlockProperties.BlockPlanks("cypress_slab"),
                BlockCatalogs.EBONY_SLAB = new BlockProperties.BlockPlanks("ebony_slab"),
                BlockCatalogs.FIR_SLAB = new BlockProperties.BlockPlanks("fir_slab"),
                BlockCatalogs.GREEN_ENCHANTED_SLAB = new BlockProperties.BlockPlanks("green_enchanted_slab"),
                BlockCatalogs.HOLLY_SLAB = new BlockProperties.BlockPlanks("holly_slab"),
                BlockCatalogs.JACARANDA_SLAB = new BlockProperties.BlockPlanks("jacaranda_slab"),
                BlockCatalogs.MAHOGONY_SLAB = new BlockProperties.BlockPlanks("mahogany_slab"),
                BlockCatalogs.MANGROVE_SLAB = new BlockProperties.BlockPlanks("mangrove_slab"),
                BlockCatalogs.MAPLE_SLAB = new BlockProperties.BlockPlanks("maple_slab"),
                BlockCatalogs.PINE_SLAB = new BlockProperties.BlockPlanks("pine_slab"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_SLAB = new BlockProperties.BlockPlanks("rainbow_eucalyptus_slab"),
                BlockCatalogs.REDWOOD_SLAB = new BlockProperties.BlockPlanks("redwood_slab"),
                BlockCatalogs.SKYRIS_SLAB = new BlockProperties.BlockPlanks("skyris_slab"),
                BlockCatalogs.WILLOW_SLAB = new BlockProperties.BlockPlanks("willow_slab"),
                BlockCatalogs.WITCH_HAZEL_SLAB = new BlockProperties.BlockPlanks("witch_hazel_slab"),
                BlockCatalogs.ZELKOVA_SLAB = new BlockProperties.BlockPlanks("zelkova_slab")






                );
    }

    // Stair Blocks
    @SubscribeEvent
    public static void registerStairBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                /*
                 * TODO: Add Stair Blocks
                 */

                    /*
                    BlockCatalogs.ASPEN_STAIRS = new BYGStairBlocks(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs.BAOBAB_STAIRS = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
                    BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("")
                     */
        );
    }

    // Fence Blocks
    @SubscribeEvent
    public static void registerFenceBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_FENCE = new BlockProperties.BlockFence("aspen_fence"),
                BlockCatalogs.BAOBAB_FENCE = new BlockProperties.BlockFence("baobab_fence"),
                BlockCatalogs.BLUE_ENCHANTED_FENCE = new BlockProperties.BlockFence("blue_enchanted_fence"),
                BlockCatalogs.CHERRY_FENCE = new BlockProperties.BlockFence("cherry_fence"),
                BlockCatalogs.CIKA_FENCE = new BlockProperties.BlockFence("cika_fence"),
                BlockCatalogs.CYPRESS_FENCE = new BlockProperties.BlockFence("cypress_fence"),
                BlockCatalogs.EBONY_FENCE = new BlockProperties.BlockFence("ebony_fence"),
                BlockCatalogs.FIR_FENCE = new BlockProperties.BlockFence("fir_fence"),
                BlockCatalogs.GREEN_ENCHANTED_FENCE = new BlockProperties.BlockFence("green_enchanted_fence"),
                BlockCatalogs.HOLLY_FENCE = new BlockProperties.BlockFence("holly_fence"),
                BlockCatalogs.JACARANDA_FENCE = new BlockProperties.BlockFence("jacaranda_fence"),
                BlockCatalogs.MAHOGONY_FENCE = new BlockProperties.BlockFence("mahogany_fence"),
                BlockCatalogs.MANGROVE_FENCE = new BlockProperties.BlockFence("mangrove_fence"),
                BlockCatalogs.MAPLE_FENCE = new BlockProperties.BlockFence("maple_fence"),
                BlockCatalogs.PINE_FENCE = new BlockProperties.BlockFence("pine_fence"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_FENCE = new BlockProperties.BlockFence("rainbow_eucalyptus_fence"),
                BlockCatalogs.REDWOOD_FENCE = new BlockProperties.BlockFence("redwood_fence"),
                BlockCatalogs.SKYRIS_FENCE = new BlockProperties.BlockFence("skyris_fence"),
                BlockCatalogs.WILLOW_FENCE = new BlockProperties.BlockFence("willow_fence"),
                BlockCatalogs.WITCH_HAZEL_FENCE = new BlockProperties.BlockFence("witch_hazel_fence"),
                BlockCatalogs.ZELKOVA_FENCE = new BlockProperties.BlockFence("zelkova_fence")
        );
    }
    @SubscribeEvent
    public static void registerDirtBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(

                BlockCatalogs.PEAT_GRASSBLOCK = new BlockProperties.BlockGrass("peat_grass"),
                BlockCatalogs.MEADOW_GRASSBLOCK = new BlockProperties.BlockGrass("meadow_grass_block"),
                BlockCatalogs.MEADOW_DIRT = new BlockProperties.BlockGrass("meadow_dirt"),
                BlockCatalogs.MUD_BLOCK = new BlockProperties.BlockDirt("mud_block"),
                BlockCatalogs.MUD_BRICKS = new BlockProperties.BlockDirt("mud_bricks")

        );
    }

    // Sapling Blocks
    @SubscribeEvent
    public static void registerSaplingBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_SAPLING = new BlockProperties.BlockFlower("aspen_sapling"),
                BlockCatalogs.BAOBAB_SAPLING = new BlockProperties.BlockFlower("baobab_sapling"),
                BlockCatalogs.BLUE_ENCHANTED_SAPLING = new BlockProperties.BlockFlower("blue_enchanted_sapling"),
                BlockCatalogs.BLUE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BlueSpruceSaplingToTree(), "blue_spruce_sapling"),
                BlockCatalogs.BROWN_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownBirchSaplingToTree(), "brown_birch_sapling"),
                BlockCatalogs.BROWN_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownOakSaplingToTree(), "brown_oak_sapling"),
                BlockCatalogs.CIKA_SAPLING = new BlockProperties.BlockFlower("cika_sapling"),
                BlockCatalogs.CYPRESS_SAPLING = new BlockProperties.BlockFlower("cypress_sapling"),
                BlockCatalogs.EBONY_SAPLING = new BlockProperties.BlockFlower("ebony_sapling"),
                BlockCatalogs.FIR_SAPLING = new BlockProperties.BlockFlower("fir_sapling"),
                BlockCatalogs.GREEN_ENCHANTED_SAPLING = new BlockProperties.BlockFlower("green_enchanted_sapling"),
                BlockCatalogs.HOLLY_SAPLING = new BlockProperties.BlockFlower("holly_sapling"),
                BlockCatalogs.JACARANDA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.JacarandaSaplingToTree(), "jacaranda_sapling"),
                BlockCatalogs.MAHOGONY_SAPLING = new BlockProperties.BlockFlower("mahogany_sapling"),
                BlockCatalogs.MANGROVE_SAPLING = new BlockProperties.BlockFlower("mangrove_sapling"),
                BlockCatalogs.ORANGE_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeBirchSaplingToTree(), "orange_birch_sapling"),
                BlockCatalogs.ORANGE_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeOakSaplingToTree(), "orange_oak_sapling"),
                BlockCatalogs.ORANGE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeSpruceSaplingToTree(), "orange_spruce_sapling"),
                BlockCatalogs.ORCHARD_SAPLING = new BlockProperties.BlockFlower("orchard_sapling"),
                BlockCatalogs.PALO_VERDE_SAPLING = new BlockProperties.BlockFlower("palo_verde_sapling"),
                BlockCatalogs.PINE_SAPLING = new BlockProperties.BlockFlower("pine_sapling"),
                BlockCatalogs.PINK_CHERRY_SAPLING = new BlockProperties.BlockFlower("pink_cherry_sapling"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_SAPLING = new BlockProperties.BlockFlower("rainbow_eucalyptus_sapling"),
                BlockCatalogs.RED_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedBirchSaplingToTree(), "red_birch_sapling"),
                BlockCatalogs.RED_MAPLE_SAPLING = new BlockProperties.BlockFlower("red_maple_sapling"),
                BlockCatalogs.RED_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedOakSaplingToTree(), "red_oak_sapling"),
                BlockCatalogs.RED_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedSpruceSaplingToTree(), "red_spruce_sapling"),
                BlockCatalogs.REDWOOD_SAPLINGS = new BlockProperties.BlockFlower("redwood_sapling"),
                BlockCatalogs.SILVER_MAPLE_SAPLINGS = new BlockProperties.BlockFlower("silver_maple_sapling"),
                BlockCatalogs.SKYRIS_SAPLINGS = new BlockProperties.BlockFlower("skyris_sapling"),
                BlockCatalogs.WHITE_CHERRY_SAPLING = new BlockProperties.BlockFlower("white_cherry_sapling"),
                BlockCatalogs.WILLOW_SAPLING = new BlockProperties.BlockFlower("willow_sapling"),
                BlockCatalogs.WITCH_HAZEL_SAPLING = new BlockProperties.BlockFlower("witch_hazel_sapling"),
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
                BlockCatalogs.ASPEN_LEAVES = new BlockProperties.BlockLeave("aspen_leaves"),
                BlockCatalogs.BAOBAB_LEAVES = new BlockProperties.BlockLeave("baobab_leaves"),
                BlockCatalogs.BLOOMING_WITCH_HAZEL_LEAVES = new BlockProperties.BlockLeave("blooming_witch_hazel_leaves"),
                BlockCatalogs.BLUE_ENCHANTED_LEAVES = new BlockProperties.BlockLeave("blue_enchanted_leaves"),
                BlockCatalogs.BLUE_SPRUCE_LEAVES = new BlockProperties.BlockLeave("blue_spruce_leaves"),
                BlockCatalogs.BROWN_BIRCH_LEAVES = new BlockProperties.BlockLeave("brown_birch_leaves"),
                BlockCatalogs.BROWN_OAK_LEAVES = new BlockProperties.BlockLeave("brown_oak_leaves"),
                BlockCatalogs.CIKA_LEAVES = new BlockProperties.BlockLeave("cika_leaves"),
                BlockCatalogs.CYPRESS_LEAVES = new BlockProperties.BlockLeave("cypress_leaves"),
                BlockCatalogs.EBONY_LEAVES = new BlockProperties.BlockLeave("ebony_leaves"),
                BlockCatalogs.FIR_LEAVES = new BlockProperties.BlockLeave("fir_leaves"),
                BlockCatalogs.FLOWERING_ORCHARD_LEAVES = new BlockProperties.BlockLeave("flowering_orchard_leaves"),
                BlockCatalogs.FLOWERING_PALO_VERDE_LEAVES = new BlockProperties.BlockLeave("flowering_palo_verde_leaves"),
                BlockCatalogs.GREEN_ENCHANTED_LEAVES = new BlockProperties.BlockLeave("green_enchanted_leaves"),
                BlockCatalogs.HOLLY_BERRY_LEAVES = new BlockProperties.BlockLeave("holly_berry_leaves"),
                BlockCatalogs.HOLLY_LEAVES = new BlockProperties.BlockLeave("holly_leaves"),
                BlockCatalogs.JACARANDA_LEAVES = new BlockProperties.BlockLeave("jacaranda_leaves"),
                BlockCatalogs.MAHOGANY_LEAVES = new BlockProperties.BlockLeave("mahogany_leaves"),
                BlockCatalogs.MANGROVE_LEAVES = new BlockProperties.BlockLeave("mangrove_leaves"),
                BlockCatalogs.ORANGE_BIRCH_LEAVES = new BlockProperties.BlockLeave("orange_birch_leaves"),
                BlockCatalogs.ORANGE_OAK_LEAVES = new BlockProperties.BlockLeave("orange_oak_leaves"),
                BlockCatalogs.ORANGE_SPRUCE_LEAVES = new BlockProperties.BlockLeave("orange_spruce_leaves"),
                BlockCatalogs.ORCHARD_LEAVES = new BlockProperties.BlockLeave("orchard_leaves"),
                BlockCatalogs.PALO_VERDE_LEAVES = new BlockProperties.BlockLeave("palo_verde_leaves"),
                BlockCatalogs.PINE_lEAVES = new BlockProperties.BlockLeave("pine_leaves"),
                BlockCatalogs.PINK_CHERRY_LEAVES = new BlockProperties.BlockLeave("pink_cherry_leaves"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LEAVES = new BlockProperties.BlockLeave("rainbow_eucalyptus_leaves"),
                BlockCatalogs.RED_BIRCH_LEAVES = new BlockProperties.BlockLeave("red_birch_leaves"),
                BlockCatalogs.RED_MAPLE_LEAVES = new BlockProperties.BlockLeave("red_maple_leaves"),
                BlockCatalogs.RED_OAK_LEAVES = new BlockProperties.BlockLeave("red_oak_leaves"),
                BlockCatalogs.RED_SPRUCE_LEAVES = new BlockProperties.BlockLeave("red_spruce_leaves"),
                BlockCatalogs.REDWOOD_LEAVES = new BlockProperties.BlockLeave("redwood_leaves"),
                BlockCatalogs.RIPE_ORCHARD_LEAVES = new BlockProperties.BlockLeave("ripe_orchard_leaves"),
                BlockCatalogs.SILVER_MAPLE_LEAVES = new BlockProperties.BlockLeave("silver_maple_leaves"),
                BlockCatalogs.SKYRIS_LEAVES_GREEN_APPLE = new BlockProperties.BlockLeave("green_apple_skyris_leaves"),
                BlockCatalogs.SKYRIS_LEAVES = new BlockProperties.BlockLeave("skyris_leaves"),
                BlockCatalogs.WHITE_CHERRY_LEAVES = new BlockProperties.BlockLeave("white_cherry_leaves"),
                BlockCatalogs.WILLOW_LEAVES = new BlockProperties.BlockLeave("willow_leaves"),
                BlockCatalogs.WITCH_HAZEL_LEAVES = new BlockProperties.BlockLeave("witch_hazel_leaves"),
                BlockCatalogs.YELLOW_BIRCH_LEAVES = new BlockProperties.BlockLeave("yellow_birch_leaves"),
                BlockCatalogs.YELLOW_SPRUCE_LEAVES = new BlockProperties.BlockLeave("yellow_spruce_leaves")

        );
    }

    // Plant Blocks
    @SubscribeEvent
    public static void registerPlantBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.BLUEBERRY_BUSH = new BlockProperties.BlockBerryBush("blueberry_bush"),
                BlockCatalogs.GREEN_MUSHROOM_BLOCK = new BlockProperties.BlockHugeMushroom("green_mushroom_block"),
               BlockCatalogs.MILKCAP_MUSHROOM_BLOCK = new BlockProperties.BlockHugeMushroom("weeping_milkcap_mushroom_block"),
                BlockCatalogs.BLEWIT_MUSHROOM_BLOCK = new BlockProperties.BlockHugeMushroom("wood_blewit_mushroom_block"),
                BlockCatalogs.PUFF_MUSHROOM_BLOCK = new BlockProperties.BlockHugeMushroom("black_puff_mushroom_block"),
                BlockCatalogs.WHITE_MUSHROOM_STEM = new BlockProperties.BlockHugeMushroom("white_mushroom_stem"),
                BlockCatalogs.BROWN_MUSHROOM_STEM = new BlockProperties.BlockHugeMushroom("brown_mushroom_stem"),

                BlockCatalogs.CATTAIL = new BlockProperties.BlockFlower("cattail"),
                BlockCatalogs.REEDS = new BlockProperties.BlockFlower("reeds"),
                BlockCatalogs.HORSEWEED = new BlockProperties.BlockFlower("horseweed"),
                BlockCatalogs.MINI_CACTUS = new BlockProperties.BlockFlower("mini_cactus"),
                BlockCatalogs.PRICKLY_PEAR_CACTUS = new BlockProperties.BlockFlower("prickly_pear_cactus"),
                BlockCatalogs.WINTER_SUCCULENT = new BlockProperties.BlockFlower("winter_succulent"),
                BlockCatalogs.DEAD_GRASS = new BlockProperties.BlockFlower("dead_grass"),
                BlockCatalogs.SHORT_DEAD_GRASS = new BlockProperties.BlockFlower("short_dead_grass"),
                BlockCatalogs.BLUE_GLOWCANE = new BlockProperties.BlockStalk("blue_glowcane"),
                BlockCatalogs.RED_GLOWCANE = new BlockProperties.BlockStalk("red_glowcane"),
                BlockCatalogs.PURPLE_GLOWCANE = new BlockProperties.BlockStalk("purple_glowcane"),
                BlockCatalogs.PINK_GLOWCANE = new BlockProperties.BlockStalk("pink_glowcane"),
                BlockCatalogs.POISON_IVY = new BlockProperties.BlockFlower("poison_ivy"),




                //Petal Blocks
                BlockCatalogs.WHITE_PETAL = new BlockProperties.BlockLeave("white_petal_block"),
                BlockCatalogs.RED_PETAL = new BlockProperties.BlockLeave("red_petal_block"),
                BlockCatalogs.PURPLE_PETAL = new BlockProperties.BlockLeave("purple_petal_block"),
                BlockCatalogs.BLUE_PETAL = new BlockProperties.BlockLeave("blue_petal_block"),
                BlockCatalogs.LIGHT_BLUE_PETAL = new BlockProperties.BlockLeave("light_blue_petal_block"),
                BlockCatalogs.YELLOW_PETAL = new BlockProperties.BlockLeave("yellow_petal_block"),
                BlockCatalogs.PLANT_STEM = new BlockProperties.BlockLeave("plant_stem")




        );
    }

    // Log Blocks
    @SubscribeEvent
    public static void registerLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_LOG = new BlockProperties.BlockLog("aspen_log"),
                BlockCatalogs.BAOBAB_LOG = new BlockProperties.BlockLog("baobab_log"),
                BlockCatalogs.BLUE_ENCHANTED_LOG = new BlockProperties.BlockLog("blue_enchanted_log"),
                BlockCatalogs.CHERRY_LOG = new BlockProperties.BlockLog("cherry_log"),
                BlockCatalogs.CIKA_LOG = new BlockProperties.BlockLog("cika_log"),
                BlockCatalogs.CYPRESS_LOG = new BlockProperties.BlockLog("cypress_log"),
                BlockCatalogs.EBONY_LOG = new BlockProperties.BlockLog("ebony_log"),
                BlockCatalogs.FIR_LOG = new BlockProperties.BlockLog("fir_log"),
                BlockCatalogs.GREEN_ENCHANTED_LOG = new BlockProperties.BlockLog("green_enchanted_log"),
                BlockCatalogs.HOLLY_LOG = new BlockProperties.BlockLog("holly_log"),
                BlockCatalogs.JACARANDA_LOG = new BlockProperties.BlockLog("jacaranda_log"),
                BlockCatalogs.MAHOGANY_LOG = new BlockProperties.BlockLog("mahogany_log"),
                BlockCatalogs.MANGROVE_LOG = new BlockProperties.BlockLog("mangrove_log"),
                BlockCatalogs.MAPLE_LOG = new BlockProperties.BlockLog("maple_log"),
                BlockCatalogs.PALO_VERDE_LOG = new BlockProperties.BlockLog("palo_verde_log"),
                BlockCatalogs.PINE_LOG = new BlockProperties.BlockLog("pine_log"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LOG = new BlockProperties.BlockLog("rainbow_eucalyptus_log"),
                BlockCatalogs.REDWOOD_LOG = new BlockProperties.BlockLog("redwood_log"),
                BlockCatalogs.SKYRIS_LOG = new BlockProperties.BlockLog("skyris_log"),
                BlockCatalogs.WILLOW_LOG = new BlockProperties.BlockLog("willow_log"),
                BlockCatalogs.WITCH_HAZEL_LOG = new BlockProperties.BlockLog("witch_hazel_log"),
                BlockCatalogs.ZELKOVA_LOG = new BlockProperties.BlockLog("zelkova_log")
        );
    }

    //MushroomBlocks
    @SubscribeEvent
    public static void registerMushroomBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.BLACK_PUFF = new BlockProperties.BlockMushroom("black_puff"),
                BlockCatalogs.WEEPING_MILKCAP = new BlockProperties.BlockMushroom("weeping_milkcap"),
                BlockCatalogs.WOOD_BLEWIT = new BlockProperties.BlockMushroom("wood_blewit"),
                BlockCatalogs.GREEN_MUSHSHROOM = new BlockProperties.BlockMushroom("green_mushroom")

        );
    }

    //OreBlocks
    @SubscribeEvent
    public static void registerOreBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.PENDORITE_ORE = new BlockProperties.BlockOre("pendorite_ore"),
                BlockCatalogs.AMETRINE_ORE = new BlockProperties.BlockOre("ametrine_ore"),
                BlockCatalogs.PENDORITE_BLOCK = new BlockProperties.BlockOre("pendorite_block"),
                BlockCatalogs.AMETRINE_BLOCK = new BlockProperties.BlockOre("ametrine_block")

        );
    }

    //StoneBlocks
    @SubscribeEvent
    public static void registerStoneBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.DACITE = new BlockProperties.BlockStone("dacite"),
                BlockCatalogs.DACITE_BRICKS = new BlockProperties.BlockStone("dacite_bricks"),
                BlockCatalogs.DACITE_COBBLESTONE = new BlockProperties.BlockStone("dacite_cobblestone"),
                BlockCatalogs.DACITE_PILLAR = new BlockProperties.BlockStone("dacite_pillar"),
                BlockCatalogs.DACITE_TILE = new BlockProperties.BlockStone("dacite_tile"),

                BlockCatalogs.MOSSY_STONE = new BlockProperties.BlockStone("mossy_stone"),
                BlockCatalogs.OVERGROWN_STONE = new BlockProperties.BlockStone("overgrown_stone"),
                BlockCatalogs.ROCKY_STONE = new BlockProperties.BlockStone("rocky_stone"),

                BlockCatalogs.SCORIA_STONE = new BlockProperties.BlockStone("scoria_stone"),
                BlockCatalogs.SCORIA_COBBLESTONE = new BlockProperties.BlockStone("scoria_cobblestone"),
                BlockCatalogs.SCORIA_PILLAR = new BlockProperties.BlockStone("scoria_pillar"),
                BlockCatalogs.SCORIA_STONEBRICKS = new BlockProperties.BlockStone("scoria_stonebricks"),

                BlockCatalogs.SOAPSTONE = new BlockProperties.BlockStone("soapstone"),
                BlockCatalogs.POLISHED_SOAPSTONE = new BlockProperties.BlockStone("polished_soapstone"),
                BlockCatalogs.SOAPSTONE_BRICKS = new BlockProperties.BlockStone("soapstone_bricks"),
                BlockCatalogs.SOAPSTONE_PILLAR = new BlockProperties.BlockStone("soapstone_pillar"),
                BlockCatalogs.SOAPSTONE_TILE = new BlockProperties.BlockStone("soapstone_tile")

                );
    }

    //Stripped Logs
    @SubscribeEvent
    public static void registerStrippedLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.STRIPPED_ASPEN_LOG = new BlockProperties.BlockStrippedLog("stripped_aspen_log"),
                BlockCatalogs.STRIPPED_BAOBAB_LOG = new BlockProperties.BlockStrippedLog("stripped_baobab_log"),
                BlockCatalogs.STRIPPED_BLUE_ENCHANTED_LOG = new BlockProperties.BlockStrippedLog("stripped_blue_enchanted_log"),
                BlockCatalogs.STRIPPED_CHERRY_LOG = new BlockProperties.BlockStrippedLog("stripped_cherry_log"),
                BlockCatalogs.STRIPPED_CIKA_LOG = new BlockProperties.BlockStrippedLog("stripped_cika_log"),
                BlockCatalogs.STRIPPED_CYPRESS_LOG = new BlockProperties.BlockStrippedLog("stripped_cypress_log"),
                BlockCatalogs.STRIPPED_EBONY_LOG = new BlockProperties.BlockStrippedLog("stripped_ebony_log"),
                BlockCatalogs.STRIPPED_FIR_LOG = new BlockProperties.BlockStrippedLog("stripped_fir_log"),
                BlockCatalogs.STRIPPED_GREEN_ENCHANTED_LOG = new BlockProperties.BlockStrippedLog("stripped_green_enchanted_log"),
                BlockCatalogs.STRIPPED_HOLLY_LOG = new BlockProperties.BlockStrippedLog("stripped_holly_log"),
                BlockCatalogs.STRIPPED_JACARANDA_LOG = new BlockProperties.BlockStrippedLog("stripped_jacaranda_log"),
                BlockCatalogs.STRIPPED_MAHOGANY_LOG = new BlockProperties.BlockStrippedLog("stripped_mahogany_log"),
                BlockCatalogs.STRIPPED_MANGROVE_LOG = new BlockProperties.BlockStrippedLog("stripped_mangrove_log"),
                BlockCatalogs.STRIPPED_MAPLE_LOG = new BlockProperties.BlockStrippedLog("stripped_maple_log"),
                BlockCatalogs.STRIPPED_PALO_VERDE_LOG = new BlockProperties.BlockStrippedLog("stripped_palo_verde_log"),
                BlockCatalogs.STRIPPED_PINE_LOG = new BlockProperties.BlockStrippedLog("stripped_pine_log"),
                BlockCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BlockProperties.BlockStrippedLog("stripped_rainbow_eucalyptus_log"),
                BlockCatalogs.STRIPPED_SKYRIS_LOG = new BlockProperties.BlockStrippedLog("stripped_skyris_log"),
                BlockCatalogs.STRIPPED_WILLOW_LOG = new BlockProperties.BlockStrippedLog("stripped_willow_log"),
                BlockCatalogs.STRIPPED_REDWOOD_LOG = new BlockProperties.BlockStrippedLog("stripped_redwood_log"),
                BlockCatalogs.STRIPPED_WITCH_HAZEL_LOG = new BlockProperties.BlockStrippedLog("stripped_witch_hazel_log"),
                BlockCatalogs.STRIPPED_ZELKOVA_LOG = new BlockProperties.BlockStrippedLog("stripped_zelkova_log")
        );

    }

    //FlowerBlocks
    @SubscribeEvent
    public static void registerFlowerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ALLIUM_FLOWER_BUSH = new BlockProperties.BlockFlower("allium_flower_bush"),
                BlockCatalogs.ALPINE_BELLFLOWER = new BlockProperties.BlockFlower("alpine_bellflower"),
                BlockCatalogs.AMARANTH = new BlockProperties.BlockFlower("amaranth"),
                BlockCatalogs.ANGELICA = new BlockProperties.BlockFlower("angelica"),
                BlockCatalogs.AZALEA = new BlockProperties.BlockFlower("azalea"),
                BlockCatalogs.BEGONIA = new BlockProperties.BlockFlower("begonia"),
                BlockCatalogs.BISTORT = new BlockProperties.BlockFlower("bistort"),
                BlockCatalogs.BLUE_SAGE = new BlockProperties.BlockFlower("blue_sage"),
                BlockCatalogs.CALIFORNIA_POPPY = new BlockProperties.BlockFlower("california_poppy"),
                BlockCatalogs.CROCUS = new BlockProperties.BlockFlower("crocus"),
                BlockCatalogs.BLACK_ROSE = new BlockProperties.BlockFlower("black_rose"),
                BlockCatalogs.CYAN_AMARANTH = new BlockProperties.BlockFlower("cyan_amaranth"),
                BlockCatalogs.CYAN_ROSE = new BlockProperties.BlockFlower("cyan_rose"),
                BlockCatalogs.CYAN_TULIP = new BlockProperties.BlockFlower("cyan_tulip"),
                BlockCatalogs.DAFFODIL = new BlockProperties.BlockFlower("daffodil"),
                BlockCatalogs.DELPHINIUM = new BlockProperties.BlockFlower("delphinium"),
                BlockCatalogs.FAIRY_SLIPPER = new BlockProperties.BlockFlower("fairy_slipper"),
                BlockCatalogs.FIRECRACKER_FLOWER_BUSH = new BlockProperties.BlockFlower("firecracker_flower_bush"),
                BlockCatalogs.FOXGLOVE = new BlockProperties.BlockFlower("foxglove"),
                BlockCatalogs.GOLDEN_SPINED_CACTUS = new BlockProperties.BlockFlower("golden_spined_cactus"),
                BlockCatalogs.GREEN_TULIP = new BlockProperties.BlockFlower("green_tulip"),
                BlockCatalogs.GUZMANIA = new BlockProperties.BlockFlower("guzmania"),
                BlockCatalogs.INCAN_LILY = new BlockProperties.BlockFlower("incan_lily"),
                BlockCatalogs.IRIS = new BlockProperties.BlockFlower("iris"),
                BlockCatalogs.JAPANESE_ORCHID = new BlockProperties.BlockFlower("japanese_orchid"),
                BlockCatalogs.KOVAN_FLOWER = new BlockProperties.BlockFlower("kovan_flower"),
                BlockCatalogs.LAZARUS_BELLFLOWER = new BlockProperties.BlockFlower("lazarus_bellflower"),
                BlockCatalogs.LOLIPOP_FLOWER = new BlockProperties.BlockFlower("lolipop_flower"),
                BlockCatalogs.MAGENTA_AMARANTH = new BlockProperties.BlockFlower("magenta_amaranth"),
                BlockCatalogs.MAGENTA_TULIP = new BlockProperties.BlockFlower("magenta_tulip"),
                BlockCatalogs.ORANGE_AMARANTH = new BlockProperties.BlockFlower("orange_amaranth"),
                BlockCatalogs.ORANGE_DAISY = new BlockProperties.BlockFlower("orange_daisy"),
                BlockCatalogs.ORSIRIA_ROSE = new BlockProperties.BlockFlower("osiria_rose"),
                BlockCatalogs.PEACH_LEATHER_FLOWER = new BlockProperties.BlockFlower("peach_leather_flower"),
                BlockCatalogs.PINK_ALLIUM = new BlockProperties.BlockFlower("pink_allium"),
                BlockCatalogs.PINK_ALLIUM_FLOWER_BUSH = new BlockProperties.BlockFlower("pink_allium_flower_bush"),
                BlockCatalogs.PINK_ANEMONE = new BlockProperties.BlockFlower("pink_anemone"),
                BlockCatalogs.PINK_DAFFODIL = new BlockProperties.BlockFlower("pink_daffodil"),
                BlockCatalogs.PINK_ORCHID = new BlockProperties.BlockFlower("pink_orchid"),
                BlockCatalogs.PRAIRIE_GRASS = new BlockProperties.TallGrass("prairie_grass"),
                BlockCatalogs.PROTEA_FLOWER = new BlockProperties.BlockFlower("protea_flower"),
                BlockCatalogs.PURPLE_AMARANTH = new BlockProperties.BlockFlower("purple_amaranth"),
                BlockCatalogs.PURPLE_ORCHID = new BlockProperties.BlockFlower("purple_orchid"),
                BlockCatalogs.PURPLE_SAGE = new BlockProperties.BlockFlower("purple_sage"),
                BlockCatalogs.PURPLE_TULIP = new BlockProperties.BlockFlower("purple_tulip"),
                BlockCatalogs.RED_CORNFLOWER = new BlockProperties.BlockFlower("red_cornflower"),
                BlockCatalogs.RED_ORCHID = new BlockProperties.BlockFlower("red_orchid"),
                BlockCatalogs.RICHEA = new BlockProperties.BlockFlower("richea"),
                BlockCatalogs.ROSE = new BlockProperties.BlockFlower("rose"),
                BlockCatalogs.SNOWDROPS = new BlockProperties.BlockFlower("snowdrops"),
                BlockCatalogs.SILVER_VASE_FLOWER = new BlockProperties.BlockFlower("silver_vase_flower"),
                BlockCatalogs.TORCH_GINGER = new BlockProperties.BlockFlower("torch_ginger"),
                BlockCatalogs.VIOLET_LEATHER_FLOWER = new BlockProperties.BlockFlower("violet_leather_flower"),
                BlockCatalogs.WHITE_ANEMONE = new BlockProperties.BlockFlower("white_anemone"),
                BlockCatalogs.WHITE_SAGE = new BlockProperties.BlockFlower("white_sage"),
                BlockCatalogs.WINTER_CYCLAMEN = new BlockProperties.BlockFlower("winter_cyclamen"),
                BlockCatalogs.WINTER_ROSE = new BlockProperties.BlockFlower("winter_rose"),
                BlockCatalogs.WINTER_SCILLA = new BlockProperties.BlockFlower("winter_scilla"),
                BlockCatalogs.YELLOW_DAFFODIL = new BlockProperties.BlockFlower("yellow_daffodil"),
                BlockCatalogs.YELLOW_TULIP = new BlockProperties.BlockFlower("yellow_tulip")
        );
        BYG.LOGGER.info("All BYG blocks registered!");
    }
}
