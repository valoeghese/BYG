package sporeaoc.byg.byglists;

import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import sporeaoc.byg.world.structure.reddesert.RedDesertTempleStructure;

public class BYGStructureList {
    public static final Structure<NoFeatureConfig> RED_DESERT_PYRAMID = new RedDesertTempleStructure(NoFeatureConfig::deserialize);

}
