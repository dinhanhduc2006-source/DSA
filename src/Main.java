import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedInputStream sc = new BufferedInputStream(System.in);

    int n = nextInt(sc);
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
      boolean first = true;

      for (int j = 0; j < n; j++) {
        int x = nextInt(sc);

        if (x == 1) {
          if (!first) {
            result.append(' ');
          }

          result.append(j + 1);
          first = false;
        }
      }

      result.append('\n');
    }

    System.out.print(result);
  }

  private static int nextInt(BufferedInputStream sc) throws IOException {
    int c;

    do {
      c = sc.read();
    } while (c <= ' ' && c != -1);

    int num = 0;

    while (c > ' ') {
      num = num * 10 + c - '0';
      c = sc.read();
    }

    return num;
  }
}