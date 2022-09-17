import java.util.ArrayList;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TwoDivisors {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();
        int q = scan.nextInt();
        int[] pr = new int[10000010];
        for (long i = 2; i < 10000010; i++) {
            if (pr[(int) i] == 0) {
                for (long j = i * i; j < 10000010; j += i) {
                    pr[(int) j] = 1;
                }
            }
        }
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while (q-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    while (n % i == 0) {
                        n = n / (int) i;
                    }
                    a.add((int) i);
                }
            }
            if (n >= 2) {
                a.add(n);
            }
            int l = -1;
            int r = -1;
            int e = a.size();
            for (int i = 0; i < e; i++) {
                for (int j = 0; j < e; j++) {
                    if (pr[a.get(i) + a.get(j)] == 0) {
                        l = a.get(i);
                        r = a.get(j);
                        break;
                    }
                }
            }
            s1.append(l + " ");
            s2.append(r + " ");
        }
        System.out.println(s1);
        System.out.println(s2);

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

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64];
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    break;
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
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

        public long nextLong() throws IOException {
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

        public double nextDouble() throws IOException {
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

        private byte read() throws IOException {
            if (bufferPointer == bytesRead) {
                fillBuffer();
            }
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null) {
                return;
            }
            din.close();
        }
    }

}