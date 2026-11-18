package stack;

import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThucTrungTo {

  static int priority(char c) {
    if (c == '*' || c == '/') {
      return 2;
    } else if (c == '+' || c == '-') {
      return 1;
    }
    return 0;
  }

  static long calculator(long s2, long s1, char c) {
    if (c == '+') {
      return s1 + s2;
    } else if (c == '-') {
      return s1 - s2;
    } else if (c == '*') {
      return s1 * s2;
    }
    return s1 / s2;
  }

  static long solve(String s) {
    Stack<Long> numbers = new Stack<>();
    Stack<Character> operators = new Stack<>();

    long result = 0;

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == '(') {
        operators.push(c);
      } else if (c == ')') {
        while (!operators.empty() && operators.peek() != '(') {

          result = calculator(numbers.pop(), numbers.pop(), operators.pop());

          numbers.push(result);
        }
        operators.pop();
      } else if (Character.isDigit(c)) {

        long number = 0;

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
          number = 10 * number + (s.charAt(i) - '0');
          i++;
        }

        numbers.push(number);

        i--;
      } else {
        while (!operators.empty() && operators.peek() != '('
            && priority(operators.peek()) >= priority(c)) {
          result = calculator(numbers.pop(), numbers.pop(), operators.pop());
          numbers.push(result);
        }
        operators.push(c);
      }
    }
    while (!operators.empty() && operators.peek() != '(') {
      result = calculator(numbers.pop(), numbers.pop(), operators.pop());
      numbers.push(result);
    }

    return numbers.pop();
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
