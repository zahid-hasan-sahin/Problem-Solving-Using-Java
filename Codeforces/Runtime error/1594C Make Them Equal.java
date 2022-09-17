import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1594 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            char c = scan.next().charAt(0);
            char[] a = scan.next().toCharArray();
            char[] s = new char[n];
            for (int i = 0; i < n; i++) {
                s[i] = a[i];
            }
            boolean ch = true;
            for (int i = 0; i < n; i++) {
                if (a[i] != c) {
                    ch = false;
                }
            }
            if (ch) {
                System.out.println("0");
                continue k;
            }

            int p = -1;
            for (int i = 0; i < n; i++) {
                if (a[i] == c) {
                    p = i;
                }
            }
            ++p;
       
            for (int i = 0; i < n; i++) {
                if ((i + 1) % p != 0) {
                    a[i] = c;
                }
            }
            boolean b = false;
            for (int i = 0; i < n; i++) {
                if (a[i] != c) {
                    b = true;
                }
            }
            if (!b) {

                System.out.println(1);
                System.out.println(p);
                continue k;
            }

            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n - 1; i++) {
                if (s[i] != c) {
                    ar.add(n);
                    break;
                }
            }
            if (s[n - 1] != c) {
                ar.add(n - 1);
            }
            System.out.println(ar.size());
            for (int i = 0; i < ar.size(); i++) {
                if (ar.size() == i + 1) {
                    System.out.println(ar.get(i));
                } else {
                    System.out.print(ar.get(i) + " ");
                }
            }

        }

    }
}