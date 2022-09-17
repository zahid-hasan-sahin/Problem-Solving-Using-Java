import java.util.Scanner;

public class Taxi {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < total; i++) {
            sum = sum + scan.nextInt();
        }

        System.out.println(sum % 4 != 0 ? sum / 4 + 1 : sum / 4);

    }

}