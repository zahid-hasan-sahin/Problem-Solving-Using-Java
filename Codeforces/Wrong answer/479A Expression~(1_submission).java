import java.util.Scanner;

public class Expression {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            num[i] = scan.nextInt();
        }
        int a = num[0] + num[1] * num[2];
        int b = num[0] * (num[1] + num[2]);
        int c = num[0] * num[1] * num[2];
        int d = (num[0] + num[1]) * num[2];
        int max = 0;
        if (a > b && a > c && a > d) {
            System.out.println(a);
        } else if (b > a && b > c && b > d) {
            System.out.println(b);
        } else if (c > a && c > b && c > d) {
            System.out.println((c));
        } else {
            System.out.println(d);
        }

    }

}