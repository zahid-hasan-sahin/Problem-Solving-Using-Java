import java.util.Scanner;

public class VityaintheCountryside {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] moon = new int[n];
        for (int i = 0; i < n; i++) {
            moon[i] = scan.nextInt();
        }
        if(n==1){
            System.out.println("-1");
        }else{
            if(moon[n-1]>moon[n-2]){
                System.out.println("UP");
            }else if( moon[n-1]<moon[n-2]){
                System.out.println("DOWN");
            }else{
                System.out.println("-1");
            }
        }
        
    }
}