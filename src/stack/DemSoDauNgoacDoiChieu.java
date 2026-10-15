package stack;

import java.util.Scanner;
import java.util.Stack;

public class DemSoDauNgoacDoiChieu {

  static int solve(String s) {
    Stack<Character> stack = new Stack<>();

    int open = 0;
    int close = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        open++;
        stack.push(s.charAt(i));
      } else {
        if (!stack.empty() && stack.peek() == '(') {
          open--;
          stack.pop();
        } else {
          close++;
          stack.push(s.charAt(i));
        }
      }
    }
    int result = close / 2 + open / 2 + close % 2 + open % 2;
    //cứ mỗi 2 dấu ngoặc cùng loại dư thì cần 1 lần đổi; nếu còn lẻ 1 dấu thì cộng thêm 1 lần đổi.
    //    )(  →  ()
    return result;
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int t = sc.nextInt();
    while (t-->0){
      String s = sc.next();
      System.out.println(solve(s));
    }
  }
}
