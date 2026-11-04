package sinhketiep;

import java.util.Scanner;

public class MaGray2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0){
      String s=sc.next();

      char [] binary = new char[s.length()];

      binary[0]=s.charAt(0);

      for (int i=1;i<s.length();i++){
        if(binary[i-1]!=s.charAt(i)){
          binary[i]='1';
        } else {
          binary[i]='0';
        }
      }
      for (int i=0;i<binary.length;i++){
        System.out.print(binary[i]);
      }
      System.out.println();
    }
  }
}
