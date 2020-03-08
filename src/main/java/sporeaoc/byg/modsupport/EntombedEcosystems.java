package sporeaoc.byg.modsupport;

import com.mojang.datafixers.Dynamic;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.MultipleRandomFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;
import sporeaoc.byg.catalogs.BiomeCatalog;
import sporeaoc.byg.catalogs.FeatureCatalog;
import sporeaoc.byg.config.orestones.OreStoneConfig;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EntombedEcosystems {
    public static class EEFeatureAdder {
        public static void EEaddBlueTaigaTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BLUETALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(1, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BlUETAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(10, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BLUESMALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(15, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{Feature.PINE_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.33333334F}, Feature.SPRUCE_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.1F, -20)));
        }

        public static void EEaddBorealTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BOREALFOREST_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(12, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BOREALFOREST_TREE2, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(40, 0.3F, -15)));

        }

        public static void EEaddCypressTreeVegetation(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.HUGECYPRESS_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(1, 0.5F, 1)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.HUGECYPRESS_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(1, 0.5F, 1)));

        }

        public static void EEaddDeciduousTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.DECIDUOUS_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(30, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.DECIDUOUS_SHRUBS, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.3F, -20)));

        }

        public static void EEaddGiantBlueTaigaTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BLUEGIANTTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{Feature.MEGA_SPRUCE_TREE, Feature.PINE_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG, IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.33333334F, 0.33333334F}, Feature.SPRUCE_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(10, 0.1F, 1)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BlUETAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BLUESMALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BLUETALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{Feature.PINE_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.33333334F}, Feature.SPRUCE_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(1, 0.1F, 0)));
        }

        public static void EEaddGiantSeasonalTaigaTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SEASONALGIANTTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{Feature.MEGA_SPRUCE_TREE, Feature.PINE_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG, IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.33333334F, 0.33333334F}, Feature.SPRUCE_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(10, 0.1F, 1)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SEASONALTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SEASONALSMALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SEASONALTALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -10)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{Feature.PINE_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.33333334F}, Feature.SPRUCE_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(1, 0.1F, 0)));
        }

        public static void EEaddJacarandaTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{FeatureCatalog.JACARANDA_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.33333334F}, FeatureCatalog.JACARANDA_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.5F, 15)));
        }


        public static void EEaddSeasonalBirchForestTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BROWNBIRCH_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.ORANGEBIRCH_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -15)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.REDBIRCH_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.3F, -15)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.YELLOWBIRCH_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(35, 0.3F, -15)));
        }

        public static void EEaddSeasonalDeciduousTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SDECIDUOUS_TREE1, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SDECIDUOUS_TREE2, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SDECIDUOUS_TREE3, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SDECIDUOUS_TREE5, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SDECIDUOUS_SHRUBS, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.3F, -20)));
        }

        public static void EEaddSeasonalForestTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.BROWNOAK_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(5, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.ORANGEOAK_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.REDOAK_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.YELLOWBIRCH_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.3F, -20)));

        }

        public static void EEaddSeasonalTaigaTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SEASONALTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SEASONALSMALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(20, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SEASONALTALLTAIGA_TREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.3F, -20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{Feature.PINE_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.33333334F}, Feature.SPRUCE_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.1F, -20)));
        }

        public static void EEaddShrubs(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SHRUB, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(2, 0.8F, -2)));
        }


        public static void EEaddRedOakForestTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{Feature.NORMAL_TREE, Feature.FANCY_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG, IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.2F, 0.1F}, FeatureCatalog.REDOAK_TREE, IFeatureConfig.NO_FEATURE_CONFIG), EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(45, 0.3F, -20)));
        }


        public static void EEaddTropJungleTrees(Biome biome) {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.TROPICALRAINFORESTTREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(30, 0.5F, 20)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SHORTTROPICALRAINFORESTTREE, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(45, 0.8F, 45)));
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(FeatureCatalog.SHRUB, DecoratedFeatureConfig.NO_FEATURE_CONFIG, EEPlacerList.EETREEPLACER, new AtSurfaceWithExtraConfig(25, 0.8F, 10)));

        }
    }

    public static class EETreePlacer extends Placement<AtSurfaceWithExtraConfig> {
        public EETreePlacer(Function<Dynamic<?>, ? extends AtSurfaceWithExtraConfig> configFactoryIn) {
            super(configFactoryIn);
        }

        public Stream<BlockPos> getPositions(IWorld worldIn, ChunkGenerator<? extends GenerationSettings> chunkGenerator, Random random, AtSurfaceWithExtraConfig chancesConfig, BlockPos pos) {
            int c = chancesConfig.count;
            if (random.nextFloat() < chancesConfig.extraChance) {
                c += chancesConfig.extraCount;
            }

            boolean airFlag = false;
            boolean airBlock = true;
            ArrayList<BlockPos> blockPosList = new ArrayList<BlockPos>();

            for (int i = 0; i < c; i++) {
                int x = random.nextInt(16);
                int z = random.nextInt(16);
                int height = worldIn.getHeight(Heightmap.Type.MOTION_BLOCKING, pos.add(x, 0, z)).getY() - 5;


                while (height > 15) {

                    airBlock = worldIn.isAirBlock(pos.add(x, height, z));

                    //if height is is an air block and previous block was a solid block, store the fact that we are in an air block now
                    if (!airFlag && airBlock) {
                        airFlag = true;
                    }


                    //if height is an solid block and last block was air block, we are now on the surface of a piece of land. Generate feature now
                    else if (airFlag && !airBlock) {

                        blockPosList.add(pos.add(x, height + 1, z));
                        airFlag = false;
                    }

                    //move down
                    height--;
                }

            }

            return IntStream.range(0, blockPosList.size()).mapToObj((p_215051_3_) -> {
                return blockPosList.remove(0);
            }).filter(Objects::nonNull);
        }
    }

    public static class BYGEETreeAdd {
        public static void init(FMLCommonSetupEvent event) {
            if (OreStoneConfig.EESupport.get()) {
                if (ModList.get().isLoaded("entombedecosystems")) {

                    for (Biome biome : ForgeRegistries.BIOMES) {
                        if (biome == BiomeCatalog.BLUEGIANTTAIGA) {
                            EEFeatureAdder.EEaddGiantBlueTaigaTrees(biome);
                        }
                        if (biome == BiomeCatalog.BLUETAIGA) {
                            EEFeatureAdder.EEaddBlueTaigaTrees(biome);
                        }
                        if (biome == BiomeCatalog.BOREALFOREST) {
                            EEFeatureAdder.EEaddBorealTrees(biome);
                        }
                        if (biome == BiomeCatalog.DECIDUOUSFOREST) {
                            EEFeatureAdder.EEaddDeciduousTrees(biome);
                        }
                        if (biome == BiomeCatalog.SEASONALGIANTTAIGA) {
                            EEFeatureAdder.EEaddGiantSeasonalTaigaTrees(biome);
                        }
                        if (biome == BiomeCatalog.JACARANDAFOREST) {
                            EEFeatureAdder.EEaddJacarandaTrees(biome);
                        }
                        if (biome == BiomeCatalog.DECIDUOUSFOREST) {
                            EEFeatureAdder.EEaddDeciduousTrees(biome);
                        }
                        if (biome == BiomeCatalog.REDOAKFOREST) {
                            EEFeatureAdder.EEaddRedOakForestTrees(biome);
                        }
                        if (biome == BiomeCatalog.SEASONALDECIDUOUSFOREST) {
                            EEFeatureAdder.EEaddSeasonalDeciduousTrees(biome);
                        }
                        if (biome == BiomeCatalog.SHRUBLANDS) {
                            EEFeatureAdder.EEaddShrubs(biome);
                        }
                        if (biome == BiomeCatalog.SEASONALFOREST) {
                            EEFeatureAdder.EEaddSeasonalForestTrees(biome);
                        }
                        if (biome == BiomeCatalog.TROPICALRAINFOREST) {
                            EEFeatureAdder.EEaddTropJungleTrees(biome);
                        }
                        if (biome == BiomeCatalog.SEASONALTAIGA) {
                            EEFeatureAdder.EEaddSeasonalTaigaTrees(biome);
                        }
                        if (biome == BiomeCatalog.SEASONALBIRCHFOREST) {
                            EEFeatureAdder.EEaddSeasonalBirchForestTrees(biome);
                        }
                    }
                }
            }
        }
    }

    public static class EEPlacerList {
        public static final Placement<AtSurfaceWithExtraConfig> EETREEPLACER = new EETreePlacer(AtSurfaceWithExtraConfig::deserialize);

    }
}
