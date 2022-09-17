import java.util.Scanner;

public class cfContest1714 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            long n = scan.nextInt();
            long h = scan.nextInt();
            long m = scan.nextInt();
            long mn = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                long g = scan.nextInt();
                long k = scan.nextInt();

                long w = g * 60 + k;
                long r = h * 60 + m;

                if (w < r) {
                    w += 24 * 60;
                }

                long re = w - r;

                mn = Math.min(re, mn);

            }
            long hr = mn / 60;
            long mr = mn % 60;
            System.out.println(hr + " " + mr);
        }
    }
}