package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class DayConTangDanDaiNhat {

  static int solve(int[] arr) {
    int n = arr.length;
    int[] dp = new int[n];
    for (int i = 0; i < n; i++) {
      dp[i] = 1;
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }

    Arrays.sort(dp);
    return dp[n-1] ;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println(solve(arr));
  }
}
