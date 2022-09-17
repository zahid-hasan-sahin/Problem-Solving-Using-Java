import java.util.Scanner;

public class InterviewwithOleg {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();

        String[] a = new String[110];
        a[0] = "ogo";
        for (int i = 1; i < 110; i++) {
            a[i] = a[i - 1] + "go";
        }

        for (int i = 0; i < n; i++) {

            for (int j = 109; j >= 0; j--) {
                if (s.contains(a[j])) {
                    s = s.replaceFirst(a[j], "***");
                    i += a[j].length();
                    break;
                }
            }

        }

        System.out.println(s);
    }

}