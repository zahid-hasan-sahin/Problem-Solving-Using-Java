import java.util.Scanner;

public class PrimeSubtraction {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        while(total>0){
        double f = scan.nextDouble();
        double l = scan.nextDouble();
        if (f - l <= 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        total--;
        }

    }

}