import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] s = br.readLine().trim().toCharArray();
    int q = Integer.parseInt(br.readLine().trim());

    StringBuilder sb = new StringBuilder();
    while (q-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      char type = st.nextToken().charAt(0);
      if (type == 'q') {
        int l = Integer.parseInt(st.nextToken()) - 1;
        int r = Integer.parseInt(st.nextToken()) - 1;
        boolean ok = true;
        while (l < r) {
          if (s[l] != s[r]) {
            ok = false;
            break;
          }
          l++;
          r--;
        }
        sb.append(ok ? "YES\n" : "NO\n");
      } else {
        int u = Integer.parseInt(st.nextToken()) - 1;
        char x = st.nextToken().charAt(0);
        s[u] = x;
      }
    }
    System.out.print(sb);
  }
}