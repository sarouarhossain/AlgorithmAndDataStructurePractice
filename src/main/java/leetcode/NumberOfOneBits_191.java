package leetcode;

public class NumberOfOneBits_191 {
  public static void main(String[] args) {
    //
    System.out.println(Integer.bitCount(5));
  }

  public static int solution2(int n) {
    int count = 0;
    int mask = 1;
    for (int i = 0; i < 32; i++) {
      if ((n & mask) != 0) {
        count++;
      }
      mask = mask << 1;
    }

    return count;
  }

  public static int hammingWeight(long n) {
    int count = 0;
    while (n > 0) {
      if (n % 2 != 0) {
        count++;
      }
      n = n / 2;
    }

    return count;
  }
}
