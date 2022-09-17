import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class DishonestSellers {

    public static class st {

        int f, l;
        long d;
    }

    public static class mycom implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            long f = ob1.d;
            long l = ob2.d;
            return f > l ? 1 : -1;

        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        DishonestSellers.st[] ob = new DishonestSellers.st[n];
        for (int i = 0; i < n; i++) {
            ob[i] = new st();
            ob[i].f = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            ob[i].l = scan.nextInt();
            ob[i].d = ob[i].f - ob[i].l;
        }
        Arrays.sort(ob, new mycom());
        long r = 0;
        int i = 0;
        while (ob[i].d <= 0 || k > 0) {
            r += ob[i].f;
            ++i;
            --k;
            if (i >= n) {
                break;
            }
        }
        for (int j = i; j < n; j++) {
            r += ob[j].l;
        }
        System.out.println(r);

    }

}