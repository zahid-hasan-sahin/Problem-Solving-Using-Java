import java.util.Scanner;

public class main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int xp = scan.nextInt();
        int nb = scan.nextInt();
        int a = Math.min(xp * 2, nb);
        int b = Math.min(xp, nb * 2);
        int rb = b / 2;
        int ra = a/2;
        if (xp - rb >= 2 && nb - rb * 2 >=1) {
            ++rb;
        }
        if(nb-ra>=2 && xp-ra*2>=1){
            ++ra;
        }
        System.out.println(Math.max(rb, ra));
        
    }
}