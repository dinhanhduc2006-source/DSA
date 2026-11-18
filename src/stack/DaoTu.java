package stack;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();

    while (t-- > 0) {
      String s = sc.nextLine();

      String [] words =s.split(" ");

      Stack<String> stack = new Stack<>();

      StringBuilder result = new StringBuilder();
      for (int i = 0; i < words.length; i++) {

        stack.push(words[i]);
      }

      while (!stack.empty()) {
        System.out.print(stack.pop()+" ");
      }
      System.out.println();
    }
  }
}
