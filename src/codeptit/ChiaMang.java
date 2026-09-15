package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class ChiaMang {

  static int n, k;
  static int[] arr;
  static int[] sum;
  static boolean[] used;
  static int target;
  static int[] count;

  //i     → đang xây dựng tập thứ i
  static boolean backtrack(int i) {
    if (i == k) {
      return true;
    }
    if (sum[i] == target) {
      if (count[i] > 0) {//neu tap tong tap i =target thi chuyen sang tap tiep theo
        return backtrack(i + 1);
      }
      return false;
    }
    for (int j = 0; j < n; j++) {
      if (!used[j]) {
        if (sum[i] + arr[j] <= target) {
          used[j] = true;
          sum[i] += arr[j];
          count[i]++;


          if (backtrack(i)) {
            return true;
          }

          sum[i] -= arr[j];  //quay lui
          used[j] = false;
          count[i]--;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      n = sc.nextInt();
      k = sc.nextInt();
      arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

      int total = 0;
      for (int i = 0; i < n; i++) {
        total += arr[i];
      }
      if (total % k != 0) {
        System.out.println(0);
        continue;
      }

      target = total / k;

      Arrays.sort(arr);
      sum = new int[k];
      used = new boolean[n];
      count = new int[k];
      if (backtrack(0)) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }
  }
}
