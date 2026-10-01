package codeptit;

import java.util.Scanner;

public class DoiTien {

  static int greedy(int value, int[] coins) {
    int result = 0;
    for (int i = coins.length - 1; i >= 0; i--) {
      while (coins[i] <= value) {
        value -= coins[i];
        result++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int[] coins = {1, 2, 5, 10, 20, 50, 100, 200, 500, 1000};
    while (t-- > 0) {
      int value = sc.nextInt();

      System.out.println(greedy(value, coins));
    }
  }
}
