package sporeaoc.byg.registries;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.byglists.BYGBlockList;
import sporeaoc.byg.bygproperties.BYGBlockProperties;
import sporeaoc.byg.bygproperties.blocks.BYGSaplingProperties;
import sporeaoc.byg.world.feature.tree.BYGSaplingToTree;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGBlockRegistry {
    // Plank Blocks
    @SubscribeEvent
    public static void registerPlankBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_PLANKS = new BYGBlockProperties.BYGPlanks("aspen_planks"),
                BYGBlockList.BAOBAB_PLANKS = new BYGBlockProperties.BYGPlanks("baobab_planks"),
                BYGBlockList.BLUE_ENCHANTED_PLANKS = new BYGBlockProperties.BYGPlanks("blue_enchanted_planks"),
                BYGBlockList.CHERRY_PLANKS = new BYGBlockProperties.BYGPlanks("cherry_planks"),
                BYGBlockList.CIKA_PLANKS = new BYGBlockProperties.BYGPlanks("cika_planks"),
                BYGBlockList.CYPRESS_PLANKS = new BYGBlockProperties.BYGPlanks("cypress_planks"),
                BYGBlockList.EBONY_PLANKS = new BYGBlockProperties.BYGPlanks("ebony_planks"),
                BYGBlockList.FIR_PLANKS = new BYGBlockProperties.BYGPlanks("fir_planks"),
                BYGBlockList.GREEN_ENCHANTED_PLANKS = new BYGBlockProperties.BYGPlanks("green_enchanted_planks"),
                BYGBlockList.HOLLY_PLANKS = new BYGBlockProperties.BYGPlanks("holly_planks"),
                BYGBlockList.JACARANDA_PLANKS = new BYGBlockProperties.BYGPlanks("jacaranda_planks"),
                BYGBlockList.MAHOGANY_PLANKS = new BYGBlockProperties.BYGPlanks("mahogany_planks"),
                BYGBlockList.MANGROVE_PLANKS = new BYGBlockProperties.BYGPlanks("mangrove_planks"),
                BYGBlockList.MAPLE_PLANKS = new BYGBlockProperties.BYGPlanks("maple_planks"),
                BYGBlockList.PINE_PLANKS = new BYGBlockProperties.BYGPlanks("pine_planks"),
                BYGBlockList.RAINBOW_EUCALYPTUS_PLANKS = new BYGBlockProperties.BYGPlanks("rainbow_eucalyptus_planks"),
                BYGBlockList.REDWOOD_PLANKS = new BYGBlockProperties.BYGPlanks("redwood_planks"),
                BYGBlockList.SKYRIS_PLANKS = new BYGBlockProperties.BYGPlanks("skyris_planks"),
                BYGBlockList.WILLOW_PLANKS = new BYGBlockProperties.BYGPlanks("willow_planks"),
                BYGBlockList.WITCH_HAZEL_PLANKS = new BYGBlockProperties.BYGPlanks("witch_hazel_planks"),
                BYGBlockList.ZELKOVA_PLANKS = new BYGBlockProperties.BYGPlanks("zelkova_planks"),

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

                //Doors
                BYGBlockList.ASPEN_DOOR = new BYGBlockProperties.BYGDoors("aspen_door"),
                BYGBlockList.BAOBAB_DOOR = new BYGBlockProperties.BYGDoors("baobab_door"),
                BYGBlockList.BLUE_ENCHANTED_DOOR = new BYGBlockProperties.BYGDoors("blue_enchanted_door"),
                BYGBlockList.CHERRY_DOOR = new BYGBlockProperties.BYGDoors("cherry_door"),
                BYGBlockList.CIKA_DOOR = new BYGBlockProperties.BYGDoors("cika_door"),
                BYGBlockList.CYPRESS_DOOR = new BYGBlockProperties.BYGDoors("cypress_door"),
                BYGBlockList.EBONY_DOOR= new BYGBlockProperties.BYGDoors("ebony_door"),
                BYGBlockList.FIR_DOOR = new BYGBlockProperties.BYGDoors("fir_door"),
                BYGBlockList.GREEN_ENCHANTED_DOOR = new BYGBlockProperties.BYGDoors("green_enchanted_door"),
                BYGBlockList.HOLLY_DOOR = new BYGBlockProperties.BYGDoors("holly_door"),
                BYGBlockList.JACARANDA_DOOR = new BYGBlockProperties.BYGDoors("jacaranda_door"),
                BYGBlockList.MAHOGANY_DOOR = new BYGBlockProperties.BYGDoors("mahogany_door"),
                BYGBlockList.MANGROVE_DOOR = new BYGBlockProperties.BYGDoors("mangrove_door"),
                BYGBlockList.MAPLE_DOOR = new BYGBlockProperties.BYGDoors("maple_door"),
                BYGBlockList.PINE_DOOR = new BYGBlockProperties.BYGDoors("pine_door"),
                BYGBlockList.RAINBOW_EUCALYPTUS_DOOR = new BYGBlockProperties.BYGDoors("rainbow_eucalyptus_door"),
                BYGBlockList.REDWOOD_DOOR = new BYGBlockProperties.BYGDoors("redwood_door"),
                BYGBlockList.SKYRIS_DOOR = new BYGBlockProperties.BYGDoors("skyris_door"),
                BYGBlockList.WILLOW_DOOR = new BYGBlockProperties.BYGDoors("willow_door"),
                BYGBlockList.WITCH_HAZEL_DOOR = new BYGBlockProperties.BYGDoors("witch_hazel_door"),
                BYGBlockList.ZELKOVA_DOOR = new BYGBlockProperties.BYGDoors("zelkova_door"),


                //Crafting Tables
//                BYGBlockList.ASPEN_CRAFTING_TABLE = new BYGBlockProperties.BYGCraftingTable("aspen_crafting_table"),
//                BYGBlockList.BAOBAB_DOOR = new BYGBlockProperties.BYGDoors("baobab_door"),
//                BYGBlockList.BLUE_ENCHANTED_DOOR = new BYGBlockProperties.BYGDoors("blue_enchanted_door"),
//                BYGBlockList.CHERRY_DOOR = new BYGBlockProperties.BYGDoors("cherry_door"),
//                BYGBlockList.CIKA_DOOR = new BYGBlockProperties.BYGDoors("cika_door"),
//                BYGBlockList.CYPRESS_DOOR = new BYGBlockProperties.BYGDoors("cypress_door"),
//                BYGBlockList.EBONY_DOOR= new BYGBlockProperties.BYGDoors("ebony_door"),
//                BYGBlockList.FIR_DOOR = new BYGBlockProperties.BYGDoors("fir_door"),
//                BYGBlockList.GREEN_ENCHANTED_DOOR = new BYGBlockProperties.BYGDoors("green_enchanted_door"),
//                BYGBlockList.HOLLY_DOOR = new BYGBlockProperties.BYGDoors("holly_door"),
//                BYGBlockList.JACARANDA_DOOR = new BYGBlockProperties.BYGDoors("jacaranda_door"),
//                BYGBlockList.MAHOGANY_DOOR = new BYGBlockProperties.BYGDoors("mahogany_door"),
//                BYGBlockList.MANGROVE_DOOR = new BYGBlockProperties.BYGDoors("mangrove_door"),
//                BYGBlockList.MAPLE_DOOR = new BYGBlockProperties.BYGDoors("maple_door"),
//                BYGBlockList.PINE_DOOR = new BYGBlockProperties.BYGDoors("pine_door"),
//                BYGBlockList.RAINBOW_EUCALYPTUS_DOOR = new BYGBlockProperties.BYGDoors("rainbow_eucalyptus_door"),
//                BYGBlockList.REDWOOD_DOOR = new BYGBlockProperties.BYGDoors("redwood_door"),
//                BYGBlockList.SKYRIS_DOOR = new BYGBlockProperties.BYGDoors("skyris_door"),
//                BYGBlockList.WILLOW_DOOR = new BYGBlockProperties.BYGDoors("willow_door"),
//                BYGBlockList.WITCH_HAZEL_DOOR = new BYGBlockProperties.BYGDoors("witch_hazel_door"),
//                BYGBlockList.ZELKOVA_DOOR = new BYGBlockProperties.BYGDoors("zelkova_door"),

                //Fence Gates
                BYGBlockList.ASPEN_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("aspen_fence_gate"),
                BYGBlockList.BAOBAB_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("baobab_fence_gate"),
                BYGBlockList.BLUE_ENCHANTED_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("blue_enchanted_fence_gate"),
                BYGBlockList.CHERRY_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("cherry_fence_gate"),
                BYGBlockList.CIKA_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("cika_fence_gate"),
                BYGBlockList.CYPRESS_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("cypress_fence_gate"),
                BYGBlockList.EBONY_FENCE_GATE= new BYGBlockProperties.BYGFenceGate("ebony_fence_gate"),
                BYGBlockList.FIR_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("fir_fence_gate"),
                BYGBlockList.GREEN_ENCHANTED_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("green_enchanted_fence_gate"),
                BYGBlockList.HOLLY_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("holly_fence_gate"),
                BYGBlockList.JACARANDA_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("jacaranda_fence_gate"),
                BYGBlockList.MAHOGANY_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("mahogany_fence_gate"),
                BYGBlockList.MANGROVE_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("mangrove_fence_gate"),
                BYGBlockList.MAPLE_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("maple_fence_gate"),
                BYGBlockList.PINE_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("pine_fence_gate"),
                BYGBlockList.RAINBOW_EUCALYPTUS_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("rainbow_eucalyptus_fence_gate"),
                BYGBlockList.REDWOOD_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("redwood_fence_gate"),
                BYGBlockList.SKYRIS_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("skyris_fence_gate"),
                BYGBlockList.WILLOW_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("willow_fence_gate"),
                BYGBlockList.WITCH_HAZEL_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("witch_hazel_fence_gate"),
                BYGBlockList.ZELKOVA_FENCE_GATE = new BYGBlockProperties.BYGFenceGate("zelkova_fence_gate"),

                //Slabs
                BYGBlockList.ASPEN_SLAB = new BYGBlockProperties.BYGWoodSlab("aspen_slab"),
                BYGBlockList.BAOBAB_SLAB = new BYGBlockProperties.BYGWoodSlab("baobab_slab"),
                BYGBlockList.BLUE_ENCHANTED_SLAB = new BYGBlockProperties.BYGWoodSlab("blue_enchanted_slab"),
                BYGBlockList.CHERRY_SLAB = new BYGBlockProperties.BYGWoodSlab("cherry_slab"),
                BYGBlockList.CIKA_SLAB = new BYGBlockProperties.BYGWoodSlab("cika_slab"),
                BYGBlockList.CYPRESS_SLAB = new BYGBlockProperties.BYGWoodSlab("cypress_slab"),
                BYGBlockList.EBONY_SLAB = new BYGBlockProperties.BYGWoodSlab("ebony_slab"),
                BYGBlockList.FIR_SLAB = new BYGBlockProperties.BYGWoodSlab("fir_slab"),
                BYGBlockList.GREEN_ENCHANTED_SLAB = new BYGBlockProperties.BYGWoodSlab("green_enchanted_slab"),
                BYGBlockList.HOLLY_SLAB = new BYGBlockProperties.BYGWoodSlab("holly_slab"),
                BYGBlockList.JACARANDA_SLAB = new BYGBlockProperties.BYGWoodSlab("jacaranda_slab"),
                BYGBlockList.MAHOGANY_SLAB = new BYGBlockProperties.BYGWoodSlab("mahogany_slab"),
                BYGBlockList.MANGROVE_SLAB = new BYGBlockProperties.BYGWoodSlab("mangrove_slab"),
                BYGBlockList.MAPLE_SLAB = new BYGBlockProperties.BYGWoodSlab("maple_slab"),
                BYGBlockList.PINE_SLAB = new BYGBlockProperties.BYGWoodSlab("pine_slab"),
                BYGBlockList.RAINBOW_EUCALYPTUS_SLAB = new BYGBlockProperties.BYGWoodSlab("rainbow_eucalyptus_slab"),
                BYGBlockList.REDWOOD_SLAB = new BYGBlockProperties.BYGWoodSlab("redwood_slab"),
                BYGBlockList.SKYRIS_SLAB = new BYGBlockProperties.BYGWoodSlab("skyris_slab"),
                BYGBlockList.WILLOW_SLAB = new BYGBlockProperties.BYGWoodSlab("willow_slab"),
                BYGBlockList.WITCH_HAZEL_SLAB = new BYGBlockProperties.BYGWoodSlab("witch_hazel_slab"),
                BYGBlockList.ZELKOVA_SLAB = new BYGBlockProperties.BYGWoodSlab("zelkova_slab"),

                //Stairs
                BYGBlockList.ASPEN_STAIRS = new BYGBlockProperties.BYGWoodStairs("aspen_stairs"),
                BYGBlockList.BAOBAB_STAIRS = new BYGBlockProperties.BYGWoodStairs("baobab_stairs"),
                BYGBlockList.BLUE_ENCHANTED_STAIRS = new BYGBlockProperties.BYGWoodStairs("blue_enchanted_stairs"),
                BYGBlockList.CHERRY_STAIRS = new BYGBlockProperties.BYGWoodStairs("cherry_stairs"),
                BYGBlockList.CIKA_STAIRS = new BYGBlockProperties.BYGWoodStairs("cika_stairs"),
                BYGBlockList.CYPRESS_STAIRS = new BYGBlockProperties.BYGWoodStairs("cypress_stairs"),
                BYGBlockList.EBONY_STAIRS = new BYGBlockProperties.BYGWoodStairs("ebony_stairs"),
                BYGBlockList.FIR_STAIRS = new BYGBlockProperties.BYGWoodStairs("fir_stairs"),
                BYGBlockList.GREEN_ENCHANTED_STAIRS = new BYGBlockProperties.BYGWoodStairs("green_enchanted_stairs"),
                BYGBlockList.HOLLY_STAIRS = new BYGBlockProperties.BYGWoodStairs("holly_stairs"),
                BYGBlockList.JACARANDA_STAIRS = new BYGBlockProperties.BYGWoodStairs("jacaranda_stairs"),
                BYGBlockList.MAHOGANY_STAIRS = new BYGBlockProperties.BYGWoodStairs("mahogany_stairs"),
                BYGBlockList.MANGROVE_STAIRS = new BYGBlockProperties.BYGWoodStairs("mangrove_stairs"),
                BYGBlockList.MAPLE_STAIRS = new BYGBlockProperties.BYGWoodStairs("maple_stairs"),
                BYGBlockList.PINE_STAIRS = new BYGBlockProperties.BYGWoodStairs("pine_stairs"),
                BYGBlockList.RAINBOW_EUCALYPTUS_STAIRS = new BYGBlockProperties.BYGWoodStairs("rainbow_eucalyptus_stairs"),
                BYGBlockList.REDWOOD_STAIRS = new BYGBlockProperties.BYGWoodStairs("redwood_stairs"),
                BYGBlockList.SKYRIS_STAIRS = new BYGBlockProperties.BYGWoodStairs("skyris_stairs"),
                BYGBlockList.WILLOW_STAIRS = new BYGBlockProperties.BYGWoodStairs("willow_stairs"),
                BYGBlockList.WITCH_HAZEL_STAIRS = new BYGBlockProperties.BYGWoodStairs("witch_hazel_stairs"),
                BYGBlockList.ZELKOVA_STAIRS = new BYGBlockProperties.BYGWoodStairs("zelkova_stairs")


        );
    }

    // Fence Blocks
    @SubscribeEvent
    public static void registerFenceBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_FENCE = new BYGBlockProperties.BYGFence("aspen_fence"),
                BYGBlockList.BAOBAB_FENCE = new BYGBlockProperties.BYGFence("baobab_fence"),
                BYGBlockList.BLUE_ENCHANTED_FENCE = new BYGBlockProperties.BYGFence("blue_enchanted_fence"),
                BYGBlockList.CHERRY_FENCE = new BYGBlockProperties.BYGFence("cherry_fence"),
                BYGBlockList.CIKA_FENCE = new BYGBlockProperties.BYGFence("cika_fence"),
                BYGBlockList.CYPRESS_FENCE = new BYGBlockProperties.BYGFence("cypress_fence"),
                BYGBlockList.EBONY_FENCE = new BYGBlockProperties.BYGFence("ebony_fence"),
                BYGBlockList.FIR_FENCE = new BYGBlockProperties.BYGFence("fir_fence"),
                BYGBlockList.GREEN_ENCHANTED_FENCE = new BYGBlockProperties.BYGFence("green_enchanted_fence"),
                BYGBlockList.HOLLY_FENCE = new BYGBlockProperties.BYGFence("holly_fence"),
                BYGBlockList.JACARANDA_FENCE = new BYGBlockProperties.BYGFence("jacaranda_fence"),
                BYGBlockList.MAHOGANY_FENCE = new BYGBlockProperties.BYGFence("mahogany_fence"),
                BYGBlockList.MANGROVE_FENCE = new BYGBlockProperties.BYGFence("mangrove_fence"),
                BYGBlockList.MAPLE_FENCE = new BYGBlockProperties.BYGFence("maple_fence"),
                BYGBlockList.PINE_FENCE = new BYGBlockProperties.BYGFence("pine_fence"),
                BYGBlockList.RAINBOW_EUCALYPTUS_FENCE = new BYGBlockProperties.BYGFence("rainbow_eucalyptus_fence"),
                BYGBlockList.REDWOOD_FENCE = new BYGBlockProperties.BYGFence("redwood_fence"),
                BYGBlockList.SKYRIS_FENCE = new BYGBlockProperties.BYGFence("skyris_fence"),
                BYGBlockList.WILLOW_FENCE = new BYGBlockProperties.BYGFence("willow_fence"),
                BYGBlockList.WITCH_HAZEL_FENCE = new BYGBlockProperties.BYGFence("witch_hazel_fence"),
                BYGBlockList.ZELKOVA_FENCE = new BYGBlockProperties.BYGFence("zelkova_fence")
        );
    }

    @SubscribeEvent
    public static void registerDirtBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.PEAT_GRASSBLOCK = new BYGBlockProperties.BYGGrassBlock("peat_grass_block"),
                BYGBlockList.MEADOW_GRASSBLOCK = new BYGBlockProperties.BYGMeadowGrass("meadow_grass_block"),
                BYGBlockList.GLOWCELIUM = new BYGBlockProperties.BYGGlowcelium("glowcelium_block"),
                BYGBlockList.MEADOW_DIRT = new BYGBlockProperties.BYGDirt("meadow_dirt"),
                BYGBlockList.MUD_BLOCK = new BYGBlockProperties.BYGMud("mud_block"),
                BYGBlockList.MUD_BRICKS = new BYGBlockProperties.BYGDirt("mud_bricks")
        );
    }

    // Sapling Blocks
    @SubscribeEvent
    public static void registerSaplingBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_SAPLING = new BYGBlockProperties.BYGFlower("aspen_sapling"),
                BYGBlockList.BAOBAB_SAPLING = new BYGBlockProperties.BYGFlower("baobab_sapling"),
                BYGBlockList.BLUE_ENCHANTED_SAPLING = new BYGBlockProperties.BYGFlower("blue_enchanted_sapling"),
                BYGBlockList.BLUE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BlueSpruceSaplingToTree(), "blue_spruce_sapling"),
                BYGBlockList.BROWN_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownBirchSaplingToTree(), "brown_birch_sapling"),
                BYGBlockList.BROWN_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.BrownOakSaplingToTree(), "brown_oak_sapling"),
                BYGBlockList.CIKA_SAPLING = new BYGBlockProperties.BYGFlower("cika_sapling"),
                BYGBlockList.CYPRESS_SAPLING = new BYGBlockProperties.BYGFlower("cypress_sapling"),
                BYGBlockList.EBONY_SAPLING = new BYGBlockProperties.BYGFlower("ebony_sapling"),
                BYGBlockList.FIR_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.FirSaplingToTree(), "fir_sapling"),
                BYGBlockList.GREEN_ENCHANTED_SAPLING = new BYGBlockProperties.BYGFlower("green_enchanted_sapling"),
                BYGBlockList.HOLLY_SAPLING = new BYGBlockProperties.BYGFlower("holly_sapling"),
                BYGBlockList.JACARANDA_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.JacarandaSaplingToTree(), "jacaranda_sapling"),
                BYGBlockList.MAHOGANY_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.MahogonySaplingToTree(), "mahogany_sapling"),
                BYGBlockList.MANGROVE_SAPLING = new BYGBlockProperties.BYGFlower("mangrove_sapling"),
                BYGBlockList.ORANGE_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeBirchSaplingToTree(), "orange_birch_sapling"),
                BYGBlockList.ORANGE_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeOakSaplingToTree(), "orange_oak_sapling"),
                BYGBlockList.ORANGE_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.OrangeSpruceSaplingToTree(), "orange_spruce_sapling"),
                BYGBlockList.ORCHARD_SAPLING = new BYGBlockProperties.BYGFlower("orchard_sapling"),
                BYGBlockList.PALO_VERDE_SAPLING = new BYGBlockProperties.BYGFlower("palo_verde_sapling"),
                BYGBlockList.PINE_SAPLING = new BYGBlockProperties.BYGFlower("pine_sapling"),
                BYGBlockList.PINK_CHERRY_SAPLING = new BYGBlockProperties.BYGFlower("pink_cherry_sapling"),
                BYGBlockList.RAINBOW_EUCALYPTUS_SAPLING = new BYGBlockProperties.BYGFlower("rainbow_eucalyptus_sapling"),
                BYGBlockList.RED_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedBirchSaplingToTree(), "red_birch_sapling"),
                BYGBlockList.RED_MAPLE_SAPLING = new BYGBlockProperties.BYGFlower("red_maple_sapling"),
                BYGBlockList.RED_OAK_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedOakSaplingToTree(), "red_oak_sapling"),
                BYGBlockList.RED_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.RedSpruceSaplingToTree(), "red_spruce_sapling"),
                BYGBlockList.REDWOOD_SAPLING = new BYGBlockProperties.BYGFlower("redwood_sapling"),
                BYGBlockList.SILVER_MAPLE_SAPLING = new BYGBlockProperties.BYGFlower("silver_maple_sapling"),
                BYGBlockList.SKYRIS_SAPLING = new BYGBlockProperties.BYGFlower("skyris_sapling"),
                BYGBlockList.WHITE_CHERRY_SAPLING = new BYGBlockProperties.BYGFlower("white_cherry_sapling"),
                BYGBlockList.WILLOW_SAPLING = new BYGBlockProperties.BYGFlower("willow_sapling"),
                BYGBlockList.WITCH_HAZEL_SAPLING = new BYGBlockProperties.BYGFlower("witch_hazel_sapling"),
                BYGBlockList.YELLOW_BIRCH_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowBirchSaplingToTree(), "yellow_birch_sapling"),
                BYGBlockList.YELLOW_SPRUCE_SAPLING = new BYGSaplingProperties(new BYGSaplingToTree.YellowSpruceSaplingToTree(), "yellow_spruce_sapling"),
                BYGBlockList.ZELKOVA_SAPLING = new BYGBlockProperties.BYGFlower("zelkova_sapling")

        );
    }

    // Leave Blocks
    @SubscribeEvent
    public static void registerLeaveBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_LEAVES = new BYGBlockProperties.BYGLeaves("aspen_leaves"),
                BYGBlockList.BAOBAB_LEAVES = new BYGBlockProperties.BYGLeaves("baobab_leaves"),
                BYGBlockList.BLOOMING_WITCH_HAZEL_LEAVES = new BYGBlockProperties.BYGLeaves("blooming_witch_hazel_leaves"),
                BYGBlockList.BLUE_ENCHANTED_LEAVES = new BYGBlockProperties.BYGLeaves("blue_enchanted_leaves"),
                BYGBlockList.BLUE_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("blue_spruce_leaves"),
                BYGBlockList.BROWN_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("brown_birch_leaves"),
                BYGBlockList.BROWN_OAK_LEAVES = new BYGBlockProperties.BYGLeaves("brown_oak_leaves"),
                BYGBlockList.CIKA_LEAVES = new BYGBlockProperties.BYGLeaves("cika_leaves"),
                BYGBlockList.CYPRESS_LEAVES = new BYGBlockProperties.BYGLeaves("cypress_leaves"),
                BYGBlockList.EBONY_LEAVES = new BYGBlockProperties.BYGLeaves("ebony_leaves"),
                BYGBlockList.FIR_LEAVES = new BYGBlockProperties.BYGLeaves("fir_leaves"),
                BYGBlockList.FLOWERING_ORCHARD_LEAVES = new BYGBlockProperties.BYGLeaves("flowering_orchard_leaves"),
                BYGBlockList.FLOWERING_PALO_VERDE_LEAVES = new BYGBlockProperties.BYGLeaves("flowering_palo_verde_leaves"),
                BYGBlockList.GREEN_ENCHANTED_LEAVES = new BYGBlockProperties.BYGLeaves("green_enchanted_leaves"),
                BYGBlockList.HOLLY_BERRY_LEAVES = new BYGBlockProperties.BYGLeaves("holly_berry_leaves"),
                BYGBlockList.HOLLY_LEAVES = new BYGBlockProperties.BYGLeaves("holly_leaves"),
                BYGBlockList.JACARANDA_LEAVES = new BYGBlockProperties.BYGLeaves("jacaranda_leaves"),
                BYGBlockList.MAHOGANY_LEAVES = new BYGBlockProperties.BYGLeaves("mahogany_leaves"),
                BYGBlockList.MANGROVE_LEAVES = new BYGBlockProperties.BYGLeaves("mangrove_leaves"),
                BYGBlockList.ORANGE_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("orange_birch_leaves"),
                BYGBlockList.ORANGE_OAK_LEAVES = new BYGBlockProperties.BYGLeaves("orange_oak_leaves"),
                BYGBlockList.ORANGE_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("orange_spruce_leaves"),
                BYGBlockList.ORCHARD_LEAVES = new BYGBlockProperties.BYGLeaves("orchard_leaves"),
                BYGBlockList.PALO_VERDE_LEAVES = new BYGBlockProperties.BYGLeaves("palo_verde_leaves"),
                BYGBlockList.PINE_LEAVES = new BYGBlockProperties.BYGLeaves("pine_leaves"),
                BYGBlockList.PINK_CHERRY_LEAVES = new BYGBlockProperties.BYGLeaves("pink_cherry_leaves"),
                BYGBlockList.RAINBOW_EUCALYPTUS_LEAVES = new BYGBlockProperties.BYGLeaves("rainbow_eucalyptus_leaves"),
                BYGBlockList.RED_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("red_birch_leaves"),
                BYGBlockList.RED_MAPLE_LEAVES = new BYGBlockProperties.BYGLeaves("red_maple_leaves"),
                BYGBlockList.RED_OAK_LEAVES = new BYGBlockProperties.BYGLeaves("red_oak_leaves"),
                BYGBlockList.RED_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("red_spruce_leaves"),
                BYGBlockList.REDWOOD_LEAVES = new BYGBlockProperties.BYGLeaves("redwood_leaves"),
                BYGBlockList.RIPE_ORCHARD_LEAVES = new BYGBlockProperties.BYGLeaves("ripe_orchard_leaves"),
                BYGBlockList.SILVER_MAPLE_LEAVES = new BYGBlockProperties.BYGLeaves("silver_maple_leaves"),
                BYGBlockList.SKYRIS_LEAVES_GREEN_APPLE = new BYGBlockProperties.BYGLeaves("green_apple_skyris_leaves"),
                BYGBlockList.SKYRIS_LEAVES = new BYGBlockProperties.BYGLeaves("skyris_leaves"),
                BYGBlockList.WHITE_CHERRY_LEAVES = new BYGBlockProperties.BYGLeaves("white_cherry_leaves"),
                BYGBlockList.WILLOW_LEAVES = new BYGBlockProperties.BYGLeaves("willow_leaves"),
                BYGBlockList.WITCH_HAZEL_LEAVES = new BYGBlockProperties.BYGLeaves("witch_hazel_leaves"),
                BYGBlockList.YELLOW_BIRCH_LEAVES = new BYGBlockProperties.BYGLeaves("yellow_birch_leaves"),
                BYGBlockList.YELLOW_SPRUCE_LEAVES = new BYGBlockProperties.BYGLeaves("yellow_spruce_leaves"),
                BYGBlockList.ZELKOVA_LEAVES = new BYGBlockProperties.BYGLeaves("zelkova_leaves")

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
                BYGBlockList.HORSEWEED = new BYGBlockProperties.BYGFlower("horseweed"),
                BYGBlockList.MINI_CACTUS = new BYGBlockProperties.BYGDesertPlant("mini_cactus"),
                BYGBlockList.PRICKLY_PEAR_CACTUS = new BYGBlockProperties.BYGDesertPlant("prickly_pear_cactus"),
                BYGBlockList.WINTER_SUCCULENT = new BYGBlockProperties.BYGFlower("winter_succulent"),
                BYGBlockList.SHORT_GRASS = new BYGBlockProperties.BYGTallGrass("short_grass"),
                BYGBlockList.TALL_PRAIRIE_GRASS = new BYGBlockProperties.BYGDoublePlant("tall_prairie_grass"),
                BYGBlockList.BLUE_GLOWCANE = new BYGBlockProperties.BYGBLUEGlowCane("blue_glowcane"),
                BYGBlockList.RED_GLOWCANE = new BYGBlockProperties.BYGREDGlowCane("red_glowcane"),
                BYGBlockList.PURPLE_GLOWCANE = new BYGBlockProperties.BYGPURPLEGlowCane("purple_glowcane"),
                BYGBlockList.PINK_GLOWCANE = new BYGBlockProperties.BYGPINKGlowCane("pink_glowcane"),
                BYGBlockList.POISON_IVY = new BYGBlockProperties.BYGPoisonIvy("poison_ivy"),
                BYGBlockList.BLUEBERRY_BUSH = new BYGBlockProperties.BYGBerryBush("blueberry_bush"),
                BYGBlockList.TINY_LILYPADS = new BYGBlockProperties.BYGLily("tiny_lilypads"),

                BYGBlockList.WEED_GRASS = new BYGBlockProperties.BYGTallGrass("weed_grass"),
                BYGBlockList.WILTED_GRASS = new BYGBlockProperties.BYGTallGrass("wilted_grass"),
                BYGBlockList.SHORT_BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("short_beach_grass"),
                BYGBlockList.BEACH_GRASS = new BYGBlockProperties.BYGBeachGrass("beach_grass"),
                BYGBlockList.LEAF_PILE = new BYGBlockProperties.BYGLeafPile("leaf_pile"),

                //Glowcane Blocks

                BYGBlockList.BLUE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("blue_glowcane_block"),
                BYGBlockList.RED_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("red_glowcane_block"),
                BYGBlockList.PINK_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("pink_glowcane_block"),
                BYGBlockList.PURPLE_GLOWCANE_BLOCK = new BYGBlockProperties.BYGGlowCaneBlock("purple_glowcane_block"),

                //Decorations

                //BYGBlockList.REDSTONE_LANTERN = new BYGRedStoneLantern("redstone_lantern_block"),


                //Petal Blocks
                BYGBlockList.WHITE_PETAL = new BYGBlockProperties.BYGPetal("white_petal_block"),
                BYGBlockList.RED_PETAL = new BYGBlockProperties.BYGPetal("red_petal_block"),
                BYGBlockList.PURPLE_PETAL = new BYGBlockProperties.BYGPetal("purple_petal_block"),
                BYGBlockList.BLUE_PETAL = new BYGBlockProperties.BYGPetal("blue_petal_block"),
                BYGBlockList.LIGHT_BLUE_PETAL = new BYGBlockProperties.BYGPetal("light_blue_petal_block"),
                BYGBlockList.YELLOW_PETAL = new BYGBlockProperties.BYGPetal("yellow_petal_block"),
                BYGBlockList.PLANT_STEM = new BYGBlockProperties.BYGLog("plant_stem"),
                BYGBlockList.POLLEN_BLOCK = new BYGBlockProperties.BYGPollen("pollen_block"),

                //Sands
                BYGBlockList.BLACK_SAND = new BYGBlockProperties.BYGSand(5197647, "black_sand"),
                BYGBlockList.WHITE_SAND = new BYGBlockProperties.BYGSand(15395562, "white_sand"),
                BYGBlockList.BLUE_SAND = new BYGBlockProperties.BYGSand(13559021, "blue_sand"),
                BYGBlockList.PURPLE_SAND = new BYGBlockProperties.BYGSand(12887002, "purple_sand"),
                BYGBlockList.PINK_SAND = new BYGBlockProperties.BYGSand(15585004, "pink_sand")
        );
    }

    // Log Blocks
    @SubscribeEvent
    public static void registerLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ASPEN_LOG = new BYGBlockProperties.BYGLog("aspen_log"),
                BYGBlockList.BAOBAB_LOG = new BYGBlockProperties.BYGLog("baobab_log"),
                BYGBlockList.BLUE_ENCHANTED_LOG = new BYGBlockProperties.BYGLog("blue_enchanted_log"),
                BYGBlockList.CHERRY_LOG = new BYGBlockProperties.BYGLog("cherry_log"),
                BYGBlockList.CIKA_LOG = new BYGBlockProperties.BYGLog("cika_log"),
                BYGBlockList.CYPRESS_LOG = new BYGBlockProperties.BYGLog("cypress_log"),
                BYGBlockList.EBONY_LOG = new BYGBlockProperties.BYGLog("ebony_log"),
                BYGBlockList.FIR_LOG = new BYGBlockProperties.BYGLog("fir_log"),
                BYGBlockList.GREEN_ENCHANTED_LOG = new BYGBlockProperties.BYGLog("green_enchanted_log"),
                BYGBlockList.HOLLY_LOG = new BYGBlockProperties.BYGLog("holly_log"),
                BYGBlockList.JACARANDA_LOG = new BYGBlockProperties.BYGLog("jacaranda_log"),
                BYGBlockList.MAHOGANY_LOG = new BYGBlockProperties.BYGLog("mahogany_log"),
                BYGBlockList.MANGROVE_LOG = new BYGBlockProperties.BYGLog("mangrove_log"),
                BYGBlockList.MAPLE_LOG = new BYGBlockProperties.BYGLog("maple_log"),
                BYGBlockList.PALO_VERDE_LOG = new BYGBlockProperties.BYGLog("palo_verde_log"),
                BYGBlockList.PINE_LOG = new BYGBlockProperties.BYGLog("pine_log"),
                BYGBlockList.RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BYGLog("rainbow_eucalyptus_log"),
                BYGBlockList.REDWOOD_LOG = new BYGBlockProperties.BYGLog("redwood_log"),
                BYGBlockList.SKYRIS_LOG = new BYGBlockProperties.BYGLog("skyris_log"),
                BYGBlockList.WILLOW_LOG = new BYGBlockProperties.BYGLog("willow_log"),
                BYGBlockList.WITCH_HAZEL_LOG = new BYGBlockProperties.BYGLog("witch_hazel_log"),
                BYGBlockList.ZELKOVA_LOG = new BYGBlockProperties.BYGLog("zelkova_log")
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
                BYGBlockList.PENDORITE_ORE = new BYGBlockProperties.BYGOre("pendorite_ore"),
                BYGBlockList.AMETRINE_ORE = new BYGBlockProperties.BYGOre("ametrine_ore"),
                BYGBlockList.PENDORITE_BLOCK = new BYGBlockProperties.BYGOre("pendorite_block"),
                BYGBlockList.AMETRINE_BLOCK = new BYGBlockProperties.BYGOre("ametrine_block")

        );
    }

    //StoneBlocks
    @SubscribeEvent
    public static void registerStoneBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.DACITE = new BYGBlockProperties.BYGStone("dacite"),
                BYGBlockList.DACITE_BRICKS = new BYGBlockProperties.BYGStone("dacite_bricks"),
                BYGBlockList.DACITE_COBBLESTONE = new BYGBlockProperties.BYGStone("dacite_cobblestone"),
                BYGBlockList.DACITE_PILLAR = new BYGBlockProperties.BYGPillar("dacite_pillar"),
                BYGBlockList.DACITE_TILE = new BYGBlockProperties.BYGStone("dacite_tile"),

                BYGBlockList.MOSSY_STONE = new BYGBlockProperties.BYGStone("mossy_stone"),
                BYGBlockList.PODZOL_DACITE = new BYGBlockProperties.BYGDirt("podzol_dacite"),
                BYGBlockList.OVERGROWN_DACITE = new BYGBlockProperties.BlockOvergrownDaciteBlock("overgrown_dacite"),
                BYGBlockList.OVERGROWN_STONE = new BYGBlockProperties.BlockOvergrownStoneBlock("overgrown_stone"),
                BYGBlockList.ROCKY_STONE = new BYGBlockProperties.BYGStone("rocky_stone"),

                BYGBlockList.SCORIA_STONE = new BYGBlockProperties.BYGStone("scoria_stone"),
                BYGBlockList.SCORIA_COBBLESTONE = new BYGBlockProperties.BYGStone("scoria_cobblestone"),
                BYGBlockList.SCORIA_PILLAR = new BYGBlockProperties.BYGPillar("scoria_pillar"),
                BYGBlockList.SCORIA_STONEBRICKS = new BYGBlockProperties.BYGStone("scoria_stonebricks"),

                BYGBlockList.SOAPSTONE = new BYGBlockProperties.BYGStone("soapstone"),
                BYGBlockList.POLISHED_SOAPSTONE = new BYGBlockProperties.BYGStone("polished_soapstone"),
                BYGBlockList.SOAPSTONE_BRICKS = new BYGBlockProperties.BYGStone("soapstone_bricks"),
                BYGBlockList.SOAPSTONE_PILLAR = new BYGBlockProperties.BYGPillar("soapstone_pillar"),
                BYGBlockList.SOAPSTONE_TILE = new BYGBlockProperties.BYGStone("soapstone_tile")

        );
    }

    //Stripped Logs
    @SubscribeEvent
    public static void registerStrippedLogBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.STRIPPED_ASPEN_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_aspen_log"),
                BYGBlockList.STRIPPED_BAOBAB_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_baobab_log"),
                BYGBlockList.STRIPPED_BLUE_ENCHANTED_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_blue_enchanted_log"),
                BYGBlockList.STRIPPED_CHERRY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_cherry_log"),
                BYGBlockList.STRIPPED_CIKA_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_cika_log"),
                BYGBlockList.STRIPPED_CYPRESS_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_cypress_log"),
                BYGBlockList.STRIPPED_EBONY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_ebony_log"),
                BYGBlockList.STRIPPED_FIR_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_fir_log"),
                BYGBlockList.STRIPPED_GREEN_ENCHANTED_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_green_enchanted_log"),
                BYGBlockList.STRIPPED_HOLLY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_holly_log"),
                BYGBlockList.STRIPPED_JACARANDA_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_jacaranda_log"),
                BYGBlockList.STRIPPED_MAHOGANY_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_mahogany_log"),
                BYGBlockList.STRIPPED_MANGROVE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_mangrove_log"),
                BYGBlockList.STRIPPED_MAPLE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_maple_log"),
                BYGBlockList.STRIPPED_PALO_VERDE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_palo_verde_log"),
                BYGBlockList.STRIPPED_PINE_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_pine_log"),
                BYGBlockList.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_rainbow_eucalyptus_log"),
                BYGBlockList.STRIPPED_SKYRIS_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_skyris_log"),
                BYGBlockList.STRIPPED_WILLOW_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_willow_log"),
                BYGBlockList.STRIPPED_REDWOOD_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_redwood_log"),
                BYGBlockList.STRIPPED_WITCH_HAZEL_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_witch_hazel_log"),
                BYGBlockList.STRIPPED_ZELKOVA_LOG = new BYGBlockProperties.BYGStrippedLog("stripped_zelkova_log")
        );

    }

    //FlowerBlocks
    @SubscribeEvent
    public static void registerFlowerBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                BYGBlockList.ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGFlower("allium_flower_bush"),
                BYGBlockList.ALPINE_BELLFLOWER = new BYGBlockProperties.BYGFlower("alpine_bellflower"),
                BYGBlockList.AMARANTH = new BYGBlockProperties.BYGFlower("amaranth"),
                BYGBlockList.ANGELICA = new BYGBlockProperties.BYGFlower("angelica"),
                BYGBlockList.AZALEA = new BYGBlockProperties.BYGDoublePlant("azalea"),
                BYGBlockList.BEGONIA = new BYGBlockProperties.BYGFlower("begonia"),
                BYGBlockList.BISTORT = new BYGBlockProperties.BYGFlower("bistort"),
                BYGBlockList.BLUE_SAGE = new BYGBlockProperties.BYGFlower("blue_sage"),
                BYGBlockList.CALIFORNIA_POPPY = new BYGBlockProperties.BYGFlower("california_poppy"),
                BYGBlockList.CROCUS = new BYGBlockProperties.BYGFlower("crocus"),
                BYGBlockList.BLACK_ROSE = new BYGBlockProperties.BYGFlower("black_rose"),
                BYGBlockList.CYAN_AMARANTH = new BYGBlockProperties.BYGFlower("cyan_amaranth"),
                BYGBlockList.CYAN_ROSE = new BYGBlockProperties.BYGFlower("cyan_rose"),
                BYGBlockList.CYAN_TULIP = new BYGBlockProperties.BYGFlower("cyan_tulip"),
                BYGBlockList.DAFFODIL = new BYGBlockProperties.BYGFlower("daffodil"),
                BYGBlockList.DELPHINIUM = new BYGBlockProperties.BYGDoublePlant("delphinium"),
                BYGBlockList.FAIRY_SLIPPER = new BYGBlockProperties.BYGFlower("fairy_slipper"),
                BYGBlockList.FIRECRACKER_FLOWER_BUSH = new BYGBlockProperties.BYGDesertPlant("firecracker_flower_bush"),
                BYGBlockList.FOXGLOVE = new BYGBlockProperties.BYGFlower("foxglove"),
                BYGBlockList.GOLDEN_SPINED_CACTUS = new BYGBlockProperties.BYGDesertPlant("golden_spined_cactus"),
                BYGBlockList.GREEN_TULIP = new BYGBlockProperties.BYGFlower("green_tulip"),
                BYGBlockList.GUZMANIA = new BYGBlockProperties.BYGFlower("guzmania"),
                BYGBlockList.INCAN_LILY = new BYGBlockProperties.BYGFlower("incan_lily"),
                BYGBlockList.IRIS = new BYGBlockProperties.BYGFlower("iris"),
                BYGBlockList.JAPANESE_ORCHID = new BYGBlockProperties.BYGDoublePlant("japanese_orchid"),
                BYGBlockList.KOVAN_FLOWER = new BYGBlockProperties.BYGFlower("kovan_flower"),
                BYGBlockList.LAZARUS_BELLFLOWER = new BYGBlockProperties.BYGFlower("lazarus_bellflower"),
                BYGBlockList.LOLIPOP_FLOWER = new BYGBlockProperties.BYGFlower("lolipop_flower"),
                BYGBlockList.MAGENTA_AMARANTH = new BYGBlockProperties.BYGFlower("magenta_amaranth"),
                BYGBlockList.MAGENTA_TULIP = new BYGBlockProperties.BYGFlower("magenta_tulip"),
                BYGBlockList.ORANGE_AMARANTH = new BYGBlockProperties.BYGFlower("orange_amaranth"),
                BYGBlockList.ORANGE_DAISY = new BYGBlockProperties.BYGFlower("orange_daisy"),
                BYGBlockList.ORSIRIA_ROSE = new BYGBlockProperties.BYGFlower("osiria_rose"),
                BYGBlockList.PEACH_LEATHER_FLOWER = new BYGBlockProperties.BYGFlower("peach_leather_flower"),
                BYGBlockList.PINK_ALLIUM = new BYGBlockProperties.BYGFlower("pink_allium"),
                BYGBlockList.PINK_ALLIUM_FLOWER_BUSH = new BYGBlockProperties.BYGFlower("pink_allium_flower_bush"),
                BYGBlockList.PINK_ANEMONE = new BYGBlockProperties.BYGFlower("pink_anemone"),
                BYGBlockList.PINK_DAFFODIL = new BYGBlockProperties.BYGFlower("pink_daffodil"),
                BYGBlockList.PINK_ORCHID = new BYGBlockProperties.BYGFlower("pink_orchid"),
                BYGBlockList.PRAIRIE_GRASS = new BYGBlockProperties.BYGPrairieGrass("prairie_grass"),
                BYGBlockList.PROTEA_FLOWER = new BYGBlockProperties.BYGFlower("protea_flower"),
                BYGBlockList.PURPLE_AMARANTH = new BYGBlockProperties.BYGFlower("purple_amaranth"),
                BYGBlockList.PURPLE_ORCHID = new BYGBlockProperties.BYGFlower("purple_orchid"),
                BYGBlockList.PURPLE_SAGE = new BYGBlockProperties.BYGFlower("purple_sage"),
                BYGBlockList.PURPLE_TULIP = new BYGBlockProperties.BYGFlower("purple_tulip"),
                BYGBlockList.RED_CORNFLOWER = new BYGBlockProperties.BYGFlower("red_cornflower"),
                BYGBlockList.RED_ORCHID = new BYGBlockProperties.BYGFlower("red_orchid"),
                BYGBlockList.RICHEA = new BYGBlockProperties.BYGFlower("richea"),
                BYGBlockList.ROSE = new BYGBlockProperties.BYGFlower("rose"),
                BYGBlockList.SNOWDROPS = new BYGBlockProperties.BYGFlower("snowdrops"),
                BYGBlockList.SILVER_VASE_FLOWER = new BYGBlockProperties.BYGFlower("silver_vase_flower"),
                BYGBlockList.TORCH_GINGER = new BYGBlockProperties.BYGFlower("torch_ginger"),
                BYGBlockList.VIOLET_LEATHER_FLOWER = new BYGBlockProperties.BYGFlower("violet_leather_flower"),
                BYGBlockList.WHITE_ANEMONE = new BYGBlockProperties.BYGFlower("white_anemone"),
                BYGBlockList.WHITE_SAGE = new BYGBlockProperties.BYGFlower("white_sage"),
                BYGBlockList.WINTER_CYCLAMEN = new BYGBlockProperties.BYGFlower("winter_cyclamen"),
                BYGBlockList.WINTER_ROSE = new BYGBlockProperties.BYGFlower("winter_rose"),
                BYGBlockList.WINTER_SCILLA = new BYGBlockProperties.BYGFlower("winter_scilla"),
                BYGBlockList.YELLOW_DAFFODIL = new BYGBlockProperties.BYGFlower("yellow_daffodil"),
                BYGBlockList.YELLOW_TULIP = new BYGBlockProperties.BYGFlower("yellow_tulip")
        );
        BYG.LOGGER.info("All BYG blocks registered!");
    }
}
