package codeptit;

import java.util.Scanner;

// mid=2^(n-1)
public class GapDoiDaySo {

  static long solve(long n, long k) {
    if (n == 1) {
      return 1;
    }
    long mid = power(2, n - 1);

    if (k == mid) {
      return n;
    }
    if (k < mid) {
      return solve(n - 1, k);
    }
    if (k > mid) {
      return solve(n - 1, k - mid);
    }
    return 1;
  }

  static long power(long n, long k) {
    if (k == 0) {
      return 1;
    }
    long result = power(n, k / 2);
    if (k % 2 == 0) {
      return result * result;
    } else {
      return result * result * n;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long k = sc.nextLong();
      System.out.println(solve(n, k));
    }
  }
}
