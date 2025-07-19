import java.util.*;
public class ATM{

    static int balance = 1_00_000;
    static int PIN = 6340;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("=====Welcome to the ATM system====");
        int counter = 0;
        while(counter!=3){
            System.out.print("Enter the PIN :  ");
            int pin = sc.nextInt();
            if(pin==PIN){
                System.out.println("The PIN is correct ! Welcome ");
                
                

                while(true){
                    System.out.println("1. Check Balance : ");
                    System.out.println("2. Deposit Money : ");
                    System.out.println("3. Withdraw Money : ");
                    System.out.println("4. Exit : ");
                    int choice = sc.nextInt();
                    switch (choice){
                        case 1 -> checkBalance();
                        case 2 -> depositMoney (sc);
                        
                        case 3 -> withdrawMoney(sc);
                        
                        case 4 ->{
                            System.out.println("Thank you for trusting us as banking \n BYE!...");
                            return; }
                        
                        default->
                            System.out.println("Invalid choice please select another one ");
                        
                    }
                }
            
            }
            else{
                System.out.println("The PIN is incorrect ! Try again please ....");
            }
            counter++;
        }
        if(counter==3){
            System.out.println("Your ATM has been blocked due to multiple wrong PIN attempts ");
        }
        
    }

    public static void checkBalance(){
        System.out.println("The balance is " + balance);
        
    }

    public static void withdrawMoney(Scanner sc){
        System.out.print("Enter the amount you want to withdraw :  ");
        int withdraw = sc.nextInt();

        if(balance>0 && withdraw<=balance){
            balance-=withdraw;
            System.out.println("The balancee is " + balance);
        }
        else{
            System.out.println("The balance is insufficient ");
        }

        

         
    }

    public static void depositMoney(Scanner sc){

        
        System.out.print("Enter the amout you want to deposit :  ");
        int deposit = sc.nextInt();
        if(deposit>0){
          balance+=deposit;
          System.out.println("The balance is " + balance);

        }
        else{
            System.out.println("Invalid amount  ");
        }

        
    }

}