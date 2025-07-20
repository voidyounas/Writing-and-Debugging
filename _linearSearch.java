import java.util.Scanner;

public class _linearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter elements of array  ");
        for(int i =0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the number you want to search in array : ");
        int search = sc.nextInt();
        
        linearSearch(arr, search);    
    }

    public static void linearSearch(int[] arr, int key) {
        int counter = 0;
            for(int i =0; i<arr.length;i++){
                if(arr[i]==key){
                    System.out.println("The number is found at " + i);
                    counter++;    
                }
            }
            if(counter==0){
                System.out.println("The number is not found ");
                return;
            }
            else {
                System.out.println("The number occured " + counter + " times");
            }

        
        
       
    }
}