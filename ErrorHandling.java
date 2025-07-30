import java.util.InputMismatchException;
import java.util.Scanner;

public class ErrorHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the 1st number ");
            int num1 = sc.nextInt();       
            System.out.println("Enter the 2nd number ");  
            int num2 = sc.nextInt(); 

            try{
            int result = num1/num2;
            System.out.println(result);
            }
            catch(ArithmeticException a){
                System.out.println("Cannot divide by zero ");
            }
            }
        catch(InputMismatchException e){
            System.out.println("Invalid input ");
        } 
    }
    
}
