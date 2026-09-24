package devideandconquer;

public class LuyThua {

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
    long n =2;
    long k=4;
    System.out.println(power(2,4));
  }

}
