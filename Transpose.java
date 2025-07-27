import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int array [][] = new int[rows][columns];

        System.out.println("Enter the elements of the array ");
        for(int i =0;i<rows;i++){
            for(int j =0;j<columns;j++){
                array[i][j]=sc.nextInt();
            }
        }
        transposeArray(array, rows, columns);
        
    }
    public static void transposeArray(int arr[][],int rows , int columns){
        for(int j =0;j<columns;j++){
            for(int i =0; i<rows;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
