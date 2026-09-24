package codeptit;

import java.util.Scanner;

public class LuyThuaDao {

  static final long MOD = 1000000007;

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
      String swap = new StringBuilder(String.valueOf(n)).reverse().toString();
      long result = Long.parseLong(swap);
      System.out.println(power(n, result));
    }
  }
}
