package sporeaoc.byg.worldtype.islandtype;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.WorldType;
import net.minecraft.world.gen.IExtendedNoiseRandom;
import net.minecraft.world.gen.LazyAreaLayerContext;
import net.minecraft.world.gen.OverworldGenSettings;
import net.minecraft.world.gen.area.IArea;
import net.minecraft.world.gen.area.IAreaFactory;
import net.minecraft.world.gen.area.LazyArea;
import net.minecraft.world.gen.layer.VoroniZoomLayer;
import net.minecraft.world.gen.layer.ZoomLayer;

import java.util.function.LongFunction;

public class BYGLayerProvider {
    public static <T extends IArea, C extends IExtendedNoiseRandom<T>> ImmutableList<IAreaFactory<T>> buildArchipelagoProcedure(WorldType worldTypeIn, OverworldGenSettings settings, LongFunction<C> contextFactory) {
        IAreaFactory<T> survivalIslandFactory = BYGIslandLayer.INSTANCE.apply(contextFactory.apply(1000L));
        survivalIslandFactory = ZoomLayer.FUZZY.apply(contextFactory.apply(1000L), survivalIslandFactory);
        survivalIslandFactory = ZoomLayer.NORMAL.apply(contextFactory.apply(1000L), survivalIslandFactory);
        survivalIslandFactory = ZoomLayer.NORMAL.apply(contextFactory.apply(1000L), survivalIslandFactory);
        survivalIslandFactory = ZoomLayer.NORMAL.apply(contextFactory.apply(1000L), survivalIslandFactory);
        survivalIslandFactory = ZoomLayer.NORMAL.apply(contextFactory.apply(1000L), survivalIslandFactory);
        survivalIslandFactory = ZoomLayer.NORMAL.apply(contextFactory.apply(1000L), survivalIslandFactory);


        IAreaFactory<T> iareafactory5 = VoroniZoomLayer.INSTANCE.apply(contextFactory.apply(1000L), survivalIslandFactory);
//        iareafactory5 = VoroniZoomLayer.INSTANCE.apply(contextFactory.apply(1000L), iareafactory5);
//        iareafactory5 = VoroniZoomLayer.INSTANCE.apply(contextFactory.apply(1000L), iareafactory5);

        return ImmutableList.of(survivalIslandFactory, iareafactory5, survivalIslandFactory);
    }

    public static BYGLayers[] buildArchipelagoProcedure(long seed, WorldType typeIn, OverworldGenSettings settings) {
        ImmutableList<IAreaFactory<LazyArea>> immutablelist = buildArchipelagoProcedure(typeIn, settings, (p_215737_2_) -> {
            return new LazyAreaLayerContext(25, seed, p_215737_2_);
        });
        BYGLayers layer = new BYGLayers(immutablelist.get(0));
        BYGLayers layer1 = new BYGLayers(immutablelist.get(1));
        BYGLayers layer2 = new BYGLayers(immutablelist.get(2));
        return new BYGLayers[]{layer, layer1, layer2};

    }
}