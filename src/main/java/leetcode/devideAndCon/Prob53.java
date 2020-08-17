package leetcode.devideAndCon;

public class Prob53 {
  public static void main(String[] args) {
    int[] input = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    int out = maxSubArray(input);
    System.out.println(out);
  }

  public static int maxSubArray(int[] nums) {
    return rec(nums, 0, nums.length - 1);
  }

  public static int rec(int[] nums, int left, int right) {
    // System.out.println(left + "  " + right + " ");
    if (left == right) return nums[left];

    int mid = (left + right) / 2;

    int l = rec(nums, left, mid);
    int r = rec(nums, mid + 1, right);
    int cross = cross(nums, left, right, mid);

    return Math.max(l, Math.max(r, cross));
  }

  public static int cross(int[] nums, int left, int right, int mid) {
    // System.out.println(left + "  " + right + " " + mid);
    if (left == right) return nums[left];

    int lSum = Integer.MIN_VALUE;
    int cSum = 0;
    for (int i = mid; i >= left; i--) {
      cSum += nums[i];
      lSum = Math.max(lSum, cSum);
      // System.out.println(cSum + "   " + lSum);
    }

    int rSum = Integer.MIN_VALUE;
    cSum = 0;
    for (int i = mid + 1; i <= right; i++) {
      cSum += nums[i];
      rSum = Math.max(rSum, cSum);
    }

    //    for (int i = left; i <= right; i++) {
    //      System.out.print(nums[i] + " ");
    //    }
    //    System.out.println("  , sum:" + (lSum + rSum) + "   lSum:" + lSum + "   rSum:" + rSum);
    return lSum + rSum;
  }
}
