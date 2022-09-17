import java.util.Scanner;

public class BowWowandthTimetable {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int des = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                des += Math.pow(2, s.length() - i - 1);
            }
        }
        int res = 1;
        while (Math.pow(4, res) < des) {
            ++res;
        }
        System.out.println(res);

    }

}