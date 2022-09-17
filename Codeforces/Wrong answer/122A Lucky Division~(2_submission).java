import java.util.Scanner;

public class LuckyDivision {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int c = 0;
        String temp = String.valueOf(num);
        if (temp.contains("47") || temp.contains("74")) {
            System.out.println("YES");
        }else{
        for (int i = 0; i < num; i = i + 2) {
            if (((double) num / 4 == i) || (double) num / 7 == i) {
                c++;
            }
        }
        if (c == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
        }
    }

}