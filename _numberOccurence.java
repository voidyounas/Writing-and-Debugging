import java.util.*;
public class _numberOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements of array :  ");
        for(int i =0; i<array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("Enter the number you want to know the freq of : ");
        int target = sc.nextInt();
        if(occuringNum(array, target)!=-1){
            System.out.println("the number " + target + " occured " + occuringNum(array, target) + " times");
        }
        else{
            System.out.println("There is no occurence of this number ");
        }
    }

    public static int occuringNum(int[]arr , int num){
        int counter = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==num){
                counter++;
            }
        }
        int result = counter;
        if(counter==0){
            return -1;
        }
        return result;
    }
}
