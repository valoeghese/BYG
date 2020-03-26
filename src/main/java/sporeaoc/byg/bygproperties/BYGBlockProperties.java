package sporeaoc.byg.bygproperties;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;
import net.minecraft.state.properties.Half;
import net.minecraft.state.properties.StairsShape;
import net.minecraft.util.Direction;
import sporeaoc.byg.byglists.BYGMaterials;
import sporeaoc.byg.bygproperties.blocks.*;
import sporeaoc.byg.bygproperties.blocks.grassblocks.BYGGlowCeliumBlock;
import sporeaoc.byg.bygproperties.blocks.grassblocks.BYGMeadowGrassBlock;
import sporeaoc.byg.bygproperties.blocks.grassblocks.BYGOverGrownDaciteBlock;
import sporeaoc.byg.bygproperties.blocks.grassblocks.BYGOverGrownStoneBlock;

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

    public static class BYGFenceGate extends FenceGateBlock {
        public BYGFenceGate(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGWoodSlab extends SlabBlock {
        public BYGWoodSlab(String registryName) {
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

    public static class BYGDoublePlant extends DoublePlantBlock {
        public BYGDoublePlant(String registryName) {
            super(
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
                            .notSolid()
            );
            setRegistryName(registryName);

        }
    }
    public static class BYGDesertPlant extends BYGDesertPlants {
        public BYGDesertPlant(String registryName) {
            super(
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
                            .notSolid()
            );
            setRegistryName(registryName);

        }
    }

    public static class BYGBeachGrass extends BYGBeachGrassBlock {
        public BYGBeachGrass(String registryName) {
            super(
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

    public static class BYGLeafPile extends BYGLeafPileBlock {
        public BYGLeafPile(String registryName) {
            super(
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
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

    public static class BYGPrairieGrass extends BYGPrairieGrassBlock {
        public BYGPrairieGrass(String registryName) {
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

    public static class BlockOvergrownStoneBlock extends BYGOverGrownStoneBlock {
        public BlockOvergrownStoneBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .tickRandomly()

            );
            setRegistryName(registryName);
        }
    }

    public static class BlockOvergrownDaciteBlock extends BYGOverGrownDaciteBlock {
        public BlockOvergrownDaciteBlock(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .tickRandomly()

            );
            setRegistryName(registryName);
        }
    }

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

    public static class BYGMud extends SoulSandBlock {
        public BYGMud (String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .speedFactor(0.4F)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGMeadowGrass extends BYGMeadowGrassBlock {
        public BYGMeadowGrass(String registryName) {
            super(Block.Properties.create(Material.EARTH)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGGlowcelium extends BYGGlowCeliumBlock {
        public BYGGlowcelium(String registryName) {
            super(Block.Properties.create(BYGMaterials.GLOWCELIUM)
                    .sound(SoundType.GROUND)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .lightValue(10)

            );
            setRegistryName(registryName);
        }
    }
    public static class BYGLeaves extends LeavesBlock {
        public BYGLeaves(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                            .hardnessAndResistance(0.2F)
                            .tickRandomly()
                            .sound(SoundType.PLANT)
                            .notSolid()
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(DISTANCE, Integer.valueOf(7)).with(PERSISTENT, Boolean.valueOf(false)));
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

    public static class BYGPollen extends BYGPollenBlock {
        public BYGPollen(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.CORAL)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .notSolid()
                    .doesNotBlockMovement()

            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPoisonIvy extends PoisonIvyBlock {
        public BYGPoisonIvy(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
                    .doesNotBlockMovement()

            );
            setRegistryName(registryName);
        }
    }

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

    public static class BYGOre extends BYGOreBlock {
        public BYGOre(String registryName) {
            super(
                    Block.Properties.create(Material.ROCK)
                            .sound(SoundType.STONE)
                            .hardnessAndResistance(3.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGREDGlowCane extends BYGGlowcane {
        public BYGREDGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.RED_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .lightValue(10)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPINKGlowCane extends BYGGlowcane {
        public BYGPINKGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.PINK_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .lightValue(10)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGPURPLEGlowCane extends BYGGlowcane {
        public BYGPURPLEGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.PURPLE_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .lightValue(10)
            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBLUEGlowCane extends BYGGlowcane {
        public BYGBLUEGlowCane(String registryName) {
            super(Block.Properties.create(BYGMaterials.BLUE_GLOWCANE)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.0f, 0.0f)
                    .doesNotBlockMovement()
                    .lightValue(10)
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

    public static class BlockCattail extends TallSeaGrassBlock {
        public BlockCattail(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .notSolid()
                    .doesNotBlockMovement()


            );
            setRegistryName(registryName);
        }
    }

    public static class BYGBerryBush extends BlueBerryBush {
        public BYGBerryBush(String registryName) {
            super(Block.Properties.create(Material.PLANTS)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(1.5f, 6.0f)
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }


    public static class BlockHugeMushroom extends HugeMushroomBlock {
        public BlockHugeMushroom(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(1.5f, 6.0f)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(NORTH, Boolean.valueOf(true)).with(EAST, Boolean.valueOf(true)).with(SOUTH, Boolean.valueOf(true)).with(WEST, Boolean.valueOf(true)).with(UP, Boolean.valueOf(true)).with(DOWN, Boolean.valueOf(true)));
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

    public static class BYGCraftingTable extends BYGCraftingTableBlock {
        public BYGCraftingTable(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }
    public static class BYGDoors extends DoorBlock {
        public BYGDoors(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }
    public static class BYGWoodStairs extends BYGStairBlock {
        public BYGWoodStairs(String registryName) {
            super(stateSupplier, Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
            this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(HALF, Half.BOTTOM).with(SHAPE, StairsShape.STRAIGHT).with(WATERLOGGED, Boolean.valueOf(false)));
            this.modelBlock = Blocks.AIR;
            this.modelState = Blocks.AIR.getDefaultState();
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

    public static class BYGGlowCaneBlock extends Block {
        public BYGGlowCaneBlock(String registryName) {
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
