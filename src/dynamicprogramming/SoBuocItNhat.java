package dynamicprogramming;
//Tư tưởng: Vì đã biết tìm LIS(Day con tang dai nhay), ta tìm độ dài dãy con tăng dài nhất L.
// Giữ nguyên các phần tử thuộc LIS, chỉ cần chèn những phần tử còn lại vào đúng vị trí để mảng tăng dần.
//Kết quả: N - L (số phần tử không thuộc LIS).


import java.util.Scanner;

public class SoBuocItNhat {

  static int solve(int[] arr, int n) {
    int[] dp = new int[n];

    for (int i = 0; i < n; i++) {
      dp[i] = 1;
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] >= arr[j]) {
          //bài này yêu cầu là sort nên chỗ này lấy cả dấu =
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }
    int max=0;
    for (int i=0;i<n;i++){
      max=Math.max(max,dp[i]);
    }
    return n - max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println(solve(arr,n));
    }
  }
}
