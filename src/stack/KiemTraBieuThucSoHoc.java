package stack;


import java.util.Scanner;
import java.util.Stack;

public class KiemTraBieuThucSoHoc {

  static String solve (String s) {
    Stack<Character> stack = new Stack<>();

    for (int i=0;i<s.length();i++){
      if (s.charAt(i) != ')'){
        stack.push(s.charAt(i));
      } else {
        boolean found = false;
        while (!(stack.peek() == '(')){
          char c=stack.pop();
          if (c=='+' || c=='-' || c=='*' || c=='/'){
            found=true;
          }
        }
        stack.pop();  //xoa dau ngoac '('
        if (!found){
          return "Yes";
        }
      }
    }
    return "No";
  }


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    sc.nextLine();

    while (t-->0){
      String s = sc.nextLine();
      System.out.println(solve(s));
    }
  }
}
