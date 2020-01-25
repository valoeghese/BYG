package sporeaoc.byg.world.tree;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.catalogs.BlockCatalogs;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

import static net.minecraft.util.math.BlockPos.*;

//Copied and Pasted Dark Oak to try and undertstand the logic and math for tree creation.
public class RealCypressTree extends AbstractTreeFeature<NoFeatureConfig> {
    private static final BlockState LOG = BlockCatalogs.CYPRESS_LOG.getDefaultState();
    private static final BlockState LEAVES = BlockCatalogs.CYPRESS_LEAVES.getDefaultState();

    public RealCypressTree(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn) {
        super(configIn, doBlockNotifyIn);
        //setSapling((net.minecraftforge.common.IPlantable) Blocks.DARK_OAK_SAPLING);
    }

    public RealCypressTree() {
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
            } else if (!this.func_214615_a(worldIn, position, randTreeHeight)) {
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

                for(int posX2 = 3; posX2 < randTreeHeight; ++posX2) {//raising this value will remove log blocks from the ground up.
                    if (posX2 >= random1 && posY1 > 0) { //Unknown
                        posX1 += direction.getXOffset();
                        posZ1 += direction.getZOffset();
                        --posY1;
                    }
                    int k2 = posY + posX2;
                    BlockPos blockpos1 = new BlockPos(posX1, k2, posZ1);
                    if (isAirOrLeaves(worldIn, blockpos1)) {
                        this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.east(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.south(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.north(), boundsIn);
                    }

                }

                /*&BlockPos pos1;
                for (int z = 0; randTreeHeight < 5; z++) {
                    pos1 = new BlockPos(z1, z2 - 1, z3);
                    z = (int) (z1 / 2.5);
                    this.setBlockState(worldIn, pos1.add(-z1, 0, 0), LOG);
                    this.setBlockState(worldIn, pos1.add(-z1, 0, -z3), LOG);
                    this.setBlockState(worldIn, pos1.add(z1, 0, -z3), LOG);
                    this.setBlockState(worldIn, pos1.add(z1, 0, -z3), LOG);
                    this.setBlockState(worldIn, pos1.add(z1, 0, 0), LOG);
                    this.setBlockState(worldIn, pos1.add(z1, 0, z3), LOG);
                    this.setBlockState(worldIn, pos1.add(0, 0, z3), LOG);
                    this.setBlockState(worldIn, pos1.add(-z1, 0, z3), LOG);
                }
                */
                for(int j3 = -2; j3 <= 0; ++j3) {//has to do with leaves
                    for(int i4 = -2; i4 <= 0; ++i4) {
                        int l4 = -100;//Unknown
                        this.leafs(worldIn, posX1 + j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);
                        this.leafs(worldIn, 1 + posX1 - j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX1 + j3, posy2 + l4, 1 + posZ1 - i4, boundsIn, changedBlocks);
                        this.leafs(worldIn, 1 + posX1 - j3, posy2 + l4, 1 + posZ1 - i4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX1 + j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);
                        this.leafs(worldIn, 1 + posX1 - j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);


                        if ((j3 > -2 || i4 > -1) && (j3 != -1 || i4 != -2)) {
                            l4 = 1;//sets leave height?
                            this.leafs(worldIn, posX1 + j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);
                            this.leafs(worldIn, 1 + posX1 - j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + j3, posy2 + l4, 1 + posZ1 - i4, boundsIn, changedBlocks);
                            this.leafs(worldIn, 1 + posX1 - j3, posy2 + l4, 1 + posZ1 - i4, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);
                            this.leafs(worldIn, 1 + posX1 - j3, posy2 + l4, posZ1 + i4, boundsIn, changedBlocks);




                        }
                    }
                }
                //Layer1
                if (rand.nextBoolean()) { //these are for the top 4 leaves on the top layer of the tree. these values change the x, y, and z values on them
                    this.leafs(worldIn, posX1, posy2 + 2, posZ1, boundsIn, changedBlocks);
                    this.leafs(worldIn, posX1 + 1, posy2 + 2, posZ1, boundsIn, changedBlocks);
                    this.leafs(worldIn, posX1 + 1, posy2 + 2, posZ1 + 1, boundsIn, changedBlocks);
                    this.leafs(worldIn, posX1, posy2 + 2, posZ1 + 1, boundsIn, changedBlocks);
                }
                    //Layer2
                for(int k3 = -1; k3 <= 4; ++k3) { //Changes X
                    for(int j4 = -3; j4 <= 4; ++j4) { //Changes Z
                        if ((k3 != -3 || j4 != -3) && (k3 != -3 || j4 != 4) && (k3 != 4 || j4 != -3) && (k3 != 4 || j4 != 4) && (Math.abs(k3) < 3 || Math.abs(j4) < 3)) {
                            this.leafs(worldIn, posX1 + k3, posy2, posZ1 + j4, boundsIn, changedBlocks);
                        }
                    }
                }
                //Layer
                for(int l3 = -1; l3 <= 2; ++l3) { //changes the X width of the top tree area
                    for(int k4 = -1; k4 <= 2; ++k4) { //changes the Z width of the top tree area
                        if ((l3 < 0 || l3 > 1 || k4 < 0 || k4 > 1) && rand.nextInt(3) <= 0) { //makes the tree increase upwards
                            int i5 = rand.nextInt(3) + 2; //makes the tree increase both upwards and downwards

                            /*for(int l2 = 0; l2 < i5; ++l2) { //does nothing
                                this.treelog(changedBlocks, worldIn, new BlockPos(posX + l3, posy2 - l2 - 2, posZ + k4), boundsIn); //creates Branches, number value of 2 or lower does nothing 5 seems to be a good value
                            }*/

                            /*for (int z2 = 5; z2 < i5;)
                                this.treelog(changedBlocks, worldIn, new BlockPos(j2 + l3, posy2 - z2 , posZ + k4), boundsIn); //creates Base, number value of 2 or lower does nothing 5 seems to be a good value
//LAYER 3 */
                            for(int j5 = -1; j5 <= 1; ++j5) { //changes the x width of the leaves on row 3
                                for(int i3 = -1; i3 <= 1; ++i3) { //changes the z width of the leaves on row 3
                                    this.leafs(worldIn, posX1 + l3 + j5, posy2, posZ1 + k4 + i3, boundsIn, changedBlocks);
                                }
                            }
//LAYER 4
                            for(int k5 = -2; k5 <= 2; ++k5) { //changes the X width of the leaves on row 4
                                for(int l5 = -2; l5 <= 2; ++l5) { //changes the Z width of the leaves on row 4
                                    if (Math.abs(k5) != 2 || Math.abs(l5) != 2) { //does nothing
                                        this.leafs(worldIn, posX1 + l3 + k5, posy2 - 1, posZ1 + k4 + l5, boundsIn, changedBlocks); //posy2 -1 apears to have no change on the tree
                                    }
                                }
                            }
                        }
                    }
                }

                return true;
            }
        } else {
            return false;
        }
    }
        //Tree Height Maybe?
    private boolean func_214615_a(IWorldGenerationBaseReader p_214615_1_, BlockPos p_214615_2_, int p_214615_3_) {
        int i = p_214615_2_.getX();
        int j = p_214615_2_.getY();
        int k = p_214615_2_.getZ();
        MutableBlockPos blockpos$mutableblockpos = new MutableBlockPos();

        for(int l = 0; l <= p_214615_3_ + 1; ++l) {
            int i1 = 1; //higher the value, lower the density of trees?
            if (l == 0) { //does nothing?
                i1 = 0; //higher the value, lower the density of trees?
            }

            if (l >= p_214615_3_ - 1) {
                i1 = 1; //higher the value, lower the density of trees?
            }

            for(int j1 = -i1; j1 <= i1; ++j1) {
                for(int k1 = -i1; k1 <= i1; ++k1) {
                    if (!func_214587_a(p_214615_1_, blockpos$mutableblockpos.setPos(i + j1, j + l, k + k1))) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
    //Log Placement
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
//