package leetcode;

public class MissingNumber_268 {
  public static void main(String[] args) {
    //
    int[] input = {9, 6, 4, 2, 3, 5, 7, 0, 1};
    // int[] input = {0};
    System.out.println(missingNumber(input));
  }

  public static int missingNumber(int[] nums) {
    int sum = 0;
    int n = nums.length;

    for (int x : nums) {
      sum += x;
    }

    int expectedSum = (n * (n + 1)) / 2;

    return expectedSum - sum;
  }
}
