package Java;
import java.util.Scanner;

class isSorted{
    public static void main(String args[]){
        int arr[];
        boolean flag = true;

        Scanner sc = new Scanner(System.in);
        try{
            
            System.out.println("Enter the length of the array: " );
            arr = new int[sc.nextInt()];
            System.out.println("Enter the array elements: " );
            for(int i=0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=1; i<arr.length; i++){
                if(arr[i] < arr[i-1]){
                    flag = false;
                    break;
                }
            }
            if(flag==false){
                System.out.println("Array is not sorted.");
            }else{
                System.out.println("Array is sorted.");
            }
        } finally{
            sc.close();
        }
    }
}