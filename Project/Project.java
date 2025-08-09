import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Project {

    static final int MAX_STUDENTS = 100;
    static String Names[] = new String[MAX_STUDENTS];
    static String rollNo[] = new String[MAX_STUDENTS];
    static String courses[][] = new String[MAX_STUDENTS][5];
    static int marks[][] = new int[MAX_STUDENTS][5];
    static int studentCount = 0;

    public static void main(String[] args) throws IOException {
        loadDataFromFile();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n====== Student Management System ======");
            System.out.println("1. Add New Student");
            System.out.println("2. Add Marks");
            System.out.println("3. View All Records");
            System.out.println("4. Search Student by Roll Number");
            System.out.println("5. Delete Student");
            System.out.println("6. Save and Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    addMarks(sc);
                    break;
                case 3:
                    viewAll();
                    break;
                case 4:
                    searchStudent(sc);
                    break;
                case 5:
                    deleteStudent(sc);
                    break;
                case 6:
                    saveDataToFile();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }

    public static void addStudent(Scanner sc) {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Limit reached");
            return;
        }
        try {
            System.out.print("Enter name: ");
            Names[studentCount] = sc.nextLine();
            System.out.print("Enter Roll no: ");
            rollNo[studentCount] = sc.nextLine();

            System.out.print("How many courses to register (max 5): ");
            int n = sc.nextInt();
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                System.out.print("Enter course " + (i + 1) + ": ");
                courses[studentCount][i] = sc.nextLine();
            }
            studentCount++;
            System.out.println("Student added successfully");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }

    public static int findStudent(String roll) {
        for (int i = 0; i < studentCount; i++) {
            if (rollNo[i].equalsIgnoreCase(roll))
                return i;
        }
        return -1;
    }

    public static void searchStudent(Scanner sc) {
        System.out.print("Enter Roll no: ");
        String rollNumber = sc.nextLine();
        int ID = findStudent(rollNumber);

        if (ID == -1) {
            System.out.println("Student not found");
        } else {
            System.out.println("Name: " + Names[ID]);
            System.out.println("Roll No: " + rollNo[ID]);
            System.out.println("Courses and Marks:");
            for (int i = 0; i < 5; i++) {
                if (courses[ID][i] != null) {
                    System.out.println(courses[ID][i] + " (" + marks[ID][i] + ")");
                }
            }
        }
    }

    public static void addMarks(Scanner sc) {
        System.out.print("Enter Roll No: ");
        String rollNumber = sc.nextLine();
        int ID = findStudent(rollNumber);

        if (ID == -1) {
            System.out.println("Student not found");
            return;
        }
        for (int i = 0; i < 5; i++) {
            if (courses[ID][i] == null) break;
            System.out.print("Enter marks for " + courses[ID][i] + ": ");
            marks[ID][i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Marks updated successfully");
    }

    public static void viewAll() {
        System.out.println("\n===== All Students =====");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nName: " + Names[i]);
            System.out.println("Roll No: " + rollNo[i]);
            System.out.println("Courses and Marks:");
            for (int j = 0; j < 5; j++) {
                if (courses[i][j] != null) {
                    System.out.println(courses[i][j] + " (" + marks[i][j] + ")");
                }
            }
        }
    }

    public static void deleteStudent(Scanner sc) {
        System.out.print("Enter Roll No of student to delete: ");
        String rollNumber = sc.nextLine();
        int ID = findStudent(rollNumber);

        if (ID == -1) {
            System.out.println("Student not found");
            return;
        }
        for (int i = ID; i < studentCount - 1; i++) {
            Names[i] = Names[i + 1];
            rollNo[i] = rollNo[i + 1];
            for (int j = 0; j < 5; j++) {
                courses[i][j] = courses[i + 1][j];
                marks[i][j] = marks[i + 1][j];
            }
        }
        Names[studentCount - 1] = null;
        rollNo[studentCount - 1] = null;
        for (int j = 0; j < 5; j++) {
            courses[studentCount - 1][j] = null;
            marks[studentCount - 1][j] = 0;
        }
        studentCount--;
        System.out.println("Student deleted successfully");
    }

    public static void saveDataToFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("R:\\PF\\Learning java\\Project\\students.txt"));
        for (int i = 0; i < studentCount; i++) {
            bw.write(Names[i] + "," + rollNo[i]);
            for (int j = 0; j < 5; j++) {
                if (courses[i][j] != null) {
                    bw.write("," + courses[i][j] + ":" + marks[i][j]);
                }
            }
            bw.newLine();
        }
        bw.close();
    }

    public static void loadDataFromFile() throws IOException {
        File file = new File("R:\\PF\\Learning java\\Project\\students.txt");

        if (!file.exists()){
            return;
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null && studentCount < MAX_STUDENTS) {
            String[] parts = line.split(",");
            Names[studentCount] = parts[0];
            rollNo[studentCount] = parts[1];
            for (int i = 2; i < parts.length; i++) {
                String[] courseMark = parts[i].split(":");
                courses[studentCount][i - 2] = courseMark[0];
                marks[studentCount][i - 2] = Integer.parseInt(courseMark[1]);
            }
            studentCount++;
        }
        br.close();
    }
}
