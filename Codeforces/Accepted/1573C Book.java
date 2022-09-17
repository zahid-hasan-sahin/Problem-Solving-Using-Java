import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

import java.io.DataInputStream;
import java.io.FileInputStream;

import java.io.IOException;

public class cfContest1573 {

    public static void main(String args[]) throws IOException {
        Reader scan = new Reader();

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            Graph g = new Graph(n - 1);
            for (int i = 0; i < n; i++) {
                int m = scan.nextInt();
                for (int j = 0; j < m; j++) {
                    g.addEdge(scan.nextInt() - 1, i);
                }

            }
            HashSet<Integer> a = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                a.add(i);
            }
            int res = 0;
            g.make();
            while (a.size() != 0) {
                int p = a.size();
                ++res;

                g.TopologicalSort(a);
                if (p == a.size()) {
                    System.out.println("-1");
                    continue k;
                }
            }
            System.out.println(res);

        }
    }

}

class Graph {

    ArrayList<Integer>[] node;
    int size;
    int[] totalIn;

    Graph(int n) {
        size = n + 1;
        totalIn = new int[size];
        node = new ArrayList[size];
        for (int i = 0; i < size; i++) {
            node[i] = new ArrayList<Integer>();
        }
    }

    void addEdge(int v, int u) {
        node[v].add(u);
        totalIn[u]++;
    }
    static PriorityQueue<Integer> q = new PriorityQueue<Integer>();

    void make() {
        for (int i = 0; i < size; i++) {
            if (totalIn[i] == 0) {
                q.add(i);
            }
        }
    }

    void TopologicalSort(HashSet<Integer> h) {
        PriorityQueue<Integer> q2 = new PriorityQueue<Integer>();
        while (!q.isEmpty()) {
            int p = q.poll();
            h.remove(p);
            for (int child : node[p]) {
                --totalIn[child];
                if (totalIn[child] == 0) {
                    if (child > p) {
                        q.add(child);
                    } else {
                        q2.add(child);
                    }
                }
            }
        }

        q = q2;
    }

}

class Reader {

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
        byte[] buf = new byte[64]; // line length 
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