package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockOre extends OreBlock {
    public BlockOre(String registryName) {
        super(
                Block.Properties.create(Material.ROCK)
                        .sound(SoundType.STONE)
                        .hardnessAndResistance(3.0f, 3.0f)
        );
        setRegistryName(registryName);
    }
}
