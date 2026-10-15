package stack;

import java.util.Scanner;
import java.util.Stack;

public class TinhGiaTriBieuThucTrungTo {

  static int priority(char c) {
    if (c == '*' || c == '/') {
      return 2;
    } else {
      return 1;
    }
  }
  static int calculate(int s1,int s2, char c){
    int result= 0;
    if (c =='+'){
      result=s1+s2;
    } else if (c=='-') {
      result=s1-s2;
    } else if (c=='*') {
      result=s1*s2;
    } else {
      result=s1/s2;
    }
    return result;
  }

  static int solve(String s) {
    Stack<Integer> numbers = new Stack<>();
    Stack<Character> operators = new Stack<>(); //luu toan tu va dau ( )

    int result=0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (Character.isDigit(c)) {
        numbers.push(Integer.parseInt(String.valueOf(c)));
      } else if (c == '(') {
        operators.push(c);
      } else if (c== ')') {
        while (!(operators.peek() == '(')){
          result= calculate(numbers.pop(),numbers.pop(),c);
        }
        numbers.push(result);
        operators.pop();
      } else {
        while (priority(operators.peek())>=priority(c) && !operators.empty()){
          result=calculate(numbers.pop(),numbers.pop(),operators.pop());
        }
        operators.push(c);
      }
    }
    while (!numbers.empty()){
      if(operators.peek()!='('){
        result=calculate(numbers.pop(),numbers.pop(),operators.pop());
      } else {
        operators.pop();
      }
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t =sc .nextInt();
    while (t-->0){
      String s =sc.next();
      System.out.println(solve(s));
    }
  }
}
