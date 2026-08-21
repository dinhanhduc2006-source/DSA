package codeptit;

import java.util.Scanner;

public class SapXepNoiBot {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int count = 0;
    for (int i = 0; i < n - 1; i++) {
      boolean flag = false;

      for (int j = 0; j < n - i - 1; j++) {

        if (arr[j] > arr[j + 1]) {

          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;

          flag = true;
        }
      }
      if (flag) {
        count++;

        System.out.print("Buoc " + count + ": ");
        for (int x : arr) {
          System.out.print(x + " ");
        }
        System.out.println();
      } else {
        break;
      }
    }
  }
}
