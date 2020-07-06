package leetcode;

public class ExcelSheetColumnNumber_171 {
  public static void main(String[] args) {
    //
    String s = "AB";
    s = s.toUpperCase();

    int sum = 0;
    int length = s.length();
    int power = length - 1;
    for (int i = 0; i < length; i++) {
      int pow = (int) Math.pow(26, power--);
      int num = s.charAt(i) - 'A' + 1;
      sum += num * pow;
    }

    System.out.println(sum);
  }
}
