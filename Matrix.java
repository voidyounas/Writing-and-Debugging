import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n-by-n of matrix : ");
        int n = sc.nextInt();

        System.out.println("The matrix is " );
        printMatrix(n);
        
    }

    public static int printMatrix(int n ){
        int num1 = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){

               num1= (int)(Math.random()*2);
               System.out.print(num1+"  " );
               
            }
            System.out.println();
            
        }
        return num1;

    }
}