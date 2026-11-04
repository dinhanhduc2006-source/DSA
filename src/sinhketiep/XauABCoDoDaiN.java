package sinhketiep;

import java.util.Scanner;

public class XauABCoDoDaiN {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      char[] arr = new char[n + 1];

      for (int i = 0; i < n; i++) {
        arr[i] = 'A';
      }
      while (true) {
        for (int i = 0; i < n; i++) {
          System.out.print(arr[i]);
        }
        System.out.print(" ");

        int i = n - 1;

        while (i >= 0 && arr[i] == 'B') {
          arr[i] = 'A';
          i--;
        }

        if (i < 0) {
          break;
        }
        arr[i] = 'B';

      }
      System.out.println();
    }
  }
}
