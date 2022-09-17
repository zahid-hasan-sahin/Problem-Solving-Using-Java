import java.util.ArrayList;
import java.util.Scanner;

public class LonelyNumbers {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int[] a = new int[1000010];
        ArrayList<Integer> pr = new ArrayList<Integer>();
        for (long i = 2; i < 1000010; i++) {
            if (a[(int) i] == 0) {
                pr.add((int) i);
                for (long j = i * i; j < 1000010; j += i) {
                    a[(int) j] = 1;
                }
            }
        }

        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int c = 0;
            for (int i = 0; pr.get(i) <= n; i++) {
                int k = pr.get(i);
                int r = n / k;
                if (r + (r - 1) <= k) {
                    
                    ++c;
                }
            }
            System.out.println(c + 1);
        }
    }

}