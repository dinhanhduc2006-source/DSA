package stack;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucTangGiam {

  static String solve(String s) {
    Stack<Integer> stack = new Stack<>();
    StringBuilder result = new StringBuilder();

    int number = 1;

    for (int i = 0; i <= s.length(); i++) {
      stack.push(number);
      number++;
      if (i==s.length() ||s.charAt(i) == 'I' ) {
        while (!stack.empty()) {
          result.append(stack.pop());
        }
      }
    }
    return result.toString();
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
