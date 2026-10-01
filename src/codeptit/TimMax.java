package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class TimMax {

  static final long MOD = 1000000007;

  static long sumMax(int[] arr, long result) {
    for (int i = 0; i < arr.length; i++) {
      long value = (long) arr[i] * i;  // vi arr[i],i deu la int nen co the tran so nen ta (long) ben ngoai
      value = value % MOD;
      result = result + value;
      result = result % MOD;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      long result = 0;
      Arrays.sort(arr);

      System.out.println(sumMax(arr, result));
    }
  }
}
