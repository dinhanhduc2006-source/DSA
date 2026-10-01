package codeptit;

import java.util.Scanner;

public class SapXepCongViec1 {

  static int solve(int[] start, int[] finish, int n) {
    //sap xep finish va doi vi tri start tuong ung voi finish
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (finish[i] > finish[j]) {
          int temp = finish[i];
          finish[i] = finish[j];
          finish[j] = temp;

          temp = start[i];
          start[i] = start[j];
          start[j] = temp;
        }
      }
    }

    int count = 1;
    int lastFinish = finish[0];

    for (int i = 1; i < n; i++) {
      if (start[i] >= lastFinish) {
        count++;
        lastFinish = finish[i];
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] start = new int[n];
      int[] finish = new int[n];
      for (int i = 0; i < n; i++) {
        start[i] = sc.nextInt();
      }
      for (int i = 0; i < n; i++) {
        finish[i] = sc.nextInt();
      }
      System.out.println(solve(start, finish, n));
    }
  }
}
