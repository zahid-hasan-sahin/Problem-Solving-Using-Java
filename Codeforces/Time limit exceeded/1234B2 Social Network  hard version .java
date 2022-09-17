import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SocialNetwork {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        Deque<Integer> d = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            int in = scan.nextInt();
            if (d.size() < k) {
                
                if (!d.contains(in)) {
                    d.addFirst(in);
                }
            } else {
                if (!d.contains(in)) {
                    d.removeLast();
                    d.addFirst(in);
                }
            }
            
        }
        System.out.println();
        System.out.println(d.size());
        for (int e : d) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}