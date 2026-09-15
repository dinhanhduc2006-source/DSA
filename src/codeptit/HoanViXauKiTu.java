package codeptit;

import java.util.Scanner;

public class HoanViXauKiTu {

  static int n;
  static char[] arr;
  static char[] newarr;
  static boolean[] used;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      arr = sc.next().toCharArray();
      n = arr.length;
      used = new boolean[n];
      newarr = new char[n];
      backtrack(0);
      System.out.println();
    }
  }

  static void backtrack(int i) {
    if (i == n) {
      System.out.print(new String(newarr)+ " ");
      return;
    }
    for (int j = 0; j < n; j++) {
      if (!used[j]) {
        newarr[i] = arr[j];

        used[j] = true;

        backtrack(i + 1);

        used[j] = false;
      }
    }
  }
}
