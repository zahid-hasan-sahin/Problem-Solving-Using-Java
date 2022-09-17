import java.util.Scanner;

public class Main {

    static void prime(int n, boolean[] check) {

        check[0] = true;
        check[1] = true;

        for (int i = 3; i < n; i++) {
            if (check[i] == false) {
                for (int j = i + i; j < n; j = j + i) {
                    check[j] = true;
                }
            }
        }
        check[4] = true;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        boolean[] check = new boolean[1000001];
        prime(1000001, check);
        int total = scan.nextInt();
        while (total-- > 0) {
            long n = scan.nextLong();
            double d = Math.sqrt(n);
            int i = (int) Math.sqrt(n);
            if (d == i && check[i] == false) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}