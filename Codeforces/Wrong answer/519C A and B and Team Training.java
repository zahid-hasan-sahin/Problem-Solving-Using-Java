import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int xp = scan.nextInt();
        int nb = scan.nextInt();
        int res = 0;
        while (xp > 0 && nb > 0) {
            if (xp > nb) {
                xp -= 2;
                --nb;
            } else {
                --xp;
                nb -= 2;
            }
            ++res;

        }
        System.out.println(res);

    }
}