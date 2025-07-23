public class ArraysPractice{
    public static void main(String[] args) {
        
        int [] arr = {4 , 5 , 5 , 6 , 7};
        int [] arr2 = {4 , 2 , 7 , 9, 3};

        int result [] = new int[arr.length];


        for(int i  =0; i<arr.length; i++){
            result [i] = arr[i] + arr2[i];  
        }

        System.out.println("The result array is : ");
        for(int i =0; i<result.length; i++){
            System.out.println(result[i] + "  ");
        }
        
    }
}