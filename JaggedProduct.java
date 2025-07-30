import java.util.Scanner;
public class JaggedProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int array [][] = new int[rows][];

        for(int i =0; i<rows; i++){
            System.out.println("Enter the number of columns in row " + i + " : ");
            int columns = sc.nextInt();
            array[i] = new int[columns];
        }
        System.out.println("Enter the elements in the array ");
        for(int i =0; i<rows;i++){
            for(int j=0; j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("The Jagged Array is ");
        for(int i  =0;i<rows;i++){
            for(int j =0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        long product = 1;
        for(int i =0; i<rows;i++){
            for(int j =0;j<array[i].length;j++){
                if(array[i][j]==0){
                    System.out.println("The product will be zero because one of the element is 0  " );
                }
                product *= array[i][j];
            }
        }
        System.out.print("The product of Jagged Array is : " + product);
    }
}
