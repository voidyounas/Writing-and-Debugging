import java.util.Scanner;
public class FibGFG{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int number = sc.nextInt();

        System.out.println(fib(number));
        
    }


    // User function Template for Java


    public static long fib(int N) {
        // code here
        if(N<=1){
            return N;
        }
        long next =0;
        long  first=0;
        long  second =1;
        
        for(int i =2; i<=N; i++){
            next =  (first + second) %10;
            first = second;
            second = next;
        }
        return next;
    }
}
