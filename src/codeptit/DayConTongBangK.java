package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class DayConTongBangK {

  static int n;
  static int[] arr;
  static int total;
  static int[] result;
  static boolean found;//Xem da tim duoc mang con nao chua

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      n = sc.nextInt();
      total = sc.nextInt();
      arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      result = new int[n];

      found = false;
      backtrack(0, 0, 0);

      if (!found) {
        System.out.println("-1");
      }
      System.out.println();
    }
  }
  //i = đang xét đến phần tử nào trong mảng arr
  //j = đang có bao nhiêu phần tử trong dãy con result
  static void backtrack(int i, int j, int sum) {
    if (total == sum) {
      System.out.print("[");

      for (int x = 0; x < j; x++) {
        System.out.print(result[x]);
        if (x < j - 1) {
          System.out.print(" ");
        }
      }

      System.out.print("] ");

      found = true;

      return;
    }
    if (i == n || sum > total) {
      return;
    }
    result[j] = arr[i];

    backtrack(i + 1, j + 1, sum + arr[i]);

    backtrack(i + 1, j, sum);

  }
}
