import java.util.ArrayList;
import java.util.Scanner;

public class cfContest1706 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            ArrayList<Integer>[] ar = new ArrayList[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < n; i++) {
                ar[a[i]].add(i);
            }

            int[] res = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                if (ar[i].size() == 0) {
                    res[i] = 0;
                } else {
                    int curr = ar[i].get(0);
                    int r = 1;
                    for (int j = 1; j < ar[i].size(); j++) {
                        if ((ar[i].get(j) - curr) % 2 == 1) {
                            ++r;
                        }
                        curr = ar[i].get(j);
                    }
                    res[i] = r;
                }
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}