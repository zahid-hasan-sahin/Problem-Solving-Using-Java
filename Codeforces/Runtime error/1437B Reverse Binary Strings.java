import java.util.Scanner;

public class NewClass12 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            String s = scan.next();
            long res = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    int k = i;
                    while (s.charAt(i) == '1') {
                        ++i;
                    }
                    res += i - 1 - k;
                }
            }
            System.out.println(res);
        }
    }

}