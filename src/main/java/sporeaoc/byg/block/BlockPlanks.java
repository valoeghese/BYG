package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockPlanks extends Block {
    public BlockPlanks(String registryName) {
        super(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(2.0f, 3.0f)
        );
        setRegistryName(registryName);
    }
}
