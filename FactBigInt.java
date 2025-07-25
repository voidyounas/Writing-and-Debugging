import java.math.BigInteger;
import java.util.Scanner;

public class FactBigInt{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number : ");
    int num = sc.nextInt();

    BigInteger results = fact(num);
    System.out.println("fact(" + num + ") = " + results);
    System.out.println("Number of digits: " + results.toString().length());

    }
    public static BigInteger fact(int n){
        if(n<0){
            return BigInteger.ZERO;
        }
        BigInteger fact = BigInteger.ONE;

        for(int i =1; i<=n; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}