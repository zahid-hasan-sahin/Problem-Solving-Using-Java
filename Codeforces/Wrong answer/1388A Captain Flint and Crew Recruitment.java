import java.util.Scanner;

public class NewClass8 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int q = scan.nextInt();
        while(q-->0){
            int n = scan.nextInt();
            if(6+10+14+1<=n){
                System.out.println("YES");
                System.out.println(6+" "+10+" "+14+" "+(n-(6+10+14)));
            }else{
                 System.out.println("NO");
            }
            
        }
    }
    
}