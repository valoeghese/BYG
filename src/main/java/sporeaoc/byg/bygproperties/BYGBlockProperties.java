package sporeaoc.byg.bygproperties;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import sporeaoc.byg.bygproperties.otherproperties.blocks.*;

public class BYGBlockProperties {
    public static class BYGFence extends FenceBlock {
        public BYGFence(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGSlab extends SlabBlock {
        public BYGSlab(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGFlower extends FlowerBlock {
        public BYGFlower(String registryName) {
            super(
                    Effects.SATURATION, 7,
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
                            .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLily extends LilyPadBlock {
        public BYGLily(String registryName) {
            super(
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGTallGrass extends TallGrassBlock {
        public BYGTallGrass(String registryName) {
            super(Block.Properties.create(Material.TALL_PLANTS)
                    .sound(SoundType.PLANT)
                    .doesNotBlockMovement()
                    .hardnessAndResistance(0.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGGrassBlock extends GrassBlock {
        public BYGGrassBlock(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

//    public static class BlockMeadowGrass extends MeadowGrassBlock {
//        public BlockMeadowGrass(String registryName) {
//            super(Block.Properties.create(Material.EARTH)
//                    .sound(SoundType.PLANT)
//                    .hardnessAndResistance(0.2f)
//                    .tickRandomly()
//            );
//            setRegistryName(registryName);
//        }
//    }

//    public static class BlockOvergrownStone extends OvergrownStoneBlock {
//        public BlockOvergrownStone(String registryName) {
//            super(Block.Properties.create(Material.ROCK)
//                    .sound(SoundType.PLANT)
//                    .hardnessAndResistance(1.5f, 6.0f)
//                    .tickRandomly()
//
//            );
//            setRegistryName(registryName);
//        }
//    }

    public static class BYGDirt extends Block {
        public BYGDirt(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGLeaves extends BYGSnowyLeavesBlock {
        public BYGLeaves(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPetal extends LeavesBlock {
        public BYGPetal(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

//    public static class BlockVine extends PoisonIvyBlock {
//        public BlockVine(String registryName) {
//            super(Block.Properties.create(Material.LEAVES)
//                    .sound(SoundType.PLANT)
//                    .hardnessAndResistance(0.2f)
//                    .tickRandomly()
//                    .doesNotBlockMovement()
//
//            );
//            setRegistryName(registryName);
//        }
//    }

    public static class BYGLog extends LogBlock {
        public BYGLog(String registryName) {
            super(
                    MaterialColor.WOOD,
                    Block.Properties.create(Material.WOOD)
                            .sound(SoundType.WOOD)
                            .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockMushroom extends MushroomBlock {
        public BlockMushroom(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f)
                    .doesNotBlockMovement()

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGOre extends OreBlock {
        public BYGOre(String registryName) {
            super(
                    Block.Properties.create(Material.ROCK)
                            .sound(SoundType.STONE)
                            .hardnessAndResistance(3.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockStalk extends SugarCaneBlock {
        public BlockStalk(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGCrop extends CropsBlock {
        public BYGCrop(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .notSolid()
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockCattail extends SeaGrassBlock {
        public BlockCattail(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .notSolid()

            );
            setRegistryName(registryName);
        }
    }

//    public static class BlockBerryBush extends BlueBerryBush {
//        public BlockBerryBush(String registryName) {
//            super(Block.Properties.create(Material.PLANTS)
//                    .sound(SoundType.PLANT)
//                    .hardnessAndResistance(1.5f, 6.0f)
//                    .doesNotBlockMovement()
//            );
//            setRegistryName(registryName);
//        }


    public static class BlockHugeMushroom extends HugeMushroomBlock {
        public BlockHugeMushroom(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(1.5f, 6.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPlanks extends Block {
        public BYGPlanks(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockBookshelf extends BookshelfBlock {
        public BlockBookshelf(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGGlow extends Block {
        public BYGGlow(String registryName) {
            super(Block.Properties.create(Material.GLASS)
                    .sound(SoundType.GLASS)
                    .hardnessAndResistance(0.3F)
                    .lightValue(15)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStone extends Block {
        public BYGStone(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPillar extends RotatedPillarBlock {
        public BYGPillar(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGStrippedLog extends LogBlock {
        public BYGStrippedLog(String registryName) {
            super(
                    MaterialColor.WOOD,
                    Block.Properties.create(Material.WOOD, MaterialColor.WOOD)
                            .sound(SoundType.WOOD)
                            .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);

        }
    }
}
