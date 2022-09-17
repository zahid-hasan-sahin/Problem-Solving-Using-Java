import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class GCDofanArray {

    static class pair {

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] pr = new int[200010];

        for (int i = 2; i < 200010; i++) {
            if (pr[i] == 0) {
                pr[i] = i;
                for (long j = i * (long) i; j < 200010; j += i) {
                    pr[(int) j] = i;
                }
            }
        }

        int n = scan.nextInt();
        int q = scan.nextInt();
        HashMap<Integer, Integer>[] count = new HashMap[n + 1];
        MultiSet<Integer>[] mn = new MultiSet[200010];
        for (int i = 0; i < 100010; i++) {
            mn[i] = new MultiSet<Integer>();
        }
        for (int i = 0; i < n + 1; i++) {
            count[i] = new HashMap<Integer, Integer>();

        }
        int M = 1000000007;
        int i = 0;
        long ans = 1;
        while (i < n) {
            int in = scan.nextInt();
            while (in != 1) {
                int p = pr[in];

                if (!count[i].containsKey(p)) {
                    mn[p].add(0);
                    count[i].put(p, 0);
                }

                int best = mn[p].getFirst();

                mn[p].remove(count[i].get(p));

                int k = 0;
                if (count[i].containsKey(p)) {
                    k = count[i].get(p);
                }

                count[i].put(p, k + 1);
                mn[p].add(count[i].get(p));
                if (mn[p].size == n && best < mn[p].getFirst()) {
                    ans = ((ans % M) * (p % M)) % M;

                }
                in /= p;
            }

            ++i;

        }
        while (q-- > 0) {
            i = scan.nextInt() - 1;
            int in = scan.nextInt();
            while (in != 1) {
                int p = pr[in];

                if (!count[i].containsKey(p)) {
                    mn[p].add(0);
                    count[i].put(p, 0);
                }
                int best = mn[p].getFirst();

                mn[p].remove(count[i].get(p));

                int k = 0;
                if (count[i].containsKey(p)) {
                    k = count[i].get(p);
                }
                count[i].put(p, k + 1);
                mn[p].add(count[i].get(p));
                if (mn[p].size == n && best < mn[p].getFirst()) {
                    ans = ans * p % M;

                }
                in /= p;
            }
            System.out.println(ans);
        }

    }

}

class MultiSet<E> {

    int size = 0;
    TreeSet<E> set = new TreeSet<E>();
    private HashMap<E, Integer> occour = new HashMap<E, Integer>();

    void add(E v) {
        ++size;
        if (occour.containsKey(v)) {
            occour.put(v, occour.get(v) + 1);
            if (occour.get(v) == 1) {
                set.add(v);
            }
        } else {
            set.add(v);
            occour.put(v, 1);
        }
    }

    boolean isEmpty() {
        return set.isEmpty();
    }

    E getFirst() {
        for (E i : set) {

            return i;
        }
        return null;
    }

    void remove(E el) {
        if (occour.containsKey(el) && occour.get(el) >= 1) {
            --size;
            occour.put(el, occour.get(el) - 1);
            if (occour.get(el) == 0) {
                set.remove(el);
            }
        }
    }

    int setCount(E k) {
        return occour.get(k);
    }

    int size() {
        return size;
    }

}