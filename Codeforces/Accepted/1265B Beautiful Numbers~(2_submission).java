import java.util.Scanner;

public class BeautifulNumbers {

    static class st {

        int n;
        int pos;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            BeautifulNumbers.st[] ob = new BeautifulNumbers.st[n + 1];
            for (int i = 1; i <= n; i++) {
                ob[i] = new st();
            }
            for (int i = 1; i <= n; i++) {
                int k = scan.nextInt();
                ob[i].n = k;
                ob[k].pos = i;
            }
            int max = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                max = Math.max(max, ob[i].pos);
                min = Math.min(min, ob[i].pos);
                if (max - min + 1 == i) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();

        }
    }

}