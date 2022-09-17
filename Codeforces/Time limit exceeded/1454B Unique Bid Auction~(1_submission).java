import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class UniqueBidAuction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[30000000];
            int mx = 0;
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                int in = scan.nextInt();
                mx = Math.max(mx, in);
                ++a[in];
                b[i] = in;
            }
            int res = -1;
            for (int i = 0; i <= mx; i++) {
                if (a[i] == 1) {
                    res = i;
                    break;
                }
            }
            if(res==-1){
                System.out.println(-1);
            }else{
                for (int i = 0; i < n; i++) {
                    if(b[i]==res){
                        System.out.println(i+1);
                    }
                }
            }
        }
    }
}