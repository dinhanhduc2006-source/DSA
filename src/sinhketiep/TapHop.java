package sinhketiep;

import java.util.Scanner;

public class TapHop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int n = sc.nextInt();
      int k = sc.nextInt();
      int s = sc.nextInt();
      if (n == 0 && k == 0 && s == 0) {
        break;
      }
      if (k>n){
        System.out.println(0);
        continue;
      }
      int[] arr = new int[k];
      for (int i = 0; i < k; i++) {
        arr[i] = i + 1;
      }
      int count = 0;
      while (true) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
          sum += arr[i];
        }
        if (sum == s) {
          count++;
        }

        int i = k - 1;
        while (i >= 0 && arr[i] == n - k + i + 1) {
          i--;
        }
        if (i < 0) {
          break;
        }
        arr[i]++;
        for (int j = i + 1; j < k; j++) {
          arr[j] = arr[j - 1] + 1;
        }
      }
      System.out.println(count);
    }
  }
}
