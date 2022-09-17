import java.util.Scanner;

public class LuckyDivision {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String temp = String.valueOf(num);
        if (temp.contains("47") || temp.contains("74")) {
            System.out.println("YES");
        } else if ((4 * 4) == num || (7 * 7) == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}