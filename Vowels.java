import java.util.Scanner;
public class Vowels{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("The vowels in the string are " );
        countVowels(str);
        
    }

    public static void countVowels(String str){
        int counter = 0;
        for(int i =0; i<str.length(); i++){
            char abc = str.charAt(i);
            if(abc=='a' || abc=='e' ||abc=='i' || abc=='o' ||abc=='u'){
                counter++;

            }


            
        }

        System.out.println(counter );
    }
}