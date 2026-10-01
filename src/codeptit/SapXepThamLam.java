package codeptit;

import java.util.Arrays;
import java.util.Scanner;

public class SapXepThamLam {

  static String solve(int[] arr, int n) {
    int[] sorted = arr.clone();
    Arrays.sort(sorted);
    for (int i = 0; i < n / 2; i++) {
      int left = arr[i];
      int right = arr[n - i - 1];

      int leftSorted = sorted[i];
      int rightSorted = sorted[n - i - 1];

      //Mỗi cặp đối xứng trong mảng ban đầu phải chứa đúng 2 giá trị tạo thành cặp đối xứng trong mảng đã sắp xếp.
      if (!((left == leftSorted && rightSorted == right) || (left == rightSorted
          && right == leftSorted))){
        return "No";
      }

    }
    return "Yes";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }
      System.out.println(solve(arr, n));
    }

  }
}
