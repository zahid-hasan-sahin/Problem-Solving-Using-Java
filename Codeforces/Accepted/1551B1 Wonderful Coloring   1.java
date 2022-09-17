import java.util.Scanner;

public class cfContest1551 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            String s = scan.next();
            int[] a = new int[26];
            for (int i = 0; i < s.length(); i++) {
                ++a[s.charAt(i) - 'a'];
            }
            for (int i = 0; i < 26; i++) {
                if (a[i] > 2) {
                    a[i] = 2;
                }
            }
            int sum = 0;
            for (int i = 0; i < 26; i++) {
                sum += a[i];
            }
            System.out.println(sum/2);
        }
    }
}