
import java.util.Scanner;

public class New
{
    public static void main (String [] args)
    {
        
        Scanner sc = new Scanner(System.in);

      System.out.println("Enter the number : ");
      int n = sc.nextInt();
        int i ;
      for ( i = 2; i < n; i++) {
        if(n%i==0){
            break;
        }
          
      }

      if(i==n){
        System.out.println("it is prime number ");
      }
      else {
        System.out.println("it is not a prime number ");
      }

        
    }  
}