package codeptit;

import java.util.Scanner;

public class NhamChuSO {

  static String changeMax(String s) {
    char[] arr = s.toCharArray();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '5') {
        arr[i] = '6';
      }
    }
    return new String(arr);
  }

  static String changeMin(String s) {
    char[] arr = s.toCharArray();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '6') {
        arr[i] = '5';
      }
    }
    return new String(arr);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a = sc.next();
    String b = sc.next();

    String amin = changeMin(a);
    String amax = changeMax(a);

    String bmin = changeMin(b);
    String bmax = changeMax(b);

    long min =Long.parseLong(amin)+Long.parseLong(bmin);
    long max=Long.parseLong(amax)+Long.parseLong(bmax);

    System.out.println(min + " " + max);

  }
}
