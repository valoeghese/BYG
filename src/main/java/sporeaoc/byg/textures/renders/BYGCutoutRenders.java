package sporeaoc.byg.textures.renders;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import sporeaoc.byg.byglists.BYGBlockList;

public class BYGCutoutRenders {
    public void renderCutOuts(FMLClientSetupEvent e) {
        //Plants
        RenderTypeLookup.setRenderLayer(BYGBlockList.HORSEWEED.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MINI_CACTUS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PRICKLY_PEAR_CACTUS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WINTER_SUCCULENT.getBlock(), RenderType.getCutoutMipped());

        //Sea Plants
        RenderTypeLookup.setRenderLayer(BYGBlockList.CATTAIL.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.REEDS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.TINY_LILYPADS.getBlock(), RenderType.getCutoutMipped());

        //GlowCane
        RenderTypeLookup.setRenderLayer(BYGBlockList.BLUE_GLOWCANE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINK_GLOWCANE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PURPLE_GLOWCANE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RED_GLOWCANE.getBlock(), RenderType.getCutoutMipped());

        //Doors
        RenderTypeLookup.setRenderLayer(BYGBlockList.ASPEN_DOOR.getBlock(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BAOBAB_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BLUE_ENCHANTED_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CHERRY_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CIKA_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CYPRESS_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.EBONY_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.FIR_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.GREEN_ENCHANTED_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.HOLLY_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.JACARANDA_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MAHOGANY_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MANGROVE_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MAPLE_DOOR.getBlock(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINE_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RAINBOW_EUCALYPTUS_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.REDWOOD_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.SKYRIS_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WILLOW_DOOR.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WITCH_HAZEL_DOOR.getBlock(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ZELKOVA_DOOR.getBlock(), RenderType.getTranslucent());

        //Grass
        RenderTypeLookup.setRenderLayer(BYGBlockList.TALL_PRAIRIE_GRASS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PRAIRIE_GRASS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.SHORT_GRASS.getBlock(), RenderType.getCutoutMipped());

        //Saplings
        RenderTypeLookup.setRenderLayer(BYGBlockList.ASPEN_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BAOBAB_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BLUE_ENCHANTED_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BLUE_SPRUCE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BROWN_BIRCH_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BROWN_OAK_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CIKA_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.EBONY_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.FIR_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.GREEN_ENCHANTED_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.HOLLY_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.JACARANDA_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MAHOGANY_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MANGROVE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.HOLLY_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ORANGE_BIRCH_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ORANGE_OAK_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ORANGE_SPRUCE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PALO_VERDE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINK_CHERRY_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RAINBOW_EUCALYPTUS_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RED_BIRCH_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RED_MAPLE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RED_OAK_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RED_SPRUCE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.REDWOOD_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.SILVER_MAPLE_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.SKYRIS_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WHITE_CHERRY_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WILLOW_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WITCH_HAZEL_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.YELLOW_BIRCH_SAPLING.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.YELLOW_SPRUCE_SAPLING.getBlock(), RenderType.getCutoutMipped());


        //FlowerBlocks
        RenderTypeLookup.setRenderLayer(BYGBlockList.ALLIUM_FLOWER_BUSH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ALPINE_BELLFLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.AMARANTH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ANGELICA.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.AZALEA.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BEGONIA.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CALIFORNIA_POPPY.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CROCUS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.BLACK_ROSE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CYAN_AMARANTH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CYAN_ROSE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.CYAN_TULIP.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.DAFFODIL.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.DELPHINIUM.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.FAIRY_SLIPPER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.FIRECRACKER_FLOWER_BUSH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.FOXGLOVE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.GOLDEN_SPINED_CACTUS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.GREEN_TULIP.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.GUZMANIA.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.INCAN_LILY.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.IRIS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.JAPANESE_ORCHID.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.KOVAN_FLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.LAZARUS_BELLFLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.LOLIPOP_FLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MAGENTA_AMARANTH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MAGENTA_TULIP.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ORANGE_AMARANTH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ORANGE_DAISY.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ORSIRIA_ROSE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PEACH_LEATHER_FLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINK_ALLIUM.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINK_ALLIUM_FLOWER_BUSH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINK_ANEMONE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINK_DAFFODIL.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PINK_ORCHID.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PROTEA_FLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PURPLE_AMARANTH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PURPLE_ORCHID.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PURPLE_SAGE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PURPLE_TULIP.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RED_CORNFLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RED_ORCHID.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.RICHEA.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.ROSE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.SNOWDROPS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.SILVER_VASE_FLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.TORCH_GINGER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.VIOLET_LEATHER_FLOWER.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WHITE_ANEMONE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WHITE_SAGE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WINTER_CYCLAMEN.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WINTER_ROSE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.WINTER_SCILLA.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.YELLOW_DAFFODIL.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.YELLOW_TULIP.getBlock(), RenderType.getCutoutMipped());

        //Other renders
        RenderTypeLookup.setRenderLayer(BYGBlockList.BLUEBERRY_BUSH.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.OVERGROWN_STONE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.OVERGROWN_DACITE.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.PRAIRIE_GRASS.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.MEADOW_GRASSBLOCK.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.GLOWCELIUM.getBlock(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(BYGBlockList.POISON_IVY.getBlock(), RenderType.getCutoutMipped());

    }
}
