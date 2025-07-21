import java.util.Scanner;
public class inputArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want to enter in the array : ");
        int n = sc.nextInt();
        if(n>0 && n<=20){
            System.out.println("Enter the elements of array : ");
            int arr [] = new int[n];
            for(int i =0; i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
             System.out.println("The array you entered is ");
             for(int i =0;i<arr.length;i++){
                System.out.println("A[ " + i+" ]" + " " +arr[i]);
             }
        }
        else{
            System.out.println("You entered invalid number ");
        }
    }
}