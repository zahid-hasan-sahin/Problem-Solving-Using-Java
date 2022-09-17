import java.util.*;
import java.io.*;

public class Bertownroads {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n);
        for (int i = 0; i < m; i++) {
            g.addEdge(scan.nextInt(), scan.nextInt());
        }
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        boolean[] bol = {false};
        g.isBridge(1, -1, a, b, bol);
      
        if (bol[0]) {
            System.out.println("0");
        } else {
            for (int i = 0; i < a.size(); i++) {
                  System.out.println(a.get(i) + " " + b.get(i));
            }
        }

    }

}

class Graph {

    ArrayList<Integer>[] node;
    int n;
    boolean[] vis;
    int[] in;
    int[] low;
    int timer;

    Graph(int size) {
        n = size + 1;
        vis = new boolean[n];
        in = new int[n];
        low = new int[n];
        timer = 0;
        node = new ArrayList[size + 1];
        for (int i = 0; i < size + 1; i++) {
            node[i] = new ArrayList<Integer>();
        }

    }

    void addEdge(int v, int u) {
        node[v].add(u);
        node[u].add(v);
    }

    void isBridge(int v, int par, ArrayList<Integer> a, ArrayList<Integer> b, boolean[] bol) {
        vis[v] = true;
        low[v] = in[v] = timer++;
        for (int child : node[v]) {
            if (child == par) {
                continue;
            } else if (vis[child]) {
                low[v] = Math.min(low[v], in[child]);
                if (in[child] < in[v]) {
                    a.add(v);
                    b.add(child);
                }
            } else {
                a.add(v);
                b.add(child);
                isBridge(child, v, a, b, bol);

                if (low[child] > in[v]) {
                    bol[0] = true;
                    return;
                }
                low[v] = Math.min(low[v], low[child]);
            }
        }

    }

    
}