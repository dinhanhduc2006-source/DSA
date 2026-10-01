package codeptit;

import java.util.Scanner;

public class SapXepXauKiTu1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t =sc.nextInt();
    while (t-->0){
      String s=sc.next();
      int [] count = new int [26];
      for (int i=0;i<s.length();i++){
        count[s.charAt(i) - 'a']++;
      }

      int max=0;

      for (int i=0;i<26;i++){
        if (count[i]>max){
          max=count[i];
        }
      }
      if (max>(s.length()+1)/2){
        System.out.println(-1);
      } else {
        System.out.println(1);
      }
    }
  }
}
