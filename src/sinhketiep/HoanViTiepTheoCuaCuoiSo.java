package sinhketiep;

import java.util.Scanner;

public class HoanViTiepTheoCuaCuoiSo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      String s = sc.next();
      char[] arr = s.toCharArray();

      int i = arr.length - 2;
      while (i >= 0 && arr[i] >= arr[i + 1]) {
        i--;
      }

      if (i < 0) {
        System.out.println(n + " BIGGEST");
        continue;
      }
      int j = arr.length - 1;
      while (arr[j] <= arr[i]) {
        j--;
      }
      char temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;

      int left = i + 1;
      int right = arr.length - 1;
      while (left < right) {
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
      }
      System.out.println(n +" " +new String(arr));
    }
  }
}
