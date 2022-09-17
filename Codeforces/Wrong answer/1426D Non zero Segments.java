import java.awt.event.InputEvent;
import java.lang.Thread;
import java.util.Scanner;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class NonzeroSegments {

    public static class st {

        int l, r;

    }

    public static class myCom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.l;
            int l = ob2.l;
            if (f == l) {
                return ob2.r - ob1.r;
            }
            return f - l;
        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        a[0] = scan.nextInt();
        for (int i = 1; i < n; i++) {
            a[i] = a[i - 1] + scan.nextInt();
        }
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        NonzeroSegments.st[] ob = new NonzeroSegments.st[n];
        int k = 0;
        h.put(0, -1);

        for (int i = 0; i < n; i++) {
            int p = a[i];
            if (h.containsKey(p)) {
                ob[k] = new st();
                ob[k].l = h.get(p) + 2;
                ob[k].r = i + 1;
                h.put(p, i);
                ++k;
            } else {
                h.put(p, i);
            }
        }

        Arrays.sort(ob, 0, k, new myCom());

        int r = -11;
        int c = 0;
        int l = 88898809;
        for (int i = 0; i < k; i++) {
            if ((ob[i].l >= l && ob[i].l < r)) {
            } else {
                ++c;
            }
            r = ob[i].r;
            l = ob[i].l;

        }

        System.out.println(c);
    }
}