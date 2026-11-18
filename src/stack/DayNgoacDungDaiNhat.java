package stack;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {

  static int solve(String s) {
    Stack<Integer> stack = new Stack<>();

    stack.push(-1);
    int max = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(') {
        stack.push(i);
      } else {
        stack.pop();
        if (stack.empty()) {
          stack.push(i);
        } else {
          int length = i - stack.peek();
          max = Math.max(max, length);
        }
      }
    }
    return max;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      System.out.println(solve(s));
    }
  }
}
