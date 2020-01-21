package sporeaoc.byg.world.tree;

/*
//Copied and pasted traverse(MIT Licenses) tree to understand tree creation logic. Will not use in final code. May use the layout.
public class MyFirstTree extends AbstractTreeFeature<NoFeatureConfig> {
    private int minHeight;
    private static BlockState LOG = BlockCatalogs.FIR_LOG.getDefaultState();
    private static BlockState LEAVES = BlockCatalogs.FIR_LEAVES.getDefaultState();

    public MyFirstTree(final Function<Dynamic<?>, ? extends NoFeatureConfig> function, final boolean worldGen) {
        this(function, worldGen, 100);
    }

    public MyFirstTree(final Function<Dynamic<?>, ? extends NoFeatureConfig> function, final boolean worldGen, int minHeight) {
        this(function, worldGen, minHeight, BlockCatalogs.FIR_LOG.getDefaultState(), BlockCatalogs.FIR_LEAVES.getDefaultState());
    }

    public MyFirstTree(final Function<Dynamic<?>, ? extends NoFeatureConfig> function, final boolean worldGen, int minHeight, BlockState log, BlockState leaves) {
        super(function, worldGen);
        this.minHeight = minHeight;
        this.LOG = log;
        this.LEAVES = leaves;
    }

    @Override
    protected boolean place(Set<BlockPos> blocks, IWorldGenerationReader world, Random random, BlockPos pos, MutableBoundingBox box) {
        int height = random.nextInt(15) + minHeight;
        int logHeight = 4 + random.nextInt(2);
        int leavesHeight = height - logHeight;
        int l = 2 + random.nextInt(7);
        boolean canGenerate = true;

        if (pos.getY() >= 1 && pos.getY() + height + 1 <= 256) {
            for (int i1 = pos.getY(); i1 <= pos.getY() + 1 + height && canGenerate; ++i1) {
                int j1;

                if (i1 - pos.getY() < logHeight) {
                    j1 = 0;
                } else {
                    j1 = l;
                }

                BlockPos.MutableBlockPos checkPos = new BlockPos.MutableBlockPos();

                for (int k1 = pos.getX() - j1; k1 <= pos.getX() + j1 && canGenerate; ++k1) {
                    for (int l1 = pos.getZ() - j1; l1 <= pos.getZ() + j1 && canGenerate; ++l1) {
                        if (i1 >= 0 && i1 < 256) {
                            if (!func_214587_a(world, checkPos.setPos(k1, i1, l1))) {
                                canGenerate = false;
                            }
                        } else {
                            canGenerate = false;
                        }
                    }
                }
            }

            if (!canGenerate) {
                return false;
            } else if (isDirtOrGrassBlock(world, pos.down()) && pos.getY() < 256 - height - 1) {
                this.setDirtAt(world, pos.down(), pos);
                int i3 = random.nextInt(1); //Leave width on top layer
                int j3 = 1;
                int k3 = 1;

                for (int l3 = 0; l3 <= leavesHeight; ++l3) {
                    int leavesY = pos.getY() + height - l3;

                    for (int leavesX = pos.getX() - i3; leavesX <= pos.getX() + i3; ++leavesX) {
                        int j2 = leavesX - pos.getX();

                        for (int leavesZ = pos.getZ() - i3; leavesZ <= pos.getZ() + i3; ++leavesZ) {
                            int l2 = leavesZ - pos.getZ();

                            if (Math.abs(j2) != i3 || Math.abs(l2) != i3 || i3 <= 0) {
                                BlockPos leavesPos = new BlockPos(leavesX, leavesY, leavesZ);
                                if (isAirOrLeaves(world, leavesPos)) {
                                    setBlockState(world, leavesPos, LEAVES);
                                }
                            }
                        }
                    }

                    if (i3 >= j3) {
                        i3 = k3;
                        k3 = 1;
                        ++j3;

                        if (j3 > l) {
                            j3 = l;
                        }
                    } else {
                        ++i3;
                    }
                }

                int i4 = random.nextInt(7);

                for (int k4 = 0; k4 < height - i4; ++k4) {
                    if (isAirOrLeaves(world, pos.up(k4)) || func_214587_a(world, pos.up(k4))) {
                        this.setLogState(blocks, world, pos.up(k4), this.LOG, box);
                    }
                }
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public MyFirstTree() {
        super(null, true);
    }


}
*/