import java.util.ArrayList;
import java.util.Scanner;

public class BakryandPartitioning {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] a = new int[n + 1];
            int x = 0;
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
                x ^= a[i];
            }
            ArrayList<Integer>[] graph = new ArrayList[n + 1];
            for (int i = 0; i <= n; i++) {
                graph[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < n - 1; i++) {
                int u = scan.nextInt();
                int v = scan.nextInt();
                graph[u].add(v);
                graph[v].add(u);
            }
            if (x == 0) {
                System.out.println("YES");
            } else {
                if (k == 2) {
                    System.out.println("NO");
                    continue k;
                }
                int[] vis = new int[n + 1];
                int[] xor = new int[n + 1];
                int l = -1;
                int r = -1;

                checkXor(graph, 1, vis, xor, a, l);
                for (int i = 2; i <= n; i++) {
                    if (xor[i] == x) {
                        l = i;
                        break;
                    }
                }
                if (l == -1) {
                    System.out.println("NO");
                    continue k;
                }
                for (int i = 0; i <= n; i++) {
                    vis[i] = 0;
                    xor[i] = 0;
                }
                checkXor(graph, 1, vis, xor, a, l);
                for (int i = 2; i <= n; i++) {
                    if (xor[i] == x) {
                        r = i;
                    }
                }
                if (r == -1) {
                    System.out.println("NO");
                    continue k;
                }
                System.out.println("YES");

            }
        }
    }

    static void checkXor(ArrayList<Integer>[] graph, int curr, int[] vis, int[] xor, int[] val, int l) {
        if (curr == l) {
            return;
        }
        vis[curr] = 1;
        int x = 0;
        for (int i : graph[curr]) {
            if (vis[i] == 0) {
                checkXor(graph, i, vis, xor, val, l);
                x ^= xor[i];
            }
        }
        xor[curr] = x ^ val[curr];
    }
}