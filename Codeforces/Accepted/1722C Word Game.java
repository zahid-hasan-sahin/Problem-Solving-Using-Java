import java.util.HashMap;
import java.util.Scanner;

public class cfContest1722 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            HashMap<String, Integer> a = new HashMap<String, Integer>();
            HashMap<String, Integer> b = new HashMap<String, Integer>();
            HashMap<String, Integer> c = new HashMap<String, Integer>();
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                a.put(s, 1);
            }
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                b.put(s, 1);
            }
            for (int i = 0; i < n; i++) {
                String s = scan.next();
                c.put(s, 1);
            }
            int x = 0;
            int y = 0;
            int z = 0;
            for (String i : a.keySet()) {
                int p = 0;
                if (b.containsKey(i)) {
                    ++p;
                }
                if (c.containsKey(i)) {
                    ++p;
                }
                if (p == 0) {
                    x += 3;
                }
                if (p == 1) {
                    x += 1;
                }

            }

            for (String i : b.keySet()) {
                int p = 0;
                if (c.containsKey(i)) {
                    ++p;
                }
                if (a.containsKey(i)) {
                    ++p;
                }
                if (p == 0) {
                    y += 3;
                }
                if (p == 1) {
                    y += 1;
                }

            }

            for (String i : c.keySet()) {
                int p = 0;
                if (a.containsKey(i)) {
                    ++p;
                }
                if (b.containsKey(i)) {
                    ++p;
                }
                if (p == 0) {
                    z += 3;
                }
                if (p == 1) {
                    z += 1;
                }

            }
            System.out.println(x + " " + y + " " + z);
        }
    }
}