import java.util.Scanner;

public class CodeforcesSubsequences {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        StringBuilder s = new StringBuilder("codeforces");
        for (int i = 0; i < n-1; i++) {
            s.append("s");
        }
        System.out.println(s);

    }

}