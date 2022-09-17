import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1696 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n + 2];
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }

            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i <= n + 1; i++) {
                //System.out.println(a[i]);
                if (a[i] == 0) {
                    ar.add(i);
                }
            }

            int res = 0;
    //        System.out.println(ar);
            for (int i = 1; i < ar.size(); i++) {
                if (ar.get(i) - ar.get(i - 1) != 1) {
                    ++res;
                }
            }
            System.out.println(res);
        }
    }
}