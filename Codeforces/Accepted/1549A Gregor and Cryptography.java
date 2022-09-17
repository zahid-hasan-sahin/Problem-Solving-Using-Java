import java.util.Scanner;

public class A {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            System.out.println((n-1)/2+" "+(n-1));
        }
    }
}