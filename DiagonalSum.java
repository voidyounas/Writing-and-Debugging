import java.util.Scanner;
public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        if(rows!=columns){
            System.out.println("This sum only applies on square matrices  ");
            return;
        }

        int array [][] = new int[rows][columns];
        System.out.println("Enter the elements of the array ");
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter \n1.Diagonal Sum \n2.Anti-Diagonal Sum");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("The sum of Diagonal is " + diagonalSum(array, rows, columns));
        }
        else if (choice==2){
            System.out.println("The sum of Anti-Diagonal is " + antiDiagonalSum(array, rows, columns));
        }
        else{
            System.out.println("The choiice is invalid ");
        }
    }
    public static int diagonalSum(int arr[][], int rows, int columns){
        int sum = 0;
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static int antiDiagonalSum(int arr[][] , int rows , int columns){
        int sum = 0;
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(i+j ==columns-1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    
}
