import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int array [][] = new int [rows][columns];
        System.out.println("Enter the number you want to search in the matrix ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array ");
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                array[i][j] = sc.nextInt();
            }
        }

        for(int i =0; i<rows;i++){
            for(int j=0; j<columns;j++){
                if(n==array[i][j])
                System.out.print("The number occured at index :  " +"{" + i + " , " + j+"}");
                 System.out.println();
            }
           
        }
    }
}