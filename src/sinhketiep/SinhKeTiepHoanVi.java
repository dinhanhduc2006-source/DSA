package sinhketiep;

import java.util.Scanner;

public class SinhKeTiepHoanVi {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    //B1
    int i = n - 2;
    while (i >= 0 && arr[i] > arr[i + 1]) {
      i--;
    }
    //B2
    if (i >= 0) {
      int j = n - 1;
      while (j >= 0 && arr[i] > arr[j]) {
        j--;
      }
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }
    //B3
    int left = i + 1;
    int right = n - 1;

    while (left <= right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;

      left++;
      right--;
    }
    for (int x : arr) {
      System.out.print(x + " ");
    }
  }
}
