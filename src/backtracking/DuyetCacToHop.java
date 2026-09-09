package backtracking;

import java.util.Scanner;

public class DuyetCacToHop {

  static int n, k;
  static int[] arr;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    k = sc.nextInt();
    arr = new int[k + 1];
    backtrack(1);
  }

  static void backtrack(int i) {
    for (int j = arr[i - 1] + 1; j <= n - k + i; j++) {
      arr[i] = j;
      if (i == k) {
        for (int x = 1; x <= k; x++) {
          System.out.print(arr[x] + " ");
        }
        System.out.println();
      } else {
        backtrack(i + 1);
      }

    }
  }
}
