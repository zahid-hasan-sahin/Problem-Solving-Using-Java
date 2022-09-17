import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        HashSet<String> countTotalRoot = new HashSet<String>();
        HashSet<Character> removeDuplicateElement = new HashSet<Character>();
        String s = "";
        for (int i = 0; i < n; i++) {
            String temp = scan.next();
            for (int j = 0; j < temp.length(); j++) {
                removeDuplicateElement.add(temp.charAt(j));

            }
            String root = "";
            for (Character getAllRoot : removeDuplicateElement) {
                root += getAllRoot;
            }
            countTotalRoot.add(root);
            removeDuplicateElement.clear();
            root = "";
        }
        System.out.println(countTotalRoot.size());

    }

}