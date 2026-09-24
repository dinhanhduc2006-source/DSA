package devideandconquer;

import java.util.Scanner;

public class TongDayConLonNhat {

  static int maxSubArray(int[] arr, int right, int left) {
    if (left == right) {
      return arr[left];
    }

    int mid = (left + right) / 2;

    int leftSum = maxSubArray(arr, left, mid);
    int rightSum = maxSubArray(arr, mid + 1, right);

    int sum = 0;
    int maxLeft = Integer.MIN_VALUE;
    for (int i = mid; i >= left; i--) {
      sum += arr[i];
      if (sum > maxLeft) {
        maxLeft = sum;
      }
    }

    sum = 0;
    int maxRight = Integer.MIN_VALUE;
    for (int i = mid + 1; i <= right; i++) {
      sum += arr[i];
      if (sum > maxRight) {
        maxRight = sum;
      }
    }

    int crossSum = maxRight + maxLeft;
    return Math.max(Math.max(leftSum, rightSum), crossSum);
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

      System.out.println(maxSubArray(arr, 0, n - 1));
    }
  }
}
