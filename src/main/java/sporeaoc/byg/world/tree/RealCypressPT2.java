package sporeaoc.byg.world.tree;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.catalogs.BlockCatalogs;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

public class RealCypressPT2 extends AbstractTreeFeature<NoFeatureConfig> {
    private static final BlockState LOG = BlockCatalogs.CYPRESS_LOG.getDefaultState();
    private static final BlockState LEAVES = BlockCatalogs.CYPRESS_LEAVES.getDefaultState();

    public RealCypressPT2(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn) {
        super(configIn, doBlockNotifyIn);
        //setSapling((net.minecraftforge.common.IPlantable) Blocks.DARK_OAK_SAPLING);
    }

    public RealCypressPT2() {
        super(null, true);
    } //

    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        int randTreeHeight = rand.nextInt(25) + rand.nextInt(2) + 6; //First value changes height of the trunk.
        int posX = position.getX();
        int posY = position.getY();
        int posZ = position.getZ();
        if (posY >= 1 && posY + randTreeHeight + 1 < 256) {
            BlockPos blockpos = position.down();
            if (!isSoil(worldIn, blockpos, getSapling())) {
                return false;
            } else {
                this.setDirtAt(worldIn, blockpos, position);
                this.setDirtAt(worldIn, blockpos.east(), position);
                this.setDirtAt(worldIn, blockpos.south(), position);
                this.setDirtAt(worldIn, blockpos.south().east(), position);
                Direction direction = Direction.Plane.HORIZONTAL.random(rand);
                int random1 = randTreeHeight - rand.nextInt(1);//Crashes on 0. Unknown use.
                int posY1 = 2 - rand.nextInt(1);//Crashes on 0. Unknown Use
                int posX1 = posX;
                int posZ1 = posZ;
                int posy2 = posY + randTreeHeight - 1;

                /*int z1 = posX;
                int z2 = posY;
                int z3 = posZ;*/

                for (int posX2 = 3; posX2 < randTreeHeight; ++posX2) {//raising this value will remove log blocks from the ground up.
                    if (posX2 >= random1 && posY1 > 0) { //Unknown
                        posX1 += direction.getXOffset();
                        posZ1 += direction.getZOffset();
                        --posY1;
                    }
                    int logplacer = posY + posX2;
                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);
                    if (isAirOrLeaves(worldIn, blockpos1)) {
                        this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.east(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.south(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.north(), boundsIn);
                        //this.treelog(changedBlocks, worldIn, blockpos1.north(2), boundsIn);
                    }

                }
                boolean leaves = true;
                //Layer1
                if (leaves) { //these are for the top 4 leaves on the top layer of the tree. these values change the x, y, and z values on them
                    this.leafs(worldIn, posX1, posy2 + 3, posZ1, boundsIn, changedBlocks);
                    this.leafs(worldIn, posX1 + 1, posy2 + 2, posZ1, boundsIn, changedBlocks);
                    this.leafs(worldIn, posX1 + 1, posy2 + 2, posZ1 + 1, boundsIn, changedBlocks);
                    this.leafs(worldIn, posX1, posy2 + 2, posy2 + 1, boundsIn, changedBlocks);}

            }
            //Layer2
            /*for(int k3 = -1; k3 <= 10; ++k3) { //Changes X
                for(int j4 = -3; j4 <= 10; ++j4) { //Changes Z
                    if ((k3 != -3 || j4 != -3) && (k3 != -3 || j4 != 4) && (k3 != 4 || j4 != -3) && (k3 != 4 || j4 != 4) && (Math.abs(k3) < 3 || Math.abs(j4) < 3)) {
                        this.leafs(worldIn, posX + 2, posY, posZ + 2, boundsIn, changedBlocks);*/
                    }


        return true;
    }
                private void treelog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
                    if (func_214587_a(reader, pos)) {
                        this.setLogState(setlogblock, reader, pos, LOG, boundingBox);
                    }

                }
                //Leaves Placement
                private void leafs(IWorldGenerationReader reader, int p_214617_2_, int p_214617_3_, int p_214617_4_, MutableBoundingBox p_214617_5_, Set<BlockPos> p_214617_6_) {
                    BlockPos blockpos = new BlockPos(p_214617_2_, p_214617_3_, p_214617_4_);
                    if (isAir(reader, blockpos)) {
                        this.setLogState(p_214617_6_, reader, blockpos, LEAVES, p_214617_5_);
                    }

                }
            }