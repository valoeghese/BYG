package sporeaoc.byg.registries;

import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.catalogs.FeatureCatalog;

@Mod.EventBusSubscriber(modid = BYG.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGFeatureRegistry {


    @SubscribeEvent
    public static void bygRegisterFeatures(final RegistryEvent.Register<Feature<?>> event) {


        event.getRegistry().registerAll
                (
                        FeatureCatalog.CYPRESS_TREE.setRegistryName("cypress_tree"),
                        FeatureCatalog.MYT.setRegistryName("myt")
                );
    }

/*    @SubscribeEvent
    public static void registerFeatures(IForgeRegistry<Feature<?>> event) {
       event.registerAll(
               FeatureCatalog.CYPRESS_TREE.setRegistryName("cypress_tree")
       );
    }*/
}