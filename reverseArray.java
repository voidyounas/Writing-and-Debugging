import java.util.*;
public class reverseArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr1[] = new int[10];
        System.out.println("Enter the elements of array ");
        for(int i =0; i<arr1.length;i++){
            arr1[i]= sc.nextInt();
        }

        System.out.println("The original array is ");
        for(int i =0; i<arr1.length;i++){
            System.out.println("A[" + i + "] " + arr1[i]);
        }

       
        int arr2[]= new int[10];
        int j =0;
        for(int i=arr1.length-1; i>=0;i--){
            arr2[j]=arr1[i];
            j++;
        }

        System.out.println("The reverse array is ");
        for(int i =0; i<arr2.length;i++){
            System.out.println("B[" +  i + "] " + arr2[i]);
        }
    }
}