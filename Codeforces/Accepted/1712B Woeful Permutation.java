import java.util.Scanner;

public class cfContest1712 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] res = new int[n];
            if (n % 2 == 0) {
                int c = 1;

                for (int i = 0; i < n; i += 2) {
                    res[i] = c + 1;
                    res[i + 1] = c;
                    c += 2;
                }
            } else {
                int c = 2;
                res[0] = 1;
                for (int i = 1; i < n; i += 2) {
                    res[i] = c + 1;
                    res[i + 1] = c;
                    c += 2;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }

    }

}