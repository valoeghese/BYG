package sporeaoc.byg.world.worldtypes.islandtype;

import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.ZoomLayer;
import sporeaoc.byg.world.worldtypes.islandtype.layers.*;
import sporeaoc.byg.world.worldtypes.islandtype.layers.islandadders.BaseIslandAdder;
import sporeaoc.byg.world.worldtypes.islandtype.layers.islandadders.HotIslandAdder;
import sporeaoc.byg.world.worldtypes.islandtype.layers.islandadders.SnowyIslandAdder;
import sporeaoc.byg.world.worldtypes.islandtype.layers.islandadders.TropIslandAdder;

import java.util.function.LongFunction;

public class IslandLayerProvider {
    private static <A extends IArea, R extends IExtendedNoiseRandom<A>> IAreaFactory<A> stackLayers(LongFunction<R> randomProvider) {
        IAreaFactory<A> islandFactory = MasterOceanLayer.INSTANCE.apply(randomProvider.apply(110200L));
        islandFactory = WarmOceanEdges.INSTANCE.apply(randomProvider.apply(72421L), islandFactory);
        islandFactory = LukeWarmOceanEdges.INSTANCE.apply(randomProvider.apply(7244L), islandFactory);
        for (int oceanBiomeSize = 0; oceanBiomeSize <= 2; oceanBiomeSize++) {
            islandFactory = ZoomLayer.NORMAL.apply(randomProvider.apply(1000L + oceanBiomeSize), islandFactory);
        }
        islandFactory = BaseIslandAdder.INSTANCE.apply(randomProvider.apply(72421L), islandFactory);
        islandFactory = HotIslandAdder.INSTANCE.apply(randomProvider.apply(9355L), islandFactory);
        islandFactory = SnowyIslandAdder.INSTANCE.apply(randomProvider.apply(110293L), islandFactory);
        islandFactory = TropIslandAdder.INSTANCE.apply(randomProvider.apply(90923L), islandFactory);
        islandFactory = BYGClimateUnmixingLayer.INSTANCE.apply(randomProvider.apply(90923L), islandFactory);

        for (int islandSize = 0; islandSize <= 2; islandSize++) {
            islandFactory = IslandSizer.INSTANCE.apply(randomProvider.apply(9123L + islandSize), islandFactory);
        }
//        if (BYGIslandSettingsConfig.beaches.get()) {
//            islandFactory = ShoreLayer.INSTANCE.apply(randomProvider.apply(1294L), islandFactory);
//        }
        islandFactory = BYGShoreLayer.INSTANCE.apply(randomProvider.apply(9123L), islandFactory);
        islandFactory = ZoomLayer.FUZZY.apply(randomProvider.apply(19035L), islandFactory);
        islandFactory = ZoomLayer.NORMAL.apply(randomProvider.apply(11020L), islandFactory);
        islandFactory = ZoomLayer.FUZZY.apply(randomProvider.apply(4601L), islandFactory);

        return islandFactory;
    }

    public static Layer build(long seed) {
        return new Layer(stackLayers(salt -> new LazyAreaLayerContext(25, seed, salt)));
    }
}

