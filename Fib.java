import java.util.*;
public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        System.out.println(fib(number));

    }
    public static int fib(int n) {
        if(n<=1){
            return n;
        }
        if(n==2){
            return n-1;
        }
        int next =0;
        int first =0;
        int second =1;

        for(int i =2; i<=n; i++){
            next = first + second ;
            first = second;
            second = next;
        }
        return next;

    }
}