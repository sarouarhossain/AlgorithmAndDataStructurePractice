package test;

import java.util.*;

public class ArrayProb1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the Array: ");
    int n = sc.nextInt();

    System.out.println("Enter the elements of the Array: ");
    List<Integer> inputArray = new ArrayList<>();
    Integer totalSum = 0;
    for (int i = 0; i < n; i++) {
      Integer data = sc.nextInt();
      inputArray.add(data);
      totalSum += data;
    }

    Collections.sort(inputArray);
    System.out.println("Array after sorting: ");
    System.out.println(inputArray);

    System.out.println("Total Sum: " + totalSum);

    Integer digitSum = 0;
    while (totalSum > 0) {
      digitSum += totalSum % 10;
      totalSum = totalSum / 10;
    }

    System.out.println("Digit Sum: " + digitSum);
  }
}
