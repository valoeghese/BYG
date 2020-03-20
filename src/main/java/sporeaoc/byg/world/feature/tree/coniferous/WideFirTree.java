package sporeaoc.byg.world.feature.tree.coniferous;

import com.mojang.datafixers.Dynamic;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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

public class WideFirTree extends BYGAbstractTreeFeature<NoFeatureConfig> {
    //Blocks used for the tree.
    private static final BlockState LOG = BYGBlockList.FIR_LOG.getDefaultState();
    private static final BlockState LEAVES = BYGBlockList.FIR_LEAVES.getDefaultState();
    private static final BlockState BEENEST = Blocks.BEE_NEST.getDefaultState();

    public WideFirTree(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn, int beeHiveChance) {
        super(configIn, doBlockNotifyIn, beeHiveChance);
        setSapling((net.minecraftforge.common.IPlantable) BYGBlockList.FIR_SAPLING);

    }

    protected static boolean canTreePlace(IWorldGenerationBaseReader genBaseReader, BlockPos blockPos) {
        return func_214587_a(
                genBaseReader, blockPos
        );
    }

    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        //This sets heights for trees. Rand.nextint allows for tree height randomization. The final int value sets the minimum for tree Height.
        int randTreeHeight = rand.nextInt(6) + rand.nextInt(6) + 16;
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
                this.setDirtAt(worldIn, checkGround.west(), position);
                this.setDirtAt(worldIn, checkGround.west().south(), position);
                this.setDirtAt(worldIn, checkGround.south(), position);
                Direction direction = Direction.Plane.HORIZONTAL.random(rand);
                int randTreeHeight2 = randTreeHeight - rand.nextInt(1);//Crashes on 0.
                int posY2 = 2 - rand.nextInt(1);//Crashes on 0.
                int posX2 = posX;
                int posZ2 = posZ;
                int topTrunkHeight = posY + randTreeHeight - 1;

                for (int trunkBottom = 0; trunkBottom < randTreeHeight; ++trunkBottom) {
                    if (trunkBottom >= randTreeHeight2 && posY2 < 0) { //Unknown
                        posX2 += direction.getXOffset();
                        posZ2 += direction.getZOffset();
                        ++posY2;
                    }
                    int logplacer = posY + trunkBottom;


                    BlockPos trunkPos1 = new BlockPos(posX2, logplacer, posZ2);
                    this.treelog(changedBlocks, worldIn, trunkPos1, boundsIn);
                    this.treelog(changedBlocks, worldIn, trunkPos1.west(), boundsIn);
                    this.treelog(changedBlocks, worldIn, trunkPos1.south(), boundsIn);
                    this.treelog(changedBlocks, worldIn, trunkPos1.south().west(), boundsIn);

                }
                for (int posXLeafSize = 0; posXLeafSize <= 1; ++posXLeafSize) {
                    for (int posZLeafSize = 0; posZLeafSize <= 1; ++posZLeafSize) {
                        int posX3 = posX2 + posXLeafSize - 1;
                        int posZ3 = posZ2 + posZLeafSize;

                        this.leafs(worldIn, posX3, topTrunkHeight + 2, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight + 1, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight + 1, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight + 1, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight + 1, posZ3 + 1, boundsIn, changedBlocks);

                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 1, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 1, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 1, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 1, posZ3 + 1, boundsIn, changedBlocks);
                        
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 2, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 2, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 2, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 2, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 2, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 2, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 2, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 2, posZ3 - 1, boundsIn, changedBlocks);
                        
                        this.leafs(worldIn, posX3 + 3, topTrunkHeight - 3, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 3, topTrunkHeight - 3, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 3, posZ3 - 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 3, posZ3 + 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 3, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 3, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 3, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 3, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 3, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 3, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 3, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 3, posZ3 + 2, boundsIn, changedBlocks);

                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 4, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 4, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 4, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 4, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 4, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 4, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 4, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 4, posZ3 - 1, boundsIn, changedBlocks);

                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 5, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 5, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 5, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 5, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 5, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 5, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 5, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 5, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 5, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 5, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 5, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 5, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 3, topTrunkHeight - 5, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 3, topTrunkHeight - 5, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 3, topTrunkHeight - 5, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 3, topTrunkHeight - 5, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 5, posZ3 - 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 5, posZ3 + 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 5, posZ3 - 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 5, posZ3 + 3, boundsIn, changedBlocks);
                        
                        
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 6, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 6, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 6, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 6, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 6, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 6, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 6, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 6, posZ3 - 1, boundsIn, changedBlocks);
                        
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 7, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 7, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 7, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 7, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 3, topTrunkHeight - 7, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 3, topTrunkHeight - 7, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 7, posZ3 - 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 7, posZ3 + 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 3, topTrunkHeight - 7, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 3, topTrunkHeight - 7, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 7, posZ3 - 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 7, posZ3 + 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 3, topTrunkHeight - 7, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 3, topTrunkHeight - 7, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 7, posZ3 - 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 7, posZ3 + 3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 7, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 7, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 7, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 7, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 4, topTrunkHeight - 7, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 4, topTrunkHeight - 7, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 7, posZ3 - 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 7, posZ3 + 4, boundsIn, changedBlocks);

                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 8, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 8, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 8, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 8, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 8, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 8, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 8, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 8, posZ3 - 1, boundsIn, changedBlocks);
                        
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 9, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 9, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 9, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 9, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 9, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 9, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 9, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 9, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 4, topTrunkHeight - 9, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 4, topTrunkHeight - 9, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 9, posZ3 - 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 9, posZ3 + 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 4, topTrunkHeight - 9, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 4, topTrunkHeight - 9, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 9, posZ3 - 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 9, posZ3 + 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 4, topTrunkHeight - 9, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 4, topTrunkHeight - 9, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 9, posZ3 - 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 9, posZ3 + 4, boundsIn, changedBlocks);
                        
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 10, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 10, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 10, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 10, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 10, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 10, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 10, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 10, posZ3 - 1, boundsIn, changedBlocks);
                        
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 11, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 11, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 11, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 11, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 11, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 11, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 11, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 11, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 4, topTrunkHeight - 11, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 4, topTrunkHeight - 11, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 11, posZ3 - 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 11, posZ3 + 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 4, topTrunkHeight - 11, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 4, topTrunkHeight - 11, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 11, posZ3 - 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 11, posZ3 + 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 4, topTrunkHeight - 11, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 4, topTrunkHeight - 11, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 11, posZ3 - 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 11, posZ3 + 4, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 5, topTrunkHeight - 11, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 5, topTrunkHeight - 11, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 11, posZ3 - 5, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 11, posZ3 + 5, boundsIn, changedBlocks);

                        this.leafs(worldIn, posX3 + 2, topTrunkHeight - 12, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 2, topTrunkHeight - 12, posZ3, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 12, posZ3 - 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3, topTrunkHeight - 12, posZ3 + 2, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 12, posZ3 - 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 12, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 - 1, topTrunkHeight - 12, posZ3 + 1, boundsIn, changedBlocks);
                        this.leafs(worldIn, posX3 + 1, topTrunkHeight - 12, posZ3 - 1, boundsIn, changedBlocks);

                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    //This Method essentially checks whether or not our tree can generate
    private boolean doesTreeFit(IWorldGenerationBaseReader reader, BlockPos blockPos, int height) {
        int x = blockPos.getX();
        int y = blockPos.getY();
        int z = blockPos.getZ();
        BlockPos.Mutable position = new BlockPos.Mutable();

        for (int yOffset = 0; yOffset <= height + 1; ++yOffset) {
            //Distance/Density of trees. Positive Values ONLY
            int distance = 5;

            for (int xDistance = -distance; xDistance <= distance; ++xDistance) {
                for (int zDistance = -distance; zDistance <= distance; ++zDistance) {
                    if (!canTreePlace(reader, position.setPos(x + xDistance, y + yOffset, z + zDistance))) {
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

}