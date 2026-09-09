package codeptit;

import java.util.Scanner;

public class XauNhiPhanKeTiep {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      char[] arr = sc.next().toCharArray();
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
}
