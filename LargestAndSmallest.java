import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int largest = array[0];
        int smallest = array[0]; 

        for (int i = 1; i < size; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);

        scanner.close();
    }
}