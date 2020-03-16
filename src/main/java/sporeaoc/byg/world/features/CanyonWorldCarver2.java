//package sporeaoc.sporeaoc.byg.world.features;
//
//import net.minecraft.world.gen.carver.WorldCarver;
//import net.minecraft.world.gen.feature.ProbabilityConfig;
//
//import java.awt.*;
//
//
//public class CanyonWorldCarver2 extends WorldCarver<ProbabilityConfig> {
//   private final double x;
//   private final double z;
//
//   /**
//    * Creates a point at location (x, y, z).
//    *
//    * @param x
//    *            the x coordinate of the point.
//    * @param z
//    *            the z coordinate of the point.
//    */
//   private Point(double x, double z) {
//      super();
//      this.x = x;
//      this.z = z;
//   }
//
//   public CanyonWorldCarver2(double x) {
//      this.x = x;
//   }
//
//   /**
//    * Provides a fast distance calculation between two points. This is done by
//    * not taking the square root of the result.
//    *
//    * @param other
//    *            the coordinate to calculate distance to.
//    * @return the distance between this point and the provided point.
//    */
//   public double distanceSquared(Point other) {
//      double x2 = x - other.x;
//      double z2 = z - other.z;
//      return x2 * x2 + z2 * z2;
//   }
//}
//
//   private static int floor(double n) {
//      return n > 0 ? (int) n : (int) n - 1;
//   }
//
//   private static double frac(double n) {
//      return n >= 0 ? n - (int) (n) : frac(-n);
//   }
//
//   /**
//    * Checks all voxels near the origin for the closest point to the origin.
//    * The returned value will be the distance to the closest point.
//    */
//   private static double minimumDistance(XorShift.Instance r, Point origin) {
//      // hack, but easier than handling points that are exactly at negative
//      // integer latice-points correctly.
//      Point p = new Point(origin.x + 1e-7,  origin.z + 1e-7);
//      // get the coordinate that this point resides at
//      int x = floor(p.x);
////		int y = floor(p.y);
//      int z = floor(p.z);
//      // create storage to track lowest values
//      double s = Double.MAX_VALUE;
//      // first check voxel the point is in
//      s = processVoxel(r, p, s, x, z);
//      // check each of the voxels that share a face with the
//      // point's voxel, if they're close enough to possibly
//      // make a difference
//      // squared distance to the voxel in the +x direction
//      double dpx2 = p.x >= 0. ? square(1.0 - frac(p.x)) : square(frac(p.x));
//      if(dpx2 < s) {
//         s = processVoxel(r, p, s, x + 1, z);
//      }
//      // -x
//      double dnx2 = p.x >= 0. ? square(frac(p.x)) : square(1. - frac(p.x));
//      if(dnx2 < s) {
//         s = processVoxel(r, p, s, x - 1, z);
//      }
//
//      //We can safely ignore the y value, improving the performance
//
////		// +y
////		double dpy2 = p.y >= 0. ? square(1. - frac(p.y)) : square(frac(p.y));
////		if(dpy2 < s) {
////			s = processVoxel(r, p, s, x, y + 1, z);
////		}
////		// -y
////		double dny2 = p.y >= 0. ? square(frac(p.y)) : square(1. - frac(p.y));
////		if(dny2 < s) {
////			s = processVoxel(r, p, s, x, y - 1, z);
////		}
//
//      // +z
//      double dpz2 = p.z >= 0. ? square(1. - frac(p.z)) : square(frac(p.z));
//      if(dpz2 < s) {
//         s = processVoxel(r, p, s, x, z + 1);
//      }
//      // -z
//      double dnz2 = p.z >= 0. ? square(frac(p.z)) : square(1. - frac(p.z));
//      if(dnz2 < s) {
//         s = processVoxel(r, p, s, x, z - 1);
//      }
//      // finally check the remaining adjacent voxels
//      for(int i = -1; i <= 1; ++i) {
////			for(int j = -1; j <= 1; ++j) {
//         for(int k = -1; k <= 1; ++k) {
//            // don't check the ones we already did above
//            if(Noise.fastAbs(i) + /*Math.abs(j)*/ + Noise.fastAbs(k) <= 1) {
//               continue;
//            }
//            // find squared distance to voxel
//            double vd2 = 0;
//            if(i < 0)
//               vd2 += dnx2;
//            else if(i > 0)
//               vd2 += dpx2;
////					if(j < 0)
////						vd2 += dny2;
////					else if(j > 0)
////						vd2 += dpy2;
//            if(k < 0)
//               vd2 += dnz2;
//            else if(k > 0)
//               vd2 += dpz2;
//            // and check it if it's close enough to matter
//            if(vd2 < s)
//            {
//               s = processVoxel(r, p, s, x + i, z + k);
//            }
//         }
////			}
//      }
//      // provide minimum. be sure to square root it to get the
//      // true distance.
//
//      return fastSqrt(s);
//   }
//
//   /**
//    * Processes a voxel and calculates the distances of the points within
//    * against the provided point. It also tracks the progress of the lowest
//    * values yet discovered.
//    *
//    * @param r
//    *            the random number generator.
//    * @param p
//    *            the point that the locations within this voxel will be tested
//    *            against.
//    * @param s
//    *            the storage that tracks the lowest values currently
//    *            encountered.
//    * @param x
//    *            the x coordinate of the voxel.
//    * @param z
//    *            the z coordinate of the voxel.
//    * @return the closest distance of the points within the voxel to the
//    *         provided point.
//    */
//   private static double processVoxel(XorShift.Instance r, Point p, double s, int x, int z) {
//      // reset random number generator for the voxel
//      r.setSeed(x, z);
//      // each voxel always has one point
////		Point created = new Point(
////				x + r.nextDouble(),
////				y + r.nextDouble(),
////				z + r.nextDouble());
//      Point created = new Point(
//              x + r.nextDouble(),
//              z + r.nextDouble());
//      // determine the distance between the generated point
//      // and the source point we're checking.
//      double distance = p.distanceSquared(created);
//      // add distance if it is lowest
//      return Math.min(distance, s);
//   }
//
//   private static double square(double n) {
//      return n * n;
//   }
//
//   private final XorShift randomFactory;
//
//   public WorleyNoise(long seed) {
//      super(seed);
//      randomFactory = XorShift.create(seed);
//   }
//
//   /**
//    * Gets the noise value at the provided location.
//    *
//    * @param x
//    *            the x coordinate.
//    * @param y
//    *            the y coordinate.
//    * @param z
//    *            the z coordinate.
//    * @return the noise value at the coordinate.
//    */
//   private double noise(double x, double y, double z) {
//      return minimumDistance(randomFactory.getInstance(), new Point(x, z));
//   }
//
//   @Override
//   public double sample(double x, double z) {
//      return noise(x, 0, z);
//   }
//
//   @Override
//   public double sample(double x, double y, double z) {
//      return noise(x, y, z);
//   }
//
//   @Override
//   public int implementedFunctions() {
//      return NoiseImplementation.NOISE_2D;
//   }
//}