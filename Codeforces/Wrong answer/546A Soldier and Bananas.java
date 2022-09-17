import java.util.Scanner;

public class SoldierandBananas {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int cost = scan.nextInt();
        int have = scan.nextInt();
        int total = scan.nextInt();
        int need = 0;
        for (int i = 1; i <= 4; i++) {
            need = need + (cost * i);

        }
        System.out.println(need - have);
    }
}