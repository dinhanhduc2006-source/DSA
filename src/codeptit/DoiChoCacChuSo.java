package codeptit;

import java.util.Scanner;

public class DoiChoCacChuSo {

  static String max;

  static void backtrack(char[] s, int i, int k) {
    if (k == 0 || i == s.length) {   //Dieu kien dung
      String current = new String(s);
      if (current.compareTo(max) > 0) {
        max = current;
      }
      return;
    }

    char lagest = s[i];//Coi so lon nhat la vi tri dau tien(i)

    for (int j = i + 1; j < s.length; j++) {     //tim so lon nhat gan vao lagest
      if (lagest < s[j]) {
        lagest = s[j];
      }
    }
    if (lagest == s[i]) {     // so dau tien la lon nhat roi thi tiesp tuc i+1
      backtrack(s, i + 1, k);
      return;
    }
    for (int j = i + 1; j < s.length; j++) {  //swap 2 vi tri
      if (s[j] == lagest) {
        char temp = s[j];
        s[j] = s[i];
        s[i] = temp;

        backtrack(s, i + 1, k - 1);

        temp = s[j];    // quay lui lai de co TH 2 so lon nhat
        s[j] = s[i];
        s[i] = temp;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int k= sc.nextInt();
      String s=sc.next();

      char[]  arr=s.toCharArray();

      max=s;

      backtrack(arr,0,k);

      System.out.println(max);
    }
  }
}
