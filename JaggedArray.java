import java.util.Scanner;
public class JaggedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int array [][] = new int[3][];
        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[4];

        System.out.println("Enter the elements of the array ");
        for(int i =0; i<array.length;i++){
            for(int j =0; j<array[i].length;j++){
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("The elemets you entered are ");
        for(int i =0; i<array.length;i++){
            for(int j =0; j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
