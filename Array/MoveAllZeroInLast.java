import java.util.Scanner;

public class MoveAllZeroInLast {

    static void MoveZeroInLast(int [] arr){
        int n = arr.length;
        int index = 0; // Position for non-zero elements

        // Step 1: Move non-zero elements to front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill the remaining with zeros
        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n = sc.nextInt();
        System.out.println("Enter the elemenets (Zero And Non Zero) :");
        int [] arr =new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i] =sc.nextInt();
        }
        System.out.println("the element of original array -----------");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("the element after the move all zero in the last ---------");

        MoveZeroInLast(arr); // <-- Important (call the function)

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
