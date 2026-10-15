package stack;

import java.util.Scanner;
import java.util.Stack;

public class NganXep2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Stack<Integer> stack = new Stack<>();

    while (n-- > 0) {
      String s = sc.next();

      if (s.equals("PUSH")) {
        int x = sc.nextInt();
        stack.push(x);
      } else if (s.equals("PRINT")) {
        if (stack.empty()){
          System.out.println("NONE");
        } else {
          System.out.println(stack.peek());
        }
      } else if (s.equals("POP")) {
        if(!stack.empty()){
          stack.pop();
        }
      }
    }
  }
}
