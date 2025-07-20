import java.util.*;
public class numOfOccurence{
    public static void main(String[] args) {
        

        countingOccurence();
    }

    public static void countingOccurence(){
        Scanner sc = new Scanner(System.in);

        char [] chars = new char[10];
        System.out.println("Enter the character elements of array ");
        for(int i =0; i<10;i++){
            
            System.out.print("Char[ " + i +" ] = ");
            chars[i]=sc.next().charAt(0);
        }
        int counter = 0;
        for(int i =0; i<10;i++){
            for(int j =0;j<10;j++){
                if(chars[i]==chars[j]){
                    counter++;

                }
            }
            System.out.println(chars[i] + " occured " + counter + " times ");
            counter =0;
        }
    }
}