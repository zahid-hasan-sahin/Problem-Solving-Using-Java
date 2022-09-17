import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h = scan.nextInt();
        int val[] = new int[n];
        for (int i = 0; i < n; i++) {
            val[i] = scan.nextInt();
        }
        int r = 0, i = 0;
        while (n > 0) {
            if (val[i] <= h) {
                r = r + 1;
            } else {
                r = r + 2;
            }

            i++;
            n--;

        }
        System.out.println(r);

    }

}