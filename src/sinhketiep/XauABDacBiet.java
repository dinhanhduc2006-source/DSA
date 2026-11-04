package sinhketiep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XauABDacBiet {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    char[] arr = new char[n];
    for (int i = 0; i < n; i++) {
      arr[i] = 'A';
    }

    List<String> list = new ArrayList<>();

    while (true) {
      int count = 0;

      for (int i = 0; i <= n - k; i++) {
        boolean check = true;

        for (int j = i; j < i + k; j++) {
          if (arr[j] != 'A') {
            check = false;
            break;
          }
        }
        if (check) {
          count++;
        }
      }

      if (count == 1) {
        list.add(new String(arr));
      }

      int i = n - 1;
      while (i >= 0 && arr[i] == 'B') {
        arr[i] = 'A';
        i--;
      }
      if (i < 0) {
        break;
      }
      arr[i] = 'B';
    }

    System.out.println(list.size());
    for (String s : list) {
      System.out.println(s);
    }
  }
}
