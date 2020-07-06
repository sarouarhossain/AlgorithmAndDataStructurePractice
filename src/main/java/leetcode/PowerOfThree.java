package leetcode;

public class PowerOfThree {
  public static void main(String[] args) {
    //
    // int n = 2147483647;
    int n = 27;

    boolean result = false;

    for (int i = 0; ; i++) {
      double x = Math.pow(3, i);
      if (x > n) {
        System.out.println(x);
        break;
      }
      if (x == n) {
        System.out.println(x);
        result = true;
        break;
      }
    }

    System.out.println(result);
  }
}
