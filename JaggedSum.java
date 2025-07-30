import java.util.Scanner;
public class JaggedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();

        int array[][] = new int[rows][];

        for(int i =0; i<rows;i++){
            System.out.println("Enter the number of elements in " + i + " : ");
            int columns = sc.nextInt();
            array[i] = new int [columns];
        }
        System.out.println("Enter the elements ");
        for(int i =0;i<rows;i++){
            for(int j =0;j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("The jagged Array is ");
        for(int i=0; i<rows;i++){
            for(int j =0;j<array[i].length;j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }

        int sum =0;
        for(int i =0; i<rows;i++){
            for(int j =0; j<array[i].length;j++){
                sum+=array[i][j];
            }
        }
         
        System.out.println("The sum of the jagged array is "+ sum);

        sc.close();
    }
}
