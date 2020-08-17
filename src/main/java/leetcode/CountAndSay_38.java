package leetcode;

public class CountAndSay_38 {
  public static void main(String[] args) {
    //
    System.out.println(countAndSay(1));
  }

  public static String countAndSay(int n) {

    String prev = "1";

    for (int i = 1; i < n; i++) {
      Character cC = prev.charAt(0);
      int cCount = 1;
      StringBuilder s = new StringBuilder();

      if (prev.length() == 1) {
        s.append(cCount);
        s.append(cC);
      } else {
        for (int j = 1; j < prev.length(); j++) {
          Character c = prev.charAt(j);
          if (c == cC) {
            cCount++;
          } else {
            s.append(cCount);
            s.append(cC);
            cC = c;
            cCount = 1;
          }
        }
        s.append(cCount);
        s.append(cC);
      }

      prev = s.toString();
    }

    return prev;
  }
}
