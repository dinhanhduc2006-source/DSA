package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class SoNhoNhatVaSoNhoThuHai {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      Arrays.sort(arr);
      if (arr[0] >= arr[1]) {
        System.out.println(-1);
      } else {
        System.out.println(arr[0] + " " + arr[1]);
      }
    }
  }
}
