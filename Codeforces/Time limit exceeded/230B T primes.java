import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] prime = new int[1000001];
        ++prime[1];
        ++prime[2];
        ++prime[3];
        int j = 1;
        int c = 0;
        int inc = 0;
        for (int i = 1; i < 1000000; i++) {
            if (((6 * j) + 1 == i || (6 * j) - 1 == i)) {
                ++inc;
                for (int k = 2; (int) k <= Math.sqrt(i); ++k) {
                    if (prime[k] > 0) {
                        if (i % k == 0) {
                            c++;
                            break;
                        }

                    }
                }
                if (c == 0) {
                    ++prime[i];
                }
                c = 0;
                if (inc == 2) {
                    ++j;
                    inc = 0;
                }
            }

        }
        int total = scan.nextInt();
        while (total-- > 0) {
            long n = scan.nextLong();
            int res = (int) Math.sqrt(n);
            if (Math.sqrt(n) == res && n!=1  && (n%2!=0 || n==4)) {
                if (prime[res] == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                System.out.println("NO");
            }

        }

    }
}