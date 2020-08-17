package leetcode.BS;

public class Prob_240 {
  public static void main(String[] args) {
    int[][] input = {
      {1, 4, 7, 11, 15},
      {2, 5, 8, 12, 19},
      {3, 6, 9, 16, 22},
      {10, 13, 14, 17, 24},
      {18, 21, 23, 26, 30}
    };

    System.out.println(searchMatrix(input, 20));
  }

  public static boolean searchMatrix(int[][] matrix, int target) {
    int row = matrix.length;
    if (row == 0) return false;
    int col = matrix[0].length;
    if (col == 0) return false;

    int tRow = row - 1;
    int tCol = 0;
    int temp = matrix[tRow][tCol];

    while (tRow >= 0 && tCol < col) {
      if (target == matrix[tRow][tCol]) return true;

      if (target > matrix[tRow][tCol]) {
        tCol = tCol + 1;
      } else {
        tRow = tRow - 1;
      }
    }
    return false;
  }
}
