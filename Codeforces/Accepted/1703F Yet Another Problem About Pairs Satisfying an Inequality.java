import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class A {

    static int bn(ArrayList<Integer> arr, int l, int r, int key) {
        int res = -1;
        while (l <= r) {
           
            int mid = (l + r) / 2;
            if (arr.get(mid) < key) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = scan.nextInt();
            }
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                if (a[i] < i) {
                    ar.add(i);
                }
            }
         
            long res = 0;
            for (int i = 0; i < ar.size(); i++) {
                int r = bn(ar, 0, i, a[ar.get(i)]);
             
                res += r + 1;
            }
            System.out.println(res);
        }
    }

}