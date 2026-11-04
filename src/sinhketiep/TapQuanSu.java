package sinhketiep;

import java.util.Scanner;

public class TapQuanSu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-->0){
      int n= sc.nextInt();
      int k = sc.nextInt();
      int [] newArr = new int[k];
      for (int i=0;i<k;i++){
        newArr[i]= sc.nextInt();
      }
      int [] oldArr = newArr.clone();

      int i=k-1;
      while (i>=0 && newArr[i]== n-k+i+1){
        i--;
      }
      if (i<0){
        System.out.println(k);
        continue;
      }
        newArr[i]++;
      for (int j =i+1;j<k;j++){
        newArr[j]= newArr[j-1]+1;
      }

      int count=0;
      for (int x=0;x<k;x++){
        boolean check= true;
        for (int j=0;j<k;j++){
          if (newArr[j]== oldArr[x]){
            check = false;
          }
        }
        if (check){
          count++;
        }
      }
      System.out.println(count);
    }
  }
}
