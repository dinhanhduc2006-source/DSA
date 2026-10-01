package codeptit;

import java.util.LinkedList;
import java.util.Scanner;

//Thay vì tính F(n-1) và F(n-2), ta chỉ cần tính F(n/2) và F(n/2 + 1), sau đó dùng công thức để suy ra F(n).
//F(0) = 0
//F(1) = 1
//
//k = n / 2
//
//F(2k)   = F(k) × [2F(k+1) - F(k)]
//
//F(2k+1) = F(k)² + F(k+1)²
public class SoFibonacciThuN {

  static final long MOD = 1000000000 + 7;

  static long[] solve(long n) {
    if (n == 0) {
      return new long[]{0, 1};
    }
    long[] result = solve(n / 2);

    long f2k = (result[0] * (2 * result[1] - result[0])) % MOD;
    long f2k1 = (result[0] * result[0] + result[1] * result[1]) % MOD;

    if (f2k < 0) {
      f2k += MOD;
    }

    if (n % 2 == 0) {
      return new long[]{f2k, f2k1};
    } else {
      return new long[]{f2k1, (f2k + f2k1) % MOD};
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();

      long[] result = solve(n);

      System.out.println(result[0]);

      LinkedList lk = new LinkedList();
    }
  }
}
