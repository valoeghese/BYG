package sporeaoc.byg.registries;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.block.*;
import sporeaoc.byg.catalogs.BlockCatalogs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBlockRegistry {
    // Plank Blocks
    @SubscribeEvent
    public static void registerPlankBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_PLANKS = new BlockPlanks("aspen_planks"),
                BlockCatalogs.BAOBAB_PLANKS = new BlockPlanks("baobab_planks"),
                BlockCatalogs.BLUE_ENCHANTED_PLANKS = new BlockPlanks("blue_enchanted_planks"),
                BlockCatalogs.CHERRY_PLANKS = new BlockPlanks("cherry_planks"),
                BlockCatalogs.CIKA_PLANKS = new BlockPlanks("cika_planks"),
                BlockCatalogs.CYPRESS_PLANKS = new BlockPlanks("cypress_planks"),
                BlockCatalogs.EBONY_PLANKS = new BlockPlanks("ebony_planks"),
                BlockCatalogs.FIR_PLANKS = new BlockPlanks("fir_planks"),
                BlockCatalogs.GREEN_ENCHANTED_PLANKS = new BlockPlanks("green_enchanted_planks"),
                BlockCatalogs.HOLLY_PLANKS = new BlockPlanks("holly_planks"),
                BlockCatalogs.JACARANDA_PLANKS = new BlockPlanks("jacaranda_planks"),
                BlockCatalogs.MAHOGONY_PLANKS = new BlockPlanks("mahogany_planks"),
                BlockCatalogs.MANGROVE_PLANKS = new BlockPlanks("mangrove_planks"),
                BlockCatalogs.MAPLE_PLANKS = new BlockPlanks("maple_planks"),
                BlockCatalogs.PINE_PLANKS = new BlockPlanks("pine_planks"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_PLANKS = new BlockPlanks("rainbow_eucalyptus_planks"),
                BlockCatalogs.REDWOOD_PLANKS = new BlockPlanks("redwood_planks"),
                BlockCatalogs.SKYRIS_PLANKS = new BlockPlanks("skyris_planks"),
                BlockCatalogs.WILLOW_PLANKS = new BlockPlanks("willow_planks"),
                BlockCatalogs.WITCH_HAZEL_PLANKS = new BlockPlanks("witch_hazel_planks"),
                BlockCatalogs.ZELKOVA_PLANKS = new BlockPlanks("zelkova_planks")
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
                BlockCatalogs.ASPEN_FENCE = new BlockFence("aspen_fence"),
                BlockCatalogs.BAOBAB_FENCE = new BlockFence("baobab_fence"),
                BlockCatalogs.BLUE_ENCHANTED_FENCE = new BlockFence("blue_enchanted_fence"),
                BlockCatalogs.CHERRY_FENCE = new BlockFence("cherry_fence"),
                BlockCatalogs.CIKA_FENCE = new BlockFence("cika_fence"),
                BlockCatalogs.CYPRESS_FENCE = new BlockFence("cypress_fence"),
                BlockCatalogs.EBONY_FENCE = new BlockFence("ebony_fence"),
                BlockCatalogs.FIR_FENCE = new BlockFence("fir_fence"),
                BlockCatalogs.GREEN_ENCHANTED_FENCE = new BlockFence("green_enchanted_fence"),
                BlockCatalogs.HOLLY_FENCE = new BlockFence("holly_fence"),
                BlockCatalogs.JACARANDA_FENCE = new BlockFence("jacaranda_fence"),
                BlockCatalogs.MAHOGONY_FENCE = new BlockFence("mahogany_fence"),
                BlockCatalogs.MANGROVE_FENCE = new BlockFence("mangrove_fence"),
                BlockCatalogs.MAPLE_FENCE = new BlockFence("maple_fence"),
                BlockCatalogs.PINE_FENCE = new BlockFence("pine_fence"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_FENCE = new BlockFence("rainbow_eucalyptus_fence"),
                BlockCatalogs.REDWOOD_FENCE = new BlockFence("redwood_fence"),
                BlockCatalogs.SKYRIS_FENCE = new BlockFence("skyris_fence"),
                BlockCatalogs.WILLOW_FENCE = new BlockFence("willow_fence"),
                BlockCatalogs.WITCH_HAZEL_FENCE = new BlockFence("witch_hazel_fence"),
                BlockCatalogs.ZELKOVA_FENCE = new BlockFence("zelkova_fence")
        );
    }

    // Sapling Blocks
    @SubscribeEvent
    public static void registerSaplingBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
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
                BlockCatalogs.BAOBAB_LEAVES = new BlockLeave("baobab_leaves"),
                BlockCatalogs.BLOOMING_WITCH_HAZEL_LEAVES = new BlockLeave("blooming_witch_hazel_leaves"),
                BlockCatalogs.BLUE_ENCHANTED_LEAVES = new BlockLeave("blue_enchanted_leaves"),
                BlockCatalogs.BLUE_SPRUCE_LEAVES = new BlockLeave("blue_spruce_leaves"),
                BlockCatalogs.BROWN_BIRCH_LEAVES = new BlockLeave("brown_birch_leaves"),
                BlockCatalogs.BROWN_OAK_LEAVES = new BlockLeave("brown_oak_leaves"),
                BlockCatalogs.CIKA_LEAVES = new BlockLeave("cika_leaves"),
                BlockCatalogs.CYPRESS_LEAVES = new BlockLeave("cypress_leaves"),
                BlockCatalogs.EBONY_LEAVES = new BlockLeave("ebony_leaves"),
                BlockCatalogs.FIR_LEAVES = new BlockLeave("fir_leaves"),
                BlockCatalogs.FLOWERING_ORCHARD_LEAVES = new BlockLeave("flowering_orchard_leaves"),
                BlockCatalogs.FLOWERING_PALO_VERDE_LEAVES = new BlockLeave("flowering_palo_verde_leaves"),
                BlockCatalogs.GREEN_ENCHANTED_LEAVES = new BlockLeave("green_enchanted_leaves"),
                BlockCatalogs.HOLLY_BERRY_LEAVES = new BlockLeave("holly_berry_leaves"),
                BlockCatalogs.HOLLY_LEAVES = new BlockLeave("holly_leaves"),
                BlockCatalogs.JACARANDA_LEAVES = new BlockLeave("jacaranda_leaves"),
                BlockCatalogs.MAHOGANY_LEAVES = new BlockLeave("mahogany_leaves"),
                BlockCatalogs.MANGROVE_LEAVES = new BlockLeave("mangrove_leaves"),
                BlockCatalogs.ORANGE_BIRCH_LEAVES = new BlockLeave("orange_birch_leaves"),
                BlockCatalogs.ORANGE_OAK_LEAVES = new BlockLeave("orange_oak_leaves"),
                BlockCatalogs.ORANGE_SPRUCE_LEAVES = new BlockLeave("orange_spruce_leaves"),
                BlockCatalogs.ORCHARD_LEAVES = new BlockLeave("orchard_leaves"),
                BlockCatalogs.PALO_VERDE_LEAVES = new BlockLeave("palo_verde_leaves"),
                BlockCatalogs.PINE_lEAVES = new BlockLeave("pine_leaves"),
                BlockCatalogs.PINK_CHERRY_LEAVES = new BlockLeave("pink_cherry_leaves"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LEAVES = new BlockLeave("rainbow_eucalyptus_leaves"),
                BlockCatalogs.RED_BIRCH_LEAVES = new BlockLeave("red_birch_leaves"),
                BlockCatalogs.RED_MAPLE_LEAVES = new BlockLeave("red_maple_leaves"),
                BlockCatalogs.RED_OAK_LEAVES = new BlockLeave("red_oak_leaves"),
                BlockCatalogs.RED_SPRUCE_LEAVES = new BlockLeave("red_spruce_leaves"),
                BlockCatalogs.REDWOOD_LEAVES = new BlockLeave("redwood_leaves"),
                BlockCatalogs.RIPE_ORCHARD_LEAVES = new BlockLeave("ripe_orchard_leaves"),
                BlockCatalogs.SILVER_MAPLE_LEAVES = new BlockLeave("silver_maple_leaves"),
                BlockCatalogs.SKYRIS_LEAVES_GREEN_APPLE = new BlockLeave("green_apple_skyris_leaves"),
                BlockCatalogs.WHITE_CHERRY_LEAVES = new BlockLeave("white_cherry_leaves"),
                BlockCatalogs.WILLOW_LEAVES = new BlockLeave("willow_leaves"),
                BlockCatalogs.WITCH_HAZEL_LEAVES = new BlockLeave("witch_hazel_leaves"),
                BlockCatalogs.YELLOW_BIRCH_LEAVES = new BlockLeave("yellow_birch_leaves")
        );
    }

    // Plant Blocks
    @SubscribeEvent
    public static void registerPlantBlocks(final RegistryEvent.Register<Block> event) {
        BlockCatalogs.PRAIRIE_GRASS = new Prairieplant("prarie_grass");

        /*
         * TODO: Add Plant Blocks
         */

        //BlockCatalogs = new Reed
    }

    // Log Blocks
    @SubscribeEvent
    public static void registerLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ASPEN_LOG = new BlockLog("aspen_log"),
                BlockCatalogs.BAOBAB_LOG = new BlockLog("baobab_log"),
                BlockCatalogs.BLUE_ENCHANTED_LOG = new BlockLog("blue_enchanted_log"),
                BlockCatalogs.CHERRY_LOG = new BlockLog("cherry_log"),
                BlockCatalogs.CIKA_LOG = new BlockLog("cika_log"),
                BlockCatalogs.CYPRESS_LOG = new BlockLog("cypress_log"),
                BlockCatalogs.EBONY_LOG = new BlockLog("ebony_log"),
                BlockCatalogs.FIR_LOG = new BlockLog("fir_log"),
                BlockCatalogs.GREEN_ENCHANTED_LOG = new BlockLog("green_enchanted_log"),
                BlockCatalogs.HOLLY_LOG = new BlockLog("holly_log"),
                BlockCatalogs.JACARANDA_LOG = new BlockLog("jacaranda_log"),
                BlockCatalogs.MAHOGANY_LOG = new BlockLog("mahogany_log"),
                BlockCatalogs.MANGROVE_LOG = new BlockLog("mangrove_log"),
                BlockCatalogs.MAPLE_LOG = new BlockLog("maple_log"),
                BlockCatalogs.PALO_VERDE_LOG = new BlockLog("palo_verde_log"),
                BlockCatalogs.PINE_LOG = new BlockLog("pine_log"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LOG = new BlockLog("rainbow_eucalyptus_log"),
                BlockCatalogs.REDWOOD_LOG = new BlockLog("redwood_log"),
                BlockCatalogs.SKYRIS_LOG = new BlockLog("skyris_log"),
                BlockCatalogs.WILLOW_LOG = new BlockLog("willow_log"),
                BlockCatalogs.WITCH_HAZEL_LOG = new BlockLog("witch_hazel_log"),
                BlockCatalogs.ZELKOVA_LOG = new BlockLog("zelkova_log")
        );
    }

    //MushroomBlocks
    @SubscribeEvent
    public static void registerMushroomBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.BLACK_PUFF = new BlockMushroom("black_puff"),
                BlockCatalogs.WEEPING_MILKCAP = new BlockMushroom("weeping_milkcap"),
                BlockCatalogs.WOOD_BLEWIT = new BlockMushroom("wood_blewit")
        );
    }

    //OreBlocks
    @SubscribeEvent
    public static void registerOreBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.LATHARIUM_ORE = new BlockOre("latharium_ore"),
                BlockCatalogs.PENDORITE_ORE = new BlockOre("pendorite_ore"),
                BlockCatalogs.TAMRELITE_ORE = new BlockOre("tamrelite_ore")
        );
    }

    //StoneBlocks
    @SubscribeEvent
    public static void registerStoneBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.DACITE = new BlockStone("dacite"),
                BlockCatalogs.MOSSY_STONE = new BlockStone("mossy_stone"),
                BlockCatalogs.OVERGROWN_STONE = new BlockStone("overgrown_stone"),
                BlockCatalogs.ROCKY_STONE = new BlockStone("rocky_stone"),
                BlockCatalogs.SCORIA_STONE = new BlockStone("scoria_stone"),
                BlockCatalogs.SOAPSTONE = new BlockStone("soapstone")
        );
    }

    //Stripped Logs
    @SubscribeEvent
    public static void registerStrippedLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.STRIPPED_BAOBAB_LOG = new BlockStrippedLog("stripped_baobab_log"),
                BlockCatalogs.STRIPPED_BLUE_ENCHANTED_LOG = new BlockStrippedLog("stripped_blue_enchanted_log"),
                BlockCatalogs.STRIPPED_CHERRY_LOG = new BlockStrippedLog("stripped_cherry_log"),
                BlockCatalogs.STRIPPED_CIKA_LOG = new BlockStrippedLog("stripped_cika_log"),
                BlockCatalogs.STRIPPED_CYPRESS_LOG = new BlockStrippedLog("stripped_cypress_log"),
                BlockCatalogs.STRIPPED_EBONY_LOG = new BlockStrippedLog("stripped_ebony_log"),
                BlockCatalogs.STRIPPED_FIR_LOG = new BlockStrippedLog("stripped_fir_log"),
                BlockCatalogs.STRIPPED_GREEN_ENCHANTED_LOG = new BlockStrippedLog("stripped_green_enchanted_log"),
                BlockCatalogs.STRIPPED_HOLLY_LOG = new BlockStrippedLog("stripped_holly_log"),
                BlockCatalogs.STRIPPED_JACARANDA_LOG = new BlockStrippedLog("stripped_jacaranda_log"),
                BlockCatalogs.STRIPPED_MAHOGANY_LOG = new BlockStrippedLog("stripped_mahogany_log"),
                BlockCatalogs.STRIPPED_MANGROVE_LOG = new BlockStrippedLog("stripped_mangrove_log"),
                BlockCatalogs.STRIPPED_MAPLE_LOG = new BlockStrippedLog("stripped_maple_log"),
                BlockCatalogs.STRIPPED_PALO_VERDE_LOG = new BlockStrippedLog("stripped_palo_verde_log"),
                BlockCatalogs.STRIPPED_PINE_LOG = new BlockStrippedLog("stripped_pine_log"),
                BlockCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BlockStrippedLog("stripped_rainbow_eucalyptus_log"),
                BlockCatalogs.STRIPPED_SKYRIS_LOG = new BlockStrippedLog("stripped_skyris_log"),
                BlockCatalogs.STRIPPED_WILLOW_LOG = new BlockStrippedLog("stripped_willow_log"),
                BlockCatalogs.STRIPPED_REDWOOD_LOG = new BlockStrippedLog("stripped_redwood_log"),
                BlockCatalogs.STRIPPED_WITCH_HAZEL_LOG = new BlockStrippedLog("stripped_witch_hazel_log"),
                BlockCatalogs.STRIPPED_ZELKOVA_LOG = new BlockStrippedLog("stripped_zelkova_log")
        );

    }

    //FlowerBlocks
    @SubscribeEvent
    public static void registerFlowerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.ALLIUM_FLOWER_BUSH = new BlockFlower("allium_flower_bush"),
                BlockCatalogs.ALPINE_BELLFLOWER = new BlockFlower("alpine_bellflower"),
                BlockCatalogs.AMARANTH = new BlockFlower("amaranth"),
                BlockCatalogs.ANGELICA = new BlockFlower("angelica"),
                BlockCatalogs.AZALEA = new BlockFlower("azalea"),
                BlockCatalogs.BEGONIA = new BlockFlower("begonia"),
                BlockCatalogs.BISTORT = new BlockFlower("bistort"),
                BlockCatalogs.BLUE_SAGE = new BlockFlower("blue_sage"),
                BlockCatalogs.CALIFORNIA_POPPY = new BlockFlower("california_poppy"),
                BlockCatalogs.CROCUS = new BlockFlower("crocus"),
                BlockCatalogs.BLACK_ROSE = new BlockFlower("black_rose"),
                BlockCatalogs.CYAN_AMARANTH = new BlockFlower("cyan_amaranth"),
                BlockCatalogs.CYAN_ROSE = new BlockFlower("cyan_rose"),
                BlockCatalogs.CYAN_TULIP = new BlockFlower("cyan_tulip"),
                BlockCatalogs.DAFFODIL = new BlockFlower("daffodil"),
                BlockCatalogs.DELPHINIUM = new BlockFlower("delphinium"),
                BlockCatalogs.FAIRY_SLIPPER = new BlockFlower("fairy_slipper"),
                BlockCatalogs.FIRECRACKER_FLOWER_BUSH = new BlockFlower("firecracker_flower_bush"),
                BlockCatalogs.FOXGLOVE = new BlockFlower("foxglove"),
                BlockCatalogs.GOLDEN_SPINED_CACTUS = new BlockFlower("golden_spined_cactus"),
                BlockCatalogs.GREEN_TULIP = new BlockFlower("green_tulip"),
                BlockCatalogs.GUZMANIA = new BlockFlower("guzmania"),
                BlockCatalogs.INCAN_LILY = new BlockFlower("incan_lily"),
                BlockCatalogs.IRIS = new BlockFlower("iris"),
                BlockCatalogs.JAPANESE_ORCHID = new BlockFlower("japanese_orchid"),
                BlockCatalogs.KOVAN_FLOWER = new BlockFlower("kovan_flower"),
                BlockCatalogs.LAZARUS_BELLFLOWER = new BlockFlower("lazarus_bellflower"),
                BlockCatalogs.LOLIPOP_FLOWER = new BlockFlower("lolipop_flower"),
                BlockCatalogs.MAGENTA_AMARANTH = new BlockFlower("magenta_amaranth"),
                BlockCatalogs.MAGENTA_TULIP = new BlockFlower("magenta_tulip"),
                BlockCatalogs.ORANGE_AMARANTH = new BlockFlower("orange_amaranth"),
                BlockCatalogs.ORANGE_DAISY = new BlockFlower("orange_daisy"),
                BlockCatalogs.ORSIRIA_ROSE = new BlockFlower("osiria_rose"),
                BlockCatalogs.PEACH_LEATHER_FLOWER = new BlockFlower("peach_leather_flower"),
                BlockCatalogs.PINK_ALLIUM = new BlockFlower("pink_allium"),
                BlockCatalogs.PINK_ALLIUM_FLOWER_BUSH = new BlockFlower("pink_allium_flower_bush"),
                BlockCatalogs.PINK_ANEMONE = new BlockFlower("pink_anemone"),
                BlockCatalogs.PINK_DAFFODIL = new BlockFlower("pink_daffodil"),
                BlockCatalogs.PINK_ORCHID = new BlockFlower("pink_orchid"),
                BlockCatalogs.PROTEA_FLOWER = new BlockFlower("protea_flower"),
                BlockCatalogs.PURPLE_AMARANTH = new BlockFlower("purple_amaranth"),
                BlockCatalogs.PURPLE_ORCHID = new BlockFlower("purple_orchid"),
                BlockCatalogs.PURPLE_SAGE = new BlockFlower("purple_sage"),
                BlockCatalogs.PURPLE_TULIP = new BlockFlower("purple_tulip"),
                BlockCatalogs.RED_CORNFLOWER = new BlockFlower("red_cornflower"),
                BlockCatalogs.RED_ORCHID = new BlockFlower("red_orchid"),
                BlockCatalogs.RICHEA = new BlockFlower("richea"),
                BlockCatalogs.ROSE = new BlockFlower("rose"),
                BlockCatalogs.SNOWDROPS = new BlockFlower("snowdrops"),
                BlockCatalogs.SILVER_VASE_FLOWER = new BlockFlower("silver_vase_flower"),
                BlockCatalogs.TORCH_GINGER = new BlockFlower("torch_ginger"),
                BlockCatalogs.VIOLET_LEATHER_FLOWER = new BlockFlower("violet_leather_flower"),
                BlockCatalogs.WHITE_ANEMONE = new BlockFlower("white_anemone"),
                BlockCatalogs.WHITE_SAGE = new BlockFlower("white_sage"),
                BlockCatalogs.WINTER_CYCLAMEN = new BlockFlower("winter_cyclamen"),
                BlockCatalogs.WINTER_ROSE = new BlockFlower("winter_rose"),
                BlockCatalogs.WINTER_SCILLA = new BlockFlower("winter_scilla"),
                BlockCatalogs.YELLOW_DAFFODIL = new BlockFlower("yellow_daffodil"),
                BlockCatalogs.YELLOW_TULIP = new BlockFlower("yellow_tulip")
        );
        BYG.LOGGER.info("All BYG blocks registered!");
    }
}
