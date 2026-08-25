package codeptit;

import java.util.Scanner;

public class TongCapSoNguyenTo {

  static boolean isPrime(int n) {
    if (n <= 1) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      boolean found = false;
      for (int i = 1; i <= n / 2; i++) {
        int j = n - i;
        if (isPrime(j) && isPrime(i)) {
          found = true;
          System.out.println(i + " " + j);
          break;
        }

      }
      if (!found) {
        System.out.println("-1");
      }

    }
  }
}
