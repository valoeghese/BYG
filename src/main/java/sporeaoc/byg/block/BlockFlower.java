package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.potion.Effects;

public class BlockFlower extends FlowerBlock {
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
