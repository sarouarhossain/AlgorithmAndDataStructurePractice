import java.util.Map;

public class RakutenInterview {
  public static void main(String[] args) {
    //
    char[] input1 = {'1', '0', '0', '1', '1', '1'};
    System.out.println(func(input1));

    System.out.println(Math.floor(5 / -2));
  }

  public static Integer func(char[] input) {
    Integer x = 0;
    for (int i = 0; i < input.length; i++) {
      x += (input[i] - 48) * (int) Math.pow(-2, i);
    }

    Integer ceilValue = (int) Math.ceil(x / 2);
    System.out.println(ceilValue);
    return x;
  }
}
