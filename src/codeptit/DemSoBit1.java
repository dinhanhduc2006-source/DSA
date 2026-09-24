package codeptit;

import java.util.Scanner;

//Độ dài của F(N) chính là N
public class DemSoBit1 {

  static long count(long number, long left, long right) {
    if (number == 1) {
      return 1;
    }

    long mid = number / 2;

    if (right < mid) {
      return count(number/2, left, right);
    }
    if (left > mid) {
      long newLeft = left - mid - 1;
      long newRight = right - mid - 1;
      return count(number/2, newLeft, newRight);
    }

    long result = 0;

    if (left <= mid - 1) {
      result += count(number/2 , left, mid - 1);
    }

    if (number % 2 == 1 && left <= mid && right >= mid) {
      result++;
    }

    if (right >= mid + 1) {
      long newLeft = Math.max(0, left - mid - 1);
      long newRight = right - mid - 1;

      result += count(number/2 , newLeft, newRight);
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long number=sc.nextLong();
      long left = sc.nextLong();
      long right= sc.nextLong();

      System.out.println(count(number,left,right));
    }
  }
}
