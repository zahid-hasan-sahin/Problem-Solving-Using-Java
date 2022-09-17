import java.util.Scanner;

public class NewClass2 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int n = s.length();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.charAt(i) - '0';
            }
            int k = scan.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = 1;
            }
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    if (i - k >= 0) {
                        b[i - k] = 0;
                    }
                    if (i + k < n) {
                        b[i + k] = 0;
                    }
                }
               
            }
           
            boolean ch = false;
            for (int i = 0; i < n; i++) {
                if (b[i] == 1) {
                    int r = 0;
                    if (i - k >= 0 && b[i - k] != 1) {
                        ++r;
                    }
                    if (i + k < n && b[i + k] != 1) {
                        ++r;
                    }
                    if (r == 2) {
                        ch = true;
                    }

                    if (i - k < 0 && b[i  + k] != a[i]) {

                        ch = true;

                    }
                    if (i  + k > n && b[i - k] != a[i]) {
                      
                        ch = true;
                    }
                }
            }
            if (ch) {
                System.out.println("-1");
            } else {

                for (int i = 0; i < n; i++) {
                    System.out.print(b[i]);
                }
                System.out.println();
            }

        }

    }
}