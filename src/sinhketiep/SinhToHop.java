package sinhketiep;

import java.util.Scanner;

public class SinhToHop {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int k = sc.nextInt();

      int[] arr = new int[k + 1];

      for (int i=0;i<k;i++){
        arr[i]=i+1;
      }
      while (true){

        for (int i=0;i<k;i++){
          System.out.print(arr[i]);
        }
        System.out.print(" ");

        int i=k-1;
        while (i>=0 && arr[i]==n-k+i+1){
          i--;
        }
        if (i<0){
          break;
        }
        arr[i]++;

        for (int j=i+1;j<k;j++){
          arr[j]=arr[j-1] + 1;
        }
      }
      System.out.println();
    }
  }
}
