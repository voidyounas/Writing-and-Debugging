import java.util.Scanner;
public class IdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int columns = sc.nextInt();

        if(rows!=columns){
            System.out.println("The singular matrix rule applies only on square matrices ");
            return;
        }

        int array [][] = new int[rows][columns];
        System.out.println("Enter the elements of array ");
        for(int i =0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[i][j] = sc.nextInt();
            }
        }
        if(isIdentity(array, rows, columns)==true){
            System.out.println("The matix is identity ");
        }
        else{
            System.out.println("The matrix is not identity ");
        }

    }
    public static boolean isIdentity(int arr[][] , int rows , int columns){
        for(int i =0; i<rows; i++){
            for(int j =0; j<columns; j++){
                if(i==j && arr[i][j]!=1 ) {
                return false;
            }
            else if(i!=j && arr[i][j]!=0)
                return false;
            }
        }
        return true;
    }
    
}
