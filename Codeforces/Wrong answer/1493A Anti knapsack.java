import java.util.ArrayList;
import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int l = 0;
            int r = k;
            while (l <= r) {
                ++l;
                --r;
            }
            ArrayList<Integer> a = new ArrayList<Integer>();
            for (int i = 1; i < l; i++) {
                a.add(i);
            }
            for (int i = k + 1; i <= n; i++) {
                a.add(i);
            }
            System.out.println(a.size());
            for (int i = 0; i < a.size(); i++) {
                System.out.print(a.get(i) + " ");
            }
            System.out.println();
        }
    }
}