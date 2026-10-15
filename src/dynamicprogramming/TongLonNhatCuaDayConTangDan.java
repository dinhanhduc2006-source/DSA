package dynamicprogramming;
//Bài này giống LIS, nhưng thay vì tìm dãy con tăng có độ dài lớn nhất, ta tìm dãy con tăng có tổng lớn nhất.
//Giữ nguyên điều kiện a[j] < a[i].
//Thay vì cộng 1 như LIS, ta cộng giá trị a[i].
//Kết quả là tổng lớn nhất trong các trạng thái dp[i].
import java.util.Arrays;
import java.util.Scanner;

public class TongLonNhatCuaDayConTangDan {

  static int sovlve(int[] arr, int n) {
    int[] dp = new int[n];

    for (int i = 0; i < n; i++) {
      dp[i] = arr[i];
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j]) {
          dp[i] = Math.max(dp[i], dp[j] + arr[i]);
        }
      }
    }
    Arrays.sort(dp);
    return dp[n - 1];
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
      System.out.println(sovlve(arr, n));
    }
  }
}
