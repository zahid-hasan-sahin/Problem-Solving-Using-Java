import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PriceFixed {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        st[] a = new st[n];
        st[] dec = new st[n];
        for (int i = 0; i < n; i++) {
            a[i] = new st();
            dec[i] = new st();
        }

        for (int i = 0; i < n; i++) {
            a[i].need = scan.nextLong();
            a[i].val = scan.nextLong();

            dec[i].need = a[i].need;
            dec[i].val = a[i].val;
        }
        Arrays.sort(dec, new myCom1());

        int l = 0;
        int r = n - 1;
        long tot = 0;
        long res = 0;
        while (l < r) {
            if (tot >= dec[r].val) {
                res += dec[r].need;
                tot += dec[r].need;
                --r;
                continue;
            }
            if (tot + dec[l].need >= dec[r].val) {
                long k = dec[r].val - tot;
                res += (k * 2);
                tot += k;
                dec[l].need -= k;
                res += (dec[r].need);
                tot += (dec[r].need);
                --r;
            } else {
                res += (dec[l].need * 2);
                tot += (dec[l].need);
                ++l;
            }
        }

        if (dec[l].need != 0 && tot + dec[l].need >= dec[l].val) {
            long k = dec[l].val - tot;
            res += (k * 2);
            dec[l].need -= k;
            res += dec[l].need;
        } else {
            res += (dec[l].need * 2);
        }

        System.out.println(res);
    }

}

class st {

    long val, need;

}

class myCom1 implements Comparator<st> {

    @Override
    public int compare(st ob1, st ob2) {
        long f = ob1.val;
        long l = ob2.val;
        return (int) (l - f);

    }

}