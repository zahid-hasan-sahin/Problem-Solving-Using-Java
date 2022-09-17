import java.util.ArrayList;
import java.util.Scanner;

public class Mainn {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long k = scan.nextLong();
        int result = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        if (k <= (n / 2)) {
            for (int i = 1; i <= n; i = i + 2) {
                array.add(i);
                if (array.size() == k) {
                    result = array.get(array.size() - 1);
                    break;
                }
            }

        } else {
            for (int i = 2; i <= n; i = i + 2) {
                array.add(i);
                if (array.size() == (n / 2) - (k / 2) - 1) {
                    result = array.size() - 1;
                    break;
                }

            }
        }
        System.out.println(array.get(array.size() - 1));

    }
}