import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the number of rows : ");  
      int rows = sc.nextInt();
      System.out.print("Enter the number of columns : ");  
      int columns = sc.nextInt();

      int array [][] = new int[rows][columns];
      System.out.println("Enter the elements of the array ");

      for(int i =0; i<rows; i++){
        for(int j =0; j<columns; j++){
            array[i][j] = sc.nextInt();
        }
      }
      zeroCount(array, rows, columns);
      oddCount(array, rows, columns);
      evenCount(array, rows, columns);
    }   
    public static void zeroCount(int arr [][] , int rows, int columns){
        int zero =0;
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns;j++){
                if(arr[i][j]==0)
                zero++;
            }
        }
        System.out.print("There are " + zero + " zeros ");
    }
     public static void oddCount(int arr[][] , int rows , int columns){
        int odd = 0;
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(arr[i][j] % 2 != 0)
                odd++;
            }
        }
        System.out.print(" , " + odd + " odd numbers ");
    }
     public static void evenCount(int arr[][] , int rows , int columns){
        int even =0;
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(arr[i][j] != 0 && arr[i][j] % 2== 0)
                even++;
            }
        }
        System.out.println(" and " + even + " even numbers in the matrix ");
    }
    
}
