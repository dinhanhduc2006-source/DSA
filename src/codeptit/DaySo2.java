package codeptit;

import java.util.ArrayList;
import java.util.Scanner;

public class DaySo2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      ArrayList<int[]> list = new ArrayList<>();
      backtrack(arr, n, list);

      for (int i = list.size() - 1; i >= 0; i--) {
        System.out.print("[");
        for (int j = 0; j < list.get(i).length; j++) {
          System.out.print(list.get(i)[j]);
          if (j < list.get(i).length - 1) {
            System.out.print(" ");
          }
        }
        System.out.print("] ");
      }
      System.out.println();

    }
  }

  static void backtrack(int[] arr, int n, ArrayList<int[]> list) {
    list.add(arr);
    if (n == 1) {
      return;
    }
    int[] newarr = new int[n - 1];
    for (int i = 0; i < n - 1; i++) {
      newarr[i] = arr[i] + arr[i + 1];
    }
    backtrack(newarr, n - 1, list);
  }
}
