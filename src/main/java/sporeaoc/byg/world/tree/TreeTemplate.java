package sporeaoc.byg.world.tree;

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

import java.util.Random;
import java.util.Set;
import java.util.function.Function;

import static net.minecraft.util.math.BlockPos.MutableBlockPos;

//THIS FEATURE MUST BE REGISTERED & ADDED TO A BIOME!
public class TreeTemplate extends AbstractTreeFeature<NoFeatureConfig> {
    //Blocks used for the tree.
    private static final BlockState LOG = Blocks.OAK_LOG.getDefaultState();
    private static final BlockState LEAVES = Blocks.OAK_LEAVES.getDefaultState();

    public TreeTemplate(Function<Dynamic<?>, ? extends NoFeatureConfig> configIn, boolean doBlockNotifyIn) {
        super(configIn, doBlockNotifyIn);
        //setSapling((net.minecraftforge.common.IPlantable) Blocks.DARK_OAK_SAPLING);
    }

    public TreeTemplate() {
        super(null, true);
    }

    public boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos position, MutableBoundingBox boundsIn) {
        //This sets heights for trees. Rand.nextint allows for tree height randomization. The final int value sets the minimum for tree Height.
        int randTreeHeight = rand.nextInt(3) + rand.nextInt(3) + 10;
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
                    //This Int is responsible for the Y coordinate of the trunk BlockPos'.
                    int logplacer = posY + groundUpLogRemover;
                    BlockPos blockpos1 = new BlockPos(posX1, logplacer, posZ1);
                    //These BlockPos' allow you to make trunks thicker than 2x2,
                    BlockPos blockposwest1 = new BlockPos(posX1 - 1, logplacer, posZ1);
                    BlockPos blockposnorth1 = new BlockPos(posX1, logplacer, posZ1 - 1);
                    BlockPos blockposnorthwest1 = new BlockPos(posX1 - 1, logplacer, posZ1 - 1);


                    //Sets Logs
                    if (isAirOrLeaves(worldIn, blockpos1)) {
                        this.treelog(changedBlocks, worldIn, blockpos1, boundsIn);
                        //Uncommenting this will create a 2x2 tree trunk.
                        /*this.treelog(changedBlocks, worldIn, blockpos1.south(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.south().east(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.east(), boundsIn);*/
                        //Uncommenting this will create a 3x3 tree trunk.
                        /*this.treelog(changedBlocks, worldIn, blockpos1.west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.south().west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.north(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.north().east(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockpos1.north().west(), boundsIn);*/
                        //Uncommenting this will create a 4x4 tree trunk.
                        /*this.treelog(changedBlocks, worldIn, blockposwest1, boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposwest1.west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposwest1.north().west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposwest1.south().west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposnorth1, boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposnorth1.north().west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposnorth1.north(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposnorth1.north().east(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposnorth1.west(), boundsIn);
                        this.treelog(changedBlocks, worldIn, blockposnorthwest1.north().west(), boundsIn);*/
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
                                //int leaveheight = 0;//0 lines it up with top log
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                            }
                        }
                    } else if (leavePreset == 2) {
                        int leavessquarespos = rand.nextInt(1) + 1;
                        for (int posXLeafWidth = (leavessquarespos * -1); posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = (leavessquarespos * -1); posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                                //int leaveheight = 0;// '0' lines it up with top log. This shouldn't be necessary.

                                //Places your square leaves.
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight + 6, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);


                                //Places your individual leave blocks by hand. 1 at a time.
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                            }
                        }
                    }
                    //This is the Tree Maker in action. This would be tree leave Preset 3. I'd suggest commenting this out! SHOULD BE USED ONLY ON 1x1 TREE TRUNKS!
                    else if (leavePreset == 3) {
                        int leavessquarespos = rand.nextInt(1) + 1;
                        for (int posXLeafWidth = -leavessquarespos; posXLeafWidth <= leavessquarespos; ++posXLeafWidth) {//has to do with leaves
                            for (int posZLeafWidthL0 = -leavessquarespos; posZLeafWidthL0 <= leavessquarespos; ++posZLeafWidthL0) {
                                //int leaveheight = 0;//0 lines it up with top log
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight - 6, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight - 5, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight - 4, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);

                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight - 3, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight - 2, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + posXLeafWidth, topTrunkHeight - 1, posZ1 + posZLeafWidthL0, boundsIn, changedBlocks);

                                //Y + 0
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight, posZ1, boundsIn, changedBlocks);

                                this.leafs(worldIn, posX1, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight, posZ1 + 2, boundsIn, changedBlocks);


                                this.leafs(worldIn, posX1 + 1, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight, posZ1 + 1, boundsIn, changedBlocks);

                                //Y=-1
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight - 1, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight - 1, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight - 1, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight - 1, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight - 1, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 1, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight - 1, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight - 1, posZ1 + 1, boundsIn, changedBlocks);

                                //Y=-2
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight - 2, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight - 2, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 2, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 2, posZ1 + 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 2, posZ1 - 2, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 2, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 2, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight - 2, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 2, topTrunkHeight - 2, posZ1 + 1, boundsIn, changedBlocks);

                                int leaveyroundness = rand.nextInt(3) + 1;
                                {
                                    if (leaveyroundness == 1) {
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                                    } else if (leaveyroundness == 2) {
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 4, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 4, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 4, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 4, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 4, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 4, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 4, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 4, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 4, posZ1 + 1, boundsIn, changedBlocks);
                                    } else if (leaveyroundness == 3) {
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 3, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 3, posZ1 + 1, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 4, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 4, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 4, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 4, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 4, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 4, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 4, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 4, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 4, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 4, posZ1 + 1, boundsIn, changedBlocks);

                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 5, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 5, posZ1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 5, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1, topTrunkHeight - 5, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 5, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 5, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 1, topTrunkHeight - 5, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 5, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 5, posZ1 + 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 5, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 1, topTrunkHeight - 5, posZ1 - 2, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 5, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 + 2, topTrunkHeight - 5, posZ1 + 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 5, posZ1 - 1, boundsIn, changedBlocks);
                                        this.leafs(worldIn, posX1 - 2, topTrunkHeight - 5, posZ1 + 1, boundsIn, changedBlocks);
                                    }
                                }


                                //Leave Layer On Top of Top Trunk Block Y + 1
                                this.leafs(worldIn, posX1, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight + 1, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight + 1, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight + 1, posZ1 + 1, boundsIn, changedBlocks);

                                //Leave Layer Trunk Y+2
                                this.leafs(worldIn, posX1, topTrunkHeight + 2, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight + 2, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight + 2, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight + 2, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight + 2, posZ1 + 1, boundsIn, changedBlocks);

                                //Leave Layer Trunk Y-4
                                this.leafs(worldIn, posX1 - 1, topTrunkHeight - 7, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1 + 1, topTrunkHeight - 7, posZ1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight - 7, posZ1 - 1, boundsIn, changedBlocks);
                                this.leafs(worldIn, posX1, topTrunkHeight - 7, posZ1 + 1, boundsIn, changedBlocks);
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