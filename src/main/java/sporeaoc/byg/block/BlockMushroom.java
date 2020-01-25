package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.MushroomBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class BlockMushroom extends MushroomBlock {
    public BlockMushroom(String registryName) {
        super(Block.Properties.create(Material.PLANTS, MaterialColor.DIRT)
                .sound(SoundType.WOOD)
                .hardnessAndResistance(0.2f)
        );
        setRegistryName(registryName);
    }
}
