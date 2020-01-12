package sporeaoc.byg;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.ModSetup.ModSetup;
import sporeaoc.byg.block.*;
import sporeaoc.byg.items.LeaveItems;

import java.util.Objects;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockItemRegistry {
    @SubscribeEvent
    public void bygRegisterBlocks(final RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
                // Leave Blocks
                new LeaveBlocks.BaobabLeaves(), new LeaveBlocks.BloomingWitchHazelLeaves(), new LeaveBlocks.BlueEnchantedLeaves(),
                new LeaveBlocks.BlueSpruceLeaves(), new LeaveBlocks.BrownBirchLeaves(), new LeaveBlocks.BrownOakLeaves(),
                new LeaveBlocks.CikaLeaves(), new LeaveBlocks.CypressLeaves(), new LeaveBlocks.EbonyLeaves(),
                new LeaveBlocks.FirLeaves(), new LeaveBlocks.FloweringOrchardLeaves(), new LeaveBlocks.FloweringPaloVerdeLeaves(),
                new LeaveBlocks.AppleSkyrisLeaves(), new LeaveBlocks.GreenEnchantedLeaves(), new LeaveBlocks.HollyBetterLeaves(),
                new LeaveBlocks.HollyLeaves(), new LeaveBlocks.JacarandaLeaves(), new LeaveBlocks.MahognyLeaves(),
                new LeaveBlocks.MangroveLeaves(), new LeaveBlocks.OrangeBirchLeaves(), new LeaveBlocks.OrangeOakLeaves(),
                new LeaveBlocks.OrangeSpruceLeaves(), new LeaveBlocks.OrchardLeaves(), new LeaveBlocks.PaloVerdeLeaves(),
                new LeaveBlocks.PineLeaves(), new LeaveBlocks.PineLeaves(), new LeaveBlocks.PinkCherryLeaves(),
                new LeaveBlocks.RainbowEucalyptusLeaves(), new LeaveBlocks.RedBirchLeaves(), new LeaveBlocks.RedMapleLeaves(),
                new LeaveBlocks.RedOakLeaves(), new LeaveBlocks.RedSpruceLeaves(), new LeaveBlocks.RedwoodLeaves(),
                new LeaveBlocks.RipeOrchardLeaves(), new LeaveBlocks.SilverMapleLeaves(), new LeaveBlocks.SkyrisLeaves(),
                new LeaveBlocks.WhiteCherryLeaves(), new LeaveBlocks.WillowLeaves(), new LeaveBlocks.WitchHazelLeaves(),
                new LeaveBlocks.YellowBirchLeaves(),

                //LogBlocks
                LogBlocks.ASPEN_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("aspen_log")),
                LogBlocks.BAOBAB_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("baobab_log")),
                LogBlocks.BLUE_ENCHANTED_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("blue_enchanted_log")),
                LogBlocks.CHERRY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("cherry_log")),
                LogBlocks.CIKA_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("cika_log")),
                LogBlocks.CYPRESS_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("cypress_log")),
                LogBlocks.EBONY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("ebony_log")),
                LogBlocks.FIR_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("fir_log")),
                LogBlocks.GREEN_ENCHANTED_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("green_enchanted_log")),
                LogBlocks.HOLLY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("holly_log")),
                LogBlocks.JACARANDA_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("jacaranda_log")),
                LogBlocks.MAHOGONY_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("mahogony_log")),
                LogBlocks.MANGROVE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("mangrove_log")),
                LogBlocks.MAPLE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("maple_log")),
                LogBlocks.PALO_VERDE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("palo_verde_log")),
                LogBlocks.PINE_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("pine_log")),
                LogBlocks.RAINBOW_EUCALYPTUS_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("rainbow_eucalyptus_log")),
                LogBlocks.REDWOOD_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("redwood_log")),
                LogBlocks.SKYRIS_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("skyris_log")),
                LogBlocks.WILLOW_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("willow_log")),
                LogBlocks.WITCH_HAZEL_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("witch_hazel_log")),
                LogBlocks.ZELKOVA_LOG = new LogBlock(MaterialColor.WOOD, Block.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F).sound(SoundType.WOOD)).setRegistryName(location("zelkova_log")),

                //OreBlocks
                OreBlocks.LATHARIUM_ORE = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(location("latharium_ore")),
                OreBlocks.PENDORITE_ORE = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(location("pendorite_ore")),
                OreBlocks.TAMRELITE_ORE = new OreBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F)).setRegistryName(location("tamrelite_ore")),

                //StoneBlocks
                StoneBlocks.DACITE_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("dacite_stone")),
                StoneBlocks.MOSSY_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("mossy_stone")),
                StoneBlocks.OVERGROWN_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("overgrown_stone")),
                StoneBlocks.SCORIA_STONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("scoria_stone")),
                StoneBlocks.SOAPSTONE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("soapstone")),
                StoneBlocks.SODALITE = new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)).setRegistryName(location("sodalite")),


                //FlowerBlocks
                FlowerBlocks.ALLIUM_FLOWER_BUSH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("allium_flower_bush")),
                FlowerBlocks.ALPINE_BELLFLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("alpine_bellflower")),
                FlowerBlocks.AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("amaranth")),
                FlowerBlocks.ANGELICA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("angelica")),
                FlowerBlocks.AZALEA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("azalea")),
                FlowerBlocks.BEGONIA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("begonia")),
                FlowerBlocks.BISTORT = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("bistort")),
                FlowerBlocks.BLUE_SAGE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("blue_sage")),
                FlowerBlocks.CALIFORNIA_POPPY = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("california_poppy")),
                FlowerBlocks.CROCUS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("crocus")),
                FlowerBlocks.BLACK_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("black_rose")),
                FlowerBlocks.CYAN_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("cyan_amaranth")),
                FlowerBlocks.CYAN_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("cyan_rose")),
                FlowerBlocks.CYAN_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("cyan_tulip")),
                FlowerBlocks.DAFFODIL = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("daffodil")),
                FlowerBlocks.DELPHINIUM = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("delphinium")),
                FlowerBlocks.FAIRY_SLIPPER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("fairy_slipper")),
                FlowerBlocks.FIRECRACKER_FLOWER_BUSH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("firecracker_flower_bush")),
                FlowerBlocks.FOXGLOVE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("foxglove")),
                FlowerBlocks.GOLDEN_SPINED_CACTUS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("golden_spined_cactus")),
                FlowerBlocks.GREEN_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("green_tulip")),
                FlowerBlocks.GUZMANIA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("guzmania")),
                FlowerBlocks.INCAN_LILY = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("incan_lily")),
                FlowerBlocks.IRIS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("iris")),
                FlowerBlocks.JAPANESE_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("japanese_orchid")),
                FlowerBlocks.KOVAN_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("kovan_flower")),
                FlowerBlocks.LAZARUS_BELLFLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("lazarus_bellflower")),
                FlowerBlocks.LOLIPOP_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("lolipop_flower")),
                FlowerBlocks.MAGENTA_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("magenta_amaranth")),
                FlowerBlocks.MAGENTA_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("magenta_tulip")),
                FlowerBlocks.ORANGE_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("orange_amaranth")),
                FlowerBlocks.ORANGE_DAISY = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("orange_daisy")),
                FlowerBlocks.ORSIRIA_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("orsiria_rose")),
                FlowerBlocks.PEACH_LEATHER_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("peach_leather_flower")),
                FlowerBlocks.PINK_ALLIUM = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_allium")),
                FlowerBlocks.PINK_ALLIUM_FLOWER_BUSH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_allium_flower_bush")),
                FlowerBlocks.PINK_ANEMONE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_anemone")),
                FlowerBlocks.PINK_DAFFODIL = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_daffodil")),
                FlowerBlocks.PINK_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("pink_orchid")),
                FlowerBlocks.PROTEA_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("protea_flower")),
                FlowerBlocks.PURPLE_AMARANTH = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_amaranth")),
                FlowerBlocks.PURPLE_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_orchid")),
                FlowerBlocks.PURPLE_SAGE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_sage")),
                FlowerBlocks.PURPLE_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("purple_tulip")),
                FlowerBlocks.RED_CORNFLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("red_cornflower")),
                FlowerBlocks.RED_ORCHID = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("red_orchid")),
                FlowerBlocks.RICHEA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("richea")),
                FlowerBlocks.ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("rose")),
                FlowerBlocks.SNOWDROPS = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("snowdrops")),
                FlowerBlocks.SILVER_VASE_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("silver_vase_flower")),
                FlowerBlocks.TORCH_GINGER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("torch_ginger")),
                FlowerBlocks.VIOLET_LEATHER_FLOWER = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("violet_leather_flower")),
                FlowerBlocks.WHITE_ANEMONE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("white_anemone")),
                FlowerBlocks.WHITE_SAGE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("white_sage")),
                FlowerBlocks.WINTER_CYCLAMEN = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("winter_cyclamen")),
                FlowerBlocks.WINTER_ROSE = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("winter_rose")),
                FlowerBlocks.WINTER_SCILLA = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("winter_scilla")),
                FlowerBlocks.YELLOW_DAFFODIL = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("yellow_daffodil")),
                FlowerBlocks.YELLOW_TULIP = new FlowerBlock(Effects.SATURATION, 7, Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0f).sound(SoundType.PLANT)).setRegistryName(location("yellow_tulip"))
        );
        BYG.LOGGER.info("Load");
    }

    @SubscribeEvent
    public void bygRegisterItems(final RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new LeaveItems.AppleSkyrisLeaves(),
                new LeaveItems.BaobaLeaves()
        );
    }

    private ResourceLocation location(String name) {
        return new ResourceLocation(BYG.MODID, name);
    }
}