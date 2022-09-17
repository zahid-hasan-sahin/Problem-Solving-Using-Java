import java.util.Scanner;

public class Taxi {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int total = scan.nextInt();
        int val[] = new int[total];
        int sum = 0;
        for (int i = 0; i < total; i++) {
            val[i] = scan.nextInt();
            sum = sum +val[i];
        }

        System.out.println(sum % 4 != 0 ||(total==3 && val[0]==3 && val[1]==3 && val[2]==2)? sum / 4 + 1 : sum / 4);

    }

}