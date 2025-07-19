import java.util.*;
public class Capital {
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the sentence : ");
    String str = sc.nextLine();

    String words [] = str.split(" ");
    String result = "";

    for(int i = 0; i<words.length; i++){
        String word = words[i];

        if(word.length()>0){
            String Capitalized = word.substring(0,1).toUpperCase() + word.substring(1);
            result+=Capitalized + " ";
        }
    }

    System.out.println("The capitalized sentence is : " + result);


    }
    
}
