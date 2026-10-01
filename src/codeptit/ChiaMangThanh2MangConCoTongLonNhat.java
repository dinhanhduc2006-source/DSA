package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class ChiaMangThanh2MangConCoTongLonNhat {

  static int sum(int[] arr, int n, int k) {
    int smallGroup = Math.min(k, n - k);

    int sumSmall = 0;
    int sumLarge = 0;

    for (int i = 0; i < smallGroup; i++) {
      sumSmall += arr[i];
    }
    for (int i = smallGroup; i < n; i++) {
      sumLarge += arr[i];
    }
    return sumLarge - sumSmall;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      System.out.println(sum(arr, n, k));
    }
  }
}
