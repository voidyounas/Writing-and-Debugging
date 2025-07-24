import java.util.Arrays;
import java.util.Scanner;
public class Storming{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        String abc = "younas";
        
        int length = str.length();
        System.out.println(length);//length of the string 

        String Str2 = str.toUpperCase();
        System.out.println(Str2);//capitalize all the letters 

        String Str3 = str.toLowerCase();
        System.out.println(Str3);// decapitalize all letters 

        int index1 = str.indexOf('a');
        System.out.println(index1);//gives the index number of first occured a 
        
        int index = str.lastIndexOf('a');
        System.out.println(index);//gives the last index where a is occured 

        System.out.println(str.equalsIgnoreCase(Str2));//comparing both strings 
        System.out.println(str.charAt(2));//this will give you the letter at index 3 
        System.out.println(str.compareTo(abc));//this will compare the strings in lexicographical order will give the result in int like (0 for equals) (- for less than ) (+ for greater than )

        System.out.println(str.startsWith("Younas"));//check if the strinng starts with the given string  
        System.out.println(str.endsWith("khan"));//check if the string ends with the provided string or something like that 
        System.out.println(str.contains("oun"));//check for the string if it is present in the first one or not 
        System.out.println(str.substring(0,6));//will give you the sub string from 0 index to 5th index 
        System.out.println(str.substring(7));//it will give you the sub string from index 7 to the end 
        System.out.println(str.replace('a', 'b'));//this will replace all the a with b 
        System.out.println(Arrays.toString(str.split(" ")));//this will split the string on the basis of spaces to the array **must to learn for file handling**
        System.out.println(str.trim());//this will remove the ending and starting spaces 
        System.out.println(str.isEmpty());//this check if the string is empty or not 
        System.out.println(str.isBlank());//this will check is the string is empty or contain spaces 

        //There are many more but these are the usefull and you can easily work  with these just have grip on them and use it in your codes and projects they are really helpfull 
    }
}