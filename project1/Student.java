import java.util.Scanner;
public class Student{
    static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
        String[] Regno = new String[500];
        String[] Batch = new String[500];
        String[] Name1 = new String[500];
        String[] Name2 = new String[500];
        Double[] GPA = new Double[500];

        int count = 0; 

        while (true) {
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

                System.out.println("ENTER OPTION [0-4]");
                int option = sc.nextInt();
                sc.nextLine();

                if (option == 0) {
                        System.out.println("Exiting the program.");
                        System.exit(0);
                        break;
                }
                
                else if (option == 1) {
                System.out.print("Enter the batch (14/15/16/17) : ");
                String batch = sc.nextLine(); 
                System.out.print("Enter the registration number : "); 
                String regno = sc.nextLine(); 
                System.out.print("Enter the first name          : ");
                String name1 = sc.nextLine(); 
                System.out.print("Enter the last name           : ");
                String name2 = sc.nextLine(); 
                System.out.print("Enter the cumulative GPA      : ");
                Double gpa = sc.nextDouble(); 
                sc.nextLine();
                
                Regno[count] = regno;
                    Batch[count] = batch;
                    Name1[count] = name1;
                    Name2[count] = name2;
                    GPA[count] = gpa;
                    count++;
                    break;
                }
                
                
                else if (option == 2) {
                    System.out.print("Enter the batch (14/15/16/17) : ");
                    String batch = sc.nextLine(); 
                    System.out.print("Enter the registration number : "); 
                    String regno = sc.nextLine();               
                        for (int i = 0; i < count; i++) {
                            if (Regno[i].equals(regno) & Batch[i].equals(batch)){
                                String n1 = Name1[i];
                                String n2 = Name2[i];
                                Double G = GPA[i];
                                    System.out.println("The student "+"n1 "+"n2 "+"E/"+"batch"+"/"+"regno"+"/"+" has a cumulative GPA of "+G);
                                    break;
                                }
                        }
                    }
                }
            }
        }

                
    
