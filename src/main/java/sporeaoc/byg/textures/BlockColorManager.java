package sporeaoc.byg.textures;

import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.renderer.color.IItemColor;
import net.minecraft.client.renderer.color.ItemColors;
import net.minecraft.item.BlockItem;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.byglists.BYGBlockList;
import sporeaoc.byg.byglists.BYGItemList;
@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockColorManager {
    /**
     * Register the {@link IBlockColor} handlers.
     */
    @SubscribeEvent
    public static void onBlockColorsInit(ColorHandlerEvent.Block event) {
        final BlockColors blockColors = event.getBlockColors();

        //registers the colors for blocks that changes colors based on biome
        blockColors.register((unknown, lightReader, pos, unknown2) -> {
            return lightReader != null && pos != null ? BiomeColors.getGrassColor(lightReader, pos) : GrassColors.get(0.5D, 1.0D);
        }, BYGBlockList.MEADOW_GRASSBLOCK, BYGBlockList.MAHOGANY_LEAVES, BYGBlockList.POISON_IVY, BYGBlockList.OVERGROWN_STONE, BYGBlockList.SHORT_GRASS, BYGBlockList.TINY_LILYPADS, BYGBlockList.OVERGROWN_DACITE, BYGBlockList.GLOWCELIUM, BYGBlockList.WILTED_GRASS, BYGBlockList.WEED_GRASS, BYGBlockList.LEAF_PILE);
    }

    /**
     * Register the {@link IItemColor} handlers
     */
    @SubscribeEvent
    public static void onItemColorsInit(ColorHandlerEvent.Item event) {
        final BlockColors blockColors = event.getBlockColors();
        final ItemColors itemColors = event.getItemColors();

        // Use the Block's colour handler for an ItemBlock
        final IItemColor itemBlockColourHandler = (stack, tintIndex) ->
        {
            final BlockState state = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
            return blockColors.getColor(state, null, null, tintIndex);
        };

        itemColors.register(itemBlockColourHandler, BYGItemList.MEADOW_GRASSBLOCK, BYGItemList.MAHOGANY_LEAVES, BYGItemList.POISON_IVY, BYGItemList.OVERGROWN_STONE, BYGItemList.SHORT_GRASS, BYGItemList.TINY_LILYPADS, BYGItemList.OVERGROWN_DACITE, BYGItemList.GLOWCELIUM, BYGItemList.WILTED_GRASS, BYGItemList.WEED_GRASS, BYGItemList.LEAF_PILE);
    }
}
