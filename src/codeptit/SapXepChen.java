package codeptit;

import java.util.Scanner;

public class SapXepChen {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.print("Buoc 0: " + arr[0]);
    System.out.println();
    for (int i = 1; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;

      System.out.print("Buoc " + i + ": ");
      for (int k = 0; k <= i; k++) {
        System.out.print(arr[k] + " ");
      }
      System.out.println();
    }

  }
}
