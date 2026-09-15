package codeptit;

import java.util.Scanner;

public class ToHopSoCoTongBangK {

  static int n;
  static int[] arr;
  static int[] result;
  static int x;
  static boolean found;

  static void backtrack(int i, int start, int sum) {
    if (sum == x) {
      System.out.print("[");
      for (int k = 0; k < i; k++) {
        System.out.print(result[k]);
        if (k < i - 1) {
          System.out.print( " ");
        }
      }
      System.out.print("]");
      found = true;
      return;
    }
    if (sum > x) {
      return;
    }
    for (int j = start; j < n; j++) {
      result[i] = arr[j];
      backtrack(i + 1, j, sum + arr[j]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- >0) {
      n= sc.nextInt();
      x=sc.nextInt();

      arr=new int [n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      result= new int [x+1];
      found= false;

      backtrack(0,0,0);

      if(!found){
        System.out.println("-1");
      }
      System.out.println();
    }
  }
}
