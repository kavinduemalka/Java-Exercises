import java.util.Scanner;
public class Student{
    static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
        String[] regno = new String[500];
        String[] batch = new String[500];
        String[] name1 = new String[500];
        String[] name2 = new String[500];
        Double[] gpa = new Double[500];

        int count = 0; 

          
                System.out.println("-------------------------------------------");
                System.out.println("   A VOLATILE STUDENT MAINTENANCE SYSTEM   "); 
                System.out.println("-------------------------------------------"); 
                System.out.println();
                System.out.println("0. Quit");
                System.out.println("1. Insert a Student Record");
                System.out.println("2. Print a Student Record");
                System.out.println("3. Print all Student Records");
                System.out.println("4. Delete a Student Record");
                System.out.println();

                System.out.print("ENTER OPTION [0-4]");
                int option = sc.nextInt();
                sc.nextLine();
}
}
                
    
        