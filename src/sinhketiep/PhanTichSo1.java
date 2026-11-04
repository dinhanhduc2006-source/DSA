package sinhketiep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//path là dãy các số đã chọn.
//
//remaining là tổng còn lại cần phân tích.
public class PhanTichSo1 {
  static List<Integer> path = new ArrayList<>();
  static void backtrack(int remaining, int maxValue){
    if (remaining==0){
      System.out.print("(");
      for (int i=0;i< path.size();i++){
        System.out.print(path.get(i));

        if (i<path.size()-1){
          System.out.print(" ");
        }
      }
      System.out.print(") ");
    }

    for (int i=Math.min(remaining,maxValue);i>=1;i--){
      path.add(i);

      backtrack(remaining-i,i);

      path.remove(path.size()-1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0){
      int n = sc.nextInt();

      backtrack(n,n);

      System.out.println();
    }
  }
}
