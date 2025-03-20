import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Press 1 to insert at the beginning or 2 to insert at the end: ");
        int choice = sc.nextInt();

        System.out.println("Enter the number to insert: ");
        int num = sc.nextInt();

        int[] newArr = new int[size + 1]; 

        if (choice == 1) {
            newArr[0] = num;
            for (int i = 0; i < size; i++) {
                newArr[i + 1] = arr[i];
            }
        } else (choice == 2) {
            for (int i = 0; i < size; i++) {
                newArr[i] = arr[i];
            }
            newArr[size] = num;
        } 
        }
        System.out.println("Updated array: ");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }

    }
}
