package codeptit;


import java.util.Scanner;

public class DayXauFIBONACCI {

  static long[] length;  //lưu độ dài của các Fibonacci Word

  static char solve(int n, long k) {
    if (n == 1) {
      return 'A';
    }
    if (n == 2) {
      return 'B';
    }

    long len = length[n - 2];   //Lấy độ dài của F[n-1] và lưu vào len.

    if (k <= len) {
      return solve(n - 2, k);
    }
    return solve(n - 1, k - len);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
      int n = sc.nextInt();
      long k = sc.nextLong();

      length = new long[n + 1];
      length[1] = 1;
      length[2] = 1;

      for (int i = 3; i <= n; i++) {
        length[i] = length[i - 2] + length[i - 1];
      }

      System.out.println(solve(n, k));
    }
  }
}
