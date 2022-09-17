import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1713 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            n = (int) Math.pow(2, n);
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                ar.add(i);
            }
            while (n > 2) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                for (int i = 0; i < n; i += 4) {
                    int u = ar.get(i);
                    int v = ar.get(i + 2);
                    System.out.println("? " + u + " " + v);
                    int in = scan.nextInt();
                    if (in == 1) {
                        temp.add(u);
                        temp.add(ar.get(i + 3));
                    } else if (in == 2) {
                        temp.add(ar.get(i + 1));
                        temp.add(v);

                    } else {
                        temp.add(ar.get(i + 1));
                        temp.add(ar.get(i + 3));
                    }
                }

                ar.clear();
                for (int i : temp) {
                    ar.add(i);
                }
                n = ar.size();
            }
            System.out.println("? " + ar.get(0) + " " + ar.get(1));
            int in = scan.nextInt();
            if (in == 1) {
                System.out.println("! " + ar.get(0));
            } else {
                System.out.println("! " + ar.get(1));
            }
        }
    }
}