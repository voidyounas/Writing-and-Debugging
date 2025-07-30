import java.util.InputMismatchException;
import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the length of the array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];
            System.out.println("Enter " + n + " elements:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter the index number of the value you want: ");
            int index = sc.nextInt();

            System.out.println("The number at index " + index + " is: " + arr[index]);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter integers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range. Please enter a valid index.");
        } finally {
            sc.close();
        }
    }
}
