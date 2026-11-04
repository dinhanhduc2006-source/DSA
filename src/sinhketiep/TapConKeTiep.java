package sinhketiep;

import java.util.Scanner;

public class TapConKeTiep {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t =sc.nextInt();
    while (t-->0){
      int n = sc.nextInt();
      int k = sc.nextInt();
      int [] arr = new int[k];
      for (int i=0;i<k;i++){
        arr[i]= sc.nextInt();
      }
      int i=k-1;
      while (i>=0 && arr[i]==n-k+i+1){
        i--;
      }
      if (i<0){
        for (int j=0;j<k;j++){
          arr[j]=j+1;
        }
      } else {
        arr[i]++;
        for (int j=i+1;j<k;j++){
          arr[j]=arr[j-1]+1;
        }
      }
      for (int x:arr){
        System.out.print(x+" ");
      }
      System.out.println();
    }

  }
}
