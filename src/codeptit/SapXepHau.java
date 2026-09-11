package codeptit;

import java.util.Scanner;

public class SapXepHau {

  static int[][] arr = new int[8][8];
  static boolean[] xuoi = new boolean[15];
  static boolean[] nguoc = new boolean[15];
  static boolean[] cot = new boolean[8];
  static int max;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int x = 1; x <= t; x++) {
      for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      max = 0;
      backtrack(0, 0);

      System.out.println("Test " + x + ": " + max);
    }
  }

  static void backtrack(int i, int score) {
    if (i == 8) {
      max = Math.max(max, score);
    } else {
      for (int j = 0; j < 8; j++) {
        if (!xuoi[i - j + 7] && !nguoc[i + j] && !cot[j]) {
          //Dat hau
          cot[j] = true;
          xuoi[i - j + 7] = true;
          nguoc[i + j] = true;

          // Di tiep
          backtrack(i + 1, score + arr[i][j]);

          //Quay lui
          cot[j] = false;
          xuoi[i - j + 7] = false;
          nguoc[i + j] = false;
        }
      }
    }
  }
}
