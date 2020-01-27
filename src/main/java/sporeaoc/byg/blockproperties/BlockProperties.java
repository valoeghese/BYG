package sporeaoc.byg.blockproperties;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.potion.Effects;

public  class BlockProperties {
    public static class BlockFence extends FenceBlock {
        public BlockFence(String registryName) {
            super(Block.Properties.create(Material.WOOD)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }

    public static class BlockFlower extends FlowerBlock {
        public BlockFlower(String registryName) {
            super(
                    Effects.SATURATION, 7,
                    Block.Properties.create(Material.PLANTS)
                            .sound(SoundType.PLANT)
                            .hardnessAndResistance(0.0f)
                            .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }
    public static class BlockLeave extends LeavesBlock {
        public BlockLeave(String registryName) {
            super(Block.Properties.create(Material.LEAVES)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(0.2f)
                    .tickRandomly()
            );
            setRegistryName(registryName);
        }
    }
    public static class BlockLog extends LogBlock {
        public BlockLog(String registryName) {
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
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(0.2f)
            );
            setRegistryName(registryName);
        }
    }
    public static class BlockOre extends OreBlock {
        public BlockOre(String registryName) {
            super(
                    Block.Properties.create(Material.ROCK)
                            .sound(SoundType.STONE)
                            .hardnessAndResistance(3.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }
    public static class BlockPlanks extends Block {
        public BlockPlanks(String registryName) {
            super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                    .sound(SoundType.WOOD)
                    .hardnessAndResistance(2.0f, 3.0f)
            );
            setRegistryName(registryName);
        }
    }
    public static class BlockStone extends Block {
        public BlockStone(String registryName) {
            super(Block.Properties.create(Material.ROCK)
                    .sound(SoundType.STONE)
                    .hardnessAndResistance(1.5f, 6.0f)
            );
            setRegistryName(registryName);
        }
    }
    public static class BlockStrippedLog extends LogBlock {
        public BlockStrippedLog(String registryName) {
            super(
                    MaterialColor.OBSIDIAN,
                    Block.Properties.create(Material.WOOD, MaterialColor.OBSIDIAN)
                            .sound(SoundType.WOOD)
                            .hardnessAndResistance(2.0f)
            );
            setRegistryName(registryName);
        }
    }
}