package sporeaoc.byg.worldtype.layers2;

import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.INoiseRandom;
import net.minecraft.world.gen.layer.traits.IAreaTransformer0;
import sporeaoc.byg.catalogs.BiomeCatalog;

public enum ContinentLayer implements IAreaTransformer0 {
    INSTANCE;

    @Override
    public int apply(INoiseRandom context, int x, int z) {
        return context.random(2) == 0 ? Registry.BIOME.getId(BiomeCatalog.AMARANTH_FIELDS) : Registry.BIOME.getId(BiomeCatalog.ALPS);
    }
}
