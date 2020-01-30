package sporeaoc.byg.world.tree.cypresstrees;

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

import static net.minecraft.util.math.BlockPos.MutableBlockPos;

//THIS FEATURE MUST BE REGISTERED & ADDED TO A BIOME!
public class HugeCypressTree extends AbstractTreeFeature<NoFeatureConfig> {
    //Blocks used for the tree.
    private static final BlockState LOG = BlockCatalogs.CYPRESS_LOG.getDefaultState();
    private static final BlockState LEAVES = BlockCatalogs.CYPRESS_LEAVES.getDefaultState();

    public HugeCypressTree(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn) {
        super(configIn, doBlockNotifyIn);
        //setSapling((net.minecraftforge.common.IPlantable) Blocks.DARK_OAK_SAPLING);
    }

    public HugeCypressTree() {
        super(null, true);
    }

    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        //This sets heights for trees. Rand.nextint allows for tree height randomization. The final int value sets the minimum for tree Height.
        int randTreeHeight = rand.nextInt(3) + rand.nextInt(3) + 20;
        //Positions
        int posX = position.getX();
        int posY = position.getY();
        int posZ = position.getZ();
        if (posY >= 1 && posY + randTreeHeight + 1 < 256) {
            BlockPos blockpos = position.down();
            if (!isSoil(worldIn, blockpos, getSapling())) {
                return false;
            } else if (!this.doesTreeFit(worldIn, position, randTreeHeight)) {
                return false;
            } else {
                //Places dirt under logs where/when necessary.
                this.setDirtAt(worldIn, blockpos, position);
                //Uncommenting this will allow for a 2x2 dirt patch under the tree.
                /*this.setDirtAt(worldIn, blockpos.east(), position);
                this.setDirtAt(worldIn, blockpos.south(), position);
                this.setDirtAt(worldIn, blockpos.south().east(), position);*/
                //Uncommenting this will allow for a 3x3 dirt patch under the tree.
                /*this.setDirtAt(worldIn, blockpos.west(), position);
                this.setDirtAt(worldIn, blockpos.south().west(), position);
                this.setDirtAt(worldIn, blockpos.north(), position);
                this.setDirtAt(worldIn, blockpos.north().east(), position);
                this.setDirtAt(worldIn, blockpos.north().west(), position);*/


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

                    int subtractedTreeHeight = rand.nextInt(2) + 9;
                    for (int treeHeightRemover = 5; treeHeightRemover < subtractedTreeHeight; ++treeHeightRemover) {//raising this value will remove log blocks from the ground up.
                        if (treeHeightRemover >= randTreeHeight2 && posY1 < 0) {
                            posX1 += direction.getXOffset();
                            posZ1 += direction.getZOffset();
                            ++posY1;
                        }

                        int subtractedTreeHeight2 = rand.nextInt(2) + 7;
                        for (int treeHeightRemover2 = 3; treeHeightRemover2 < subtractedTreeHeight2; ++treeHeightRemover2) {//raising this value will remove log blocks from the ground up.
                            if (treeHeightRemover2 >= randTreeHeight2 && posY1 < 0) { //Unknown
                                posX1 += direction.getXOffset();
                                posZ1 += direction.getZOffset();
                                ++posY1;
                            }
                            int subtractedTreeHeight3 = rand.nextInt(2) + 4;
                            for (int treeHeightRemover3 = 0; treeHeightRemover3 < subtractedTreeHeight3; ++treeHeightRemover3) {//raising this value will remove log blocks from the ground up.
                                if (treeHeightRemover3 >= randTreeHeight2 && posY1 < 0) { //Unknown
                                    posX1 += direction.getXOffset();
                                    posZ1 += direction.getZOffset();
                                    ++posY1;
                                }
                                int subtractedTreeHeight4 = rand.nextInt(1) + 2;
                                for (int treeHeightRemover4 = 0; treeHeightRemover4 < subtractedTreeHeight4; ++treeHeightRemover4) {//raising this value will remove log blocks from the ground up.
                                    if (treeHeightRemover3 >= randTreeHeight2 && posY1 < 0) { //Unknown
                                        posX1 += direction.getXOffset();
                                        posZ1 += direction.getZOffset();
                                        ++posY1;
                                    }


                                    //This Int is responsible for the Y coordinate of the trunk BlockPos'.
                                    int logplacer = posY + groundUpLogRemover;
                                    int logplacer2 = posY + treeHeightRemover;
                                    int logplacer3 = posY + treeHeightRemover2;
                                    int logplacer4 = posY + treeHeightRemover3;
                                    int logplacer5 = posY + treeHeightRemover4;
                                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);
                                    BlockPos blockpos2 = new BlockPos(posX1, logplacer2, posZ1);
                                    BlockPos blockpos3 = new BlockPos(posX1, logplacer3, posZ1);
                                    BlockPos blockpos4 = new BlockPos(posX1, logplacer4, posZ1);
                                    BlockPos blockpos5 = new BlockPos(posX1, logplacer5, posZ1);


                                    //Sets Logs
                                    //if (isAirOrLeaves(worldIn, blockpos1)) {
                                    this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos1.north(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos1.south(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos1.east(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos1.west(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos2.north(2), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos2.south(2), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos2.east(2), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos2.west(2), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos3.north(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos3.south(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos3.east(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos3.west(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos4.north(4), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos4.south(4), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos4.east(4), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos4.west(4), boundsIn);


                                    this.treelog(changedBlocks, worldIn, blockpos5.west(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.west(5), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.west(4).north(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.west(4).south(), boundsIn);

                                    this.treelog(changedBlocks, worldIn, blockpos5.east(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.east(5), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.east(4).north(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.east(4).south(), boundsIn);

                                    this.treelog(changedBlocks, worldIn, blockpos5.north(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.north(5), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.north(4).east(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.north(4).west(), boundsIn);

                                    this.treelog(changedBlocks, worldIn, blockpos5.south(3), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.south(5), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.south(4).east(), boundsIn);
                                    this.treelog(changedBlocks, worldIn, blockpos5.south(4).west(), boundsIn);
                                }
                            }
                        }
                    }
                }
                //This allows a random rotation between 3 differently leave Presets in the same class. Optimizes Performance instead of the loading of several classes.
                int leavePreset = rand.nextInt(3) + 1;
                {
                    if (leavePreset == 1) {
                        //This randomizer allows you to have randomly generating sized leave widths(X & Z). You can remove the randomizer and set your own value instead.
                        int leavessquarespos = rand.nextInt(1) + 1;
                        //This loads leaves in squares. Manually placing the squares can allow you to load in perfect squares.
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                            }
                        }
                    } else if (leavePreset == 2) {
                        int leavessquarespos = rand.nextInt(1) + 1;
                        for (int posXLeafWidth = (leavessquarespos * -1); posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = (leavessquarespos * -1); posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                            }
                        }
                    }
                    //This is the Tree Maker in action. This would be tree leave Preset 3. I'd suggest commenting this out! SHOULD BE USED ONLY ON 1x1 TREE TRUNKS!
                    else if (leavePreset == 3) {
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
        MutableBlockPos position = new MutableBlockPos();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 25;
            if (yOffset == -5) {
                distance = 0;
            }

            if (yOffset >= height - 1) {
                distance = 1;
            }

            for (int xOffset = -distance; xOffset <= distance; ++xOffset) {
                for (int zOffset = -distance; zOffset <= distance; ++zOffset) {
                    if (!canTreeReplace(reader, position.setPos(x + xOffset, y + yOffset, z + zOffset))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //Log Placement
    private void treelog(Set<BlockPos> setlogblock, IWorldGenerationReader reader, BlockPos pos, MutableBoundingBox boundingBox) {
        if (canTreeReplace(reader, pos)) {
            this.setLogState(setlogblock, reader, pos, LOG, boundingBox);
        }

    }

    //Leaves Placement
    private void leafs(IWorldGenerationReader reader, int x, int y, int z, MutableBoundingBox boundingBox, Set<BlockPos> blockPos) {
        BlockPos blockpos = new BlockPos(x, y, z);
        if (isAir(reader, blockpos)) {
            this.setLogState(blockPos, reader, blockpos, LEAVES, boundingBox);
        }

    }

    protected static boolean canTreeReplace(IWorldGenerationBaseReader genBaseReader, BlockPos blockPos) {
        return func_214587_a(
                genBaseReader, blockPos
        );
    }
}