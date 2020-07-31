package leetcode;

public class Sqrtx_69 {
  public static void main(String[] args) {
    //
    System.out.println(mySqrt(2147395600));
  }

  public static int mySqrt(int x) {
    int i;
    for (i = 1; i * i <= x && i * i > 0; i++) {
      System.out.println(i + "  : " + i * i);
    }

    return i - 1;
  }
}
