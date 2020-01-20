package sporeaoc.byg.registries;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.catalogs.BlockCatalogs;


public class BYGBlockRegistry {
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryItemEvents {

    @SubscribeEvent
    public static void bygRegisterBlocks(final RegistryEvent.Register<Block> event) {


        event.getRegistry().registerAll
                (
                //PlankBlocks
                BlockCatalogs.ASPEN_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("aspen_planks"),
                BlockCatalogs.BAOBAB_PLANKS = new Block(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("baobab_planks"),
                BlockCatalogs.BLUE_ENCHANTED_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("blue_enchanted_planks"),
                BlockCatalogs.CHERRY_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("cherry_planks"),
                BlockCatalogs.CIKA_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("cika_planks"),
                BlockCatalogs.CYPRESS_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("cypress_planks"),
                BlockCatalogs.EBONY_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("ebony_planks"),
                BlockCatalogs.FIR_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("fir_planks"),
                BlockCatalogs.GREEN_ENCHANTED_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("green_enchanted_planks"),
                BlockCatalogs.HOLLY_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("holly_planks"),
                BlockCatalogs.JACARANDA_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("jacaranda_planks"),
                BlockCatalogs.MAHOGONY_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("mahogany_planks"),
                BlockCatalogs.MANGROVE_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("mangrove_planks"),
                BlockCatalogs.MAPLE_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("maple_planks"),
                BlockCatalogs.PINE_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("pine_planks"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("rainbow_eucalyptus_planks"),
                BlockCatalogs.REDWOOD_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("redwood_planks"),
                BlockCatalogs.SKYRIS_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("skyris_planks"),
                BlockCatalogs.WILLOW_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("willow_planks"),
                BlockCatalogs.WITCH_HAZEL_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("witch_hazel_planks"),
                BlockCatalogs.ZELKOVA_PLANKS = new Block(Block.Properties.create(Material.WOOD,MaterialColor.BROWN).hardnessAndResistance(2.0F,3.0F).sound(SoundType.WOOD)).setRegistryName("zelkova_planks"),

                //Stair Blocks
                        /*BlockCatalogs.ASPEN_STAIRS = new BYGStairBlocks(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
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
                        BlockCatalogs = new StairsBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName(""),
*/

                //FenceBlocks
                BlockCatalogs.ASPEN_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("aspen_fence"),
                BlockCatalogs.BAOBAB_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("baobab_fence"),
                BlockCatalogs.BLUE_ENCHANTED_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("blue_enchanted_fence"),
                BlockCatalogs.CHERRY_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("cherry_fence"),
                BlockCatalogs.CIKA_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("cika_fence"),
                BlockCatalogs.CYPRESS_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("cypress_fence"),
                BlockCatalogs.EBONY_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("ebony_fence"),
                BlockCatalogs.FIR_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("fir_fence"),
                BlockCatalogs.GREEN_ENCHANTED_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("green_enchanted_fence"),
                BlockCatalogs.HOLLY_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("holly_fence"),
                BlockCatalogs.JACARANDA_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("jacaranda_fence"),
                BlockCatalogs.MAHOGONY_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("mahogany_fence"),
                BlockCatalogs.MANGROVE_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("mangrove_fence"),
                BlockCatalogs.MAPLE_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("maple_fence"),
                BlockCatalogs.PINE_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("pine_fence"),
                BlockCatalogs.RAINBOW_EUCALYPTUS_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("rainbow_eucalyptus_fence"),
                BlockCatalogs.REDWOOD_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("redwood_fence"),
                BlockCatalogs.SKYRIS_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("skyris_fence"),
                BlockCatalogs.WILLOW_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("willow_fence"),
                BlockCatalogs.WITCH_HAZEL_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("witch_hazel_fence"),
                BlockCatalogs.ZELKOVA_FENCE = new FenceBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD)).setRegistryName("zelkova_fence"),

                //SaplingBlocks
                //BlockCatalogs.CYPRESS_SAPLING =-props -> new CypressTreeSapling(new CypressTree2(), props))

                        //LeaveBlocks
                BlockCatalogs.BAOBAB_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("baobab_leaves")),
                BlockCatalogs.BLOOMING_WITCH_HAZEL_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("blooming_witch_hazel_leaves")),
                BlockCatalogs.BLUE_ENCHANTED_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("blue_enchanted_leaves")),
                BlockCatalogs.BLUE_SPRUCE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("blue_spruce_leaves")),
                BlockCatalogs.BROWN_BIRCH_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("brown_birch_leaves")),
                BlockCatalogs.BROWN_OAK_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("brown_oak_leaves")),
                BlockCatalogs.CIKA_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("cika_leaves")),
                BlockCatalogs.CYPRESS_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("cypress_leaves")),
                BlockCatalogs.EBONY_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("ebony_leaves")),
                BlockCatalogs.FIR_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("fir_leaves")),
                BlockCatalogs.FLOWERING_ORCHARD_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("flowering_orchard_leaves")),
                BlockCatalogs.FLOWERING_PALO_VERDE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("flowering_palo_verde_leaves")),
                BlockCatalogs.GREEN_ENCHANTED_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("green_enchanted_leaves")),
                BlockCatalogs.HOLLY_BERRY_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("holly_berry_leaves")),
                BlockCatalogs.HOLLY_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("holly_leaves")),
                BlockCatalogs.JACARANDA_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("jacaranda_leaves")),
                BlockCatalogs.MAHOGANY_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("mahogany_leaves")),
                BlockCatalogs.MANGROVE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("mangrove_leaves")),
                BlockCatalogs.ORANGE_BIRCH_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("orange_birch_leaves")),
                BlockCatalogs.ORANGE_OAK_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("orange_oak_leaves")),
                BlockCatalogs.ORANGE_SPRUCE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("orange_spruce_leaves")),
                BlockCatalogs.ORCHARD_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("orchard_leaves")),
                BlockCatalogs.PALO_VERDE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("palo_verde_leaves")),
                BlockCatalogs.PINE_lEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("pine_leaves")),
                BlockCatalogs.PINK_CHERRY_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("pink_cherry_leaves")),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("rainbow_eucalyptus_leaves")),
                BlockCatalogs.RED_BIRCH_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("red_birch_leaves")),
                BlockCatalogs.RED_MAPLE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("red_maple_leaves")),
                BlockCatalogs.RED_OAK_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("red_oak_leaves")),
                BlockCatalogs.RED_SPRUCE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("red_spruce_leaves")),
                BlockCatalogs.REDWOOD_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("redwood_leaves")),
                BlockCatalogs.RIPE_ORCHARD_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("ripe_orchard_leaves")),
                BlockCatalogs.SILVER_MAPLE_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("silver_maple_leaves")),
                BlockCatalogs.SKYRIS_LEAVES_GREEN_APPLE = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("green_apple_skyris_leaves")),
                BlockCatalogs.WHITE_CHERRY_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("white_cherry_leaves")),
                BlockCatalogs.WILLOW_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("willow_leaves")),
                BlockCatalogs.WITCH_HAZEL_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("witch_hazel_leaves")),
                BlockCatalogs.YELLOW_BIRCH_LEAVES = new LeavesBlock(Block.Properties.create(Material.LEAVES).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)).setRegistryName(location("yellow_birch_leaves")),

                //PlantBlocks
                //BlockCatalogs = new Reed

                //SaplingBlocks
                //BlockCatalogs = new SaplingBlock()

                //LogBlocks
                BlockCatalogs.ASPEN_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("aspen_log")),
                BlockCatalogs.BAOBAB_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("baobab_log")),
                BlockCatalogs.BLUE_ENCHANTED_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("blue_enchanted_log")),
                BlockCatalogs.CHERRY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("cherry_log")),
                BlockCatalogs.CIKA_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("cika_log")),
                BlockCatalogs.CYPRESS_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("cypress_log")),
                BlockCatalogs.EBONY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("ebony_log")),
                BlockCatalogs.FIR_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("fir_log")),
                BlockCatalogs.GREEN_ENCHANTED_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("green_enchanted_log")),
                BlockCatalogs.HOLLY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("holly_log")),
                BlockCatalogs.JACARANDA_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("jacaranda_log")),
                BlockCatalogs.MAHOGANY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("mahogany_log")),
                BlockCatalogs.MANGROVE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("mangrove_log")),
                BlockCatalogs.MAPLE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("maple_log")),
                BlockCatalogs.PALO_VERDE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("palo_verde_log")),
                BlockCatalogs.PINE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("pine_log")),
                BlockCatalogs.RAINBOW_EUCALYPTUS_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("rainbow_eucalyptus_log")),
                BlockCatalogs.REDWOOD_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("redwood_log")),
                BlockCatalogs.SKYRIS_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("skyris_log")),
                BlockCatalogs.WILLOW_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("willow_log")),
                BlockCatalogs.WITCH_HAZEL_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("witch_hazel_log")),
                BlockCatalogs.ZELKOVA_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("zelkova_log")),

                //MushroomBlocks
                BlockCatalogs.BLACK_PUFF = new MushroomBlock(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(0.2F).sound(SoundType.WOOD)).setRegistryName("black_puff"),
                BlockCatalogs.WEEPING_MILKCAP = new MushroomBlock(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(0.2F).sound(SoundType.WOOD)).setRegistryName("weeping_milkcap"),
                BlockCatalogs.WOOD_BLEWIT = new MushroomBlock(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT).doesNotBlockMovement().hardnessAndResistance(0.2F).sound(SoundType.WOOD)).setRegistryName("wood_blewit"),

                //OreBlocks
                BlockCatalogs.LATHARIUM_ORE = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(location("latharium_ore")),
                BlockCatalogs.PENDORITE_ORE = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(location("pendorite_ore")),
                BlockCatalogs.TAMRELITE_ORE = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(location("tamrelite_ore")),


                //StoneBlocks
                BlockCatalogs.DACITE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("dacite")),
                BlockCatalogs.MOSSY_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("mossy_stone")),
                BlockCatalogs.OVERGROWN_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("overgrown_stone")),
                BlockCatalogs.ROCKY_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("rocky_stone")),
                BlockCatalogs.SCORIA_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("scoria_stone")),
                BlockCatalogs.SOAPSTONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("soapstone")),

                //Stripped Logs
                BlockCatalogs.STRIPPED_BAOBAB_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_baobab_log"),
                BlockCatalogs.STRIPPED_BLUE_ENCHANTED_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_blue_enchanted_log"),
                BlockCatalogs.STRIPPED_CHERRY_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_cherry_log"),
                BlockCatalogs.STRIPPED_CIKA_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_cika_log"),
                BlockCatalogs.STRIPPED_CYPRESS_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_cypress_log"),
                BlockCatalogs.STRIPPED_EBONY_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_ebony_log"),
                BlockCatalogs.STRIPPED_FIR_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_fir_log"),
                BlockCatalogs.STRIPPED_GREEN_ENCHANTED_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_green_enchanted_log"),
                BlockCatalogs.STRIPPED_HOLLY_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_holly_log"),
                BlockCatalogs.STRIPPED_JACARANDA_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_jacaranda_log"),
                BlockCatalogs.STRIPPED_MAHOGANY_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_mahogany_log"),
                BlockCatalogs.STRIPPED_MANGROVE_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_mangrove_log"),
                BlockCatalogs.STRIPPED_MAPLE_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_maple_log"),
                BlockCatalogs.STRIPPED_PALO_VERDE_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_palo_verde_log"),
                BlockCatalogs.STRIPPED_PINE_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_pine_log"),
                BlockCatalogs.STRIPPED_RAINBOW_EUCALYPTUS_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_rainbow_eucalyptus_log"),
                BlockCatalogs.STRIPPED_SKYRIS_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_skyris_log"),
                BlockCatalogs.STRIPPED_WILLOW_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_willow_log"),
                BlockCatalogs.STRIPPED_REDWOOD_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_redwood_log"),
                BlockCatalogs.STRIPPED_WITCH_HAZEL_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_witch_hazel_log"),
                BlockCatalogs.STRIPPED_ZELKOVA_LOG = new LogBlock(MaterialColor.OBSIDIAN, Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName("stripped_zelkova_log"),


                        //FlowerBlocks
                BlockCatalogs.ALLIUM_FLOWER_BUSH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("allium_flower_bush")),
                BlockCatalogs.ALPINE_BELLFLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("alpine_bellflower")),
                BlockCatalogs.AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("amaranth")),
                BlockCatalogs.ANGELICA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("angelica")),
                BlockCatalogs.AZALEA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("azalea")),
                BlockCatalogs.BEGONIA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("begonia")),
                BlockCatalogs.BISTORT = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("bistort")),
                BlockCatalogs.BLUE_SAGE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("blue_sage")),
                BlockCatalogs.CALIFORNIA_POPPY = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("california_poppy")),
                BlockCatalogs.CROCUS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("crocus")),
                BlockCatalogs.BLACK_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("black_rose")),
                BlockCatalogs.CYAN_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("cyan_amaranth")),
                BlockCatalogs.CYAN_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("cyan_rose")),
                BlockCatalogs.CYAN_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("cyan_tulip")),
                BlockCatalogs.DAFFODIL = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("daffodil")),
                BlockCatalogs.DELPHINIUM = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("delphinium")),
                BlockCatalogs.FAIRY_SLIPPER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("fairy_slipper")),
                BlockCatalogs.FIRECRACKER_FLOWER_BUSH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("firecracker_flower_bush")),
                BlockCatalogs.FOXGLOVE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("foxglove")),
                BlockCatalogs.GOLDEN_SPINED_CACTUS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("golden_spined_cactus")),
                BlockCatalogs.GREEN_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("green_tulip")),
                BlockCatalogs.GUZMANIA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("guzmania")),
                BlockCatalogs.INCAN_LILY = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("incan_lily")),
                BlockCatalogs.IRIS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("iris")),
                BlockCatalogs.JAPANESE_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("japanese_orchid")),
                BlockCatalogs.KOVAN_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("kovan_flower")),
                BlockCatalogs.LAZARUS_BELLFLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("lazarus_bellflower")),
                BlockCatalogs.LOLIPOP_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("lolipop_flower")),
                BlockCatalogs.MAGENTA_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("magenta_amaranth")),
                BlockCatalogs.MAGENTA_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("magenta_tulip")),
                BlockCatalogs.ORANGE_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("orange_amaranth")),
                BlockCatalogs.ORANGE_DAISY = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("orange_daisy")),
                BlockCatalogs.ORSIRIA_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("osiria_rose")),
                BlockCatalogs.PEACH_LEATHER_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("peach_leather_flower")),
                BlockCatalogs.PINK_ALLIUM = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_allium")),
                BlockCatalogs.PINK_ALLIUM_FLOWER_BUSH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_allium_flower_bush")),
                BlockCatalogs.PINK_ANEMONE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_anemone")),
                BlockCatalogs.PINK_DAFFODIL = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_daffodil")),
                BlockCatalogs.PINK_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_orchid")),
                BlockCatalogs.PROTEA_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("protea_flower")),
                BlockCatalogs.PURPLE_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_amaranth")),
                BlockCatalogs.PURPLE_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_orchid")),
                BlockCatalogs.PURPLE_SAGE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_sage")),
                BlockCatalogs.PURPLE_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_tulip")),
                BlockCatalogs.RED_CORNFLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("red_cornflower")),
                BlockCatalogs.RED_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("red_orchid")),
                BlockCatalogs.RICHEA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("richea")),
                BlockCatalogs.ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("rose")),
                BlockCatalogs.SNOWDROPS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("snowdrops")),
                BlockCatalogs.SILVER_VASE_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("silver_vase_flower")),
                BlockCatalogs.TORCH_GINGER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("torch_ginger")),
                BlockCatalogs.VIOLET_LEATHER_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("violet_leather_flower")),
                BlockCatalogs.WHITE_ANEMONE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("white_anemone")),
                BlockCatalogs.WHITE_SAGE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("white_sage")),
                BlockCatalogs.WINTER_CYCLAMEN = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("winter_cyclamen")),
                BlockCatalogs.WINTER_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("winter_rose")),
                BlockCatalogs.WINTER_SCILLA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("winter_scilla")),
                BlockCatalogs.YELLOW_DAFFODIL = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("yellow_daffodil")),
                BlockCatalogs.YELLOW_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("yellow_tulip"))
                );
        BYG.LOGGER.info("Load Blocks");
    }
    }

    private static ResourceLocation location(String name) {
        return new ResourceLocation(BYG.MODID, name);
    }


    }
