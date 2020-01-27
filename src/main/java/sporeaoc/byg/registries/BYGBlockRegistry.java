package sporeaoc.byg.registries;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.blockproperties.BlockProperties;
import sporeaoc.byg.catalogs.BlockCatalogs;

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
                BlockCatalogs.ZELKOVA_PLANKS = new BlockProperties.BlockPlanks("zelkova_planks")
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
                BlockCatalogs.WHITE_CHERRY_LEAVES = new BlockProperties.BlockLeave("white_cherry_leaves"),
                BlockCatalogs.WILLOW_LEAVES = new BlockProperties.BlockLeave("willow_leaves"),
                BlockCatalogs.WITCH_HAZEL_LEAVES = new BlockProperties.BlockLeave("witch_hazel_leaves"),
                BlockCatalogs.YELLOW_BIRCH_LEAVES = new BlockProperties.BlockLeave("yellow_birch_leaves")
        );
    }

    // Plant Blocks
    @SubscribeEvent
    public static void registerPlantBlocks(final RegistryEvent.Register<Block> event) {

        /*
         * TODO: Add Plant Blocks
         */

        //BlockCatalogs = new Reed
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
                BlockCatalogs.WOOD_BLEWIT = new BlockProperties.BlockMushroom("wood_blewit")
        );
    }

    //OreBlocks
    @SubscribeEvent
    public static void registerOreBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.LATHARIUM_ORE = new BlockProperties.BlockOre("latharium_ore"),
                BlockCatalogs.PENDORITE_ORE = new BlockProperties.BlockOre("pendorite_ore"),
                BlockCatalogs.TAMRELITE_ORE = new BlockProperties.BlockOre("tamrelite_ore")
        );
    }

    //StoneBlocks
    @SubscribeEvent
    public static void registerStoneBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BlockCatalogs.DACITE = new BlockProperties.BlockStone("dacite"),
                BlockCatalogs.MOSSY_STONE = new BlockProperties.BlockStone("mossy_stone"),
                BlockCatalogs.OVERGROWN_STONE = new BlockProperties.BlockStone("overgrown_stone"),
                BlockCatalogs.ROCKY_STONE = new BlockProperties.BlockStone("rocky_stone"),
                BlockCatalogs.SCORIA_STONE = new BlockProperties.BlockStone("scoria_stone"),
                BlockCatalogs.SOAPSTONE = new BlockProperties.BlockStone("soapstone")
        );
    }

    //Stripped Logs
    @SubscribeEvent
    public static void registerStrippedLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
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
