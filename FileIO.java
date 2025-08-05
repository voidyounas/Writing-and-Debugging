import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        String Names [] = {"Younas","Hasnat","Ahmad"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("R:\\PF\\Learning java\\Files.txt"));
            writer.write("Writing to a file ");
            writer.write(" \nThis is the 2nd line of the file");

            for(String name : Names){
                writer.write("\n" + name);
            }
            writer.close();

        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("R:\\PF\\Learning java\\Files.txt"));
            String line;
            while((line = reader.readLine()) !=null)
                System.out.println(line);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
    }
}
