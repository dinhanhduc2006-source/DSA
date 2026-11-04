package sinhketiep;

import java.util.Scanner;

public class XauNhiPhanCoKBit1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int [] arr = new int[n];
      for (int i=0;i<n;i++){
        arr[i]=0;
      }

      while (true){
        int count=0;
        for (int i=0;i<n;i++){
          if (arr[i]==1){
            count++;
          }
        }
        if (count== k){
          for (int i=0;i<n;i++){
            System.out.print(arr[i]);
          }
          System.out.println();
        }

        int i=n-1;
        while (i>=0 && arr[i]==1){
          arr[i]=0;
          i--;
        }
        if (i<0){
          break;
        }
        arr[i]=1;
      }

    }
  }
}
