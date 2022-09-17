import java.util.Scanner;

public class YetAnotherBrokenKeyboard {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();;
        String s = scan.next();
        int[] a = new int[26];
        for (int i = 0; i < k; i++) {
            ++a[scan.next().charAt(0) - 'a'];
        }
        long res = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (a[s.charAt(i) - 'a'] == 0) {
                int t = i - p;
                res = res + ((t * (t + 1)) / 2);

                p = i + 1;
            }
        }
        int t = n - p;

        res = res + ((t * (t + 1)) / 2);
        System.out.println(res);

    }

}