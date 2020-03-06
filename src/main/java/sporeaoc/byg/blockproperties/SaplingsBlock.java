package sporeaoc.byg.blockproperties;

import net.minecraft.block.BlockState;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.IWorld;

import java.util.Random;

public class SaplingsBlock extends SaplingBlock
{
    public SaplingsBlock(Tree treeIn, Properties properties)
    {
        super(treeIn, properties);
    }

    @Override
    public void grow(IWorld worldIn, BlockPos pos, BlockState state, Random rand)
    {
        if (rand.nextInt(3) != 1)
        {
            worldIn.removeBlock(pos, false);
            worldIn.getWorld().createExplosion(null, pos.getX(), pos.getY(), pos.getZ(), 4, Explosion.Mode.DESTROY);
        }
        else
        {
            super.grow(worldIn, pos, state, rand);
        }
    }
}
