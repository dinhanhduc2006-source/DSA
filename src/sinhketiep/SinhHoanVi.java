package sinhketiep;


import java.util.Scanner;

public class SinhHoanVi {

  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int t = sc.nextInt();

    while (t-->0){

      int n=sc.nextInt();
      int [] arr =new int[n+1];
      for (int i=0;i<n;i++){
        arr[i]=i+1;
      }

      while (true){
        for (int i=0;i<n;i++){
          System.out.print(arr[i]);
        }
        System.out.print(" ");

        int i=n-2;
        while (i>=0 && arr[i]>arr[i+1]){
          i--;
        }
        if (i<0){
          break;
        }

        int j=n-1;
        while (arr[i]>arr[j]){
          j--;
        }
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]= temp;

        int left=i+1;
        int right=n-1;

        while (left<right){
          int temp1 =arr[right];
          arr[right]= arr[left];
          arr[left] = temp1;

          left++;
          right--;
        }
      }
      System.out.println();
    }
  }
}
