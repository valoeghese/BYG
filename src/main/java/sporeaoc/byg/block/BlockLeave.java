package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockLeave extends LeavesBlock {
    public BlockLeave(String registryName) {
        super(Block.Properties.create(Material.LEAVES)
                .sound(SoundType.PLANT)
                .hardnessAndResistance(0.2f)
                .tickRandomly()
        );
        setRegistryName(registryName);
    }
}
