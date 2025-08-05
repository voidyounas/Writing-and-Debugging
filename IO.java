import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        BufferedWriter bw = new BufferedWriter(new FileWriter("R:\\PF\\Learning java\\New.txt"));
            while(true){
                System.out.print("Enter roll no :  ");
                int RNo = sc.nextInt();
                sc.nextLine();
                if(RNo==0)
                    break;
                
                System.out.print("Enter name : ");
                String name = sc.next();

                System.out.print("Enter the marks : ");
                int marks = sc.nextInt();
                sc.nextLine();

                bw.write("Roll no : " + RNo + "\n");
                bw.write("Name : " + name + "\n");
                bw.write("Marks : " + marks + "\n");


            }    
            
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }


        try{
        BufferedReader br = new BufferedReader(new FileReader("R:\\PF\\Learning java\\New.txt"));

        String line ;
        while((line= br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
