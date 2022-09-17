import java.util.Scanner;

public class cfContest1713 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            int[] fre = new int[n + 1];
            long sq = (long) Math.ceil(Math.sqrt(n)) * (long) Math.ceil(Math.sqrt(n));

            int ind = n - 1;

            while (ind >= 0) {
                int av = (int) sq - ind;

                if (av >= n) {
                    while (true) {
                        int r = (int) Math.sqrt(sq) - 1;
                        if (r < 0) {
                            sb.append("-1\n");
                            continue k;
                        }
                        av = r * r - ind;

                        if (fre[av] == 0) {
                            a[ind] = av;
                            --ind;
                            fre[av] = 1;

                            break;
                        }
                        sq = r * r;
                    }
                } else if (fre[av] == 0) {
                    a[ind] = av;
                    --ind;
                    fre[av] = 1;
                } else {
                    while (true) {
                        int r = (int) Math.sqrt(sq) - 1;
                        if (r < 0) {
                            sb.append("-1\n");
                            continue k;
                        }
                        av = r * r - ind;

                        if (fre[av] == 0) {
                            a[ind] = av;
                            --ind;
                            fre[av] = 1;

                            break;
                        }
                        sq = r * r;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                sb.append(a[i] + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}