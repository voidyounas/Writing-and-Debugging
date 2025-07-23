import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        BigInteger result = fib(number);
        System.out.println("fib(" + number + ")" +" = "+ result);

    }

    public static BigInteger fib(int n ){

        if(n==0){
            return BigInteger.ZERO;
        }
        if(n==1){
            return BigInteger.ONE;
        }
        BigInteger start = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger next = BigInteger.ZERO;

        for(int i =2; i<=n; i++){
            next = start.add(second);
            start = second;
            second = next;

        }

        return next;

    }

}