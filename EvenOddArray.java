import java.util.Arrays;
import java.util.Scanner;

public class EvenOddArray{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int[] array = new int[sc.nextInt()];
        System.out.println("Enter the elements of the array : ");

        for(int i = 0; i<array.length;i++){
            array[i] = sc.nextInt();
        }

        int [] temp = new int[array.length];
        int j =0;
        int k = array.length-1;

        for(int i = 0; i<array.length;i++){
            if(array[i]%2!=0){
                temp[j++] = array[i];
            }
            else{
                temp[k--] = array[i];
            }
        }
        copyArray(temp , array);
        System.out.println(Arrays.toString(array));
    }

    public static void copyArray(int arr[] , int [] num){
        for(int i =0; i<arr.length;i++){
            num[i] = arr[i];
        }
    }
}