package sporeaoc.byg.registries;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import sporeaoc.byg.BYG;
import sporeaoc.byg.byglists.BYGSBList;

@Mod.EventBusSubscriber(modid = BYG.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BYGSurfaceBuilderRegistry {


    @SubscribeEvent
    public static void bygRegisterSurfaceBuilders(final RegistryEvent.Register<SurfaceBuilder<?>> event) {
        event.getRegistry().registerAll(
                BYGSBList.BOREAL_SB.setRegistryName("boreal_sb"),
                BYGSBList.QUAGMIRE_SB.setRegistryName("quagmire_sb"),
                BYGSBList.DOVER_SB.setRegistryName("dover_sb")
        );

    }
}
