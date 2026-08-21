package sorting;

import java.util.Scanner;

public class SelectionSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
          if (arr[j] < arr[minIndex]) {
            minIndex = j;
          }
          int temp = arr[i];
          arr[i] = arr[minIndex];
          arr[minIndex] = temp;
        }
      }
      for (int x : arr) {
        System.out.print(x + " ");
      }
    }
  }
}
