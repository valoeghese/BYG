package sporeaoc.byg.world.tree.mappings.foilageplacers;

import com.mojang.datafixers.Dynamic;
import com.mojang.datafixers.types.DynamicOps;
import net.minecraft.world.gen.feature.IFeatureConfig;

public class BYGNoFeatureConfig implements IFeatureConfig {
   public <T> Dynamic<T> serialize(DynamicOps<T> ops) {
      return new Dynamic<>(ops, ops.emptyMap());
   }

   public static <T> net.minecraft.world.gen.feature.NoFeatureConfig deserialize(Dynamic<T> p_214639_0_) {
      return IFeatureConfig.NO_FEATURE_CONFIG;
   }
}
