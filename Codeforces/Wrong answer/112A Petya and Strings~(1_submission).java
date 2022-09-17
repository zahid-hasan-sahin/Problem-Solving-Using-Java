import java.util.Scanner;

public class PetyaandStrings {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next().toLowerCase();
        String last = scan.next().toLowerCase();
        int f = 0;
        int l = 0;
        for (int i = 0; i < first.length(); i++) {
            f = f + first.charAt(i);
            l = l + last.charAt(i);
            
        }if(f>l){
            System.out.println("1");
        }else if(l>f){
            System.out.println("-1");
        }else{
            System.out.println("0");
        }

    }

}