package backtracking;

import java.util.Scanner;

public class DuyetCacXauNhiPhanCoDoDaiN {

  static int n;
  static int[] arr;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    arr = new int[n];
    backtracking(0);
  }

  static void backtracking(int i) {
    for (int j = 0; j <= 1; j++) {
      arr[i] = j;
      if (i == n - 1) {
        for (int k = 0; k < n; k++) {
          System.out.print(arr[k]);
        }
        System.out.println();
      } else {
        backtracking(i + 1);
      }
    }
  }
}
