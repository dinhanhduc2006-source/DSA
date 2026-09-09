package backtracking;

import java.util.Scanner;

public class BaiToanXepHau {

  static int n;
  static int[] x;
  static boolean[] arr, nguoc, xuoi;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();

    x = new int[n + 1];
    arr = new boolean[n + 1];
    nguoc = new boolean[2 * n + 1];
    xuoi = new boolean[2 * n + 1];

    for (int i = 1; i <= n; i++) {
      arr[i] = true;
    }
    for (int i = 1; i <= 2 * n - 1; i++) {
      xuoi[i] = true;
      nguoc[i] = true;
    }
    backtrack(1);
  }

  static void backtrack(int i) {
    for (int j = 1; j <= n; j++) {
      if (arr[j] && xuoi[i - j + n] && nguoc[i + j - 1]) {
        x[i] = j;
        arr[j] = false;
        xuoi[i - j + n] = false;
        nguoc[i + j - 1] = false;
        if (i == n) {

          for (int k = 1; k <= n; k++) {
            System.out.print(x[k] + " ");
          }
          System.out.println();
        } else {
          backtrack(i + 1);
        }
        arr[j] = true;
        xuoi[i - j + n] = true;
        nguoc[i + j - 1] = true;
      }
    }
  }
}
