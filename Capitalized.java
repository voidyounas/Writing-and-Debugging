import java.util.Scanner;
public class Capitalized{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string in small letters : ");
        String str = sc.nextLine();


        System.out.println("The capital is ");
        System.out.println(toCapitalize(str));


    }

    public static String toCapitalize(String str){

        if(str==null|| str.isEmpty()){
            return str;
        }

        String abc= str.substring(0,1).toUpperCase() + str.substring(1);
        return abc;
    }
}