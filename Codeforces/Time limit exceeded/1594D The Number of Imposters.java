import java.util.ArrayList;
import java.util.Scanner;

public class TheNumberofImposters {

    static void addEdge(ArrayList<Integer>[] graph, int u, int v) {
        graph[u].add(v);
        graph[v].add(u);
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            ArrayList<Integer>[] graph = new ArrayList[2 * n + 1];
            for (int i = 0; i <= 2 * n; i++) {
                graph[i] = new ArrayList<Integer>();
            }
            int p = 0;
            for (int i = 0; i < m; i++) {
                int u = scan.nextInt();
                p = u;
                int v = scan.nextInt();
                String s = scan.next();
                if (s.equals("imposter")) {

                    addEdge(graph, u, v);
                } else {

                    addEdge(graph, n + u, u);
                    addEdge(graph, n + v, v);
                    addEdge(graph, n + v, u);
                    addEdge(graph, n + u, v);
                }
            }
            int[] vis = new int[2 * n + 1];
            int[] col = new int[2 * n + 1];
            for (int i = 0; i < 2 * n + 1; i++) {
                col[i] = -1;
            }

            long res = 0;

            for (int i = 1; i <= n; i++) {
                if (vis[i] == 0 && graph[i].size() != 0) {
                    int[] c = new int[2];
                    boolean ch = bip(graph, i, vis, col, 1, c, n);
                    if (!ch) {
                        System.out.println("-1");
                        continue k;
                    }

                    res += Math.min(c[0], c[1]);
                }
            }

            System.out.println(n - res);
        }

    }

    static boolean bip(ArrayList<Integer>[] graph, int curr, int[] vis, int[] color, int col, int[] c, int n) {

        vis[curr] = 1;
        color[curr] = col;
        if (curr <= n) {
            if (col == 1) {
                ++c[1];
            } else {
                c[0]++;
            }
        }
        for (int child : graph[curr]) {
            if (vis[child] == 0) {
                if (!bip(graph, child, vis, color, -col, c, n)) {
                    return false;
                }
            } else if (color[child] == color[curr]) {
                return false;
            }
        }
        return true;
    }

}