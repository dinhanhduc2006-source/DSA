package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class TichLonNhatNhoNhat {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] arr1 = new int[n];
      for (int i = 0; i < n; i++) {
        arr1[i] = sc.nextInt();
      }
      int[] arr2 = new int[m];
      for (int i = 0; i < m; i++) {
        arr2[i] = sc.nextInt();
      }
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      long result =(long) arr1[n - 1] * arr2[0];
      System.out.println(result);
    }

  }
}
