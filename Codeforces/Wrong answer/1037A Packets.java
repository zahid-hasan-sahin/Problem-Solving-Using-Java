import java.util.Scanner;

public class A {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = 0;
        int i = 1;
        int r = 0;
        while (p < n) {
            ++r;
            p += i++;
        }
        System.out.println(r);

    }
}