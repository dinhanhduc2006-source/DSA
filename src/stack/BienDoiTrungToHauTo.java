package stack;

import java.util.Scanner;
import java.util.Stack;

public class BienDoiTrungToHauTo {

  static int priority(char c) {
    if (c == '^') {
      return 3;
    } else if (c == '*' || c == '/') {
      return 2;
    } else if (c == '+' || c == '-') {
      return 1;
    }
    return 0;
  }

  static String solve(String s) {
    Stack<Character> stack = new Stack<>();
    String result = "";

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == '(') {
        stack.push(c);
      } else if (Character.isLetterOrDigit(c)) {
        result += c;
      } else if (c == ')') {
        while (!stack.empty() && stack.peek() != '(') {
          result += stack.peek();
          stack.pop();
        }
        if (!stack.empty()) {
          stack.pop();
        }
      } else {
        while (!stack.empty() && priority(stack.peek()) >= priority(c) && stack.peek() != '(') {
          result += stack.peek();
          stack.pop();
        }
        stack.push(c);
      }
    }
    while (!stack.empty()) {
      if (stack.peek() != '(') {
        result += stack.pop();
      } else {
        stack.pop();
      }


    }
    return result;
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
