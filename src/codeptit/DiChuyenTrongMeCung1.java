package codeptit;

import java.util.Scanner;

public class DiChuyenTrongMeCung1 {

  static int n;
  static int[][] arr;
  static boolean found;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      n = sc.nextInt();
      arr = new int[n][n];
      found = false;
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          arr[i][j] = sc.nextInt();
        }
      }

      if (arr[0][0] == 0 || arr[n - 1][n - 1] == 0){
        System.out.println("-1");
        continue;
      }

      backtrack(0,0,"");

      if (!found) {
        System.out.println("-1");
      }
      System.out.println();
    }

  }

  static void backtrack(int i, int j, String path) {
    if (i == n - 1 && j == n - 1) {
      System.out.print(path + " ");
      found = true;
      return;
    }
    if (i + 1 < n && arr[i + 1][j] == 1) {
      backtrack(i + 1, j, path + "D");
    }
    if (j + 1 < n && arr[i][j + 1] == 1) {
      backtrack(i, j + 1, path + "R");
    }
  }
}
