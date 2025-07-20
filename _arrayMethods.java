
import java.util.Scanner;

public class _arrayMethods{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array1 [] = new int[4];
        int array2 [] = new int[4];

        System.out.println("Enter the numbers of 1st array  ");

         for(int i =0; i<array1.length;i++){
            array1[i] = sc.nextInt();
         }
         System.out.println("Enter the numbers of 2nd array ");

         for(int i =0;i<array2.length;i++){
            array2[i]= sc.nextInt();
         }

         System.out.println("The sum of these two arrays is ");
         sumOfTwo(array1, array2);

         sc.close();


        

    }

    public static void sumOfTwo(int array1[] , int array2[]){
        
        int result[] = new int[array1.length];

        for(int i = 0; i<array1.length; i++){
            result[i] = array1[i] + array2[i];
        } 

        for(int i =0; i<result.length;i++){
            System.out.println(result[i] + " ");
        }
    }
}