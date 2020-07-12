package leetcode;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter_387 {
  public static void main(String[] args) {
    //
    System.out.println(firstUniqChar("loveleetcode"));
  }

  public static int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      Character c = s.charAt(i);
      if (map.containsKey(c)) {
        Integer value = map.get(c);
        map.replace(c, ++value);
      } else {
        map.put(c, 1);
      }
    }

    for (int i = 0; i < s.length(); i++) {
      if (map.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }
}
