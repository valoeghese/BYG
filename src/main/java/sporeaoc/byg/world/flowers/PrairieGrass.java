//package sporeaoc.byg.world.flowers;
//
//import com.mojang.datafixers.Dynamic;
//import net.minecraft.block.BlockState;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.gen.feature.FlowersFeature;
//import net.minecraft.world.gen.feature.NoFeatureConfig;
//import sporeaoc.byg.catalogs.BlockList;
//
//import java.util.Random;
//import java.util.function.Function;
//
//public class PrairieGrass extends FlowersFeature {
//    public PrairieGrass(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i51465_1_) {
//        super(p_i51465_1_);
//    }
//
//    public BlockState getRandomFlower(Random random, BlockPos pos) {
//        int randomizer = random.nextInt(1) + 1;
//
//        if(randomizer == 1) {
//            return BlockList.PRAIRIE_GRASS.getDefaultState();
//        } else {
//            return BlockList.PRAIRIE_GRASS.getDefaultState();
//        }
//    }
//}