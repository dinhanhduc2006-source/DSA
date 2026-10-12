
package codeptit;

import java.util.Scanner;

public class DayConTangCoDoDaiK {

  static int solve(int[] arr, int k) {
    int n = arr.length;
    int[][] dp = new int[n][k + 1];

    for (int i = 0; i < n; i++) {
      dp[i][1] = 1;

      for (int j = 0; j < i; j++) {
        if (arr[j] < arr[i]) {
          for (int len = 2; len <= k; len++) {
            dp[i][len] += dp[j][len - 1];
          }
        }
      }
    }

    int count = 0;

    for (int i = 0; i < n; i++) {
      count += dp[i][k];
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(solve(arr, k));
  }
}