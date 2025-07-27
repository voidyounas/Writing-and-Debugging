import java.util.Scanner;

public class RowColumnWisesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the num of columns : ");
        int columns = sc.nextInt();

        int array [][] = new int[rows][columns];

        for(int i =0; i<rows;i++){
            for(int j =0; j<columns;j++){
                array[i][j] = sc.nextInt();
            }
        }    

        System.out.println("Enter\n1.Row Sum\n2.Column Sum");
        int choice = sc.nextInt();

        if(choice==1){
            for(int i =0;i<rows;i++){
                int sum = rowSum(array, i, columns); 
                System.out.println("The sum of row " + (i+1)+" is " +sum);
            }
        }
        else{
            for(int j=0; j<columns;j++){
                int sum = columnSum(array, rows, j);
                System.out.println("The sum of column " + (j+1)+"is "+sum);
            }
        }
    }
    public static int rowSum(int [][] arr,int i ,int column){
        int sum = 0;
        for(int j =0;j<column;j++){
            sum+=arr[i][j];
        }
        return sum;
    }
    public static int columnSum(int[][]arr,int rows,int j){
        int sum =0;
        for(int i =0; i<rows;i++){
            sum +=arr[i][j];
        }
        return sum;
    }
   
}
