import java.util.*;
import java.util.Arrays;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int array[] = new int[sc.nextInt()];

        for(int i = 0; i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int[] result = twoSum(array, n);//calling method and stroing in in new array 
        System.out.println(Arrays.toString(result));//this will convert array to string 
    }
    public static int [] twoSum(int[] arr , int target){
        for(int i=0; i<arr.length;i++){//loop for i iteration that start from 0
            for(int j=i+1;j<arr.length;j++){//loop for j iteration that start from 1
                if(arr[i]+arr[j] == target){// here it will compare the i iteration and j iteration to the number 
                    return new int[]{i,j};//if the number equals to both iterations the number will be returned as new array 

                }
            }    
        }
        return new int[]{-1,-1};//if not equal will be returned as {-1,-1} as new array 
    }
}
