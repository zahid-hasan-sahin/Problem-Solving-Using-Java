import java.util.ArrayList;
import java.util.Scanner;

public class JzzhuandChildren {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        int div = 0;
        int p = 0;
        int num = 0;
        for (int i = 0; i < n; i++) {
            int t = scan.nextInt();
            if (t / m >= div) {
                if (t >= num) {
                    div = t / m;
                    p = i + 1;
                    num = t;
                }
            }
        }
        System.out.println(p);

    }

}