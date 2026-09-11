package codeptit;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DatTen1 {

  static int ndasapxep, k;
  static String[] ten;
  static int[] arr;


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    k = sc.nextInt();
    Set<String> set = new TreeSet<>();
    for (int i = 0; i < n; i++) {
      set.add(sc.next());
    }
    ten = set.toArray(new String[0]);
    ndasapxep = ten.length;
    arr = new int[k + 1];
    backtrack(1);
  }

  static void backtrack(int i) {
    for (int j = arr[i - 1] + 1; j <= ndasapxep - k + i; j++) {
      arr[i] = j;
      if (i == k) {
        for (int x = 1; x <= k; x++) {
          System.out.print(ten[arr[x] - 1] + " ");
        }
        System.out.println();
      } else {
        backtrack(i + 1);
      }
    }
  }
}
