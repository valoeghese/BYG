package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockStone extends Block {
    public BlockStone(String registryName) {
        super(Block.Properties.create(Material.ROCK)
                .sound(SoundType.STONE)
                .hardnessAndResistance(1.5f, 6.0f)
        );
        setRegistryName(registryName);
    }
}
