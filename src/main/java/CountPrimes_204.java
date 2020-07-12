import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountPrimes_204 {
  public static void main(String[] args) {
    //
    List<Integer> primes = primeNumbers(2);
    System.out.println(primes);
  }

  public static List<Integer> primeNumbers(int n) {
    boolean[] isPrime = new boolean[n + 1];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;

    for (int i = 2; i * i < n; i++) {
      if (!isPrime[i]) continue;

      for (int j = i * i; j < n; j = j + i) {
        isPrime[j] = false;
      }
    }

    int count = 0;
    for (int x = 0; x < n; x++) {
      if (isPrime[x]) {
        count++;
      }
    }

    List<Integer> primes = new ArrayList<>();
    for (int x = 2; x < n; x++) {
      if (isPrime[x]) {
        primes.add(x);
      }
    }

    return primes;
  }
}
