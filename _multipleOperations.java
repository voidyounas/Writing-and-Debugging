import java.util.Scanner;
public class _multipleOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n = sc.nextInt();
        int array[] = new int[n];//creating an array of users demand 

        System.out.println("Enter the " + n + " elements of array ");
        for(int i=0; i<array.length;i++){
            array[i] = sc.nextInt();//users input values in array 
        }

        System.out.println("The sum of array is :  " + sumArray(array) ); //calling sum method
        

        System.out.println("The product of array is : " + productArray(array));//calling product method
        

        System.out.println("The average of array is : " + averageArray(array) );//calling average method 
        
    }

    public static double sumArray(int []arr){
        double sum = 0;//sum is zero , stored in double for average purpose 
        for(int i =0; i<arr.length;i++){
            sum += arr[i];//0 + arr[i]
        }
        double result = sum ;//final vlaue of sum assigned to result 
        return result;//returning the final value 
    }

    public static int productArray(int[] arr){
        int product = 1;//product will be 1 cz if you assigned it to 0 the whole product will be 0 
        for(int i =0; i<arr.length;i++){
            product *= arr[i];//1 multiply arr[i]
        }
        int result = product;//product assigned to result 
        return result;//returning the result 
    }

    public static double averageArray(int[]arr){
        
        double average = sumArray(arr)/arr.length;//the method sum is called and the returned value is divided by array length to get the average ,,,, e.g 1+3+3=10;  the method will return 10 and array length is 3 so  10/3 is the answer for average 
        return average;//returns average for main method 
    }
    
}
