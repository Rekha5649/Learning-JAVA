package Java;
import java.util.Scanner;

public class pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            for (; n > 0; n--) {
                for (int i = n; i > 0; i--) {
                    System.out.print('*');
                }
                System.out.print('\n');
            }
        } finally {
            sc.close();
        }
    }
}
