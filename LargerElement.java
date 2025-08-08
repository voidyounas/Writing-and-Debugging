import java.util.Scanner;
public class LargerElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        int array [][] = new int[rows][columns];
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter \n1.Largest Element \n2.Smallest Element");
        int choice = sc.nextInt();

        if(choice==1){
            System.out.println("The largest element in the array is " + largestElement(array, rows, columns));
        }
        else if(choice==2){
            System.out.println("The smallest element in the array is " + smallestElement(array, rows, columns));
        }
        else{
            System.out.println("Invalid choice ");
        }

    }

    public static int largestElement(int [][]arr, int rows,int columns){
        int larg = arr[0][0];
        for(int i=0; i<rows; i++){
            for(int j =0; j<columns ;j++){
                if(arr[i][j]>larg){
                    larg = arr[i][j];
                }
            }
        }
        return larg;
    }

    public static int smallestElement(int arr [][], int rows , int columns ){
        int small = arr[0][0];
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(arr[i][j]<small ){
                    small = arr[i][j];
                }
            }
        }
        return small;
    }
}
