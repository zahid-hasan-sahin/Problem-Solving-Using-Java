import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LinovaandKingdom {

    static ArrayList<store> a = new ArrayList<store>();

    static void dfs(ArrayList<Integer>[] node, int curr, int lvl, int[] vis) {
        a.add(new store(curr, lvl, lvl - node[curr].size() + 1));
        vis[curr] = 1;
        for (int i : node[curr]) {
            if (vis[i] == 0) {
                dfs(node, i, lvl + 1, vis);
            }
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Integer>[] node = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            node[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < n - 1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            node[u].add(v);
            node[v].add(u);

        }
        int[] vis = new int[n + 1];
        dfs(node, 1, 0, vis);
        Collections.sort(a, new myCom());

        long res = 0;
        for (int i = 0; i < k; i++) {
           
            res += a.get(i).val;
          
        }
        System.out.println(res);
    }
}

class myCom implements Comparator<store> {

    @Override
    public int compare(store a, store b) {
        if (a.val == b.val) {
            return 0;
        } else if (a.val > b.val) {
            return -1;
        } else {
            return 1;
        }
    }

}

class store {

    int lvl, ind;
    int val;

    store(int i, int l, int c) {
        ind = i;
        lvl = l;
        val = c;
    }
}