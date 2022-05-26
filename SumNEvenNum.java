package Java;
import java.util.Scanner;

public class SumNEvenNum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            int sum = 0, evenNum=0;
            while(n>0){
                sum += evenNum;
                evenNum += 2;
                n--;
            }
            System.out.printf("Sum of the first N even numbers: %d\n", sum);
        } finally {
            sc.close();
        }
    }
}
