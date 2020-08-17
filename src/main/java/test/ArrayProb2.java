package test;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProb2 {
  public static void main(String[] args) {
    int n, sum = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number of element you want in array: ");
    n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter all the elements: ");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
      sum = sum + arr[i];
    }

    // sorting
    Arrays.sort(arr);
    System.out.println("Array after Sorting is : ");
    System.out.println(Arrays.toString(arr));

    System.out.println("sum: " + sum);
    int digitSum = 0;
    while (sum > 0) {
      digitSum += sum % 10;
      sum = sum / 10;
    }
    System.out.println("Digits sum:" + digitSum);
  }
}
