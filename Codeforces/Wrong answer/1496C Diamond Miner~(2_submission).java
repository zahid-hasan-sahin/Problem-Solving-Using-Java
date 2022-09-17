import java.util.*;
import java.lang.*;
import java.io.*;

public class NewClass3 {

    public static class st {

        int x, y;

    }

    public static class myCom1 implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.y;
            int l = ob2.y;
            return f - l;

        }

    }

    public static class myCom2 implements Comparator<st> {

        @Override
        public int compare(st ob1, st ob2) {
            int f = ob1.x;
            int l = ob2.x;
            return f - l;

        }

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = scan.nextInt();
            NewClass3.st[] di = new NewClass3.st[n];
            NewClass3.st[] mi = new NewClass3.st[n];
            for (int i = 0; i < n; i++) {
                di[i] = new st();
                mi[i] = new st();
            }
            int p = 0;
            int q = 0;
            for (int i = 0; i < 2 * n; i++) {
                int x = Math.abs(scan.nextInt());
                int y = Math.abs(scan.nextInt());
                if (x == 0) {
                    mi[p].x = x;
                    mi[p++].y = y;
                } else {
                    di[q].x = x;
                    di[q++].y = y;
                }
            }       
            Arrays.sort(mi, new myCom1());
            Arrays.sort(di, new myCom2());
            double res = 0;
            for (int i = 0; i < n; i++) {

                res += Math.sqrt((double)(di[i].x * di[i].x) + (double)(mi[i].y * mi[i].y));
              
            }
            sb.append(res+"\n");
        }
        System.out.println(sb);
    }
}