package leetcode;

public class ValidPalindrome_125 {
  public static void main(String[] args) {
    //
    System.out.println(isPalindrome("0P"));
  }

  public static boolean isPalindrome(String s) {
    StringBuilder stringBuilder = new StringBuilder();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
        stringBuilder.append(Character.toLowerCase(c));
      }
    }
    String t1 = new String(stringBuilder);
    StringBuilder reverseString = stringBuilder.reverse();
    String t2 = new String(reverseString);
    return t1.equals(t2);
  }
}
