import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> std = new ArrayList<Integer>();
        int p = 0;
        int m = 0;
        int pe = 0;
        for (int i = 0; i < n; i++) {
            std.add(i, scan.nextInt());
            if (std.get(i) == 1) {
                ++p;
            } else if (std.get(i) == 2) {
                ++m;
            } else {
                ++pe;
            }
        }
        int total = Math.min(p, Math.min(m, pe));
        System.out.println(total);
        int team = 0;
        int i = 0;
        int tp = 0;
        int tm = 0;
        int tpe = 0;
        while (team != total) {
            int val = std.get(i);
            if (val == 1) {
                tp = i;
            } else if (val == 2) {
                tm = i;
            } else if (val == 3) {
                tpe = i;
            }

            if (tp > 0 && tm > 0 && tpe > 0) {
                System.out.println((tp + 1) + " " + (tm + 1) + " " + (tpe + 1));
                std.set(tp,0);
                std.set(tm, 0);
                std.set(tpe, 0);               
                tp = 0;
                tm = 0;
                tpe = 0;
                i = 0;
                ++team;
            }
            ++i;
        }
    }

}