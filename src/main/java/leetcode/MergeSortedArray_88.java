package leetcode;

import java.util.Arrays;

public class MergeSortedArray_88 {
  public static void main(String[] args) {
    //
    int[] nums1 = {1, 2, 3, 0, 0, 0};
    int[] nums2 = {2, 5, 6};
    merge(nums1, 3, nums2, 3);
    System.out.println(Arrays.toString(nums1));
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] B = new int[m + n];
    while (i < m && j < n) {
      if (nums1[i] <= nums2[j]) {
        B[k++] = nums1[i];
        i++;
      } else {
        B[k++] = nums2[j];
        j++;
      }
    }

    for (; i < m; i++) {
      B[k++] = nums1[i];
    }

    for (; j < n; j++) {
      B[k++] = nums2[j];
    }

    if (m + n >= 0) System.arraycopy(B, 0, nums1, 0, m + n);
  }
}
