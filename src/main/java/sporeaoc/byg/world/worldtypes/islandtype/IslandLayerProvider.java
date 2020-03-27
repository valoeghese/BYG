package sporeaoc.byg.world.worldtypes.islandtype;

import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.layer.Layer;
import net.minecraft.world.gen.layer.SmoothLayer;
import net.minecraft.world.gen.layer.ZoomLayer;
import sporeaoc.byg.config.BYGWorldTypesConfig;
import sporeaoc.byg.world.worldtypes.islandtype.layers.*;
import sporeaoc.byg.world.worldtypes.islandtype.layers.islandadders.*;
import sporeaoc.byg.world.worldtypes.islandtype.layers.oceanedges.FrozenOceanEdges;
import sporeaoc.byg.world.worldtypes.islandtype.layers.oceanedges.LukeWarmOceanEdges;
import sporeaoc.byg.world.worldtypes.islandtype.layers.oceanedges.WarmOceanEdges;
import sporeaoc.byg.world.worldtypes.islandtype.layers.shore.BYGShoreLayer;
import sporeaoc.byg.world.worldtypes.islandtype.layers.shore.BYGShoreXLayer;

import java.util.function.LongFunction;

public class IslandLayerProvider {
    private static int oceanSize = BYGWorldTypesConfig.oceanBiomeSize.get();
    private static int islandSize = BYGWorldTypesConfig.islandsize.get();

    private static <A extends IArea, R extends IExtendedNoiseRandom<A>> IAreaFactory<A> stackLayers(LongFunction<R> randomProvider) {
        IAreaFactory<A> islandFactory = MasterOceanLayer.INSTANCE.apply(randomProvider.apply(110200L));
        islandFactory = WarmOceanEdges.INSTANCE.apply(randomProvider.apply(72421L), islandFactory);
        islandFactory = LukeWarmOceanEdges.INSTANCE.apply(randomProvider.apply(7244L), islandFactory);
        islandFactory = FrozenOceanEdges.INSTANCE.apply(randomProvider.apply(7667L), islandFactory);
        for (int oceanBiomeSize = 0; oceanBiomeSize <= oceanSize; oceanBiomeSize++) {
            islandFactory = ZoomLayer.NORMAL.apply(randomProvider.apply(1000L + oceanBiomeSize), islandFactory);
        }
        islandFactory = ZoomLayer.NORMAL.apply(randomProvider.apply(13200L), islandFactory);
        islandFactory = CoolIslandAdder.INSTANCE.apply(randomProvider.apply(9355L), islandFactory);
        islandFactory = WarmIslandAdder.INSTANCE.apply(randomProvider.apply(72421L), islandFactory);
        islandFactory = HotIslandAdder.INSTANCE.apply(randomProvider.apply(9355L), islandFactory);
        islandFactory = SnowyIslandAdder.INSTANCE.apply(randomProvider.apply(110293L), islandFactory);
        islandFactory = TropIslandAdder.INSTANCE.apply(randomProvider.apply(90923L), islandFactory);
        islandFactory = ZoomLayer.NORMAL.apply(randomProvider.apply(25350L), islandFactory);
        for (int islandSizer = 0; islandSizer <= islandSize; islandSizer++) {
            islandFactory = IslandSizer.INSTANCE.apply(randomProvider.apply(9123L + islandSizer), islandFactory);
        }

        if (BYGWorldTypesConfig.beaches.get()) {
            islandFactory = BYGShoreLayer.INSTANCE.apply(randomProvider.apply(9123L), islandFactory);
            islandFactory = BYGShoreXLayer.INSTANCE.apply(randomProvider.apply(9123L), islandFactory);

        }
        islandFactory = ZoomLayer.FUZZY.apply(randomProvider.apply(11020L), islandFactory);
        islandFactory = ZoomLayer.FUZZY.apply(randomProvider.apply(11020L), islandFactory);
        islandFactory = SmoothLayer.INSTANCE.apply(randomProvider.apply(4601L), islandFactory);

        return islandFactory;
    }

    public static Layer build(long seed) {
        return new Layer(stackLayers(salt -> new LazyAreaLayerContext(25, seed, salt)));
    }
}

