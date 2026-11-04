package sinhketiep;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TimBoiSo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();

      Queue<String> queue = new LinkedList<>();

      queue.add("9");

      while (!queue.isEmpty()) {
        String x = queue.poll();

        int remainder = 0;

        for (int i = 0; i < x.length(); i++) {
          remainder = (remainder * 10 +( x.charAt(i) - '0')) % n;
        }

        if (remainder == 0){
          System.out.println(x);
          break;
        }

        queue.add(x+"0");
        queue.add(x+"9");
      }

    }
  }
}
