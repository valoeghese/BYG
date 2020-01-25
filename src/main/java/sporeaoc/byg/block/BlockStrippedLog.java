package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockStrippedLog extends LogBlock {
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
