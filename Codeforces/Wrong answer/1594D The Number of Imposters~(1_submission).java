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

            boolean ch = bip(graph, p, vis, col, 1);

            if (!ch) {
                System.out.println("-1");
            } else {
                int mi = 0;
                int pi = 0;
                for (int i = 1; i <= n; i++) {

                    if (col[i] == -1) {
                        ++mi;
                    } else if (col[i] == 1) {
                        ++pi;
                    }
                }

                System.out.println(n - Math.min(mi, pi));
            }

        }
    }

    static boolean bip(ArrayList<Integer>[] graph, int curr, int[] vis, int[] color, int col) {

        vis[curr] = 1;
        color[curr] = col;
        for (int child : graph[curr]) {
            if (vis[child] == 0) {
                if (!bip(graph, child, vis, color, -col)) {
                    return false;
                }
            } else if (color[child] == color[curr]) {

                return false;
            }
        }
        return true;
    }

}