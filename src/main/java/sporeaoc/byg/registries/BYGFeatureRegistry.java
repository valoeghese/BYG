package sporeaoc.byg.registries;

import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.byglists.BYGFeatureList;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGFeatureRegistry {


    @SubscribeEvent
    public static void bygRegisterFeatures(RegistryEvent.Register<Feature<?>> event) {
        event.getRegistry().registerAll(
                //All BYG Tree Features use 1.14.4 Tree Mappings. See: `world/feature/tree/util`
                BYGFeatureList.BLUE_SPRUCE.setRegistryName("bluespruce_tree"),
                BYGFeatureList.BLUEGIANTSPUCE_TREE.setRegistryName("bluegiantspruce_tree"),
                BYGFeatureList.BOREAL_TREE.setRegistryName("boreal_tree"),
                BYGFeatureList.BOREAL_TREE2.setRegistryName("boreal_tree2"),
                BYGFeatureList.BROWNBIRCH_TREE.setRegistryName("brownbirch_tree"),
                BYGFeatureList.BROWNOAK_TREE.setRegistryName("brownoak_tree"),
                BYGFeatureList.DECIDUOUS_TREE.setRegistryName("deciduous_tree"),
                BYGFeatureList.GIANTORANGESPRUCE_TREE.setRegistryName("giantorangespruce_tree"),
                BYGFeatureList.GIANTREDSPRUCE_TREE.setRegistryName("giantredspruce_tree"),
                BYGFeatureList.GIANTYELLOWSPRUCE_TREE.setRegistryName("giantyellowspruce_tree"),
                BYGFeatureList.HUGECYPRESS_TREE.setRegistryName("hugecypress_tree"),
                BYGFeatureList.JACARANDA_TREE.setRegistryName("jacaranda_tree"),
                BYGFeatureList.ORANGEBIRCH_TREE.setRegistryName("orangebirch_tree"),
                BYGFeatureList.ORANGEDECIDUOUS_TREE.setRegistryName("orangedeciduous_tree"),
                BYGFeatureList.ORANGEOAK_TREE.setRegistryName("orangeoak_tree"),
                BYGFeatureList.ORANGESPRUCE_TREE.setRegistryName("orangespruce_tree"),
                BYGFeatureList.REDBIRCH_TREE.setRegistryName("redbirch_tree"),
                BYGFeatureList.REDDECIDUOUS_TREE.setRegistryName("reddeciduous_tree"),
                BYGFeatureList.REDOAK_TREE.setRegistryName("redoak_tree"),
                BYGFeatureList.REDSPRUCE_TREE.setRegistryName("redspruce_tree"),
                BYGFeatureList.SEASONAL_SHRUBS.setRegistryName("seasonal_shrubs"),
                BYGFeatureList.SHORTTROPICALRAINFOREST_TREE.setRegistryName("shorttropicalrainforest_tree"),
                BYGFeatureList.SHRUB.setRegistryName("shrub"),
                BYGFeatureList.SMALLBLUESPRUCE_TREE.setRegistryName("smallbluespruce_tree"),
                BYGFeatureList.SMALLORANGESPRUCE_TREE.setRegistryName("smallorangespruce_tree"),
                BYGFeatureList.SMALLREDSPRUCE_TREE.setRegistryName("smallredspruce_tree"),
                BYGFeatureList.SMALLYELLOWSPRUCE_TREE.setRegistryName("smallyellowspruce_tree"),
                BYGFeatureList.TALLBLUESPRUCE_TREE.setRegistryName("tallbluespruce_tree"),
                BYGFeatureList.TALLORANGESPRUCE_TREE.setRegistryName("tallorangespruce_tree"),
                BYGFeatureList.TALLREDSPRUCE_TREE.setRegistryName("tallredspruce_tree"),
                BYGFeatureList.TALLYELLOWSPRUCE_TREE.setRegistryName("tallyellowspruce_tree"),
                BYGFeatureList.TROPICALRAINFOREST_TREE.setRegistryName("tropicalrainforest_tree"),
                BYGFeatureList.WIDECONIFEROUS_TREE.setRegistryName("wideconiferous_tree"),
                BYGFeatureList.YELLOWBIRCH_TREE.setRegistryName("yellowbirch_tree"),
                BYGFeatureList.YELLOWDECIDUOUS_TREE.setRegistryName("yellowdeciduous_tree"),
                BYGFeatureList.YELLOWSPRUCE_TREE.setRegistryName("yellowspruce_tree")
        );
        BYG.LOGGER.info("All BYG features registered!");

    }
}