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
            
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 0; i < n - 1; i++) {
                if (a[i] != c) {
                    ar.add(n);
                    break;
                }
            }
            if (a[n - 1] != c) {
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