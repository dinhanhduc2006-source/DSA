package codeptit;

import java.util.Scanner;

public class MayATM {

  static int n;
  static int[] arr;
  static int total;
  static int result;

  static void backtrack(int i, int sum, int count) {
    if (sum == total) {
      result = Math.min(result, count);
      return;
    }
    if (i == n || sum > total) {
      return;
    }
    //Chon i
    backtrack(i + 1, sum + arr[i], count+1);
    //Khong Chon i
    backtrack(i + 1, sum, count);

  }

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
      result = Integer.MAX_VALUE;

      backtrack(0, 0, 0);
      if (result == Integer.MAX_VALUE) {
        System.out.println("-1");
      } else {
        System.out.println(result);
      }
    }
  }
}
