import java.util.Scanner;
public class arr3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[5];

        System.out.print("Enter the number in array ");
        for(int i = 0; i<arr.length; i++){

            arr[i] = sc.nextInt();
        }

        int max = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max += arr[i];
            }
        }

        System.out.println("The maximum number is " + max);
    }
}