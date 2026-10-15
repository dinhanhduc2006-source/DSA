package stack;

import java.util.Scanner;
import java.util.Stack;

public class NganXep1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stack<Integer> stack = new Stack<>();

    while (sc.hasNext()) {
      String s = sc.next();
      if (s.equals("push")) {

        int n = sc.nextInt();
        stack.push(n);

      } else if (s.equals("pop")) {

        if (!stack.empty()) {
          stack.pop();
        }

      } else if (s.equals("show")) {

        if (stack.empty()) {

          System.out.println("empty");
        } else {

          for (int i = 0; i < stack.size(); i++) {
            if (i>0) {
              System.out.print(" ");
            }
            System.out.print(stack.get(i) );
          }
          System.out.println();
        }
      }
    }
  }
}

