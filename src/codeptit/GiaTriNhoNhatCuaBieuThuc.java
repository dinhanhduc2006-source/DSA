package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class GiaTriNhoNhatCuaBieuThuc {

  static long solve(long[] arr1, int n, long[] arr2) {
    long result = 0;

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    //sap xep giam dan
    for (int i = 0; i < n / 2; i++) {
      long temp = arr2[i];
      arr2[i] = arr2[n - i - 1];
      arr2[n - i - 1] = temp;
    }

    for (int i = 0; i < n; i++) {
      result += arr1[i] * arr2[i];
    }

    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t =sc.nextInt();
    while (t-->0){
      int n= sc.nextInt();
      long [] arr1= new long [n];
      long [] arr2= new long [n];
      for (int i=0;i<n;i++){
        arr1[i]=sc.nextLong();
      }
      for (int i=0;i<n;i++){
        arr2[i]=sc.nextLong();
      }
      System.out.println(solve(arr1,n,arr2));
    }
  }
}
