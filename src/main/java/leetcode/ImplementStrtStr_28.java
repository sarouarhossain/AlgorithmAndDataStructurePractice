package leetcode;

public class ImplementStrtStr_28 {
  public static void main(String[] args) {
    //
    String input = "aaaaa";
    String needle = "ll";

    System.out.println(strStr(input, needle));
  }

  public static int strStr(String haystack, String needle) {
    if (needle == null || needle.length() == 0) return 0;
    return haystack.indexOf(needle);
  }
}
