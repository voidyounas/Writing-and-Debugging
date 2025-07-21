import java.awt.Point;
import java.util.*;
public class _points{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num of points (Max is 20)! :  " );
        int n = sc.nextInt();

        //checking for the numbers entered by user 
        while(n>20 || n<0){
            System.out.println("Entered wrong inp ");
            break;
        }

        Point [] numbers = new Point[n];
        addPoints(numbers);//calling method 
        printPoints(numbers);//calling another method 
    }
        //method for printing the points 
    public static void printPoints(Point [] num){
        for(int i =0; i<num.length; i++){
            System.out.println("(" + num[i].x + "," + num[i].y + ")"); //first prints x and then y
        }
        

    }
        //method for user inputs of his choice
    public static void addPoints(Point [] num){
        Scanner sc = new Scanner(System.in);

        //adding the user input 
        for(int i =0; i<num.length;i++){
            System.out.println("Enter the x and y for "+ (i+1) +" : ");
            num[i] = new Point(sc.nextInt() , sc.nextInt());//creates new point , get the values (assign to point) , and store it in the array 
        }
    }

}