import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TwoArraysandSumofFunctions {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<element> a = new ArrayList<element>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        long[] ta = new long[n];
        for (int i = 0; i < n; i++) {
            long in = scan.nextInt();
            long p = in * ((i + 1) * (n - (i + 1) + 1));
            a.add(new element(i, p));
            ta[i] = p;
        }
        for (int i = 0; i < n; i++) {
            b.add(scan.nextInt());
        }
        Collections.sort(a, new myCom());
        Collections.sort(b, Collections.reverseOrder());

        long[] tb = new long[n];
        for (int i = 0; i < n; i++) {
            tb[a.get(i).ind] = b.get(i);
        }
        long res = 0;
        long mod = 998244353;
        for (int i = 0; i < n; i++) {

            res += ((ta[i] % mod) * (tb[i]) % mod) % mod;
            res %= mod;
        }
        System.out.println(res);
    }

}

class myCom implements Comparator<element> {

    @Override
    public int compare(element a, element b) {
        if (a.val == b.val) {
            return 0;
        } else if (a.val < b.val) {
            return -1;
        } else {
            return 1;
        }
    }

}

class element {

    int ind;
    long val;

    element(int i, long v) {
        ind = i;
        val = v;
    }

}