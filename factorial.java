package Java;
import java.util.Scanner;

public class factorial{

    public static int factorial(int n){
        if(n==1 | n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter the number to find the factorial: ");
            System.out.printf("Fctorial of the entered number: %d\n", factorial(sc.nextInt()));

        } finally{
            sc.close();
        }
    }
}
