package sinhketiep;

import java.util.Arrays;
import java.util.Scanner;

public class HoanViKeTiep {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int i = n - 2;
      while (i >= 0 && arr[i] > arr[i + 1]) {
        i--;
      }
      if (i >= 0) {
        int j = n - 1;
        while (arr[j] < arr[i]) {
          j--;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }

      int left = i + 1;
      int right = n - 1;
      while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
      }

      for (int x : arr) {
        System.out.print(x + " ");
      }
      System.out.println();
    }
  }
}
