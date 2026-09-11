package codeptit;

import java.util.Scanner;

public class ToHopCoThuTuNguyenTo {

  static int n, k;
  static int[] arr;
  static int count = 0;

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    k=sc.nextInt();
    arr = new int[k+1];
    backtrack(1);
  }

  static void backtrack(int i) {
    for (int j = arr[i - 1] + 1; j <= n - k + i; j++) {
      arr[i] = j;
      if (i == k) {
        count++;
        if (isPrime(count)) {
          System.out.print(count + ": ");
          for (int x = 1; x <= k; x++) {
            System.out.print(arr[x] + " ");
          }
          System.out.println();
        }
      } else {
        backtrack(i + 1);
      }
    }
  }

  static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
