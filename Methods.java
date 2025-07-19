
import java.util.Scanner;
public class Methods{
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                        System.out.print("Enter the number here: ");
                        int number = sc.nextInt();

                        System.out.println("The reverse is " + reverse(number)); 
                    
                        if(isPalindrome(number)){
                            System.out.println("The number is palindrome ");
                        }
                        else {
                            System.out.println("The number is not a palindrome  ");
                        }

                    }

                    public static boolean isPalindrome(int num){
                    
                        int reversed = reverse(num);
                        return num==reversed;
                    

                    }

                    public static int reverse(int x){
                        int reversed = 0;
                        while(x !=0){
                            int c = x  % 10;
                            reversed=reversed * 10 + c;
                            x = x / 10;
                        }
                        return reversed ;
                    }
}