package sporeaoc.byg.world.feature.tree.tropicalrainforest;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.state.BooleanProperty;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import sporeaoc.byg.byglists.BYGBlockList;
import sporeaoc.byg.world.feature.tree.util.BYGAbstractTreeFeature;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

//THIS FEATURE MUST BE REGISTERED & ADDED TO A BIOME!
public class TropicalRainForestTree extends BYGAbstractTreeFeature<NoFeatureConfig> {
    //Blocks used for the tree.
    private static final BlockState LOG = BYGBlockList.MAHOGANY_LOG.getDefaultState();
    private static final BlockState LEAVES = BYGBlockList.MAHOGANY_LEAVES.getDefaultState();
    private static final BlockState BEENEST = Blocks.BEE_NEST.getDefaultState();

    public TropicalRainForestTree(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn, int beeHiveChance) {
        super(configIn, doBlockNotifyIn, beeHiveChance);
        setSapling((net.minecraftforge.common.IPlantable) BYGBlockList.MAHOGANY_SAPLING);
    }

    protected static boolean canTreePlace(IWorldGenerationBaseReader genBaseReader, BlockPos blockPos) {
        return func_214587_a(
                genBaseReader, blockPos
        );
    }

    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        //This sets heights for trees. Rand.nextint allows for tree height randomization. The final int value sets the minimum for tree Height.
        int randTreeHeight = rand.nextInt(3) + rand.nextInt(3) + 8;
        //Positions
        int posX = position.getX();
        int posY = position.getY();
        int posZ = position.getZ();
        if (posY >= 1 && posY + randTreeHeight + 1 < 256) {
            BlockPos checkGround = position.down();
            if (!isSoil(worldIn, checkGround, getSapling())) {
                return false;
            } else if (!this.doesTreeFit(worldIn, position, randTreeHeight)) {
                return false;
            } else {
                this.setDirtAt(worldIn, checkGround, position);


                Direction direction = Direction.Plane.HORIZONTAL.random(rand);
                int randTreeHeight2 = randTreeHeight - rand.nextInt(1);//Crashes on 0.
                int posY1 = 2 - rand.nextInt(1);//Crashes on 0.
                int posX1 = posX;
                int posZ1 = posZ;
                int topTrunkHeight = posY + randTreeHeight - 1;

                //Raising the 'groundUpLogRemover'  will remove all log blocks from the ground up no matter how thick the trunk is based on the value given. 5 would destroy all trunks from 5 up off the ground.
                for (int groundUpLogRemover = 0; groundUpLogRemover < randTreeHeight; ++groundUpLogRemover) {
                    if (groundUpLogRemover >= randTreeHeight2 && posY1 < 0) { //Unknown
                        posX1 += direction.getXOffset();
                        posZ1 += direction.getZOffset();
                        ++posY1;
                    }
                    int logplacer = posY + groundUpLogRemover;
                    int logplacer1 = posY + randTreeHeight;
                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);
                    BlockPos blockpos2 = new BlockPos(posX1, logplacer1, posZ1);
                    this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.west(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.east(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.north(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.south(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.west().up(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.east().up(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.north().up(), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.south().up(), boundsIn);
//                    this.treelog(changedBlocks, worldIn, blockpos2.west(2).up(1), boundsIn);
//                    this.treelog(changedBlocks, worldIn, blockpos2.east(2).up(1), boundsIn);
//                    this.treelog(changedBlocks, worldIn, blockpos2.north(2).up(1), boundsIn);
//                    this.treelog(changedBlocks, worldIn, blockpos2.south(2).up(1), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.west(2).up(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.east(2).up(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.north(2).up(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.south(2).up(2), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.west(2).up(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.east(2).up(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.north(2).up(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.south(2).up(3), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.west(2).up(4), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.east(2).up(4), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.north(2).up(4), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.south(2).up(4), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.west(2).up(5), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.east(2).up(5), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.north(2).up(5), boundsIn);
                    this.treelog(changedBlocks, worldIn, blockpos2.south(2).up(5), boundsIn);
                }
                int leavePreset = 1;
                {
                    if (leavePreset == 1) {
                        int leavessquarespos = 1;
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + 5, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 3, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0), boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 3, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0), boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth), topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) + 3, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth), topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) - 3, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 3, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 3, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 2, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) + 3, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 2, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) - 3, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 3, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 3, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 2, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) + 3, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 2, topTrunkHeight + 5, (posZ1 + posZLeafWidthL0) - 3, boundsIn, changedBlocks);


                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + 6, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 2, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0), boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 2, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0), boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth), topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth), topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 1, topTrunkHeight + 6, (posZ1 + posZLeafWidthL0) - 1, boundsIn, changedBlocks);


                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + 7, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) - 1, topTrunkHeight + 7, (posZ1 + posZLeafWidthL0), boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth) + 1, topTrunkHeight + 7, (posZ1 + posZLeafWidthL0), boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth), topTrunkHeight + 7, (posZ1 + posZLeafWidthL0) + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, (posX1 + posXLeafWidth), topTrunkHeight + 7, (posZ1 + posZLeafWidthL0) - 1, boundsIn, changedBlocks);


                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + 8, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);


//                                this.leafs(worldIn, posX1, topTrunkHeight + 9, posZ1, boundsIn, changedBlocks);
//                                this.leafs(worldIn, posX1 - 1, topTrunkHeight + 9, posZ1, boundsIn, changedBlocks);
//                                this.leafs(worldIn, posX1 + 1, topTrunkHeight + 9, posZ1, boundsIn, changedBlocks);
//                                this.leafs(worldIn, posX1, topTrunkHeight + 9, posZ1 - 1, boundsIn, changedBlocks);
//                                this.leafs(worldIn, posX1, topTrunkHeight + 9, posZ1 + 1, boundsIn, changedBlocks);
                            }
                        }
                    } else if (leavePreset == 2) {
                        int leavessquarespos = rand.nextInt(1) + 1;
                        for (int posXLeafWidth = (leavessquarespos * -1); posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = (leavessquarespos * -1); posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + 6, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            }
                        }
                    } else if (leavePreset == 3) {
                        int leavessquarespos = rand.nextInt(1) + 1;
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {

                            }
                        }
                    }
                }
            }

            return true;
            //}
        } else {
            return false;
        }
    }

    private boolean doesTreeFit(IWorldGenerationBaseReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable position = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 0;

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canTreePlace(reader, position.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //Log Placement
    private void treelog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canTreePlace(reader, pos)) {
            this.setLogState(setlogblock, reader, pos, LOG, boundingBox);
        }

    }

    //Leaves Placement
    private void leafs(IWorldGenerationReader reader, int x, int y, int z, MutableBoundingBox boundingBox, Set<BlockPos> blockPos) {
        BlockPos leafpos = new BlockPos(x, y, z);
        if (isAir(reader, leafpos)) {
            this.setLogState(blockPos, reader, leafpos, LEAVES, boundingBox);
        }

    }

    private void tryPlaceVines(IWorldGenerationReader worldIn, Random random, BlockPos pos, BooleanProperty sideProperty) {
        if (random.nextInt(3) > 0 && isAir(worldIn, pos)) {
            this.setBlockState(worldIn, pos, Blocks.VINE.getDefaultState().with(sideProperty, Boolean.valueOf(true)));
        }

    }
}