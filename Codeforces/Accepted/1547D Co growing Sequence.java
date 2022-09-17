import java.util.Scanner;

public class cfContest1546 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        k:
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }
            long and = 0 ^ a[0];
            long[] res = new long[n];
            res[0] = 0;

            for (int i = 1; i < n; i++) {
                String s = Integer.toBinaryString(a[i]);
                String xor = Long.toBinaryString(and);

                while (s.length() < xor.length()) {
                    s = "0" + s;

                }
                while (xor.length() < s.length()) {
                    xor = "0" + xor;
                }
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        sb.append("0");
                    } else if (xor.charAt(j) == '1') {
                        sb.append("1");
                    } else {
                        sb.append("0");
                    }
                }
                String sk = sb.toString();
                res[i] = Long.parseLong(sk, 2);
                and = a[i] ^ res[i];

            }
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
    }
}