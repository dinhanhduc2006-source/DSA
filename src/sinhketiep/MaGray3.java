package sinhketiep;

import java.util.Scanner;

public class MaGray3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      char[] gray = new char[s.length()];

      gray[0] = s.charAt(0);

      for (int i = 1; i < s.length(); i++) {
        if (s.charAt(i-1) != s.charAt(i)) {
          gray[i] = '1';
        } else {
          gray[i] = '0';
        }
      }
      for (int i = 0 ; i < gray.length ; i++) {
        System.out.print(gray[i]);
      }
      System.out.println();
    }
  }
}
