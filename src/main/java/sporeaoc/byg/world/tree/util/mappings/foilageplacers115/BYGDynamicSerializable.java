package sporeaoc.byg.world.tree.util.mappings.foilageplacers115;

import com.mojang.datafixers.types.DynamicOps;

public interface BYGDynamicSerializable {
    <T> T serialize(DynamicOps<T> serializeDynamicOps);

}
