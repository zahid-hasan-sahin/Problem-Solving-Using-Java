import java.util.Scanner;

public class NewClass2 {

    public static void main(String arggs[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            int p = 0;
            int c = 0;
            int res = -1;
            for (int i = 0; i < n - 1; i++) {
                p += a[i];
              
                if (p % m == 0 && a[i + 1] % m == 0) {
                    res = Math.max(res, c);
                    if (a[i] % m != 0) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                    p = a[i];
                } else {
                    ++c;
                }
            }
            p += a[n-1];
            if(p%m!=0){
                ++c;
            }
            System.out.println(Math.max(c, res) != 0 ? Math.max(c, res) : -1);

        }

    }

}