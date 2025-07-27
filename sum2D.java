import java.util.Scanner;

public class sum2D {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns  : ");
        int columns = sc.nextInt();

        int array [][] = new int[rows][columns];

        System.out.println("Enter the elements of the array ");
        for(int i =0; i<rows;i++){
            for(int j =0; j<columns;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("the sum is " + sumArray(array, rows, columns));
    }

    public static int sumArray(int arr[][], int rows , int columns){
        int sum = 0;
        for(int i =0; i<rows;i++){
            for(int j =0; j<columns;j++){
                sum +=arr[i][j];
            }
        }
        return sum;
    }
    
}
