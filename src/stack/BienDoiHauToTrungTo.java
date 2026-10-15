package stack;

import java.util.Scanner;
import java.util.Stack;

public class BienDoiHauToTrungTo {
  static String solve (String s){
    Stack<String> stack = new Stack<>();
    for (int i=0;i<s.length();i++){
      char c = s.charAt(i);

      if (Character.isLetterOrDigit(c)){
        stack.push(String.valueOf(c));
      } else {
        String s1= stack.pop();
        String s2=stack.pop();

        String tmp="("+s2+c+s1+")";
        stack.push(tmp);
      }
    }
    return stack.pop();
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0){
      String s = sc.next();
      System.out.println(solve(s));
    }
  }
}
