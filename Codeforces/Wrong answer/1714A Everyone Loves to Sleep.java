import java.util.Scanner;

public class cfContest1714 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int h = scan.nextInt();
            int m = scan.nextInt();
            int mnh = 100000;
            int mnm = 100000;
            for (int i = 0; i < n; i++) {
                int g = scan.nextInt();
                int k = scan.nextInt();
                if (g < h) {
                    g += 24;
                }
                if (k < m) {
                    k += 60;
                }

                if (g == -1) {
                    g = 23;
                }

                int l = (k - m);
                if (l != 0) {
                    --g;
                }
                int r = g - h;

                if (r == -1) {
                    r = 23;
                }
                if (r * 60 + r < mnh * 60 + mnm) {
                    mnh = r;
                    mnm = l;
                }
            }
            System.out.println(mnh + " " + mnm);
        }
    }
}