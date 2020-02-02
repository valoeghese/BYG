package sporeaoc.byg.registries;

import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.catalogs.FeatureCatalog;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGFeatureRegistry {


    @SubscribeEvent
    public static void bygRegisterFeatures(final RegistryEvent.Register<Feature<?>> event) {


        event.getRegistry().registerAll(
                FeatureCatalog.DECIDUOUS_TREE.setRegistryName("deciduous_tree"),
                FeatureCatalog.TIGHT_TREE.setRegistryName("baobab_tree"),
                FeatureCatalog.TREE_TEMPLATE.setRegistryName("tree_template"),
                FeatureCatalog.SDECIDUOUS_TREE1.setRegistryName("sdeciduous_tree1"),
                FeatureCatalog.SDECIDUOUS_TREE2.setRegistryName("sdeciduous_tree2"),
                FeatureCatalog.SDECIDUOUS_TREE3.setRegistryName("sdeciduous_tree3"),
                FeatureCatalog.SDECIDUOUS_BIRCH.setRegistryName("sdeciduous_birch"),
                FeatureCatalog.SDECIDUOUS_TREE5.setRegistryName("sdeciduous_tree5"),
                FeatureCatalog.SDECIDUOUS_SHRUBS.setRegistryName("sdeciduous_shrubs"),
                FeatureCatalog.DECIDUOUS_SHRUBS.setRegistryName("deciduous_shrubs"),
                FeatureCatalog.BROWNOAK_TREE.setRegistryName("brownoak_tree"),
                FeatureCatalog.ORANGEOAK_TREE.setRegistryName("orangeoak_tree"),
                FeatureCatalog.REDOAK_TREE.setRegistryName("redoak_tree"),
                FeatureCatalog.BROWNBIRCH_TREE.setRegistryName("brownbirch_tree"),
                FeatureCatalog.ORANGEBIRCH_TREE.setRegistryName("orangebirch_tree"),
                FeatureCatalog.REDBIRCH_TREE.setRegistryName("redbirch_tree"),
                FeatureCatalog.YELLOWBIRCH_TREE.setRegistryName("yellow_birch"),
                FeatureCatalog.HUGECYPRESS_TREE.setRegistryName("huge_cypress"),
                FeatureCatalog.SEASONALTAIGA_TREE.setRegistryName("seasonal_taiga"),
                FeatureCatalog.SEASONALSMALLTAIGA_TREE.setRegistryName("seasonalsmall_taiga"),
                FeatureCatalog.SEASONALTALLTAIGA_TREE.setRegistryName("seasonaltall_taiga"),
                FeatureCatalog.BlUETAIGA_TREE.setRegistryName("blue_taiga"),
                FeatureCatalog.BLUESMALLTAIGA_TREE.setRegistryName("bluesmall_taiga"),
                FeatureCatalog.BLUETALLTAIGA_TREE.setRegistryName("bluetall_taiga"),
                FeatureCatalog.SEASONALGIANTTAIGA_TREE.setRegistryName("seasonalgiant_taiga"),
                FeatureCatalog.BLUEGIANTTAIGA_TREE.setRegistryName("bluegiant_taiga"),
                FeatureCatalog.SHRUB.setRegistryName("shrub"),
                FeatureCatalog.PRAIRIEGRASS.setRegistryName("prairie_grass")


        );
        BYG.LOGGER.info("All BYG features registered!");

    }
}