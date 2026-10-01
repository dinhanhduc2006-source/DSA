package greedy;

import java.util.Arrays;
import java.util.Scanner;


//arr:số lượng của từng mệnh giá.
public class BaiToanDoiTien {

  static void greedy(int value, int[] arr, int[] coins, int n) {
    for (int i = n - 1; i >= 0; i--) {
      arr[i] = 0;
      while (coins[i] <= value) {
        value -= coins[i];
        arr[i]++;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int value = sc.nextInt();
    int[] coins = {1, 5, 10, 100, 20};
    int[] arr = new int[n];

    Arrays.sort(coins);

    greedy(value, arr, coins, n);

    for (int i = n - 1; i >= 0; i--) {
      if (arr[i] > 0) {
        System.out.println("Menh gia" + coins[i] + ":" + arr[i] + "to" );
      }
    }
  }
}
