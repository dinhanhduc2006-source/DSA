package backtracking;

import java.util.Scanner;

public class DuyetCacHoanVi {
  static int n;
  static int [] arr;
  static boolean[] used;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    arr = new int[n+1];
    used = new boolean[n+1];
    backtrack(1);
  }
  static void backtrack(int i){
    for (int j=1; j<=n; j++){
      if (!used[j]){
        arr[i]=j;
        used[j]=true;
        if (i == n ) {
          for (int k = 1; k <= n; k++) {
            System.out.print(arr[k] + " ");
          }
          System.out.println();
        } else  {
          backtrack(i+1);
        }
        used[j]=false;
      }
    }
  }
}
