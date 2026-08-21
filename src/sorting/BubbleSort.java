package sorting;

import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      for (int i = 0; i < n; i++) {
        boolean flag = false;
        for (int j = 0; j < n - i - 1; j++) {
          if (arr[j] > arr[j + 1]) {
            flag = true;
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
          }
        }
        if (!flag) {
          break;
        }
      }
      for (int x : arr) {
        System.out.print(x + " ");
      }
    }

  }
}
