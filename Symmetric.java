import java.util.Scanner;
public class Symmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        if(rows!=columns){
            System.out.println("The symmetric rule can only be applied to be square matrix ");
            return;
        }

        int array [][] = new int[rows][columns];

        System.out.println("Enter the elements of the array ");
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                array [i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose of the matrix is ");
        printTranspose(array, rows, columns);
        if(isSymmetric(array, rows)){
            System.out.println("The matrix is symmetric ");
        }
        else{
            System.out.println("The given matrix is not symmetric ");
        }
    }
    public static boolean isSymmetric(int[][] arr, int size){
        for(int j =0; j<size; j++){
            for(int i =0; i<size; i++){
                if(arr[i][j] != arr[j][i])   
                return  false;
            }
        }
        return true;
    }
    
    public static void printTranspose(int arr[][] , int rows , int columns){
        for(int j =0; j<columns; j++){
            for(int i =0; i<rows; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}