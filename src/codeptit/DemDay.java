package codeptit;

import java.util.Scanner;

//Bai toan nay co CT la : 2^(n-1)
public class DemDay {

  static final long MOD = 123456789;

  static long power(long n, long k) {
    if (k == 0) {
      return 1;
    }
    long result = power(n, k / 2);
    result = (result * result) % MOD;

    if (k % 2 == 0) {
      return result;
    } else {
      return (result * n) % MOD;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      System.out.println(power(2, n - 1));
    }

  }
}
