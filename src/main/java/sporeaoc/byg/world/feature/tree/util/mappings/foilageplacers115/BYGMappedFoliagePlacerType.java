package sporeaoc.byg.world.feature.tree.util.mappings.foilageplacers115;

import com.mojang.datafixers.Dynamic;

import java.util.function.Function;

public class BYGMappedFoliagePlacerType<P extends BYGMappedFoilagePlacer> {
   public static final BYGMappedFoliagePlacerType<BYGMappedBlobFoilagePlacer> blob_foliage_placer = mFoilagePlacer(BYGMappedBlobFoilagePlacer::new);
   public final Function<Dynamic<?>, P> dynamicPFunction;

   private static <P extends BYGMappedFoilagePlacer> BYGMappedFoliagePlacerType<P> mFoilagePlacer(Function<Dynamic<?>, P> dynamicFunction) {
      return (new BYGMappedFoliagePlacerType<>(dynamicFunction));
   }

   private BYGMappedFoliagePlacerType(Function<Dynamic<?>, P> dynamicPFunction2) {
      this.dynamicPFunction = dynamicPFunction2;
   }

   public P PDynamic(Dynamic<?> dynamic) {
      return (P)(this.dynamicPFunction.apply(dynamic));
   }
}