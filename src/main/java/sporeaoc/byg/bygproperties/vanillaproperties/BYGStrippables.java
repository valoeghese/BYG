package sporeaoc.byg.bygproperties.vanillaproperties;

import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.item.AxeItem;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import sporeaoc.byg.byglists.BYGBlockList;

public class BYGStrippables {
    public void strippableLogsBYG(FMLCommonSetupEvent e){
        strippableBlock(BYGBlockList.ASPEN_LOG, BYGBlockList.STRIPPED_ASPEN_LOG);
        strippableBlock(BYGBlockList.BAOBAB_LOG, BYGBlockList.STRIPPED_BAOBAB_LOG);
        strippableBlock(BYGBlockList.BLUE_ENCHANTED_LOG, BYGBlockList.STRIPPED_BLUE_ENCHANTED_LOG);
        strippableBlock(BYGBlockList.CHERRY_LOG, BYGBlockList.CHERRY_LOG);
        strippableBlock(BYGBlockList.CIKA_LOG, BYGBlockList.STRIPPED_CIKA_LOG);
        strippableBlock(BYGBlockList.CYPRESS_LOG, BYGBlockList.STRIPPED_CYPRESS_LOG);
        strippableBlock(BYGBlockList.EBONY_LOG, BYGBlockList.STRIPPED_EBONY_LOG);
        strippableBlock(BYGBlockList.FIR_LOG, BYGBlockList.STRIPPED_FIR_LOG);
        strippableBlock(BYGBlockList.GREEN_ENCHANTED_LOG, BYGBlockList.STRIPPED_GREEN_ENCHANTED_LOG);
        strippableBlock(BYGBlockList.HOLLY_LOG, BYGBlockList.STRIPPED_HOLLY_LOG);
        strippableBlock(BYGBlockList.JACARANDA_LOG, BYGBlockList.STRIPPED_JACARANDA_LOG);
        strippableBlock(BYGBlockList.MAHOGANY_LOG, BYGBlockList.STRIPPED_MAHOGANY_LOG);
        strippableBlock(BYGBlockList.MANGROVE_LOG, BYGBlockList.STRIPPED_MANGROVE_LOG);
        strippableBlock(BYGBlockList.MAPLE_LOG, BYGBlockList.STRIPPED_MAPLE_LOG);
        strippableBlock(BYGBlockList.PALO_VERDE_LOG, BYGBlockList.STRIPPED_PALO_VERDE_LOG);
        strippableBlock(BYGBlockList.PINE_LOG, BYGBlockList.STRIPPED_PINE_LOG);
        strippableBlock(BYGBlockList.RAINBOW_EUCALYPTUS_LOG, BYGBlockList.STRIPPED_RAINBOW_EUCALYPTUS_LOG);
        strippableBlock(BYGBlockList.REDWOOD_LOG, BYGBlockList.STRIPPED_REDWOOD_LOG);
        strippableBlock(BYGBlockList.SKYRIS_LOG, BYGBlockList.STRIPPED_SKYRIS_LOG);
        strippableBlock(BYGBlockList.WILLOW_LOG, BYGBlockList.STRIPPED_WILLOW_LOG);
        strippableBlock(BYGBlockList.WITCH_HAZEL_LOG, BYGBlockList.STRIPPED_WITCH_HAZEL_LOG);
        strippableBlock(BYGBlockList.ZELKOVA_LOG, BYGBlockList.STRIPPED_ZELKOVA_LOG);
    }

    public static void strippableBlock(Block logBYG, Block strippableBYG) {
        AxeItem.BLOCK_STRIPPING_MAP = Maps.newHashMap(AxeItem.BLOCK_STRIPPING_MAP);
        AxeItem.BLOCK_STRIPPING_MAP.put(logBYG, strippableBYG);
    }
}
