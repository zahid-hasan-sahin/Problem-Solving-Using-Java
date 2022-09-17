import java.util.*;
import java.io.*;

public class Bertownroads {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        Graph g = new Graph(n);
        int a = 0;
        int[] k = new int[m];
        int[] r = new int[m];
        for (int i = 0; i < m; i++) {
            a = scan.nextInt();
            int b = scan.nextInt();
            g.addEdge(a, b);
            k[i] = a;
            r[i] = b;
        }
        boolean b = g.findBridge(1);
        if (b) {
            for (int i = 0; i < m; i++) {
                System.out.println(k[i] + " " + r[i]);
            }
        } else {
            System.out.println("0");
        }

    }
}

class Graph {

    ArrayList<Integer>[] node;
    int size;
    boolean[] vis;
    int[] color;
    int counter = 1;
    int x = 1;
    int maxCount = 0;
    int timer = 0;

    Graph(int size) {
        this.size = size;
        node = new ArrayList[size + 1];
        vis = new boolean[size + 1];
        color = new int[size + 1];
        for (int i = 0; i < size + 1; i++) {
            node[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v) {
        node[u].add(v);
        node[v].add(u);
    }

    void dfsMain(int v) {
        System.out.print(v + " ");
        vis[v] = true;
        for (int i : node[v]) {
            if (!vis[i]) {
                dfsMain(i);
            }
        }
    }

    void dfs(int v) {
        //  O(E+V)

        cleanVisArray();

        dfsMain(v);
        System.out.println();
    }

    void cleanVisArray() {
        for (int i = 0; i < size + 1; i++) {
            vis[i] = false;
        }
    }

    int countConnectedComponenets() {
        //  O(E+V)

        cleanVisArray();

        int count = 0;
        for (int i = 1; i < size + 1; i++) {
            if (!vis[i]) {
                ++count;
                dfsMain(i);
            }
        }
        return count;
    }

    void ssspUsingDfsHelper(int v, int d, int[] store) {
        vis[v] = true;
        store[v] = d;
        for (int i : node[v]) {
            if (!vis[i]) {
                ssspUsingDfsHelper(i, d + 1, store);
            }
        }
    }

    void ssspUsingDfs(int v) {
        //  Only Working For Tree
        //  O(V+E)

        cleanVisArray();

        int[] store = new int[size + 1];
        ssspUsingDfsHelper(v, 0, store);
        for (int i = 1; i < size + 1; i++) {
            System.out.print(store[i] + " ");
        }
        System.out.println();
    }

    boolean bipartiteHelper(int v, int c) {
        vis[v] = true;
        color[v] = c;
        for (int i : node[v]) {
            if (!vis[i]) {
                if (!bipartiteHelper(i, c ^ 1)) {
                    return false;
                }
            } else if (color[v] == color[i]) {
                return false;
            }
        }
        return true;

    }

    boolean isBipartite(int v, int c) {
        //  O(E+V)

        cleanVisArray();

        return bipartiteHelper(v, c);

    }

    boolean cycleHelper(int v, int p) {
        vis[v] = true;
        for (int i : node[v]) {
            if (!vis[i]) {
                return cycleHelper(i, v);
            } else if (i != p) {
                return true;
            }
        }
        return false;
    }

    boolean isContainCycle() {
        //  O(E+V)
        cleanVisArray();

        return cycleHelper(1, 1);
    }

    void inOutTimeHelper(int v, int[] in, int[] out) {
        vis[v] = true;
        in[v] = counter++;
        for (int i : node[v]) {
            if (!vis[i]) {
                inOutTimeHelper(i, in, out);
            }
        }
        out[v] = counter++;
    }

    void inOutTime(int[] in, int[] out) {
        //  O(E+V)

        cleanVisArray();

        inOutTimeHelper(1, in, out);
    }

    void findDiameterOfTreeHelper(int v, int c) {
        vis[v] = true;
        ++c;
        if (c > maxCount) {
            maxCount = c - 1;
            x = v;
        }
        for (int i : node[v]) {
            if (!vis[i]) {

                findDiameterOfTreeHelper(i, c);
            }
        }
    }

    void findDiameterOfTree(int v) {
        cleanVisArray();
        findDiameterOfTreeHelper(v, 0);
        int endPoint1 = x;
        x = 0;
        maxCount = 1;
        cleanVisArray();
        findDiameterOfTreeHelper(endPoint1, 0);
        int endPoint2 = x;
        System.out.println(endPoint1 + " " + endPoint2 + " " + maxCount);
    }

    int subTreeSizeHelper(int v, int[] res) {
        vis[v] = true;
        int count = 1;
        for (int i : node[v]) {
            if (!vis[i]) {
                count += subTreeSizeHelper(i, res);
            }
        }
        res[v] = count;
        return count;
    }

    void subTreeSize(int v) {
        cleanVisArray();
        int[] res = new int[size + 1];
        subTreeSizeHelper(v, res);
        for (int i = 1; i < size + 1; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }

    void bfs(int v) {
        cleanVisArray();
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(v);
        vis[v] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");
            for (int i : node[curr]) {
                if (!vis[i]) {
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
        System.out.println();
    }

    void sssp(int v) {
        cleanVisArray();
        Queue<Integer> q = new LinkedList<Integer>();

        int[] dis = new int[size + 1];
        q.add(v);
        vis[v] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();

            for (int i : node[curr]) {
                if (!vis[i]) {
                    vis[i] = true;
                    dis[i] = dis[curr] + 1;
                    q.add(i);

                }
            }
        }
        for (int i = 1; i < size + 1; i++) {
            System.out.print(dis[i] + " ");
        }
        System.out.println();
    }

    void findBridgeHelper(int v, int par, int[] in, int[] low) {
        vis[v] = true;

        in[v] = low[v] = timer++;
        for (int child : node[v]) {
            if (child == par) {
                continue;
            } else if (vis[child]) {
                low[v] = Math.min(low[v], in[child]);
            } else {
                findBridgeHelper(child, v, in, low);
                if (low[child] > in[v]) {
                    ++x;
                }
                low[v] = Math.min(low[v], low[child]);
            }
        }
    }

    boolean findBridge(int v) {
        cleanVisArray();
        int[] in = new int[size + 1];
        int[] low = new int[size + 1];
        timer = 0;
        findBridgeHelper(v, -1, in, low);
        return x == 1;
    }

}