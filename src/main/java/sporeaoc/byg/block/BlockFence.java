package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockFence extends FenceBlock {
    public BlockFence(String registryName) {
        super(Block.Properties.create(Material.WOOD)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0f, 3.0f)
        );
        setRegistryName(registryName);
    }
}
