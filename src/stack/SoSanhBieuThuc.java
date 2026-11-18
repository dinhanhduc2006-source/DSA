package stack;

import java.util.Scanner;
import java.util.Stack;

public class SoSanhBieuThuc {

  static String solve(String s1) {
    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    int sign = 1;
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s1.length(); i++) {
      char c = s1.charAt(i);

      if (c == '+') {
        sign = stack.peek();
      } else if (c == '-') {
        sign = -stack.peek();
      } else if (c == '(') {
        stack.push(sign);
      } else if (c == ')') {
        stack.pop();
      } else {

        if (result.length() > 0) {
          if (sign == 1) {
            result.append("+");
          } else {
            result.append("-");
          }
        } else if (sign == -1) {
          result.append("-");
        }

        result.append(c);
      }
    }
   return result.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-->0){
      String s1= sc.next();
      String s2 = sc.next();

      if (solve(s1).equals(solve(s2))){
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }
}
