package leetcode;

public class ReverseBits_190 {
  public static void main(String[] args) {
    //
    System.out.println(reverseBits(11));
  }

  public static int reverseBits(int n) {
    int ans = 0;
    final int mask = 1;
    for (int i = 0; i < 32; i++) {
      ans = ans << 1;
      ans = ans + (n & mask);
      n = n >> 1;
    }

    return ans;
  }
}
