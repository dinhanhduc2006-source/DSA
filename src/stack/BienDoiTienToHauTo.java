package stack;

import java.util.Scanner;
import java.util.Stack;

public class BienDoiTienToHauTo {

  static String solve(String s) {
    Stack<String> stack = new Stack<>();

    for (int i = s.length() - 1; i >= 0; i--) {
      char c = s.charAt(i);

      if (Character.isLetterOrDigit(c)) {
        stack.push(String.valueOf(c));
      } else {
        String s1 = stack.pop();
        String s2 = stack.pop();

        String temp = s1 + s2 + c;

        stack.push(temp);
      }
    }
    return stack.pop();
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
