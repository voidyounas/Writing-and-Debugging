import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
    }

    public static void reverseArray(int array[]) {
        int array2[] = new int[array.length];
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            array2[j] = array[i];
            j++;
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}