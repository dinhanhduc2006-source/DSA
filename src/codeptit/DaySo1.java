package codeptit;

import java.util.Scanner;

public class DaySo1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      backtrack(arr, n);
    }
  }

  static void backtrack(int[] arr, int n) {
    System.out.print("[");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i]);
      if (i < n - 1) {
        System.out.print(" ");
      }
    }
    System.out.println("]");

    if (n == 1) {
      return;
    }
    int [] newarr = new int[n-1];
    for (int i = 0; i < n-1; i++) {
      newarr[i] = arr[i] + arr[i + 1];
    }
    backtrack(newarr, n - 1);
  }
}
