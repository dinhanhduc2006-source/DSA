package dynamicprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class TongLonNhatCuaDayConKoKeNhau {

  static int solve(int[] arr, int n) {
    int[] dp = new int[n];
    dp[0] = arr[0];
    dp[1] = Math.max(arr[0], arr[1]);
    for (int i = 2; i < n; i++) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + arr[i]);
    }
    Arrays.sort(dp);
    return dp[n-1];

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t= sc.nextInt();
    while (t-->0){
      int n = sc.nextInt();
      int [] arr = new int[n];
      for (int i=0;i<n;i++){
        arr[i]= sc.nextInt();
      }
      System.out.println(solve(arr,n));
    }
  }
}
