package codeptit;

import java.util.Scanner;

public class XauConChungDaiNhat {

  static int solve(char[] arr1, char[] arr2) {
    int n = arr1.length;
    int m = arr2.length;

    int[][] dp = new int[n + 1][m + 1];

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        } else {
          if (arr1[i - 1] == arr2[j - 1]) {
            dp[i][j] = dp[i - 1][j - 1] + 1;
          } else {
            dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
          }
        }
      }
    }
    return dp[n][m];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s1 = sc.next();
      String s2 = sc.next();
      char[] arr1 = s1.toCharArray();
      char[] arr2 = s2.toCharArray();
      System.out.println(solve(arr1, arr2));
    }
  }
}
