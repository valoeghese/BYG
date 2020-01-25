package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockLog extends LogBlock {
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
