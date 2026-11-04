package sinhketiep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaGray1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n =sc.nextInt();
      List<String> gray = new ArrayList<>();
      gray.add("0");
      gray.add("1");

      for (int i=2;i<=n;i++){
        List<String> newGray = new ArrayList<>();

        for (int j=0;j<gray.size();j++){
          newGray.add("0"+gray.get(j));
        }

        for (int j=gray.size()-1;j>=0;j--){
          newGray.add("1"+gray.get(j));
        }

        gray= newGray;
      }
      for (String s:gray){
        System.out.print(s+" ");
      }
      System.out.println();
    }
  }
}
