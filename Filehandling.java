import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filehandling {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("R:\\PF\\Learning java\\Input.txt"));
            for(int i =1;i<=10;i++){
                bw.write(i + "\n" );
            }
            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("R:\\PF\\Learning java\\Input.txt"));
            String line;
            while((line = br.readLine()) !=null){
                System.out.println(line);
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
       
    }
}
