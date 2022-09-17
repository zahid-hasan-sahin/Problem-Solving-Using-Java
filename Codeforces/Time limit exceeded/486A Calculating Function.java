import java.util.Scanner;

public class CalculatingFunction {
 
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        double temp = 0;
        while(n>0){
            if(n%2==1){
                temp = temp - n;
            }else{
                temp = temp + n;
            }
            n--;
            
        }
        System.out.println((int)temp);
    }
    
}