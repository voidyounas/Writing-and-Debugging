import java.util.Scanner;
public class Main
{
    public static void main (String[]args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = sc.nextInt();

        switch(number)
        {
           case 1 ->{ System.out.println("Monday  ");
                        System.out.println("you need to go for work ");
                    
                    }

                case 2 -> System.out.println("Tuesday  ");

                case 3 -> System.out.println("Wednesday  ");

                case 4 -> System.out.println("Thursday ");

                case 5 -> System.out.println("Friday  ");

                case 6 -> System.out.println("Saturday  ");

                case 7->{
                        System.out.println("Sunday  ");
                        System.out.println("goonna be fun ");
                        }

                default ->System.out.println("Invalid number ");
        }
    }
}