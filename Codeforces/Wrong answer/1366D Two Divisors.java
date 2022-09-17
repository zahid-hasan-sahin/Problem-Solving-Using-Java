import java.util.ArrayList;
import java.util.Scanner;

public class TwoDivisors {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        StringBuilder x = new StringBuilder();
        StringBuilder y = new StringBuilder();
        int q = scan.nextInt();
        int pr[] = new int[10000010];
        for (int i = 2; i < 10000010; i++) {
            if (pr[i] == 0) {
                for (int j = i; j < 10000010; j += i) {
                    if (pr[j] == 0) {
                        pr[j] = i;
                    }
                }
            }
        }
        while (q-- > 0) {
            int n = scan.nextInt();
            int a = -1;
            int i = n;
            int b = -1;
            ArrayList<Integer> e = new ArrayList<Integer>();
            long t = 1;
            while (i != 1) {
                e.add(pr[i]);
                t *= pr[i];
                i = i / pr[i];

            }

            if (e.get(0) != e.get(e.size() - 1)) {
                a = e.get(0);
                while (t % a == 0 && t != 0) {
                    t = t / a;
                }
                if (t == 0) {
                    a = -1;
                    b = -1;
                } else {
                    b = (int) t;
                }
            }
            x.append(a + " ");
            y.append(b + " ");
        }
        System.out.println(x);
        System.out.println(y);

    }

}