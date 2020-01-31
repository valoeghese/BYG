package sporeaoc.byg.world.tree.taiga;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
public class SeasonalTallTaigaTree extends AbstractTreeFeature<NoFeatureConfig> {
    //Blocks used for the tree.
    private static final BlockState LOG = Blocks.SPRUCE_LOG.getDefaultState();
    private static final BlockState LEAVES = BlockCatalogs.ORANGE_SPRUCE_LEAVES.getDefaultState();
    private static final BlockState LEAVES3 = BlockCatalogs.RED_SPRUCE_LEAVES.getDefaultState();

    public SeasonalTallTaigaTree(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn) {
        super(configIn, doBlockNotifyIn);
        //setSapling((net.minecraftforge.common.IPlantable) Blocks.DARK_OAK_SAPLING);
    }

    public SeasonalTallTaigaTree() {
        super(null, true);
    }

        protected static boolean canTreeReplace(IWorldGenerationBaseReader genBaseReader, BlockPos blockPos) {
            return func_214587_a(
                    genBaseReader, blockPos
            );
        }

public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        //This sets heights for trees. Rand.nextint allows for tree height randomization. The final int value sets the minimum for tree Height.
        int randTreeHeight = rand.nextInt(2) + rand.nextInt(3) + 12;
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
                this.setDirtAt(worldIn, blockpos, position);

                Direction direction = Direction.Plane.HORIZONTAL.random(rand);
                int randTreeHeight2 = randTreeHeight - rand.nextInt(1);//Crashes on 0.
                int posY1 = 2 - rand.nextInt(1);//Crashes on 0.
                int posX1 = posX;
                int posZ1 = posZ;
                int topTrunkHeight = posY + randTreeHeight - 1;

                for (int groundUpLogRemover = 0; groundUpLogRemover < randTreeHeight; ++groundUpLogRemover) {
                    if (groundUpLogRemover >= randTreeHeight2 && posY1 < 0) { //Unknown
                        posX1 += direction.getXOffset();
                        posZ1 += direction.getZOffset();
                        ++posY1;
                    }
                    //This Int is responsible for the Y coordinate of the trunk BlockPos'.
                    int logplacer = posY + groundUpLogRemover;
                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);

                    if (isAirOrLeaves(worldIn, blockpos1)) {
                        this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                    }
                }
                int leaveColor = rand.nextInt(2) + 1;



                if (leaveColor == 1) {
                    int leavessquarespos = rand.nextInt(1) + 1;
                    for (int posXLeafWidth = (leavessquarespos * -1); posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                        for (int posZLeafWidthL0 = (leavessquarespos * -1); posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                            this.leafs(worldIn, posX1, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 2, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                        }
                    }
                }
                else if (leaveColor == 2) {
                    int leavessquarespos = rand.nextInt(1) + 1;
                    for (int posXLeafWidth = (leavessquarespos * -1); posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                        for (int posZLeafWidthL0 = (leavessquarespos * -1); posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                            this.leafs3(worldIn, posX1, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 - 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 - 1, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 + 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 + 1, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight - 2, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                            this.leafs3(worldIn, posX1, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);                        }
                    }
                }
            }
        }
        return true;
        //}
    }


    private boolean doesTreeFit(IWorldGenerationBaseReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        MutableBlockPos position = new MutableBlockPos();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 4;
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

    private void leafs3(IWorldGenerationReader reader, int x, int y, int z, MutableBoundingBox boundingBox, Set<BlockPos> blockPos) {
        BlockPos blockpos = new BlockPos(x, y, z);
        if (isAir(reader, blockpos)) {
            this.setLogState(blockPos, reader, blockpos, LEAVES3, boundingBox);
        }

    }
}