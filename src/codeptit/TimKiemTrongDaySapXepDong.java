package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class TimKiemTrongDaySapXepDong {

  static int binarySearch(int[] arr, int x) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (arr[mid] == x) {
        return mid+1;
      }
      if (arr[left] < arr[mid]) {
        if (arr[left] <= x && x < arr[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (arr[mid] < x && x <= arr[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int x = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println(binarySearch(arr, x));
    }
  }
}
