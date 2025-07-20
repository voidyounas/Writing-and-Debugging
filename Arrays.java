public class Arrays{
    public static void main(String[] args) {
        
        int arr[] = {5 , 4 , 4 , 3 };
        int arr1 [] = new int[arr.length-1];

        for(int i = 0; i<arr.length-1; i++){
           arr1[i] = arr[i] + arr[i+1];
        
        }

        for(int i  =0; i<arr1.length; i++){
            System.out.println("The sum of  " + arr[i] + " and " + arr[i+1] + " is " + arr1[i]);
        }

    }
}