package sporeaoc.byg.world.tree.mappings.foilageplacers;

import com.mojang.datafixers.types.DynamicOps;

public interface BYGDynamicSerializable {
    <T> T serialize(DynamicOps<T> serializeDynamicOps);

}
