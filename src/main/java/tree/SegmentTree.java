package tree;

import java.util.Arrays;

/**
 * used for range query problem type: what is the minimum value in a certain range of an array? what
 * is the maximum value in a certain range of an array? what is the sum of a certain range of an
 * array? this type of problems can be solved using segment tree
 */
public class SegmentTree {
  public static void main(String[] args) {
    //
    System.out.println(".............Test...........");
    int[] input = {-1, 3, 4, 8, 2, 1, 0, 9};
    int arrLength = input.length;
    int segTreeSizeParameter = nextPowerOfTwo(arrLength);
    int segTreeSize = segTreeSizeParameter * 2 - 1;
    int[] segTree = new int[segTreeSize];
    Arrays.fill(segTree, Integer.MAX_VALUE);
    constructSegTree(input, segTree, 0, arrLength - 1, 0);

    // test
    int result = rangeMinQuery(segTree, 1, 4, 0, 7, 0);

    System.out.println("Array: " + Arrays.toString(input));
    System.out.println("Segment Tree: " + Arrays.toString(segTree));
    System.out.println("Minimum value in the range: " + result);
  }

  /**
   * Construct segment tree
   *
   * @param input
   * @param segTree
   * @param low
   * @param high
   * @param pos
   */
  public static void constructSegTree(int[] input, int[] segTree, int low, int high, int pos) {
    if (low == high) {
      segTree[pos] = input[low];
      return;
    }

    int mid = (low + high) / 2;
    constructSegTree(input, segTree, low, mid, pos * 2 + 1);
    constructSegTree(input, segTree, mid + 1, high, pos * 2 + 2);

    segTree[pos] = Math.min(segTree[pos * 2 + 1], segTree[2 * pos + 2]);
  }

  /**
   * perform query using segment tree
   *
   * @param segTree
   * @param qLow
   * @param qHigh
   * @param low
   * @param high
   * @param pos
   * @return int result
   */
  public static int rangeMinQuery(int[] segTree, int qLow, int qHigh, int low, int high, int pos) {
    if (qLow <= low && qHigh >= high) {
      return segTree[pos];
    }

    if (high < qLow || low > qHigh) {
      return Integer.MAX_VALUE;
    }

    int mid = (low + high) / 2;

    return Math.min(
        rangeMinQuery(segTree, qLow, qHigh, low, mid, pos * 2 + 1),
        rangeMinQuery(segTree, qLow, qHigh, mid + 1, high, pos * 2 + 2));
  }

  /**
   * calculate next power of two
   *
   * @param n input
   * @return next power of 2
   */
  static int nextPowerOfTwo(int n) {
    int power = 1;
    while (power < n) {
      power = power * 2;
    }
    return power;
  }
}
