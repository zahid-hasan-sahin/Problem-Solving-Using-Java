import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (in > k) {
                ++res;
            }
        }
        System.out.println(res);
    }

}