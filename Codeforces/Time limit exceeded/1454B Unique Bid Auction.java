import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class UniqueBidAuction {

    public static void main(String args[]) {
        Reader scan = new Reader();
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[30000000];
            int mx = 0;
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                mx = Math.max(mx, in);
                ++a[in];
                b[i] = in;
            }
            int res = -1;
            for (int i = 0; i <= mx; i++) {
                if (a[i] == 1) {
                    res = i;
                    break;
                }
            }
            if (res == -1) {
                sb.append(-1 + "\n");
            } else {
                for (int i = 0; i < n; i++) {
                    if (b[i] == res) {
                        sb.append(i + 1 + "\n");
                    }
                }
            }

        }
        System.out.println(sb);
    }

    public static class Reader {

        BufferedReader br;
        StringTokenizer st;

        public Reader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
}