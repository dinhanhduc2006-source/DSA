package codeptit;

import java.util.Scanner;

public class HeCoSoK {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int k = sc.nextInt();
      ;
      String a = sc.next();
      String b = sc.next();

      int i = a.length() - 1;// i la so thu vi tri thu i (se di tu phai sang trai) (vitri cuoi cung trong a)
      int j = b.length() - 1;
      int carry = 0; // so nho

      StringBuilder result= new StringBuilder();

      while (i >= 0 || j >= 0 || carry != 0) {
        int digitA = 0; // vi co the 2 so a va b khac so chu cho nen ban dau dat la 0
        int digitB = 0;

        if(i>=0){
          digitA = a.charAt(i)-'0';
          i--;
        }
        if (j>=0){
          digitB=b.charAt(j)-'0';
          j--;
        }

        int sum=digitB+digitA+carry;
        int digit=sum%k;
        carry=sum/k;

        result.append(digit);
      }
      result.reverse();
      System.out.println(result);
    }
  }
}
