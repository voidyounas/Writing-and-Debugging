import java.util.Arrays;
import java.util.Scanner;

public class insertion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");

        int [] arr = new int[sc.nextInt()];

        System.out.println("Enter the elements of the array ");
        for(int i=0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to be change in array : ");
        int chnageNumber = sc.nextInt();
        System.out.print("Now enter the new number you want to replace with :   ");
        int changeewith = sc.nextInt();

        replaceElement(arr, chnageNumber, changeewith);    
        

    }
    public static void replaceElement(int array[] , int replaceNumber , int replaceWith){
        boolean found = false;
        for(int i =0; i <array.length; i++){
            if(array[i]==replaceNumber){
                array[i] = replaceWith;
                System.out.println("The number " + replaceNumber +  " is replaced at " + i + " with "+ array[i] );
                found = true; 
            }
        }
                String str = Arrays.toString(array);
                System.out.println(str);
        
        if(!found){
            System.out.println("The number " + replaceNumber + " is not found in the array ");
        }
       
    }
}