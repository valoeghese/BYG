package sporeaoc.byg.world.flowers;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.catalogs.BlockCatalogs;

import java.util.Random;
import java.util.function.Function;

public class AmaranthFieldFlowers extends FlowersFeature {
    public AmaranthFieldFlowers(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51465_1_) {
        super(p_i51465_1_);
    }

    public BlockState getRandomFlower(Random random, BlockPos pos) {
        int randomizer = random.nextInt(5) + 1;

        if(randomizer == 1) {
            return BlockCatalogs.AMARANTH.getDefaultState();
        }
        else if (randomizer == 2) {
            return BlockCatalogs.MAGENTA_AMARANTH.getDefaultState();
        }
        else if (randomizer == 3) {
            return BlockCatalogs.ORANGE_AMARANTH.getDefaultState();
        }
        else if (randomizer == 4) {
            return BlockCatalogs.PURPLE_AMARANTH.getDefaultState();
        }
        else {
            return BlockCatalogs.CYAN_AMARANTH.getDefaultState();
        }
    }
}