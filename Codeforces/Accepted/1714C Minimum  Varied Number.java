import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class cfContest1714 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            ArrayList<Integer> ar = new ArrayList<Integer>();
            int c = 9;
            while (n > 0) {
                if (c <= n) {
                    ar.add(c);
                    n -= c;
                }
                --c;
            }
            Collections.sort(ar);
            for (int i : ar) {
                System.out.print(i);
            }
            System.out.println();

        }
    }
}