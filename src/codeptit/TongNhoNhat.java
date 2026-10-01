package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class TongNhoNhat {
  static long sum(String [] arr){
    String a="" ;
    String b="";
    for(int i=0;i< arr.length;i++){
      if (i%2==0){
        a+=arr[i];
      } else {
        b+=arr[i];
      }
    }
//    for (int i=0;i< arr.length;i+=2){
//      a+=arr[i];
//    }
//    for (int i=1;i<arr.length;i+=2){
//      b+=arr[i];
//    }
    Long so1=Long.parseLong(a);
    Long so2=Long.parseLong(b);
    return so1+so2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t =sc.nextInt();
    while (t-->0){
      int n = sc.nextInt();
      String [] arr = new String[n];
      for (int i=0;i<n;i++){
        arr[i]=sc.next();
      }
      Arrays.sort(arr);
      System.out.println(sum(arr));
    }
  }
}
