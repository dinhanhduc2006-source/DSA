package stack;

import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThucHauTo1 {

  static int solve(String s) {
    Stack<String> stack = new Stack<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (Character.isLetterOrDigit(c)) {
        stack.push(String.valueOf(c));
      } else {
        String s1 = stack.pop();
        String s2 = stack.pop();
        int result = 0;
        if (c == '+') {
          result = Integer.parseInt(String.valueOf(s2)) + Integer.parseInt(String.valueOf(s1));
        } else if (c == '-') {
          result = Integer.parseInt(String.valueOf(s2)) - Integer.parseInt(String.valueOf(s1));
        } else if ((c == '*')) {
          result = Integer.parseInt(String.valueOf(s2)) * Integer.parseInt(String.valueOf(s1));
        } else if (c == '/') {
          result = Integer.parseInt(String.valueOf(s2)) / Integer.parseInt(String.valueOf(s1));
        }
        stack.push(String.valueOf(result));
      }
    }
    return Integer.parseInt(stack.pop());
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
