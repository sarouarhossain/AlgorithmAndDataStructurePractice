package leetcode.BS;

public class Prob_74 {
  public static void main(String[] args) {
    int[][] input = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    System.out.println(searchMatrix(input, 13));
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
    int row = matrix.length;
    if (row == 0) return false;
    int col = matrix[0].length;
    int size = row * col - 1;
    int mid = size / 2;
    int low = 0;
    int high = size;

    while (low <= high) {
      int r = mid / col;
      int c = mid % col;

      if (matrix[r][c] == target) return true;

      if (target > matrix[r][c]) {
        low = mid + 1;
        mid = (low + high) / 2;

      } else {
        high = mid - 1;
        mid = (low + high) / 2;
      }
    }
    return false;
  }
}
