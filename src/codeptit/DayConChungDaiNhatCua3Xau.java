package codeptit;

import java.util.Scanner;

public class DayConChungDaiNhatCua3Xau {

  static int solve(char[] arr1, char[] arr2, char[] arr3) {
    int n = arr1.length;
    int m = arr2.length;
    int z = arr3.length;

    int[][][] dp = new int[n + 1][m + 1][z + 1];

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= m; j++) {
        for (int k = 0; k <= z; k++) {
          if (i == 0 || j == 0 || k == 0) {
            dp[i][j][k] = 0;
          } else {
            if (arr1[i-1] == arr2[j-1] && arr1[i-1] == arr3[k-1] && arr3[k-1] == arr2[j-1]) {
              dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
            } else {
              dp[i][j][k] = Math.max(dp[i][j ][k - 1],
                  Math.max(dp[i ][j - 1][k], dp[i - 1][j][k ]));
            }
          }
        }
      }
    }
    return dp[n][m][z];
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n1= sc.nextInt();
      int n2= sc.nextInt();
      int n3= sc.nextInt();
      String s1 = sc.next();
      String s2 = sc.next();
      String s3 = sc.next();
      char[] arr1 = s1.toCharArray();
      char[] arr2 = s2.toCharArray();
      char[] arr3 = s3.toCharArray();

      System.out.println(solve(arr1, arr2, arr3));
    }
  }
}
