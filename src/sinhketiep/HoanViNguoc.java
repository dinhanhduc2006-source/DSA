package sinhketiep;

import java.util.Scanner;

public class HoanViNguoc {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      int[] arr = new int[n + 1];
      for (int i = 0; i < n; i++) {
        arr[i] = n - i;
      }
      while (true) {
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i]);
        }
        System.out.print(" ");

        int i = n - 2;
        while (i >= 0 && arr[i] < arr[i + 1]) {
          i--;
        }
        if (i <0) {
          break;
        }
        int j = n - 1;
        while (arr[i] < arr[j]) {
          j--;
        }
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;

        int left = i + 1;
        int right = n - 1;

        while (left < right) {
          int temp1 = arr[left];
          arr[left] = arr[right];
          arr[right] = temp1;

          left++;
          right--;
        }
      }
      System.out.println();
    }
  }
}
