package codeptit;

import java.util.Scanner;

public class SapXepCongViec2 {

  static String solve(int[][] arr, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[i][2] < arr[j][2]) {
          int temp = arr[i][2];
          arr[i][2] = arr[j][2];
          arr[j][2] = temp;

          temp = arr[i][1];
          arr[i][1] = arr[j][1];
          arr[j][1] = temp;

          temp = arr[i][0];
          arr[i][0] = arr[j][0];
          arr[j][0] = temp;

        }
      }
    }
    boolean[] used = new boolean[n +1];

    int count = 0;

    int result = 0;

    for (int i = 0; i < n; i++) {
      int deadline = Math.min(arr[i][1], n);

      for (int j = deadline; j >= 1; j--) {
        if (!used[j]) {
          used[j]=true;
          count++;
          result += arr[i][2];
          break;
        }
      }
    }
    return count + " " + result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[][] arr = new int[n][3];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < 3; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      System.out.println(solve(arr, n));
    }
  }
}
