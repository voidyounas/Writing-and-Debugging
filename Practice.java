import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number ");
        Double num1 = sc.nextDouble();
        System.out.println("Enter the 2nd number ");
        Double num2 = sc.nextDouble();
        System.out.println("Enter the 3rd number ");
        Double num3 = sc.nextDouble();

        System.out.println("The 3 numbers are " + num1 + "," + num2 + "," + num3);

        displaySortedNumbers(num1, num2, num3);
    }


    public static void displaySortedNumbers(Double num1, Double num2, Double num3){

        double largest , smallest , middle ;

        if(num1>num2 && num1>num3){
            largest = num1;
            if(num2>num3){
                middle = num2;
                smallest = num3;
            }
            else{
                middle = num3;
                smallest = num2;
            }

        }
        else if(num2>num3 && num2>num1 ){
            largest = num2;
            if(num3>num1){
                middle = num3;
                smallest = num1;

            }
            else{
                middle = num1;
                smallest = num3;
            }
        }
        else {
            smallest = num3;
            if(num1>num2){
                middle = num2;
                largest = num1;
            }
            else  {
                middle = num1;
                largest = num2;
                
            }
        }

        System.out.println("The sorted numbers are " + smallest + "," + middle + "," + largest);


    }
}