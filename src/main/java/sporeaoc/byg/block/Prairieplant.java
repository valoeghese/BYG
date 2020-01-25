package sporeaoc.byg.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class Prairieplant extends TallGrassBlock {
    public Prairieplant(String registryName) {
            super(Block.Properties.create(Material.PLANTS, MaterialColor.YELLOW)
                    .sound(SoundType.PLANT)
                    .hardnessAndResistance(2.0f, 3.0f)
                    .doesNotBlockMovement()
            );
            setRegistryName(registryName);
        }
    }
