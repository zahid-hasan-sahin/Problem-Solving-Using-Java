import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class RecursiveQueries {

    static int f(int n) {
        String s = String.valueOf(n);
        int res = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                res *= (s.charAt(i) - '0');
            }
        }
        return res;
    }

    static int g(int n) {
        if (n < 10) {
            return n;
        }
        return g(f(n));
    }

    public static void main(String args[]) {
        Reader scan = new Reader();
        int[] a = new int[1000010];
        for (int i = 0; i < 1000010; i++) {
            a[i] = g(i);
        }
        int[][] res = new int[10][1000010];
        for (int i = 1; i <= 9; i++) {
            int k = 0;
            for (int j = 0; j < 1000010; j++) {
                if (a[j] == i) {
                    ++k;
                }
                res[i][j] = k;
            }
        }
        StringBuilder sb = new StringBuilder();

        int t = scan.nextInt();
        while (t-- > 0) {
            int l = scan.nextInt();
            int r = scan.nextInt();
            int p = scan.nextInt();
            sb.append(res[p][r] - res[p][l - 1] + "\n");
        }
        System.out.println(sb);

    }

    static class Reader {

        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(InputStream in) {
            try {
                din = new DataInputStream(in);
            } catch (Exception e) {
                throw new RuntimeException();
            }
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String next() {
            int c;
            while ((c = read()) != -1 && (c == ' ' || c == '\n' || c == '\r'));
            StringBuilder s = new StringBuilder();
            while (c != -1) {
                if (c == ' ' || c == '\n' || c == '\r') {
                    break;
                }
                s.append((char) c);
                c = read();
            }
            return s.toString();
        }

        public String nextLine() {
            int c;
            while ((c = read()) != -1 && (c == ' ' || c == '\n' || c == '\r'));
            StringBuilder s = new StringBuilder();
            while (c != -1) {
                if (c == '\n' || c == '\r') {
                    break;
                }
                s.append((char) c);
                c = read();
            }
            return s.toString();
        }

        public int nextInt() {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg) {
                return -ret;
            }
            return ret;
        }

        public int[] readIntArray(int n) {
            int[] ar = new int[n];
            for (int i = 0; i < n; ++i) {
                ar[i] = nextInt();
            }
            return ar;
        }

        public long nextLong() {
            long ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg) {
                return -ret;
            }
            return ret;
        }

        public long[] readLongArray(int n) {
            long[] ar = new long[n];
            for (int i = 0; i < n; ++i) {
                ar[i] = nextLong();
            }
            return ar;
        }

        public double nextDouble() {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) {
                c = read();
            }
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }
            if (neg) {
                return -ret;
            }
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
            if (bytesRead == -1) {
                buffer[0] = -1;
            }
        }

        private byte read() {
            try {
                if (bufferPointer == bytesRead) {
                    fillBuffer();
                }
                return buffer[bufferPointer++];
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }

        public void close() throws IOException {
            if (din == null) {
                return;
            }
            din.close();
        }
    }

}