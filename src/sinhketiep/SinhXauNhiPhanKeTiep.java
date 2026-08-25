package sinhketiep;

import java.util.Scanner;

public class SinhXauNhiPhanKeTiep {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.next();
    char[] arr = s.toCharArray();
    int i = arr.length - 1;
    while (i >= 0 && arr[i] == '1') {
      arr[i] = '0';
      i--;
    }
    if (i >= 0) {
      arr[i] = '1';
    }
    System.out.println(new String(arr));
  }
}
