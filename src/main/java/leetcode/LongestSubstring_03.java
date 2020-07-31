package leetcode;

import java.util.HashSet;

public class LongestSubstring_03 {
  public static void main(String[] args) {
    //

    String input = " ";
    System.out.println(lengthOfLongestSubstring(input));
  }

  public static int lengthOfLongestSubstring(String s) {
    // HashSet<Character> set = new HashSet();
    boolean[] arr = new boolean[127];
    int length = s.length();
    int i = 0, j = 0, res = 0, counter = 0;
    while (i < length && j < length) {
      Character ch = s.charAt(j);
      if (!arr[ch]) {
        // set.add(ch);
        arr[ch] = true;
        j++;
        counter++;
        res = Math.max(res, counter);
      } else {
        Character c = s.charAt(i);
        // set.remove(c);
        arr[c] = false;
        i++;
        counter--;
      }
    }

    return res;
  }

  public static int lengthOfLongestSubstring1(String s) {

    int length = s.length();
    int res = 0;
    for (int i = 0; i < length; i++) {
      int lCounter = 0;
      for (int j = i; j < length; j++) {
        if (isAllUnique(s, i, j)) {
          lCounter = j - i + 1;
          if (res < lCounter) {
            res = lCounter;
          }
        } else {
          i++;
        }
      }
      break;
    }

    return res;
  }

  public static boolean isAllUnique(String s, int i, int j) {
    HashSet<Character> set = new HashSet<>();

    for (int x = i; x <= j; x++) {
      Character ch = s.charAt(x);
      if (set.contains(ch)) return false;
      set.add(ch);
    }

    return true;
  }
}
